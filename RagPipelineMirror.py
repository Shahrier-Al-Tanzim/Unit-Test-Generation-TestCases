import os
import javalang
import hashlib
import json
from ASTstructured import tree_to_json
from langchain_community.document_loaders import TextLoader
from langchain_text_splitters import RecursiveCharacterTextSplitter
from langchain_community.vectorstores import FAISS
from langchain_huggingface import HuggingFaceEmbeddings
from langchain.schema import Document
from langchain.chains import RetrievalQA
from langchain_ollama import OllamaLLM

def extract_class_name(java_code):
    try:
        tree = javalang.parse.parse(java_code)
        for type_decl in tree.types:
            if hasattr(type_decl, 'name'):
                return type_decl.name
    except Exception:
        return None
    return None

def process_java_folder(folder_path):
    java_files = [f for f in os.listdir(folder_path) if f.endswith('.java')]
    source_codes = []
    file_names = []
    for fname in java_files:
        with open(os.path.join(folder_path, fname), 'r', encoding='utf-8') as f:
            code = f.read()
            source_codes.append(code)
            file_names.append(fname)

    # Setup RAG pipeline (reuse your config)
    KB_FOLDER = "junit_kb"
    SPLIT_CACHE = "kb_splits.json"
    FAISS_INDEX_PATH = "kb_faiss_index"
    CHUNK_SIZE = 800
    CHUNK_OVERLAP = 100

    def hash_knowledge_base(folder_path):
        hasher = hashlib.md5()
        for filename in sorted(os.listdir(folder_path)):
            if filename.endswith(".txt"):
                with open(os.path.join(folder_path, filename), "rb") as f:
                    hasher.update(f.read())
        return hasher.hexdigest()

    def load_knowledge_base(folder_path=KB_FOLDER):
        docs = []
        for filename in os.listdir(folder_path):
            if filename.endswith(".txt"):
                with open(os.path.join(folder_path, filename), "r", encoding="utf-8") as f:
                    content = f.read()
                    docs.append(Document(page_content=content, metadata={"source": filename}))
        return docs

    def save_splits_to_cache(splits, kb_hash):
        data = {
            "hash": kb_hash,
            "splits": [{"content": doc.page_content, "metadata": doc.metadata} for doc in splits]
        }
        with open(SPLIT_CACHE, "w", encoding="utf-8") as f:
            json.dump(data, f)

    def load_splits_from_cache(kb_hash):
        if not os.path.exists(SPLIT_CACHE):
            return None
        with open(SPLIT_CACHE, "r", encoding="utf-8") as f:
            data = json.load(f)
        if data.get("hash") != kb_hash:
            return None
        return [Document(page_content=item["content"], metadata=item["metadata"]) for item in data["splits"]]

    def split_docs(documents, force_rebuild=False):
        kb_hash = hash_knowledge_base(KB_FOLDER)
        if not force_rebuild:
            cached_splits = load_splits_from_cache(kb_hash)
            if cached_splits:
                print("Loaded chunked splits from cache.")
                return cached_splits
        print("Splitting documents into chunks...")
        splitter = RecursiveCharacterTextSplitter(chunk_size=CHUNK_SIZE, chunk_overlap=CHUNK_OVERLAP)
        splits = splitter.split_documents(documents)
        save_splits_to_cache(splits, kb_hash)
        return splits

    def embed_documents(splits, force_rebuild=False):
        embeddings = HuggingFaceEmbeddings(model_name="all-MiniLM-L6-v2")
        if not force_rebuild and os.path.exists(FAISS_INDEX_PATH):
            print("Loading existing FAISS index...")
            return FAISS.load_local(FAISS_INDEX_PATH, embeddings, allow_dangerous_deserialization=True)
        print("Creating FAISS index...")
        vectorstore = FAISS.from_documents(splits, embeddings)
        vectorstore.save_local(FAISS_INDEX_PATH)
        return vectorstore

    def get_ollama_llm():
        return OllamaLLM(model="codellama", temperature=0.2)

    def create_rag_pipeline(force_rebuild=False, retriever_k=4, search_type="similarity"):
        print("Loading knowledge base...")
        raw_docs = load_knowledge_base()
        print(f"Loaded {len(raw_docs)} documents.")
        print("Splitting documents...")
        splits = split_docs(raw_docs, force_rebuild=force_rebuild)
        print("Embedding documents...")
        vectorstore = embed_documents(splits, force_rebuild=force_rebuild)
        print("Setting up retriever...")
        retriever = vectorstore.as_retriever(search_type=search_type, search_kwargs={"k": retriever_k})
        print("Initializing LLM and RAG pipeline...")
        llm = get_ollama_llm()
        rag_chain = RetrievalQA.from_chain_type(llm=llm, retriever=retriever, chain_type="stuff")
        return rag_chain

    rag_chain = create_rag_pipeline(force_rebuild=False, retriever_k=4)

    # Prepare output folder as <foldername>Test next to the input folder
    abs_folder = os.path.abspath(folder_path)
    parent_dir, base_folder = os.path.split(abs_folder.rstrip('/\\'))
    test_folder = os.path.join(parent_dir, base_folder + 'Test')
    os.makedirs(test_folder, exist_ok=True)

    # Process each file
    for idx, code in enumerate(source_codes):
        base_name = os.path.splitext(file_names[idx])[0]
        test_file_name = f"{base_name}Test.java"
        print(f"Processing {file_names[idx]} -> {test_file_name}")
        try:
            tree = javalang.parse.parse(code)
        except javalang.parser.JavaSyntaxError as e:
            # Save the original code in Error<base_name>.java
            error_fname = os.path.join(test_folder, f"Error{base_name}.java")
            with open(error_fname, "w", encoding="utf-8") as f:
                f.write(code)
            if hasattr(e.at, 'line') and hasattr(e.at, 'column'):
                print(f"Java syntax error in {file_names[idx]}: {e.description} at line {e.at.line}, column {e.at.column}. Saved as {error_fname}")
            else:
                print(f"Java syntax error in {file_names[idx]}: {e.description}. Saved as {error_fname}")
            continue
        json_tree = tree_to_json(tree)
        json_tree_str = json.dumps(json_tree)
        prompt = f"""
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{json_tree_str}
```
Rules:
1. Use @Test from JUnit 5.
2. Resolve all the dependencies. Use Mockito (@Mock, Mockito.when(...), verify(...)) for all dependencies.
3. Instantiate focal class
4. Use @BeforeEach for setting up required preconditions before each test method And @AfterEach for cleanup. Use @BeforeAll (static) if setup is required once before all tests.
5. For each invocation:
Stub its behavior (when(mock.member(args)).thenReturn(...) for non-void; doNothing().when(...) and verify mehtod call for void ).
6. Use Arrange-Act-Assert format.
  -Arrange: Set up inputs, mocks, or stubs.
  -Act: Call the method under test.
  -Assert:  Verify the results.
7. Make all test methods public.
8. Import only what is necessary: JUnit 5, Mockito, and the class under test.
9. Return only a complete Java test class, no explanation.
"""
        response = rag_chain.invoke(prompt)
        out_fname = os.path.join(test_folder, test_file_name)
        with open(out_fname, "w", encoding="utf-8") as f:
            if isinstance(response, dict):
                for key, value in response.items():
                    f.write(f"{key}: {value}\n")
            else:
                f.write(response)
        print(f"Test class for {base_name} written to {out_fname}")

