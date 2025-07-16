query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.matrix.matrixexponentiation", "imports": ["com.thealgorithms.matrix.utils.MatrixUtil", "java.math.BigDecimal"], "classes": [{"class_name": "Fibonacci", "modifiers": ["public", "final"], "fields": [{"name": "ONE", "type": "BigDecimal"}, {"name": "ZERO", "type": "BigDecimal"}, {"name": "FIB_MATRIX", "type": "BigDecimal"}, {"name": "IDENTITY_MATRIX", "type": "BigDecimal"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "fib", "modifiers": ["public", "static"], "return_type": "BigDecimal", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "fib", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}, {"qualifier": "MatrixUtil", "member": "multiply", "arguments": ["cachedResult", "cachedResult"]}, {"qualifier": null, "member": "get", "arguments": []}, {"qualifier": "MatrixUtil", "member": "multiply", "arguments": ["FIB_MATRIX", "matrixExpResult"]}, {"qualifier": null, "member": "get", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}]}]}]}
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
package com.thealgorithms.matrix.matrixexponentiation;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import com.thealgorithms.matrix.utils.MatrixUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class FibonacciTest {
    private static final BigDecimal ONE = new BigDecimal("1");
    private static final BigDecimal ZERO = new BigDecimal("0");
    private static final BigDecimal FIB_MATRIX = new BigDecimal("[1, 1]");
    private static final BigDecimal IDENTITY_MATRIX = new BigDecimal("[1, 0]");

    @BeforeEach
    void setUp() {
        // Set up preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void fib_n_equals_0() {
        // Arrange
        Fibonacci fib = new Fibonacci();
        MatrixUtil matrixUtil = mock(MatrixUtil.class);
        when(matrixUtil.multiply(FIB_MATRIX, IDENTITY_MATRIX)).thenReturn(IDENTITY_MATRIX);

        // Act
        BigDecimal result = fib.fib(0);

        // Assert
        assertEquals(ZERO, result);
    }

    @Test
    public void fib_n_equals_1() {
        // Arrange
        Fibonacci fib = new Fibonacci();
        MatrixUtil matrixUtil = mock(MatrixUtil.class);
        when(matrixUtil.multiply(FIB_MATRIX, IDENTITY_MATRIX)).thenReturn(IDENTITY_MATRIX);

        // Act
        BigDecimal result = fib.fib(1);

        // Assert
        assertEquals(ONE, result);
    }

    @Test
    public void fib_n_equals_2() {
        // Arrange
        Fibonacci fib = new Fibonacci();
        MatrixUtil matrixUtil = mock(MatrixUtil.class);
        when(matrixUtil.multiply(FIB_MATRIX, IDENTITY_MATRIX)).thenReturn(IDENTITY_MATRIX);

        // Act
        BigDecimal result = fib.fib(2);

        // Assert
        assertEquals(new BigDecimal("[1, 1]"), result);
    }
}
```
