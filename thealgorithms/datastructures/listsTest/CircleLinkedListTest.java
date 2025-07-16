query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.lists", "imports": [], "classes": [{"class_name": "CircleLinkedList", "modifiers": ["public"], "fields": [{"name": "size", "type": "int"}, {"name": "head", "type": "Node"}, {"name": "tail", "type": "Node"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "getSize", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "append", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "value", "type": "E"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=tail, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}]}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "sb", "member": "append", "arguments": ["value"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\", \")"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" ]\")"]}, {"qualifier": "sb", "member": "toString", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[]), operandr=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=)", "has_else": false}]}, {"name": "remove", "modifiers": ["public"], "return_type": "E", "parameters": [{"name": "pos", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=pos, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=pos, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=destroy, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=tail, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}]}]}
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
package com.thealgorithms.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class CircleLinkedListTest {
    private CircleLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new CircleLinkedList<>();
    }

    @Test
    public void getSize_emptyList_returnsZero() {
        // Arrange
        int expected = 0;

        // Act
        int actual = list.getSize();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void append_valueAddedToEmptyList_returnsValue() {
        // Arrange
        Integer value = 1;
        Mockito.when(list.size()).thenReturn(0);
        Mockito.doNothing().when(list).append(value);

        // Act
        list.append(value);

        // Assert
        verify(list, times(1)).append(value);
    }

    @Test
    public void append_valueAddedToNonEmptyList_returnsValue() {
        // Arrange
        Integer value = 1;
        Mockito.when(list.size()).thenReturn(0).thenReturn(1);
        Mockito.doNothing().when(list).append(value);

        // Act
        list.append(value);
        list.append(value);

        // Assert
        verify(list, times(2)).append(value);
    }

    @Test
    public void remove_posOutOfBounds_throwsException() {
        // Arrange
        int pos = -1;

        // Act
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> list.remove(pos));

        // Assert
        assertEquals("Position out of bounds", exception.getMessage());
    }

    @Test
    public void remove_posInBounds_returnsValue() {
        // Arrange
        Integer value = 1;
        Mockito.when(list.size()).thenReturn(0).thenReturn(1);
        Mockito.doNothing().when(list).append(value);
        Mockito.when(list.get(0)).thenReturn(value);

        // Act
        list.remove(0);

        // Assert
        verify(list, times(1)).remove(0);
    }
}
```
