query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "SumOfOddNumbers", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "sumOfFirstNOddNumbers", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}]}]}
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
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SumOfOddNumbersTest {
    private SumOfOddNumbers sumOfOddNumbers;

    @BeforeEach
    void setUp() {
        sumOfOddNumbers = new SumOfOddNumbers();
    }

    @Test
    public void testSumOfFirstNOddNumbers_1() {
        // Arrange
        int n = 1;
        int expectedResult = 0;
        when(sumOfOddNumbers.sumOfFirstNOddNumbers(n)).thenReturn(expectedResult);

        // Act
        int actualResult = sumOfOddNumbers.sumOfFirstNOddNumbers(n);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfFirstNOddNumbers_2() {
        // Arrange
        int n = 2;
        int expectedResult = 1;
        when(sumOfOddNumbers.sumOfFirstNOddNumbers(n)).thenReturn(expectedResult);

        // Act
        int actualResult = sumOfOddNumbers.sumOfFirstNOddNumbers(n);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfFirstNOddNumbers_3() {
        // Arrange
        int n = 3;
        int expectedResult = 3;
        when(sumOfOddNumbers.sumOfFirstNOddNumbers(n)).thenReturn(expectedResult);

        // Act
        int actualResult = sumOfOddNumbers.sumOfFirstNOddNumbers(n);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
```
