query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.Arrays"], "classes": [{"class_name": "BeadSort", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "", "member": "allInputsMustBeNonNegative", "arguments": ["array"]}, {"qualifier": "", "member": "extractSortedFromGrid", "arguments": ["MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=fillGrid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "fillGrid", "arguments": ["array"]}], "conditionals": []}, {"name": "allInputsMustBeNonNegative", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "anyMatch", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), parameters=[MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=stream, postfix_operators=[], prefix_operators=[], qualifier=Arrays, selectors=[MethodInvocation(arguments=[LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), parameters=[MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=anyMatch, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": false}]}, {"name": "fillGrid", "modifiers": ["private"], "return_type": "BeadState", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "max", "arguments": []}, {"qualifier": null, "member": "orElse", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "getEmptyGrid", "arguments": ["length", "maxValue"]}], "conditionals": []}, {"name": "getEmptyGrid", "modifiers": ["private"], "return_type": "BeadState", "parameters": [{"name": "arrayLength", "type": "int"}, {"name": "maxValue", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "extractSortedFromGrid", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "grid", "type": "BeadState"}], "invocations": [], "conditionals": []}]}]}
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
package com.thealgorithms.sorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import java.util.Arrays;

class BeadSortTest {
    private BeadSort beadSort;

    @BeforeEach
    public void setUp() {
        beadSort = new BeadSort();
    }

    @Test
    public void testSort() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        Mockito.when(Arrays.stream(array)).thenReturn(Arrays.stream(new int[]{1, 2, 3, 4, 5}));
        Mockito.when(Arrays.stream(array).max()).thenReturn(5);
        Mockito.doNothing().when(beadSort).fillGrid(Mockito.anyInt());

        // Act
        int result = beadSort.sort(array);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testAllInputsMustBeNonNegative() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        Mockito.when(Arrays.stream(array)).thenReturn(Arrays.stream(new int[]{1, 2, 3, 4, 5}));
        Mockito.when(Arrays.stream(array).anyMatch(Mockito.anyInt())).thenReturn(true);

        // Act
        beadSort.allInputsMustBeNonNegative(array);

        // Assert
        verify(beadSort, times(1)).allInputsMustBeNonNegative(array);
    }

    @Test
    public void testExtractSortedFromGrid() {
        // Arrange
        BeadState grid = new BeadState();
        Mockito.when(grid.getEmptyGrid(Mockito.anyInt(), Mockito.anyInt())).thenReturn(new BeadState());

        // Act
        int result = beadSort.extractSortedFromGrid(grid);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testFillGrid() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        Mockito.when(Arrays.stream(array)).thenReturn(Arrays.stream(new int[]{1, 2, 3, 4, 5}));
        Mockito.when(Arrays.stream(array).max()).thenReturn(5);

        // Act
        beadSort.fillGrid(array);

        // Assert
        verify(beadSort, times(1)).fillGrid(array);
    }
}
```
Note that the generated tests use Mockito to stub the behavior of the dependencies and verify the method calls. The test methods also follow the Arrange-Act-Assert format.