def process_java_folder_mirrored(folder_path, source_root, test_root):
    java_files = [f for f in os.listdir(folder_path) if f.endswith('.java')]
    source_abs = os.path.abspath(source_root)
    test_abs = os.path.abspath(test_root)
    folder_abs = os.path.abspath(folder_path)
    rel_folder = os.path.relpath(folder_abs, source_abs)
    # Add 'Test' suffix to every folder in the relative path
    rel_parts = rel_folder.split(os.sep)
    rel_parts_test = [part + 'Test' for part in rel_parts]
    test_folder = os.path.join(test_abs, *rel_parts_test)
    os.makedirs(test_folder, exist_ok=True)
    source_codes = []
    file_names = []
    for fname in java_files:
        base_name = os.path.splitext(fname)[0]
        test_file_name = f"{base_name}Test.java"
        test_file_path = os.path.join(test_folder, test_file_name)
        if os.path.exists(test_file_path):
            print(f"[SKIP] Test file already exists for {fname}: {test_file_name}")
            continue
        with open(os.path.join(folder_path, fname), 'r', encoding='utf-8') as f:
            code = f.read()
            source_codes.append(code)
            file_names.append(fname)

    # Setup RAG pipeline (reuse your config)
    KB_FOLDER = "junit_kb"
    SPLIT_CACHE = "kb_splits.json"
    FAISS_INDEX_PATH = "kb_faiss_index"
    CHUNK_SIZE = 800
    CHUNK_OVERLAP = 100

    def hash_knowledge_base(folder_path):
        hasher = hashlib.md5()
        for filename in sorted(os.listdir(folder_path)):
            if filename.endswith(".txt"):
                with open(os.path.join(folder_path, filename), "rb") as f:
                    hasher.update(f.read())
        return hasher.hexdigest()

    def load_knowledge_base(folder_path=KB_FOLDER):
        docs = []
        for filename in os.listdir(folder_path):
            if filename.endswith(".txt"):
                with open(os.path.join(folder_path, filename), "r", encoding="utf-8") as f:
                    content = f.read()
                    docs.append(Document(page_content=content, metadata={"source": filename}))
        return docs

    def save_splits_to_cache(splits, kb_hash):
        data = {
            "hash": kb_hash,
            "splits": [{"content": doc.page_content, "metadata": doc.metadata} for doc in splits]
        }
        with open(SPLIT_CACHE, "w", encoding="utf-8") as f:
            json.dump(data, f)

    def load_splits_from_cache(kb_hash):
        if not os.path.exists(SPLIT_CACHE):
            return None
        with open(SPLIT_CACHE, "r", encoding="utf-8") as f:
            data = json.load(f)
        if data.get("hash") != kb_hash:
            return None
        return [Document(page_content=item["content"], metadata=item["metadata"]) for item in data["splits"]]

    def split_docs(documents, force_rebuild=False):
        kb_hash = hash_knowledge_base(KB_FOLDER)
        if not force_rebuild:
            cached_splits = load_splits_from_cache(kb_hash)
            if cached_splits:
                print("Loaded chunked splits from cache.")
                return cached_splits
        print("Splitting documents into chunks...")
        splitter = RecursiveCharacterTextSplitter(chunk_size=CHUNK_SIZE, chunk_overlap=CHUNK_OVERLAP)
        splits = splitter.split_documents(documents)
        save_splits_to_cache(splits, kb_hash)
        return splits

    def embed_documents(splits, force_rebuild=False):
        embeddings = HuggingFaceEmbeddings(model_name="all-MiniLM-L6-v2")
        if not force_rebuild and os.path.exists(FAISS_INDEX_PATH):
            print("Loading existing FAISS index...")
            return FAISS.load_local(FAISS_INDEX_PATH, embeddings, allow_dangerous_deserialization=True)
        print("Creating FAISS index...")
        vectorstore = FAISS.from_documents(splits, embeddings)
        vectorstore.save_local(FAISS_INDEX_PATH)
        return vectorstore

    def get_ollama_llm():
        return OllamaLLM(model="codellama", temperature=0.2)

    def create_rag_pipeline(force_rebuild=False, retriever_k=4, search_type="similarity"):
        print("Loading knowledge base...")
        raw_docs = load_knowledge_base()
        print(f"Loaded {len(raw_docs)} documents.")
        print("Splitting documents...")
        splits = split_docs(raw_docs, force_rebuild=force_rebuild)
        print("Embedding documents...")
        vectorstore = embed_documents(splits, force_rebuild=force_rebuild)
        print("Setting up retriever...")
        retriever = vectorstore.as_retriever(search_type=search_type, search_kwargs={"k": retriever_k})
        print("Initializing LLM and RAG pipeline...")
        llm = get_ollama_llm()
        rag_chain = RetrievalQA.from_chain_type(llm=llm, retriever=retriever, chain_type="stuff")
        return rag_chain

    rag_chain = create_rag_pipeline(force_rebuild=False, retriever_k=4)
    if not source_codes:
        print(f"[INFO] All test files already exist for folder: {folder_path}")
        return
    for idx, code in enumerate(source_codes):
        base_name = os.path.splitext(file_names[idx])[0]
        test_file_name = f"{base_name}Test.java"
        out_fname = os.path.join(test_folder, test_file_name)
        print(f"Processing {file_names[idx]} -> {out_fname}")
        try:
            tree = javalang.parse.parse(code)
        except javalang.parser.JavaSyntaxError as e:
            error_fname = os.path.join(test_folder, f"Error{base_name}.java")
            with open(error_fname, "w", encoding="utf-8") as f:
                f.write(code)
            if hasattr(e.at, 'line') and hasattr(e.at, 'column'):
                print(f"Java syntax error in {file_names[idx]}: {e.description} at line {e.at.line}, column {e.at.column}. Saved as {error_fname}")
            else:
                print(f"Java syntax error in {file_names[idx]}: {e.description}. Saved as {error_fname}")
            continue
        json_tree = tree_to_json(tree)
        json_tree_str = json.dumps(json_tree)
        prompt = f"""
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{json_tree_str}
```
Rules:
1. Use @Test from JUnit 5.
2. Resolve all the dependencies. Use Mockito (@Mock, Mockito.when(...), verify(...)) for all dependencies.
3. Instantiate focal class
4. Use @BeforeEach for setting up required preconditions before each test method And @AfterEach for cleanup. Use @BeforeAll (static) if setup is required once before all tests.
5. For each invocation:
Stub its behavior (when(mock.member(args)).thenReturn(...) for non-void; doNothing().when(...) and verify mehtod call for void ).
6. Use Arrange-Act-Assert format.
  -Arrange: Set up inputs, mocks, or stubs.
  -Act: Call the method under test.
  -Assert:  Verify the results.
7. Make all test methods public.
8. Import only what is necessary: JUnit 5, Mockito, and the class under test.
9. Return only a complete Java test class, no explanation.
"""
        response = rag_chain.invoke(prompt)
        with open(out_fname, "w", encoding="utf-8") as f:
            if isinstance(response, dict):
                for key, value in response.items():
                    f.write(f"{key}: {value}\n")
            else:
                f.write(response)
        print(f"Test class for {base_name} written to {out_fname}")

