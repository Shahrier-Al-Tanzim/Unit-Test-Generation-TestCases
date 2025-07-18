query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.stacks", "imports": ["java.util.NoSuchElementException", "java.util.Stack"], "classes": [{"class_name": "GreatestElementConstantTime", "modifiers": ["public"], "fields": [{"name": "mainStack", "type": "Stack"}, {"name": "maxStack", "type": "Stack"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "push", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "data", "type": "int"}], "invocations": [{"qualifier": "mainStack", "member": "isEmpty", "arguments": []}, {"qualifier": "mainStack", "member": "push", "arguments": ["data"]}, {"qualifier": "maxStack", "member": "push", "arguments": ["data"]}, {"qualifier": "mainStack", "member": "push", "arguments": ["data"]}, {"qualifier": "maxStack", "member": "peek", "arguments": []}, {"qualifier": "maxStack", "member": "push", "arguments": ["data"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=mainStack, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MethodInvocation(arguments=[], member=peek, postfix_operators=[], prefix_operators=[], qualifier=maxStack, selectors=[], type_arguments=None), operator=>)", "has_else": false}]}, {"name": "pop", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "mainStack", "member": "isEmpty", "arguments": []}, {"qualifier": "mainStack", "member": "pop", "arguments": []}, {"qualifier": "maxStack", "member": "peek", "arguments": []}, {"qualifier": "maxStack", "member": "pop", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=mainStack, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=ele, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MethodInvocation(arguments=[], member=peek, postfix_operators=[], prefix_operators=[], qualifier=maxStack, selectors=[], type_arguments=None), operator===)", "has_else": false}]}, {"name": "getMaximumElement", "modifiers": ["public"], "return_type": "Integer", "parameters": [], "invocations": [{"qualifier": "maxStack", "member": "isEmpty", "arguments": []}, {"qualifier": "maxStack", "member": "peek", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=maxStack, selectors=[], type_arguments=None)", "has_else": false}]}]}]}
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
package com.thealgorithms.stacks;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.NoSuchElementException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreatestElementConstantTimeTest {
    @Mock private Stack<Integer> mainStack;
    @Mock private Stack<Integer> maxStack;

    private GreatestElementConstantTime greatestElementConstantTime;

    @BeforeEach
    public void setUp() {
        greatestElementConstantTime = new GreatestElementConstantTime();
        greatestElementConstantTime.mainStack = mainStack;
        greatestElementConstantTime.maxStack = maxStack;
    }

    @Test
    public void push_whenMainStackIsEmptyAndDataIsGreaterThanMaxStackPeek_shouldPushToBothStacks() {
        int data = 10;
        when(mainStack.isEmpty()).thenReturn(true);
        when(maxStack.peek()).thenReturn(5);

        greatestElementConstantTime.push(data);

        verify(mainStack).push(data);
        verify(maxStack).push(data);
    }

    @Test
    public void push_whenMainStackIsEmptyAndDataIsLessThanMaxStackPeek_shouldPushToMainStackOnly() {
        int data = 5;
        when(mainStack.isEmpty()).thenReturn(true);
        when(maxStack.peek()).thenReturn(10);

        greatestElementConstantTime.push(data);

        verify(mainStack).push(data);
        verify(maxStack, never()).push(anyInt());
    }

    @Test
    public void push_whenMainStackIsNotEmptyAndDataIsGreaterThanMaxStackPeek_shouldPushToBothStacks() {
        int data = 10;
        when(mainStack.isEmpty()).thenReturn(false);
        when(maxStack.peek()).thenReturn(5);

        greatestElementConstantTime.push(data);

        verify(mainStack).push(data);
        verify(maxStack).push(data);
    }

    @Test
    public void push_whenMainStackIsNotEmptyAndDataIsLessThanMaxStackPeek_shouldPushToMainStackOnly() {
        int data = 5;
        when(mainStack.isEmpty()).thenReturn(false);
        when(maxStack.peek()).thenReturn(10);

        greatestElementConstantTime.push(data);

        verify(mainStack).push(data);
        verify(maxStack, never()).push(anyInt());
    }

    @Test
    public void pop_whenMainStackIsEmptyAndMaxStackPeekEqualsData_shouldPopFromBothStacks() {
        int data = 10;
        when(mainStack.isEmpty()).thenReturn(true);
        when(maxStack.peek()).thenReturn(data);

        greatestElementConstantTime.pop();

        verify(mainStack).pop();
        verify(maxStack).pop();
    }

    @Test
    public void pop_whenMainStackIsEmptyAndMaxStackPeekDoesNotEqualData_shouldPopFromBothStacks() {
        int data = 5;
        when(mainStack.isEmpty()).thenReturn(true);
        when(maxStack.peek()).thenReturn(10);

        greatestElementConstantTime.pop();

        verify(mainStack).pop();
        verify(maxStack, never()).pop();
    }

    @Test
    public void pop_whenMainStackIsNotEmptyAndMaxStackPeekEqualsData_shouldPopFromBothStacks() {
        int data = 10;
        when(mainStack.isEmpty()).thenReturn(false);
        when(maxStack.peek()).thenReturn(data);

        greatestElementConstantTime.pop();

        verify(mainStack).pop();
        verify(maxStack).pop();
    }

    @Test
    public void pop_whenMainStackIsNotEmptyAndMaxStackPeekDoesNotEqualData_shouldPopFromBothStacks() {
        int data = 5;
        when(mainStack.isEmpty()).thenReturn(false);
        when(maxStack.peek()).thenReturn(10);

        greatestElementConstantTime.pop();

        verify(mainStack).pop();
        verify(maxStack, never()).pop();
    }

    @Test
    public void getMaximumElement_whenMainStackIsEmptyAndMaxStackPeekEqualsData_shouldReturnMaxStackPeek() {
        int data = 10;
        when(mainStack.isEmpty()).thenReturn(true);
        when(maxStack.peek()).thenReturn(data);

        assertEquals(data, greatestElementConstantTime.getMaximumElement());
    }

    @Test
    public void getMaximumElement_whenMainStackIsEmptyAndMaxStackPeekDoesNotEqualData_shouldThrowNoSuchElementException() {
        when(mainStack.isEmpty()).thenReturn(true);
        when(maxStack.peek()).thenReturn(10);

        assertThrows(NoSuchElementException.class, () -> greatestElementConstantTime.getMaximumElement());
    }

    @Test
    public void getMaximumElement_whenMainStackIsNotEmptyAndMaxStackPeekEqualsData_shouldReturnMaxStackPeek() {
        int data = 10;
        when(mainStack.isEmpty()).thenReturn(false);
        when(maxStack.peek()).thenReturn(data);

        assertEquals(data, greatestElementConstantTime.getMaximumElement());
    }

    @Test
    public void getMaximumElement_whenMainStackIsNotEmptyAndMaxStackPeekDoesNotEqualData_shouldThrowNoSuchElementException() {
        when(mainStack.isEmpty()).thenReturn(false);
        when(maxStack.peek()).thenReturn(10);

        assertThrows(NoSuchElementException.class, () -> greatestElementConstantTime.getMaximumElement());
    }
}
```
