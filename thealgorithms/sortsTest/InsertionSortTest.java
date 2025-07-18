query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": [], "classes": [{"class_name": "InsertionSort", "modifiers": [], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "sort", "arguments": ["array", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "length"]}], "conditionals": []}, {"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}, {"name": "lo", "type": "int"}, {"name": "hi", "type": "int"}], "invocations": [{"qualifier": "SortUtils", "member": "less", "arguments": ["key", "array"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=lo, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=hi, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=), operator=||)", "has_else": false}]}, {"name": "sentinelSort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "findMinIndex", "arguments": ["array"]}, {"qualifier": "SortUtils", "member": "swap", "arguments": ["array", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "minElemIndex"]}, {"qualifier": "SortUtils", "member": "less", "arguments": ["currentValue", "array"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<=), operator=||)", "has_else": false}]}, {"name": "findMinIndex", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "SortUtils", "member": "less", "arguments": ["array", "array"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=minIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=less, postfix_operators=[], prefix_operators=[], qualifier=SortUtils, selectors=[], type_arguments=None)", "has_else": false}]}]}]}
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

result: Here's an example of how you could write a unit test for the `findMinIndex` method in the `InsertionSort` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.sorts;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;

public class InsertionSortTest {
    private InsertionSort sorter;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        sorter = new InsertionSort();
    }

    @Test
    public void testFindMinIndex() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        int minIndex = 0;
        when(sorter.findMinIndex(array)).thenReturn(minIndex);

        // Act
        int result = sorter.findMinIndex(array);

        // Assert
        assertEquals(minIndex, result);
    }
}
```
In this example, we use the `@BeforeEach` annotation to set up the `sorter` instance before each test method. We then use Mockito's `when` and `thenReturn` methods to stub the behavior of the `findMinIndex` method so that it returns a specific value (in this case, the minimum index in the array).

We then call the `findMinIndex` method on the `sorter` instance and assert that the result is equal to the expected value.

Note that we use the `@Test` annotation to indicate that this method is a test method, and we use the `assertEquals` method from JUnit 5's `Assertions` class to verify that the result of the `findMinIndex` method is equal to the expected value.
