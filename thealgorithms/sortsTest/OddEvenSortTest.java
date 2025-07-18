query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": [], "classes": [{"class_name": "OddEvenSort", "modifiers": ["final", "public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "performOddSort", "arguments": ["array"]}, {"qualifier": "", "member": "performEvenSort", "arguments": ["array"]}], "conditionals": []}, {"name": "performOddSort", "modifiers": ["private"], "return_type": "boolean", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["array"]}, {"qualifier": "SortUtils", "member": "swap", "arguments": ["array", "i", "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+))])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}, {"name": "performEvenSort", "modifiers": ["private"], "return_type": "boolean", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["array"]}, {"qualifier": "SortUtils", "member": "swap", "arguments": ["array", "i", "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+))])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}]}]}
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

result: Here are the generated test classes for each method in the JSON array of method-metadata:
```java
package com.thealgorithms.sorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class OddEvenSortTest {
    private OddEvenSort oddEvenSort;

    @BeforeEach
    void setUp() {
        oddEvenSort = new OddEvenSort();
    }

    @Test
    public void sort_shouldSortArrayOfIntegers() {
        // Arrange
        int[] array = {3, 2, 1, 4, 5};
        Mockito.when(oddEvenSort.performOddSort(array)).thenReturn(true);
        Mockito.when(oddEvenSort.performEvenSort(array)).thenReturn(true);

        // Act
        oddEvenSort.sort(array);

        // Assert
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array);
    }
}
```
```java
package com.thealgorithms.sorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class OddEvenSortTest {
    private OddEvenSort oddEvenSort;

    @BeforeEach
    void setUp() {
        oddEvenSort = new OddEvenSort();
    }

    @Test
    public void performOddSort_shouldSortArrayOfIntegers() {
        // Arrange
        int[] array = {3, 2, 1, 4, 5};
        Mockito.when(oddEvenSort.compareTo(array)).thenReturn(true);
        Mockito.when(oddEvenSort.swap(array, i, BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+))).thenReturn(true);
        Mockito.when(oddEvenSort.performOddSort(array)).thenReturn(true);

        // Act
        oddEvenSort.performOddSort(array);

        // Assert
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array);
    }
}
```
```java
package com.thealgorithms.sorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class OddEvenSortTest {
    private OddEvenSort oddEvenSort;

    @BeforeEach
    void setUp() {
        oddEvenSort = new OddEvenSort();
    }

    @Test
    public void performEvenSort_shouldSortArrayOfIntegers() {
        // Arrange
        int[] array = {3, 2, 1, 4, 5};
        Mockito.when(oddEvenSort.compareTo(array)).thenReturn(true);
        Mockito.when(oddEvenSort.swap(array, i, BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+))).thenReturn(true);
        Mockito.when(oddEvenSort.performEvenSort(array)).thenReturn(true);

        // Act
        oddEvenSort.performEvenSort(array);

        // Assert
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array);
    }
}
```