def create_test_files_for_java_files(folder_path):
    """
    For each .java file in folder_path, create an empty file with 'TEST' appended before the .java extension
    in a sibling folder named <foldername>test. If no .java files, do nothing.
    """
    java_files = [f for f in os.listdir(folder_path) if f.lower().endswith('.java') and os.path.isfile(os.path.join(folder_path, f))]
    if not java_files:
        return
    parent_dir, base_folder = os.path.split(os.path.abspath(folder_path.rstrip('/\\')))
    test_folder = os.path.join(parent_dir, base_folder + 'test')
    os.makedirs(test_folder, exist_ok=True)
    for fname in java_files:
        base, ext = os.path.splitext(fname)
        test_fname = f"{base}TEST{ext}"
        test_fpath = os.path.join(test_folder, test_fname)
        # Only create if it doesn't already exist
        if not os.path.exists(test_fpath):
            with open(test_fpath, 'w', encoding='utf-8') as f:
                f.write("")
            print(f"[CREATE] {test_fpath}")

def dfs_list_files_and_folders(root_folder):
    stack = [os.path.abspath(root_folder)]
    while stack:
        current = stack.pop()
        print(f"[DIR] {current}")
        try:
            entries = os.listdir(current)
        except Exception as e:
            print(f"  [ERROR] {e}")
            continue
        files = [f for f in entries if os.path.isfile(os.path.join(current, f))]
        folders = [f for f in entries if os.path.isdir(os.path.join(current, f))]
        print(f"  Files: {files}")
        print(f"  Folders: {folders}")
        # Create TEST files for .java files in this folder
        create_test_files_for_java_files(current)
        # Add subfolders to stack in reverse order for natural DFS
        for folder in reversed(folders):
            stack.append(os.path.join(current, folder))

