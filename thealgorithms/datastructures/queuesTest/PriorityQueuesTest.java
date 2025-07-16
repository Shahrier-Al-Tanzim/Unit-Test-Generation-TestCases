query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.queues", "imports": [], "classes": [{"class_name": "PriorityQueue", "modifiers": [], "fields": [{"name": "maxSize", "type": "int"}, {"name": "queueArray", "type": "int"}, {"name": "nItems", "type": "int"}], "constructors": [{"parameters": [], "modifiers": []}, {"parameters": [{"name": "size", "type": "int"}], "modifiers": []}], "methods": [{"name": "swim", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "pos", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "sink", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "pos", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=nItems, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=queueArray, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=queueArray, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+))]), operator=<), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=queueArray, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=pos, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=queueArray, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=>=)", "has_else": false}]}, {"name": "insert", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "value", "type": "int"}], "invocations": [{"qualifier": "", "member": "isFull", "arguments": []}, {"qualifier": "", "member": "swim", "arguments": ["nItems"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isFull, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "remove", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}, {"qualifier": "", "member": "sink", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "peek", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isFull", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "getSize", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you could generate a complete, idiomatic JUnit 5 unit test class for the `PriorityQueue` class using the provided JSON metadata:
```java
package com.thealgorithms.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PriorityQueueTest {
    
    private PriorityQueue priorityQueue;
    
    @BeforeEach
    void setUp() {
        // Set up preconditions before each test method
        this.priorityQueue = new PriorityQueue(10);
    }
    
    @Test
    public void swim_shouldSwimElementToTopOfQueue() {
        // Arrange
        int pos = 5;
        
        // Act
        priorityQueue.swim(pos);
        
        // Assert
        assertEquals(priorityQueue.getSize(), 10);
    }
    
    @Test
    public void sink_shouldSinkElementToBottomOfQueue() {
        // Arrange
        int pos = 5;
        
        // Act
        priorityQueue.sink(pos);
        
        // Assert
        assertEquals(priorityQueue.getSize(), 10);
    }
    
    @Test
    public void insert_shouldInsertElementIntoQueue() {
        // Arrange
        int value = 5;
        
        // Act
        priorityQueue.insert(value);
        
        // Assert
        assertEquals(priorityQueue.getSize(), 10);
    }
    
    @Test
    public void remove_shouldRemoveElementFromQueue() {
        // Arrange
        
        // Act
        int value = priorityQueue.remove();
        
        // Assert
        assertEquals(value, 5);
    }
    
    @Test
    public void peek_shouldReturnTopElementOfQueue() {
        // Arrange
        
        // Act
        int value = priorityQueue.peek();
        
        // Assert
        assertEquals(value, 5);
    }
    
    @Test
    public void isEmpty_shouldReturnTrueIfQueueIsEmpty() {
        // Arrange
        
        // Act
        boolean result = priorityQueue.isEmpty();
        
        // Assert
        assertTrue(result);
    }
    
    @Test
    public void isFull_shouldReturnTrueIfQueueIsFull() {
        // Arrange
        
        // Act
        boolean result = priorityQueue.isFull();
        
        // Assert
        assertTrue(result);
    }
    
    @Test
    public void getSize_shouldReturnSizeOfQueue() {
        // Arrange
        
        // Act
        int size = priorityQueue.getSize();
        
        // Assert
        assertEquals(size, 10);
    }
}
```
Note that this is just an example and you may need to modify it based on your specific requirements and test cases.
