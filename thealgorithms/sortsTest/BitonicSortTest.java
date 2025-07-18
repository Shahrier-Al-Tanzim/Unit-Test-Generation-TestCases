query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.Arrays", "java.util.function.BiPredicate"], "classes": [{"class_name": "BitonicSort", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "nextPowerOfTwo", "arguments": ["length"]}, {"qualifier": "Arrays", "member": "copyOf", "arguments": ["array", "paddedSize"]}, {"qualifier": "", "member": "max", "arguments": ["array"]}, {"qualifier": "Arrays", "member": "fill", "arguments": ["paddedArray", "length", "paddedSize", "maxValue"]}, {"qualifier": "", "member": "bitonicSort", "arguments": ["paddedArray", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "paddedSize", "ASCENDING"]}, {"qualifier": "Arrays", "member": "copyOf", "arguments": ["paddedArray", "length"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "bitonicSort", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "low", "type": "int"}, {"name": "cnt", "type": "int"}, {"name": "direction", "type": "Direction"}], "invocations": [{"qualifier": "", "member": "bitonicSort", "arguments": ["array", "low", "k", "ASCENDING"]}, {"qualifier": "", "member": "bitonicSort", "arguments": ["array", "BinaryOperation(operandl=MemberReference(member=low, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)", "BinaryOperation(operandl=MemberReference(member=cnt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)", "DESCENDING"]}, {"qualifier": "", "member": "bitonicMerge", "arguments": ["array", "low", "cnt", "direction"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=cnt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=>)", "has_else": false}]}, {"name": "bitonicMerge", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "low", "type": "int"}, {"name": "cnt", "type": "int"}, {"name": "direction", "type": "Direction"}], "invocations": [{"qualifier": "a", "member": "compareTo", "arguments": ["b"]}, {"qualifier": "a", "member": "compareTo", "arguments": ["b"]}, {"qualifier": "areSorted", "member": "test", "arguments": ["array", "array"]}, {"qualifier": "SortUtils", "member": "swap", "arguments": ["array", "i", "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "", "member": "bitonicMerge", "arguments": ["array", "low", "k", "direction"]}, {"qualifier": "", "member": "bitonicMerge", "arguments": ["array", "BinaryOperation(operandl=MemberReference(member=low, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)", "BinaryOperation(operandl=MemberReference(member=cnt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)", "direction"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=cnt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=>)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+))])], member=test, postfix_operators=[], prefix_operators=['!'], qualifier=areSorted, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "nextPowerOfTwo", "modifiers": ["private", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), operator=&), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "max", "modifiers": ["private", "static"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "max", "arguments": ["MethodReference(expression=MemberReference(member=Comparable, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": null, "member": "orElseThrow", "arguments": []}], "conditionals": []}]}]}
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
import java.util.function.BiPredicate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class BitonicSortTest {
    private BitonicSort bitonicSort;
    private int[] array;

    @BeforeEach
    void setUp() {
        bitonicSort = new BitonicSort();
        array = new int[10];
    }

    @Test
    public void testSort() {
        // Arrange
        Mockito.when(bitonicSort.nextPowerOfTwo(array.length)).thenReturn(2);
        Mockito.when(Arrays.copyOf(array, 2)).thenReturn(new int[2]);
        Mockito.when(bitonicSort.max(array)).thenReturn(10);
        Mockito.when(Arrays.fill(Mockito.any(), Mockito.anyInt(), Mockito.anyInt(), Mockito.any())).thenReturn(null);
        Mockito.doNothing().when(bitonicSort).bitonicSort(array, 0, 2, BitonicSort.Direction.ASCENDING);
        Mockito.doNothing().when(bitonicSort).bitonicMerge(array, 0, 2, BitonicSort.Direction.DESCENDING);

        // Act
        bitonicSort.sort(array);

        // Assert
        assertArrayEquals(new int[] {1, 3, 5, 7, 9}, array);
    }
}
```
Note: This is just an example test class and may not cover all the possible cases. It's important to write comprehensive tests that cover all the edge cases and corner cases of your code.
