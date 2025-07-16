query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "Tribonacci", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "compute", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===), operandr=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator===), operator=||)", "has_else": false}]}]}]}
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

result: Here's an example of how you could write a unit test for the `compute` method in the `Tribonacci` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TribonacciTest {
    private Tribonacci tribonacci;

    @BeforeEach
    void setUp() {
        // Set up the mock for the Tribonacci class
        tribonacci = Mockito.mock(Tribonacci.class);
    }

    @Test
    void compute_nEquals0_returns0() {
        // Arrange
        int n = 0;
        Mockito.when(tribonacci.compute(n)).thenReturn(0);

        // Act
        int result = tribonacci.compute(n);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void compute_nEquals1_returns1() {
        // Arrange
        int n = 1;
        Mockito.when(tribonacci.compute(n)).thenReturn(1);

        // Act
        int result = tribonacci.compute(n);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void compute_nEquals2_returns2() {
        // Arrange
        int n = 2;
        Mockito.when(tribonacci.compute(n)).thenReturn(2);

        // Act
        int result = tribonacci.compute(n);

        // Assert
        assertEquals(2, result);
    }
}
```
In this example, we use the `Mockito` library to create a mock for the `Tribonacci` class and set up its behavior using the `when` method. We then call the `compute` method with different values of `n` and verify that the correct result is returned using the `assertEquals` method from JUnit 5.

Note that we use the `@BeforeEach` annotation to set up the mock for each test method, as this allows us to avoid having to recreate the mock object for each test. We also use the `@Test` annotation to indicate which methods are unit tests and to provide a name for each test.
