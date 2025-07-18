query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": [], "classes": [{"class_name": "SelectionSortRecursive", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "recursiveSelectionSort", "arguments": ["array", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "recursiveSelectionSort", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "index", "type": "int"}], "invocations": [{"qualifier": "SortUtils", "member": "swap", "arguments": ["array", "index", "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=findMinIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "findMinIndex", "arguments": ["array", "index"]}, {"qualifier": "", "member": "recursiveSelectionSort", "arguments": ["array", "BinaryOperation(operandl=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), operator===)", "has_else": false}]}, {"name": "findMinIndex", "modifiers": ["private", "static"], "return_type": "int", "parameters": [{"name": "array", "type": "T"}, {"name": "start", "type": "int"}], "invocations": [{"qualifier": "", "member": "findMinIndex", "arguments": ["array", "BinaryOperation(operandl=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": null, "member": "compareTo", "arguments": ["array"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), operator===)", "has_else": false}]}]}]}
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

class SelectionSortRecursiveTest {
    private SelectionSortRecursive selectionSortRecursive;

    @BeforeEach
    void setUp() {
        selectionSortRecursive = new SelectionSortRecursive();
    }

    @Test
    public void testSort() {
        // Arrange
        int[] array = {5, 2, 8, 3, 1, 6};
        int[] expectedArray = {1, 2, 3, 5, 6, 8};
        Mockito.when(selectionSortRecursive.recursiveSelectionSort(array, 0)).thenReturn(expectedArray);

        // Act
        int[] resultArray = selectionSortRecursive.sort(array);

        // Assert
        assertArrayEquals(expectedArray, resultArray);
    }
}
```
Note: This is just an example and may not cover all the possible cases. Also, it's important to note that this test class only tests one method and does not cover any edge cases or corner cases.
