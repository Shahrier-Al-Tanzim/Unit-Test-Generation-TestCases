query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.Arrays", "java.util.List", "java.util.stream.Collectors"], "classes": [{"class_name": "SortUtils", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "swap", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "i", "type": "int"}, {"name": "j", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=)", "has_else": false}]}, {"name": "less", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "firstElement", "type": "T"}, {"name": "secondElement", "type": "T"}], "invocations": [{"qualifier": "firstElement", "member": "compareTo", "arguments": ["secondElement"]}], "conditionals": []}, {"name": "greater", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "firstElement", "type": "T"}, {"name": "secondElement", "type": "T"}], "invocations": [{"qualifier": "firstElement", "member": "compareTo", "arguments": ["secondElement"]}], "conditionals": []}, {"name": "greaterOrEqual", "modifiers": ["static"], "return_type": "boolean", "parameters": [{"name": "firstElement", "type": "T"}, {"name": "secondElement", "type": "T"}], "invocations": [{"qualifier": "firstElement", "member": "compareTo", "arguments": ["secondElement"]}], "conditionals": []}, {"name": "print", "modifiers": ["static"], "return_type": "void", "parameters": [{"name": "listToPrint", "type": "List"}], "invocations": [{"qualifier": "listToPrint", "member": "stream", "arguments": []}, {"qualifier": null, "member": "map", "arguments": ["MethodReference(expression=MemberReference(member=Object, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=toString, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")], member=joining, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "joining", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["result"]}], "conditionals": []}, {"name": "print", "modifiers": ["static"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=toString, postfix_operators=[], prefix_operators=[], qualifier=Arrays, selectors=[], type_arguments=None)"]}, {"qualifier": "Arrays", "member": "toString", "arguments": ["array"]}], "conditionals": []}, {"name": "flip", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "left", "type": "int"}, {"name": "right", "type": "int"}], "invocations": [{"qualifier": "", "member": "swap", "arguments": ["array", "left", "right"]}], "conditionals": []}, {"name": "isSorted", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "less", "arguments": ["array", "array"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-))])], member=less, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "isSorted", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "list", "type": "List"}], "invocations": [{"qualifier": "list", "member": "size", "arguments": []}, {"qualifier": "", "member": "less", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=get, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None)"]}, {"qualifier": "list", "member": "get", "arguments": ["i"]}, {"qualifier": "list", "member": "get", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None), MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=get, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None)], member=less, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}]}]}
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
package com.thealgorithms.sorts;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class SortUtilsTest {
    private SortUtils sortUtils;
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        list = Arrays.asList(1, 2, 3, 4, 5);
        sortUtils = new SortUtils();
    }

    @Test
    public void testSwap() {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        sortUtils.swap(array, 1, 3);

        assertEquals(2, array[1]);
        assertEquals(4, array[3]);
    }

    @Test
    public void testLess() {
        Integer firstElement = list.get(0);
        Integer secondElement = list.get(1);

        boolean result = sortUtils.less(firstElement, secondElement);

        assertTrue(result);
    }

    @Test
    public void testGreater() {
        Integer firstElement = list.get(0);
        Integer secondElement = list.get(1);

        boolean result = sortUtils.greater(firstElement, secondElement);

        assertFalse(result);
    }

    @Test
    public void testGreaterOrEqual() {
        Integer firstElement = list.get(0);
        Integer secondElement = list.get(1);

        boolean result = sortUtils.greaterOrEqual(firstElement, secondElement);

        assertTrue(result);
    }

    @Test
    public void testPrint() {
        List<String> listToPrint = Arrays.asList("a", "b");

        sortUtils.print(listToPrint);

        verify(System.out).println("ab");
    }

    @Test
    public void testFlip() {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        sortUtils.flip(array, 1, 3);

        assertEquals(2, array[1]);
        assertEquals(4, array[3]);
    }

    @Test
    public void testIsSorted() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        boolean result = sortUtils.isSorted(list);

        assertTrue(result);
    }
}
```
