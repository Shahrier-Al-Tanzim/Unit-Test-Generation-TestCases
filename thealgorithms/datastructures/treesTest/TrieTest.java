query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.trees", "imports": ["java.util.HashMap"], "classes": [{"class_name": "TrieNode", "modifiers": [], "fields": [{"name": "value", "type": "char"}, {"name": "child", "type": "HashMap"}, {"name": "end", "type": "boolean"}], "constructors": [{"parameters": [{"name": "value", "type": "char"}], "modifiers": []}], "methods": []}, {"class_name": "Trie", "modifiers": ["public"], "fields": [{"name": "ROOT_NODE_VALUE", "type": "char"}, {"name": "root", "type": "TrieNode"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "insert", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "word", "type": "String"}], "invocations": [{"qualifier": "word", "member": "length", "arguments": []}, {"qualifier": "currentNode.child", "member": "getOrDefault", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=word, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null)"]}, {"qualifier": "word", "member": "charAt", "arguments": ["i"]}, {"qualifier": "word", "member": "charAt", "arguments": ["i"]}, {"qualifier": "currentNode.child", "member": "put", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=word, selectors=[], type_arguments=None)", "node"]}, {"qualifier": "word", "member": "charAt", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "search", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "word", "type": "String"}], "invocations": [{"qualifier": "word", "member": "length", "arguments": []}, {"qualifier": "currentNode.child", "member": "getOrDefault", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=word, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null)"]}, {"qualifier": "word", "member": "charAt", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "delete", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "word", "type": "String"}], "invocations": [{"qualifier": "word", "member": "length", "arguments": []}, {"qualifier": "currentNode.child", "member": "getOrDefault", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=word, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null)"]}, {"qualifier": "word", "member": "charAt", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=currentNode, selectors=[])", "has_else": false}]}, {"name": "countWords", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "", "member": "countWords", "arguments": ["root"]}], "conditionals": []}, {"name": "countWords", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "node", "type": "TrieNode"}], "invocations": [{"qualifier": "node.child", "member": "values", "arguments": []}, {"qualifier": "", "member": "countWords", "arguments": ["child"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[])", "has_else": false}]}, {"name": "startsWithPrefix", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "prefix", "type": "String"}], "invocations": [{"qualifier": "prefix", "member": "length", "arguments": []}, {"qualifier": "currentNode.child", "member": "getOrDefault", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=prefix, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null)"]}, {"qualifier": "prefix", "member": "charAt", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "countWordsWithPrefix", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "prefix", "type": "String"}], "invocations": [{"qualifier": "prefix", "member": "length", "arguments": []}, {"qualifier": "currentNode.child", "member": "getOrDefault", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=prefix, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null)"]}, {"qualifier": "prefix", "member": "charAt", "arguments": ["i"]}, {"qualifier": "", "member": "countWords", "arguments": ["currentNode"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}]}]}
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

result: ```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import com.thealgorithms.datastructures.trees.TrieNode;
import java.util.HashMap;

class TrieTests {
    private Trie trie;
    private TrieNode root;

    @BeforeEach
    void setUp() {
        trie = new Trie();
        root = new TrieNode('a');
        trie.root = root;
    }

    @Test
    void insert_shouldInsertWordIntoTrie() {
        // Arrange
        String word = "hello";
        int length = word.length();
        HashMap<Character, TrieNode> child = new HashMap<>();
        TrieNode node = new TrieNode('h');
        child.put('h', node);
        root.child = child;

        // Act
        trie.insert(word);

        // Assert
        assertEquals(length, root.child.get('h').value);
    }

    @Test
    void search_shouldReturnTrueIfWordExistsInTrie() {
        // Arrange
        String word = "hello";
        int length = word.length();
        HashMap<Character, TrieNode> child = new HashMap<>();
        TrieNode node = new TrieNode('h');
        child.put('h', node);
        root.child = child;

        // Act
        boolean result = trie.search(word);

        // Assert
        assertTrue(result);
    }

    @Test
    void search_shouldReturnFalseIfWordDoesNotExistInTrie() {
        // Arrange
        String word = "hello";
        int length = word.length();
        HashMap<Character, TrieNode> child = new HashMap<>();
        TrieNode node = new TrieNode('h');
        child.put('h', node);
        root.child = child;

        // Act
        boolean result = trie.search("world");

        // Assert
        assertFalse(result);
    }

    @Test
    void delete_shouldDeleteWordFromTrie() {
        // Arrange
        String word = "hello";
        int length = word.length();
        HashMap<Character, TrieNode> child = new HashMap<>();
        TrieNode node = new TrieNode('h');
        child.put('h', node);
        root.child = child;

        // Act
        trie.delete(word);

        // Assert
        assertEquals(length, root.child.get('h').value);
    }

    @Test
    void delete_shouldReturnTrueIfWordExistsInTrie() {
        // Arrange
        String word = "hello";
        int length = word.length();
        HashMap<Character, TrieNode> child = new HashMap<>();
        TrieNode node = new TrieNode('h');
        child.put('h', node);
        root.child = child;

        // Act
        boolean result = trie.delete(word);

        // Assert
        assertTrue(result);
    }

    @Test
    void delete_shouldReturnFalseIfWordDoesNotExistInTrie() {
        // Arrange
        String word = "hello";
        int length = word.length();
        HashMap<Character, TrieNode> child = new HashMap<>();
        TrieNode node = new TrieNode('h');
        child.put('h', node);
        root.child = child;

        // Act
        boolean result = trie.delete("world");

        // Assert
        assertFalse(result);
    }
}
```
