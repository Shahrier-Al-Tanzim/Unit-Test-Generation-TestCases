query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": [], "classes": [{"class_name": "AdaptiveMergeSort", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "array", "member": "clone", "arguments": []}, {"qualifier": "", "member": "sort", "arguments": ["array", "aux", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<=)", "has_else": false}]}, {"name": "sort", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "aux", "type": "T"}, {"name": "low", "type": "int"}, {"name": "high", "type": "int"}], "invocations": [{"qualifier": "", "member": "sort", "arguments": ["array", "aux", "low", "mid"]}, {"qualifier": "", "member": "sort", "arguments": ["array", "aux", "BinaryOperation(operandl=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "high"]}, {"qualifier": "", "member": "merge", "arguments": ["array", "aux", "low", "mid", "high"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=low, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=high, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=)", "has_else": false}]}, {"name": "merge", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "aux", "type": "T"}, {"name": "low", "type": "int"}, {"name": "mid", "type": "int"}, {"name": "high", "type": "int"}], "invocations": [{"qualifier": "System", "member": "arraycopy", "arguments": ["array", "low", "aux", "low", "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=high, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=low, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": null, "member": "compareTo", "arguments": ["aux"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=high, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=aux, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=aux, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": true}]}]}]}
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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class AdaptiveMergeSortTest {
    private AdaptiveMergeSort adaptiveMergeSort;

    @BeforeEach
    void setUp() {
        adaptiveMergeSort = new AdaptiveMergeSort();
    }

    @Test
    public void testSort() {
        // Arrange
        String[] array = {"one", "two", "three"};
        String[] aux = {"one", "two", "three"};
        int low = 0;
        int high = 2;

        Mockito.when(array.clone()).thenReturn(aux);
        Mockito.doNothing().when(adaptiveMergeSort).sort(array, aux, low, mid);
        Mockito.doNothing().when(adaptiveMergeSort).sort(array, aux, BinaryOperation(operandl=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), high);
        Mockito.doNothing().when(adaptiveMergeSort).merge(array, aux, low, mid, high);

        // Act
        adaptiveMergeSort.sort(array, aux, low, high);

        // Assert
        verify(adaptiveMergeSort).sort(array, aux, low, mid);
        verify(adaptiveMergeSort).sort(array, aux, BinaryOperation(operandl=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), high);
        verify(adaptiveMergeSort).merge(array, aux, low, mid, high);
    }
}
```
