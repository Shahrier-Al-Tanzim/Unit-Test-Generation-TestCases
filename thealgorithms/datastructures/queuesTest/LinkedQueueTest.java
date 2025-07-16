query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.queues", "imports": ["java.util.Iterator", "java.util.NoSuchElementException"], "classes": [{"class_name": "LinkedQueue", "modifiers": ["public"], "fields": [{"name": "front", "type": "Node"}, {"name": "rear", "type": "Node"}, {"name": "size", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "enqueue", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "data", "type": "T"}], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "dequeue", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}, {"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "peekFront", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "peekRear", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "peek", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "pos", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=pos, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=pos, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>), operator=||)", "has_else": false}]}, {"name": "iterator", "modifiers": ["public"], "return_type": "Iterator", "parameters": [], "invocations": [{"qualifier": "", "member": "hasNext", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=hasNext, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "size", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "clear", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}, {"qualifier": "sb", "member": "append", "arguments": ["data"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\", \")"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=']')"]}, {"qualifier": "sb", "member": "toString", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}]}]}]}
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

result: Here are the generated JUnit 5 unit tests for each method in the given JSON array of method-metadata for the `LinkedQueue` class:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LinkedQueueTest {
    @Mock private Node front;
    @Mock private Node rear;
    @Mock private Iterator<T> iterator;

    private LinkedQueue<T> queue;

    @BeforeEach
    public void setUp() {
        // Set up preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void isEmpty_whenQueueIsEmpty_shouldReturnTrue() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        boolean result = queue.isEmpty();

        // Assert
        assertTrue(result);
    }

    @Test
    public void isEmpty_whenQueueIsNotEmpty_shouldReturnFalse() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);

        // Act
        boolean result = queue.isEmpty();

        // Assert
        assertFalse(result);
    }

    @Test
    public void enqueue_whenDataIsNull_shouldThrowIllegalArgumentException() {
        // Arrange
        when(queue.enqueue(null)).thenThrow(new IllegalArgumentException());

        // Act
        try {
            queue.enqueue(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Data cannot be null", e.getMessage());
        }
    }

    @Test
    public void enqueue_whenQueueIsEmpty_shouldAddNodeToFront() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);
        when(queue.enqueue(any())).thenReturn();

        // Act
        queue.enqueue("data");

        // Assert
        verify(queue, times(1)).enqueue("data");
    }

    @Test
    public void enqueue_whenQueueIsNotEmpty_shouldAddNodeToRear() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        when(queue.enqueue(any())).thenReturn();

        // Act
        queue.enqueue("data");

        // Assert
        verify(queue, times(1)).enqueue("data");
    }

    @Test
    public void dequeue_whenQueueIsEmpty_shouldThrowNoSuchElementException() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        try {
            queue.dequeue();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertEquals("Queue is empty", e.getMessage());
        }
    }

    @Test
    public void dequeue_whenQueueIsNotEmpty_shouldRemoveNodeFromFront() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        when(queue.dequeue()).thenReturn("data");

        // Act
        String result = queue.dequeue();

        // Assert
        assertEquals("data", result);
    }

    @Test
    public void peekFront_whenQueueIsEmpty_shouldThrowNoSuchElementException() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        try {
            queue.peekFront();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertEquals("Queue is empty", e.getMessage());
        }
    }

    @Test
    public void peekFront_whenQueueIsNotEmpty_shouldReturnData() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        when(queue.peekFront()).thenReturn("data");

        // Act
        String result = queue.peekFront();

        // Assert
        assertEquals("data", result);
    }

    @Test
    public void peekRear_whenQueueIsEmpty_shouldThrowNoSuchElementException() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        try {
            queue.peekRear();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertEquals("Queue is empty", e.getMessage());
        }
    }

    @Test
    public void peekRear_whenQueueIsNotEmpty_shouldReturnData() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        when(queue.peekRear()).thenReturn("data");

        // Act
        String result = queue.peekRear();

        // Assert
        assertEquals("data", result);
    }

    @Test
    public void iterator_whenHasNextIsFalse_shouldReturnEmptyIterator() {
        // Arrange
        when(queue.hasNext()).thenReturn(false);

        // Act
        Iterator<T> result = queue.iterator();

        // Assert
        assertNotNull(result);
        assertFalse(result.hasNext());
    }

    @Test
    public void iterator_whenHasNextIsTrue_shouldReturnIteratorWithData() {
        // Arrange
        when(queue.hasNext()).thenReturn(true);
        when(queue.next()).thenReturn("data");

        // Act
        Iterator<T> result = queue.iterator();

        // Assert
        assertNotNull(result);
        assertTrue(result.hasNext());
        assertEquals("data", result.next());
    }

    @Test
    public void size_whenQueueIsEmpty_shouldReturnZero() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        int result = queue.size();

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void size_whenQueueIsNotEmpty_shouldReturnSize() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        when(queue.size()).thenReturn(1);

        // Act
        int result = queue.size();

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void clear_whenQueueIsEmpty_shouldDoNothing() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        queue.clear();

        // Assert
        verify(queue, never()).clear();
    }

    @Test
    public void clear_whenQueueIsNotEmpty_shouldClearQueue() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        when(queue.clear()).thenReturn();

        // Act
        queue.clear();

        // Assert
        verify(queue, times(1)).clear();
    }

    @Test
    public void toString_whenQueueIsEmpty_shouldReturnEmptyString() {
        // Arrange
        when(queue.isEmpty()).thenReturn(true);

        // Act
        String result = queue.toString();

        // Assert
        assertEquals("", result);
    }

    @Test
    public void toString_whenQueueIsNotEmpty_shouldReturnStringRepresentation() {
        // Arrange
        when(queue.isEmpty()).thenReturn(false);
        when(queue.toString()).thenReturn("[data]");

        // Act
        String result = queue.toString();

        // Assert
        assertEquals("[data]", result);
    }
}
```
