import os
from extract_java_code import extract_java_code

def clean_all_generated_tests(test_root, clean_root=None):
    if clean_root is None:
        clean_root = os.path.join(test_root, 'test')
    for dirpath, _, filenames in os.walk(test_root):
        # Always mirror the folder structure, even if no .java files
        rel_path = os.path.relpath(dirpath, test_root)
        out_dir = os.path.join(clean_root, rel_path)
        os.makedirs(out_dir, exist_ok=True)
        for fname in filenames:
            if fname.endswith('Test.java'):
                src_path = os.path.join(dirpath, fname)
                out_path = os.path.join(out_dir, fname)
                extract_java_code(src_path, out_path)
                print(f"Cleaned: {src_path} -> {out_path}")

if __name__ == "__main__":
    test_root = input("Enter the path to the test folder to clean: ").strip()
    if not os.path.exists(test_root):
        print(f"[ERROR] The folder '{test_root}' does not exist.")
    else:
        clean_all_generated_tests(test_root)