query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.misc", "imports": ["java.util.Collections", "java.util.PriorityQueue"], "classes": [{"class_name": "MedianOfRunningArray", "modifiers": ["abstract", "public"], "fields": [{"name": "maxHeap", "type": "PriorityQueue"}, {"name": "minHeap", "type": "PriorityQueue"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "insert", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "e", "type": "T"}], "invocations": [{"qualifier": "minHeap", "member": "isEmpty", "arguments": []}, {"qualifier": "e", "member": "compareTo", "arguments": ["MethodInvocation(arguments=[], member=peek, postfix_operators=[], prefix_operators=[], qualifier=minHeap, selectors=[], type_arguments=None)"]}, {"qualifier": "minHeap", "member": "peek", "arguments": []}, {"qualifier": "maxHeap", "member": "offer", "arguments": ["e"]}, {"qualifier": "maxHeap", "member": "size", "arguments": []}, {"qualifier": "minHeap", "member": "size", "arguments": []}, {"qualifier": "minHeap", "member": "offer", "arguments": ["MethodInvocation(arguments=[], member=poll, postfix_operators=[], prefix_operators=[], qualifier=maxHeap, selectors=[], type_arguments=None)"]}, {"qualifier": "maxHeap", "member": "poll", "arguments": []}, {"qualifier": "minHeap", "member": "offer", "arguments": ["e"]}, {"qualifier": "minHeap", "member": "size", "arguments": []}, {"qualifier": "maxHeap", "member": "size", "arguments": []}, {"qualifier": "maxHeap", "member": "offer", "arguments": ["MethodInvocation(arguments=[], member=poll, postfix_operators=[], prefix_operators=[], qualifier=minHeap, selectors=[], type_arguments=None)"]}, {"qualifier": "minHeap", "member": "poll", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=minHeap, selectors=[], type_arguments=None), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[MethodInvocation(arguments=[], member=peek, postfix_operators=[], prefix_operators=[], qualifier=minHeap, selectors=[], type_arguments=None)], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=e, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=&&)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=maxHeap, selectors=[], type_arguments=None), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=minHeap, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operator=>)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=minHeap, selectors=[], type_arguments=None), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=maxHeap, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operator=>)", "has_else": false}]}, {"name": "median", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "maxHeap", "member": "isEmpty", "arguments": []}, {"qualifier": "minHeap", "member": "isEmpty", "arguments": []}, {"qualifier": "maxHeap", "member": "size", "arguments": []}, {"qualifier": "minHeap", "member": "size", "arguments": []}, {"qualifier": "maxHeap", "member": "peek", "arguments": []}, {"qualifier": "minHeap", "member": "peek", "arguments": []}, {"qualifier": "", "member": "calculateAverage", "arguments": ["maxHeapTop", "minHeapTop"]}, {"qualifier": "maxHeap", "member": "size", "arguments": []}, {"qualifier": "minHeap", "member": "size", "arguments": []}, {"qualifier": "maxHeap", "member": "peek", "arguments": []}, {"qualifier": "minHeap", "member": "peek", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=maxHeap, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=minHeap, selectors=[], type_arguments=None), operator=&&)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=maxHeap, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=minHeap, selectors=[], type_arguments=None), operator===)", "has_else": false}]}, {"name": "calculateAverage", "modifiers": ["abstract", "public"], "return_type": "T", "parameters": [{"name": "a", "type": "T"}, {"name": "b", "type": "T"}], "invocations": [], "conditionals": []}]}]}
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
package com.thealgorithms.misc;

import java.util.Collections;
import java.util.PriorityQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MedianOfRunningArrayTest {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    @BeforeEach
    public void setUp() {
        maxHeap = new PriorityQueue<>();
        minHeap = new PriorityQueue<>();
    }

    @Test
    public void testInsert() {
        // Arrange
        Integer e = 10;
        when(minHeap.isEmpty()).thenReturn(false);
        when(e.compareTo(minHeap.peek())).thenReturn(0);
        when(maxHeap.offer(e)).thenReturn(true);
        when(maxHeap.size()).thenReturn(1);
        when(minHeap.size()).thenReturn(1);
        when(minHeap.offer(MethodInvocation(arguments=[], member=poll, postfix_operators=[], prefix_operators=[], qualifier=maxHeap, selectors=[], type_arguments=None))).thenReturn(true);
        when(maxHeap.poll()).thenReturn(e);

        // Act
        MedianOfRunningArray.insert(e);

        // Assert
        verify(minHeap).isEmpty();
        verify(e).compareTo(minHeap.peek());
        verify(maxHeap).offer(e);
        verify(maxHeap).size();
        verify(minHeap).size();
        verify(minHeap).offer(MethodInvocation(arguments=[], member=poll, postfix_operators=[], prefix_operators=[], qualifier=maxHeap, selectors=[], type_arguments=None));
        verify(maxHeap).poll();
    }

    @Test
    public void testMedian() {
        // Arrange
        when(maxHeap.isEmpty()).thenReturn(false);
        when(minHeap.isEmpty()).thenReturn(false);
        when(maxHeap.size()).thenReturn(1);
        when(minHeap.size()).thenReturn(1);
        when(maxHeap.peek()).thenReturn(10);
        when(minHeap.peek()).thenReturn(5);

        // Act
        MedianOfRunningArray.median();

        // Assert
        verify(maxHeap).isEmpty();
        verify(minHeap).isEmpty();
        verify(maxHeap).size();
        verify(minHeap).size();
        verify(maxHeap).peek();
        verify(minHeap).peek();
    }
}
```
