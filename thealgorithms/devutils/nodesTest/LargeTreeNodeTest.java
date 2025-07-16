query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.devutils.nodes", "imports": ["java.util.Collection"], "classes": [{"class_name": "LargeTreeNode", "modifiers": ["public"], "fields": [{"name": "childNodes", "type": "Collection"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}, {"name": "parentNode", "type": "LargeTreeNode"}], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}, {"name": "parentNode", "type": "LargeTreeNode"}, {"name": "childNodes", "type": "Collection"}], "modifiers": ["public"]}], "methods": [{"name": "isLeafNode", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [{"qualifier": "childNodes", "member": "isEmpty", "arguments": []}], "conditionals": []}, {"name": "getChildNodes", "modifiers": ["public"], "return_type": "Collection", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setChildNodes", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "childNodes", "type": "Collection"}], "invocations": [], "conditionals": []}]}]}
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
package com.thealgorithms.devutils.nodes;

import java.util.Collection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class LargeTreeNodeTest {
    private Collection<LargeTreeNode> childNodes;
    private LargeTreeNode node;

    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void isLeafNode_EmptyChildNodes_ReturnsTrue() {
        // Arrange
        childNodes = new ArrayList<>();
        node = new LargeTreeNode(null, null, childNodes);

        // Act
        boolean result = node.isLeafNode();

        // Assert
        assertTrue(result);
    }

    @Test
    public void isLeafNode_NonEmptyChildNodes_ReturnsFalse() {
        // Arrange
        childNodes = new ArrayList<>();
        childNodes.add(new LargeTreeNode(null, null, childNodes));
        node = new LargeTreeNode(null, null, childNodes);

        // Act
        boolean result = node.isLeafNode();

        // Assert
        assertFalse(result);
    }

    @Test
    public void getChildNodes_ReturnsChildNodes() {
        // Arrange
        childNodes = new ArrayList<>();
        node = new LargeTreeNode(null, null, childNodes);

        // Act
        Collection<LargeTreeNode> result = node.getChildNodes();

        // Assert
        assertEquals(childNodes, result);
    }

    @Test
    public void setChildNodes_SetsChildNodes() {
        // Arrange
        childNodes = new ArrayList<>();
        node = new LargeTreeNode(null, null, childNodes);

        // Act
        Collection<LargeTreeNode> newChildNodes = new ArrayList<>();
        newChildNodes.add(new LargeTreeNode(null, null, newChildNodes));
        node.setChildNodes(newChildNodes);

        // Assert
        assertEquals(newChildNodes, childNodes);
    }
}
```
