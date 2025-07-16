query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": ["java.util.Arrays", "java.util.Comparator"], "classes": [{"class_name": "LineSweep", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "findMaximumEndPoint", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "ranges", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "sort", "arguments": ["ranges", "MethodInvocation(arguments=[LambdaExpression(body=MemberReference(member=range, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1))]), parameters=[MemberReference(member=range, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=comparingInt, postfix_operators=[], prefix_operators=[], qualifier=Comparator, selectors=[], type_arguments=None)"]}, {"qualifier": "Comparator", "member": "comparingInt", "arguments": ["LambdaExpression(body=MemberReference(member=range, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1))]), parameters=[MemberReference(member=range, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}], "conditionals": []}, {"name": "isOverlap", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "ranges", "type": "int"}], "invocations": [{"qualifier": "", "member": "findMaximumEndPoint", "arguments": ["ranges"]}, {"qualifier": "Math", "member": "max", "arguments": ["maxOverlaps", "currentCount"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=ranges, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=ranges, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=||)", "has_else": false}]}]}]}
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
package com.thealgorithms.others;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class LineSweepTest {
    private LineSweep lineSweep;

    @BeforeEach
    void setUp() {
        lineSweep = new LineSweep();
    }

    @Test
    public void findMaximumEndPoint_shouldReturnMaximumEndpoint() {
        // Arrange
        int[] ranges = {1, 2, 3};
        Mockito.when(Arrays.sort(ranges, Comparator.comparingInt(i -> i))).thenReturn(null);

        // Act
        int result = lineSweep.findMaximumEndPoint(ranges);

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void isOverlap_shouldReturnTrueIfRangesAreOverlapping() {
        // Arrange
        int[] ranges = {1, 2, 3};
        Mockito.when(Arrays.sort(ranges, Comparator.comparingInt(i -> i))).thenReturn(null);
        Mockito.when(Math.max(Mockito.anyInt(), Mockito.anyInt())).thenReturn(2);

        // Act
        boolean result = lineSweep.isOverlap(ranges);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isOverlap_shouldReturnFalseIfRangesAreNotOverlapping() {
        // Arrange
        int[] ranges = {1, 2, 3};
        Mockito.when(Arrays.sort(ranges, Comparator.comparingInt(i -> i))).thenReturn(null);
        Mockito.when(Math.max(Mockito.anyInt(), Mockito.anyInt())).thenReturn(1);

        // Act
        boolean result = lineSweep.isOverlap(ranges);

        // Assert
        assertFalse(result);
    }
}
```
