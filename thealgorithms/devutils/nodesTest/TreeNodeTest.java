query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.devutils.nodes", "imports": [], "classes": [{"class_name": "TreeNode", "modifiers": ["abstract", "public"], "fields": [{"name": "parentNode", "type": "TreeNode"}, {"name": "depth", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}, {"name": "parentNode", "type": "TreeNode"}], "modifiers": ["public"]}], "methods": [{"name": "isLeafNode", "modifiers": ["abstract", "public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isRootNode", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "getParent", "modifiers": ["public"], "return_type": "TreeNode", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setParent", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "parentNode", "type": "TreeNode"}], "invocations": [{"qualifier": null, "member": "getDepth", "arguments": []}], "conditionals": []}, {"name": "getDepth", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you could write a JUnit 5 unit test for the `TreeNode` class:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.thealgorithms.devutils.nodes.TreeNode;

@ExtendWith(MockitoExtension.class)
public class TreeNodeTest {
    @Mock private TreeNode parentNode;
    private TreeNode node;

    @BeforeEach
    void setUp() {
        node = new TreeNode();
    }

    @Test
    public void isLeafNode_shouldReturnTrueForRootNode() {
        // Arrange
        when(parentNode.getDepth()).thenReturn(0);

        // Act
        boolean result = node.isLeafNode();

        // Assert
        assertTrue(result);
    }

    @Test
    public void isRootNode_shouldReturnTrueForRootNode() {
        // Arrange
        when(parentNode.getDepth()).thenReturn(0);

        // Act
        boolean result = node.isRootNode();

        // Assert
        assertTrue(result);
    }

    @Test
    public void getParent_shouldReturnNullForRootNode() {
        // Arrange
        when(parentNode.getDepth()).thenReturn(0);

        // Act
        TreeNode result = node.getParent();

        // Assert
        assertNull(result);
    }

    @Test
    public void setParent_shouldSetParentNode() {
        // Arrange
        when(parentNode.getDepth()).thenReturn(0);

        // Act
        node.setParent(parentNode);

        // Assert
        verify(parentNode).setDepth(node.getDepth());
    }

    @Test
    public void getDepth_shouldReturnZeroForRootNode() {
        // Arrange
        when(parentNode.getDepth()).thenReturn(0);

        // Act
        int result = node.getDepth();

        // Assert
        assertEquals(0, result);
    }
}
```
In this example, we're using Mockito to stub the behavior of the `parentNode` instance and verify that it is called correctly in the `setParent()` method. We're also verifying that the `getDepth()` method returns 0 for the root node.
