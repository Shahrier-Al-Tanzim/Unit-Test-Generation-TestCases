query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": [], "classes": [{"class_name": "CycleSort", "modifiers": [], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "findPosition", "arguments": ["array", "cycleStart", "item"]}, {"qualifier": "", "member": "placeItem", "arguments": ["array", "item", "pos"]}, {"qualifier": "", "member": "findPosition", "arguments": ["array", "cycleStart", "item"]}, {"qualifier": "", "member": "placeItem", "arguments": ["array", "item", "pos"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=pos, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=cycleStart, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}, {"name": "findPosition", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "array", "type": "T"}, {"name": "cycleStart", "type": "int"}, {"name": "item", "type": "T"}], "invocations": [{"qualifier": "SortUtils", "member": "less", "arguments": ["array", "item"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=item, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=less, postfix_operators=[], prefix_operators=[], qualifier=SortUtils, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "placeItem", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}, {"name": "item", "type": "T"}, {"name": "pos", "type": "int"}], "invocations": [{"qualifier": "item", "member": "compareTo", "arguments": ["array"]}, {"qualifier": "", "member": "replace", "arguments": ["array", "pos", "item"]}], "conditionals": []}, {"name": "replace", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}, {"name": "pos", "type": "int"}, {"name": "item", "type": "T"}], "invocations": [], "conditionals": []}]}]}
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CycleSortTest {
    @Mock
    private SortUtils sortUtils;

    private CycleSort cycleSort;

    @BeforeEach
    void setUp() {
        cycleSort = new CycleSort();
    }

    @Test
    public void testSort_WhenArrayIsEmpty_ShouldReturnOriginalArray() {
        // Arrange
        List<Integer> array = Arrays.asList();

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList());
    }

    @Test
    public void testSort_WhenArrayHasOneElement_ShouldReturnOriginalArray() {
        // Arrange
        List<Integer> array = Arrays.asList(1);

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList(1));
    }

    @Test
    public void testSort_WhenArrayHasTwoElementsAndFirstIsLessThanSecond_ShouldReturnSortedArray() {
        // Arrange
        List<Integer> array = Arrays.asList(2, 1);

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList(1, 2));
    }

    @Test
    public void testSort_WhenArrayHasTwoElementsAndFirstIsGreaterThanSecond_ShouldReturnSortedArray() {
        // Arrange
        List<Integer> array = Arrays.asList(1, 2);

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList(1, 2));
    }

    @Test
    public void testSort_WhenArrayHasThreeElementsAndFirstIsLessThanSecondAndSecondIsLessThanThird_ShouldReturnSortedArray() {
        // Arrange
        List<Integer> array = Arrays.asList(3, 2, 1);

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList(1, 2, 3));
    }

    @Test
    public void testSort_WhenArrayHasThreeElementsAndFirstIsGreaterThanSecondAndSecondIsLessThanThird_ShouldReturnSortedArray() {
        // Arrange
        List<Integer> array = Arrays.asList(1, 2, 3);

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList(1, 2, 3));
    }

    @Test
    public void testSort_WhenArrayHasThreeElementsAndFirstIsLessThanSecondAndSecondIsGreaterThanThird_ShouldReturnSortedArray() {
        // Arrange
        List<Integer> array = Arrays.asList(3, 1, 2);

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList(1, 2, 3));
    }

    @Test
    public void testSort_WhenArrayHasThreeElementsAndFirstIsGreaterThanSecondAndSecondIsGreaterThanThird_ShouldReturnSortedArray() {
        // Arrange
        List<Integer> array = Arrays.asList(1, 3, 2);

        // Act
        cycleSort.sort(array);

        // Assert
        assertEquals(array, Arrays.asList(1, 2, 3));
    }
}
```
