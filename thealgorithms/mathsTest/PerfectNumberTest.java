query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "PerfectNumber", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "isPerfectNumber", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "number", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "isPerfectNumber2", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=root, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Cast(expression=MemberReference(member=root, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type=BasicType(dimensions=[], name=int)), operator===)", "has_else": false}]}]}]}
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
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class PerfectNumberTest {
    private PerfectNumber perfectNumber;

    @BeforeEach
    void setUp() {
        perfectNumber = new PerfectNumber();
    }

    @Test
    public void isPerfectNumber_shouldReturnTrueForAPerfectNumber() {
        // Arrange
        int number = 6;
        Mockito.when(perfectNumber.isPerfectNumber(number)).thenReturn(true);

        // Act
        boolean result = perfectNumber.isPerfectNumber(number);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isPerfectNumber_shouldReturnFalseForANonPerfectNumber() {
        // Arrange
        int number = 5;
        Mockito.when(perfectNumber.isPerfectNumber(number)).thenReturn(false);

        // Act
        boolean result = perfectNumber.isPerfectNumber(number);

        // Assert
        assertFalse(result);
    }
}
```
```java
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class PerfectNumberTest {
    private PerfectNumber perfectNumber;

    @BeforeEach
    void setUp() {
        perfectNumber = new PerfectNumber();
    }

    @Test
    public void isPerfectNumber2_shouldReturnTrueForAPerfectNumber() {
        // Arrange
        int n = 6;
        Mockito.when(perfectNumber.isPerfectNumber2(n)).thenReturn(true);

        // Act
        boolean result = perfectNumber.isPerfectNumber2(n);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isPerfectNumber2_shouldReturnFalseForANonPerfectNumber() {
        // Arrange
        int n = 5;
        Mockito.when(perfectNumber.isPerfectNumber2(n)).thenReturn(false);

        // Act
        boolean result = perfectNumber.isPerfectNumber2(n);

        // Assert
        assertFalse(result);
    }
}
```
