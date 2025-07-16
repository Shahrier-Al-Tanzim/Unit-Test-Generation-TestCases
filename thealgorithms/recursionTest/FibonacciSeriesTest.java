query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.recursion", "imports": [], "classes": [{"class_name": "FibonacciSeries", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "fibonacci", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "fibonacci", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "", "member": "fibonacci", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<=)", "has_else": true}]}]}]}
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
package com.thealgorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FibonacciSeriesTest {
    private FibonacciSeries fibonacciSeries;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void fibonacci_WhenNIs1_Returns1() {
        // Arrange
        int n = 1;
        Mockito.when(fibonacciSeries.fibonacci(n)).thenReturn(1);

        // Act
        int result = fibonacciSeries.fibonacci(n);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void fibonacci_WhenNIs2_Returns1() {
        // Arrange
        int n = 2;
        Mockito.when(fibonacciSeries.fibonacci(n)).thenReturn(1);

        // Act
        int result = fibonacciSeries.fibonacci(n);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void fibonacci_WhenNIs3_Returns2() {
        // Arrange
        int n = 3;
        Mockito.when(fibonacciSeries.fibonacci(n)).thenReturn(2);

        // Act
        int result = fibonacciSeries.fibonacci(n);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void fibonacci_WhenNIs4_Returns3() {
        // Arrange
        int n = 4;
        Mockito.when(fibonacciSeries.fibonacci(n)).thenReturn(3);

        // Act
        int result = fibonacciSeries.fibonacci(n);

        // Assert
        assertEquals(3, result);
    }
}
```
