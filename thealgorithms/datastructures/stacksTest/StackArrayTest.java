query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.stacks", "imports": [], "classes": [{"class_name": "StackArray", "modifiers": ["public"], "fields": [{"name": "DEFAULT_CAPACITY", "type": "int"}, {"name": "maxSize", "type": "int"}, {"name": "stackArray", "type": "T"}, {"name": "top", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "size", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "push", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "value", "type": "T"}], "invocations": [{"qualifier": "", "member": "isFull", "arguments": []}, {"qualifier": "", "member": "resize", "arguments": ["BinaryOperation(operandl=MemberReference(member=maxSize, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=*)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isFull, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "pop", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}, {"qualifier": "", "member": "resize", "arguments": ["BinaryOperation(operandl=MemberReference(member=maxSize, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=top, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operandr=BinaryOperation(operandl=MemberReference(member=maxSize, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4), operator=/), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=maxSize, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=DEFAULT_CAPACITY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>), operator=&&)", "has_else": false}]}, {"name": "peek", "modifiers": ["public"], "return_type": "T", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "resize", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "newSize", "type": "int"}], "invocations": [{"qualifier": "System", "member": "arraycopy", "arguments": ["stackArray", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "newArray", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=top, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": []}, {"name": "isFull", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "makeEmpty", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [], "conditionals": []}, {"name": "size", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"StackArray [\")"]}, {"qualifier": "sb", "member": "append", "arguments": ["stackArray"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\", \")"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"]\")"]}, {"qualifier": "sb", "member": "toString", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=top, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}]}]}]}
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

result: Here are the generated JUnit 5 unit tests for each method in the provided JSON array of method-metadata:
```java
package com.thealgorithms.datastructures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class StackArrayTest {
    private StackArray<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new StackArray<>();
    }

    @Test
    public void testPush() {
        // Arrange
        int value = 10;

        // Act
        stack.push(value);

        // Assert
        assertEquals(1, stack.size());
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPop() {
        // Arrange
        int value = 10;
        stack.push(value);

        // Act
        Integer result = stack.pop();

        // Assert
        assertEquals(value, result);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        // Arrange
        int value = 10;
        stack.push(value);

        // Act
        Integer result = stack.peek();

        // Assert
        assertEquals(value, result);
    }

    @Test
    public void testResize() {
        // Arrange
        int newSize = 2;
        Mockito.when(stack.isFull()).thenReturn(true);

        // Act
        stack.resize(newSize);

        // Assert
        assertEquals(newSize, stack.maxSize);
    }

    @Test
    public void testIsFull() {
        // Arrange
        Mockito.when(stack.isEmpty()).thenReturn(false);

        // Act
        boolean result = stack.isFull();

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        Mockito.when(stack.isEmpty()).thenReturn(true);

        // Act
        boolean result = stack.isEmpty();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testMakeEmpty() {
        // Arrange
        int value = 10;
        stack.push(value);

        // Act
        stack.makeEmpty();

        // Assert
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        // Arrange
        int value = 10;
        stack.push(value);

        // Act
        int result = stack.size();

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testToString() {
        // Arrange
        String expected = "StackArray [10]";
        int value = 10;
        stack.push(value);

        // Act
        String result = stack.toString();

        // Assert
        assertEquals(expected, result);
    }
}
```