def dfs_process_java_folders(root_folder):
    stack = [os.path.abspath(root_folder)]
    while stack:
        current = stack.pop()
        # Process this folder with RAG pipeline logic (creates <foldername>Test and processes Java files)
        process_java_folder(current)
        try:
            entries = os.listdir(current)
        except Exception as e:
            print(f"  [ERROR] {e}")
            continue
        folders = [f for f in entries if os.path.isdir(os.path.join(current, f))]
        # Add subfolders to stack in reverse order for natural DFS
        for folder in reversed(folders):
            stack.append(os.path.join(current, folder))

def dfs_process_java_folders_mirrored(source_root, test_root):
    for dirpath, dirnames, filenames in os.walk(source_root):
        process_java_folder_mirrored(dirpath, source_root, test_root)

if __name__ == "__main__":
    source_root = input("Enter the path to the source folder: ").strip()
    if not os.path.exists(source_root):
        print(f"[ERROR] The folder '{source_root}' does not exist.")
    else:
        abs_source = os.path.abspath(source_root)
        parent_dir, base_folder = os.path.split(abs_source.rstrip('/\\'))
        test_root = os.path.join(parent_dir, base_folder + 'Test')
        print(f"[INFO] Test root folder will be: {test_root}")
        dfs_process_java_folders_mirrored(source_root, test_root)
