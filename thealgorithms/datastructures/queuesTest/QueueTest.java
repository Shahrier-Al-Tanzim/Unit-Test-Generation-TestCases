query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.queues", "imports": [], "classes": [{"class_name": "Queue", "modifiers": ["public", "final"], "fields": [{"name": "DEFAULT_CAPACITY", "type": "int"}, {"name": "maxSize", "type": "int"}, {"name": "queueArray", "type": "Object"}, {"name": "front", "type": "int"}, {"name": "rear", "type": "int"}, {"name": "nItems", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "capacity", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "insert", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "element", "type": "T"}], "invocations": [{"qualifier": "", "member": "isFull", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isFull, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "remove", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "peekFront", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "peekRear", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isFull", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "getSize", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"[\")"]}, {"qualifier": "sb", "member": "append", "arguments": ["queueArray"]}, {"qualifier": null, "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\", \")"]}, {"qualifier": "sb", "member": "setLength", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=sb, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=-)"]}, {"qualifier": "sb", "member": "length", "arguments": []}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"]\")"]}, {"qualifier": "sb", "member": "toString", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}]}]}
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

result: 
Here are the generated JUnit 5 unit tests for the given method-metadata:
```java
package com.thealgorithms.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class QueueTest {
    private Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @Test
    public void testInsert() {
        // Arrange
        Integer element = 10;
        when(queue.isFull()).thenReturn(false);

        // Act
        boolean result = queue.insert(element);

        // Assert
        assertTrue(result);
        verify(queue).isFull();
    }

    @Test
    public void testRemove() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);

        // Act
        Integer result = queue.remove();

        // Assert
        assertEquals(10, result);
        verify(queue).isEmpty();
    }

    @Test
    public void testPeekFront() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);

        // Act
        Integer result = queue.peekFront();

        // Assert
        assertEquals(10, result);
        verify(queue).isEmpty();
    }

    @Test
    public void testPeekRear() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);

        // Act
        Integer result = queue.peekRear();

        // Assert
        assertEquals(10, result);
        verify(queue).isEmpty();
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        boolean result = queue.isEmpty();

        // Assert
        assertTrue(result);
        verify(queue).isEmpty();
    }

    @Test
    public void testIsFull() {
        // Arrange
        when(queue.isFull()).thenReturn(true);

        // Act
        boolean result = queue.isFull();

        // Assert
        assertTrue(result);
        verify(queue).isFull();
    }

    @Test
    public void testGetSize() {
        // Arrange
        when(queue.getSize()).thenReturn(10);

        // Act
        int result = queue.getSize();

        // Assert
        assertEquals(10, result);
        verify(queue).getSize();
    }

    @Test
    public void testToString() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        StringBuilder sb = new StringBuilder();
        when(sb.append("[")).thenReturn(sb);
        when(sb.append(queueArray)).thenReturn(sb);
        when(sb.append(", ")).thenReturn(sb);
        when(sb.setLength(2)).thenReturn(sb);
        when(sb.append("]")).thenReturn(sb);
        when(sb.toString()).thenReturn("[10, 20, 30]");

        // Act
        String result = queue.toString();

        // Assert
        assertEquals("[10, 20, 30]", result);
        verify(queue).isEmpty();
    }
}
```
