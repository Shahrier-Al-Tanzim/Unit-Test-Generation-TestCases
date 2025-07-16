query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": ["java.util.Arrays"], "classes": [{"class_name": "UniquePaths", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "uniquePaths", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "m", "type": "int"}, {"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "uniquePaths", "arguments": ["n", "m"]}, {"qualifier": "Arrays", "member": "fill", "arguments": ["dp", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "Math", "member": "addExact", "arguments": ["dp", "dp"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": false}]}, {"name": "uniquePaths2", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "m", "type": "int"}, {"name": "n", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "addExact", "arguments": ["dp", "dp"]}], "conditionals": []}]}]}
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
package com.thealgorithms.dynamicprogramming;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UniquePathsTest {
    private UniquePaths uniquePaths;

    @BeforeEach
    public void setUp() {
        // Set up inputs, mocks, or stubs
        uniquePaths = new UniquePaths();
    }

    @Test
    public void testUniquePaths() {
        // Arrange
        int m = 2;
        int n = 3;
        Mockito.when(uniquePaths.uniquePaths(m, n)).thenReturn(1);
        Mockito.doNothing().when(Arrays).fill(Mockito.any(), Mockito.any());
        Mockito.doNothing().when(Math).addExact(Mockito.any(), Mockito.any());

        // Act
        int result = uniquePaths.uniquePaths(m, n);

        // Assert
        verify(uniquePaths).uniquePaths(n, m);
        verify(Arrays).fill(Mockito.any(), Mockito.any());
        verify(Math).addExact(Mockito.any(), Mockito.any());
        assertEquals(1, result);
    }

    @Test
    public void testUniquePaths2() {
        // Arrange
        int m = 2;
        int n = 3;
        Mockito.doNothing().when(Math).addExact(Mockito.any(), Mockito.any());

        // Act
        int result = uniquePaths.uniquePaths2(m, n);

        // Assert
        verify(Math).addExact(Mockito.any(), Mockito.any());
        assertEquals(1, result);
    }
}
```
