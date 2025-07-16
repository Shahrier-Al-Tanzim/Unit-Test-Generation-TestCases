query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.trees", "imports": ["com.thealgorithms.datastructures.trees.BinaryTree.Node"], "classes": [{"class_name": "BSTRecursive", "modifiers": ["public"], "fields": [{"name": "root", "type": "Node"}], "constructors": [{"parameters": [], "modifiers": []}], "methods": [{"name": "getRoot", "modifiers": ["public"], "return_type": "Node", "parameters": [], "invocations": [], "conditionals": []}, {"name": "delete", "modifiers": ["private"], "return_type": "Node", "parameters": [{"name": "node", "type": "Node"}, {"name": "data", "type": "int"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"No such data present in BST.\")"]}, {"qualifier": "", "member": "delete", "arguments": ["left", "data"]}, {"qualifier": "", "member": "delete", "arguments": ["right", "data"]}, {"qualifier": "", "member": "delete", "arguments": ["right", "data"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operator=&&)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}]}, {"name": "insert", "modifiers": ["private"], "return_type": "Node", "parameters": [{"name": "node", "type": "Node"}, {"name": "data", "type": "int"}], "invocations": [{"qualifier": "", "member": "insert", "arguments": ["left", "data"]}, {"qualifier": "", "member": "insert", "arguments": ["right", "data"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}]}, {"name": "search", "modifiers": ["private"], "return_type": "boolean", "parameters": [{"name": "node", "type": "Node"}, {"name": "data", "type": "int"}], "invocations": [{"qualifier": "", "member": "search", "arguments": ["left", "data"]}, {"qualifier": "", "member": "search", "arguments": ["right", "data"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[]), operandr=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}]}, {"name": "add", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "data", "type": "int"}], "invocations": [{"qualifier": "", "member": "insert", "arguments": ["This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[MemberReference(member=root, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None)])", "data"]}], "conditionals": []}, {"name": "remove", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "data", "type": "int"}], "invocations": [{"qualifier": "", "member": "delete", "arguments": ["This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[MemberReference(member=root, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None)])", "data"]}], "conditionals": []}, {"name": "find", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "data", "type": "int"}], "invocations": [{"qualifier": "", "member": "search", "arguments": ["This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[MemberReference(member=root, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None)])", "data"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" is present in given BST.\"), operator=+)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" not found.\"), operator=+)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[MemberReference(member=root, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None)]), MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=search, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}]}]}
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

result: Here are the generated JUnit 5 unit tests for each of the methods in the given JSON array:
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class BSTRecursiveTest {
    private Node root;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void getRoot_returnsRootNode() {
        // Arrange: Set up inputs, mocks, or stubs
        Node node = new Node(1);
        root = node;

        // Act: Call the method under test
        Node result = BSTRecursive.getRoot();

        // Assert: Verify the results
        assertEquals(node, result);
    }

    @Test
    public void delete_deletesNodeWithGivenData() {
        // Arrange: Set up inputs, mocks, or stubs
        Node node = new Node(1);
        root = node;

        // Act: Call the method under test
        BSTRecursive.delete(node, 2);

        // Assert: Verify the results
        assertNull(node.left);
        assertNull(node.right);
    }

    @Test
    public void insert_insertsNodeWithGivenData() {
        // Arrange: Set up inputs, mocks, or stubs
        Node node = new Node(1);
        root = node;

        // Act: Call the method under test
        BSTRecursive.insert(node, 2);

        // Assert: Verify the results
        assertEquals(new Node(2), node.left);
    }

    @Test
    public void search_returnsTrueIfNodeWithGivenDataIsPresent() {
        // Arrange: Set up inputs, mocks, or stubs
        Node node = new Node(1);
        root = node;

        // Act: Call the method under test
        boolean result = BSTRecursive.search(node, 2);

        // Assert: Verify the results
        assertTrue(result);
    }

    @Test
    public void search_returnsFalseIfNodeWithGivenDataIsNotPresent() {
        // Arrange: Set up inputs, mocks, or stubs
        Node node = new Node(1);
        root = node;

        // Act: Call the method under test
        boolean result = BSTRecursive.search(node, 3);

        // Assert: Verify the results
        assertFalse(result);
    }
}
```
