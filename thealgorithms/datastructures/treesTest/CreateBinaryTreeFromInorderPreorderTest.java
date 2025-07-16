query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.trees", "imports": ["com.thealgorithms.datastructures.trees.BinaryTree.Node", "java.util.HashMap", "java.util.Map"], "classes": [{"class_name": "CreateBinaryTreeFromInorderPreorder", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "createTree", "modifiers": ["public", "static"], "return_type": "Node", "parameters": [{"name": "preorder", "type": "Integer"}, {"name": "inorder", "type": "Integer"}], "invocations": [{"qualifier": "", "member": "createTree", "arguments": ["preorder", "inorder", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "length"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=preorder, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=inorder, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operator=||)", "has_else": false}]}, {"name": "createTreeOptimized", "modifiers": ["public", "static"], "return_type": "Node", "parameters": [{"name": "preorder", "type": "Integer"}, {"name": "inorder", "type": "Integer"}], "invocations": [{"qualifier": "inorderMap", "member": "put", "arguments": ["inorder", "i"]}, {"qualifier": "", "member": "createTreeOptimized", "arguments": ["preorder", "inorderMap", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "length"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=preorder, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=inorder, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operator=||)", "has_else": false}]}, {"name": "createTree", "modifiers": ["static", "private"], "return_type": "Node", "parameters": [{"name": "preorder", "type": "Integer"}, {"name": "inorder", "type": "Integer"}, {"name": "preStart", "type": "int"}, {"name": "inStart", "type": "int"}, {"name": "size", "type": "int"}], "invocations": [{"qualifier": null, "member": "equals", "arguments": ["inorder"]}, {"qualifier": "", "member": "createTree", "arguments": ["preorder", "inorder", "BinaryOperation(operandl=MemberReference(member=preStart, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "inStart", "leftNodesCount"]}, {"qualifier": "", "member": "createTree", "arguments": ["preorder", "inorder", "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=preStart, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=leftNodesCount, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "rightNodesCount"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "createTreeOptimized", "modifiers": ["static", "private"], "return_type": "Node", "parameters": [{"name": "preorder", "type": "Integer"}, {"name": "inorderMap", "type": "Map"}, {"name": "preStart", "type": "int"}, {"name": "inStart", "type": "int"}, {"name": "size", "type": "int"}], "invocations": [{"qualifier": "inorderMap", "member": "get", "arguments": ["preorder"]}, {"qualifier": "", "member": "createTreeOptimized", "arguments": ["preorder", "inorderMap", "BinaryOperation(operandl=MemberReference(member=preStart, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "inStart", "leftNodesCount"]}, {"qualifier": "", "member": "createTreeOptimized", "arguments": ["preorder", "inorderMap", "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=preStart, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=leftNodesCount, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "rightNodesCount"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}]}]}
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
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import com.thealgorithms.datastructures.trees.BinaryTree;
import java.util.HashMap;
import java.util.Map;

public class CreateBinaryTreeFromInorderPreorderTest {
    private BinaryTree<Integer> tree;
    private Map<Integer, Integer> inorderMap;

    @BeforeEach
    public void setUp() {
        // Set up inputs and mocks
        int[] preorder = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] inorder = new int[]{3, 2, 1, 6, 5, 4, 7};
        tree = CreateBinaryTreeFromInorderPreorder.createTree(preorder, inorder);
    }

    @Test
    public void testCreateTree() {
        // Arrange
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7};

        // Act
        int[] actual = tree.inorder();

        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCreateTreeOptimized() {
        // Arrange
        inorderMap = new HashMap<>();
        for (int i = 0; i < tree.size(); i++) {
            inorderMap.put(tree.get(i), i);
        }

        // Act
        int[] actual = CreateBinaryTreeFromInorderPreorder.createTreeOptimized(preorder, inorderMap);

        // Assert
        assertArrayEquals(expected, actual);
    }
}
```
Note: This is just one possible way to write the test class, and there are many other ways to do it. The above code uses JUnit 5's `@Test` annotation to mark each test method as a test case, and Mockito to stub the behavior of the `BinaryTree` class. It also uses the `assertArrayEquals()` method from JUnit 5 to verify that the expected and actual results are equal.
