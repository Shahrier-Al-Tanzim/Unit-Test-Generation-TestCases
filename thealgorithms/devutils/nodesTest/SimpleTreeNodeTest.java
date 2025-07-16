query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.devutils.nodes", "imports": [], "classes": [{"class_name": "SimpleTreeNode", "modifiers": ["public"], "fields": [{"name": "leftNode", "type": "SimpleTreeNode"}, {"name": "rightNode", "type": "SimpleTreeNode"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}, {"name": "parentNode", "type": "SimpleTreeNode"}], "modifiers": ["public"]}, {"parameters": [{"name": "data", "type": "E"}, {"name": "parentNode", "type": "SimpleTreeNode"}, {"name": "leftNode", "type": "SimpleTreeNode"}, {"name": "rightNode", "type": "SimpleTreeNode"}], "modifiers": ["public"]}], "methods": [{"name": "isLeafNode", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "getLeftNode", "modifiers": ["public"], "return_type": "SimpleTreeNode", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setLeftNode", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "leftNode", "type": "SimpleTreeNode"}], "invocations": [], "conditionals": []}, {"name": "getRightNode", "modifiers": ["public"], "return_type": "SimpleTreeNode", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setRightNode", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "rightNode", "type": "SimpleTreeNode"}], "invocations": [], "conditionals": []}]}]}
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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class SimpleTreeNodeTest {
    private SimpleTreeNode simpleTreeNode;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void isLeafNode_NoChildren_ReturnsTrue() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);

        // Act
        boolean result = simpleTreeNode.isLeafNode();

        // Assert
        assertTrue(result);
    }

    @Test
    public void isLeafNode_HasChildren_ReturnsFalse() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);
        Mockito.when(simpleTreeNode.getLeftNode()).thenReturn(new SimpleTreeNode());
        Mockito.when(simpleTreeNode.getRightNode()).thenReturn(new SimpleTreeNode());

        // Act
        boolean result = simpleTreeNode.isLeafNode();

        // Assert
        assertFalse(result);
    }

    @Test
    public void getLeftNode_NoChildren_ReturnsNull() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);

        // Act
        SimpleTreeNode result = simpleTreeNode.getLeftNode();

        // Assert
        assertNull(result);
    }

    @Test
    public void getLeftNode_HasChildren_ReturnsChild() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);
        Mockito.when(simpleTreeNode.getLeftNode()).thenReturn(new SimpleTreeNode());

        // Act
        SimpleTreeNode result = simpleTreeNode.getLeftNode();

        // Assert
        assertNotNull(result);
    }

    @Test
    public void setLeftNode_SetsChild() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);
        Mockito.when(simpleTreeNode.getLeftNode()).thenReturn(new SimpleTreeNode());

        // Act
        simpleTreeNode.setLeftNode(new SimpleTreeNode());

        // Assert
        verify(simpleTreeNode).setLeftNode(Mockito.any(SimpleTreeNode.class));
    }

    @Test
    public void getRightNode_NoChildren_ReturnsNull() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);

        // Act
        SimpleTreeNode result = simpleTreeNode.getRightNode();

        // Assert
        assertNull(result);
    }

    @Test
    public void getRightNode_HasChildren_ReturnsChild() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);
        Mockito.when(simpleTreeNode.getRightNode()).thenReturn(new SimpleTreeNode());

        // Act
        SimpleTreeNode result = simpleTreeNode.getRightNode();

        // Assert
        assertNotNull(result);
    }

    @Test
    public void setRightNode_SetsChild() {
        // Arrange
        simpleTreeNode = new SimpleTreeNode(null, null);
        Mockito.when(simpleTreeNode.getRightNode()).thenReturn(new SimpleTreeNode());

        // Act
        simpleTreeNode.setRightNode(new SimpleTreeNode());

        // Assert
        verify(simpleTreeNode).setRightNode(Mockito.any(SimpleTreeNode.class));
    }
}
```
