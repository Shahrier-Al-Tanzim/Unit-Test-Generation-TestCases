query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "SumOfArithmeticSeries", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "sumOfSeries", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "firstTerm", "type": "double"}, {"name": "commonDiff", "type": "double"}, {"name": "numOfTerms", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=numOfTerms, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}]}]}
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestFactory;

class SumOfArithmeticSeriesTest {
    private static final double DELTA = 1e-6;

    @Mock
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // Arrange
        when(calculator.add(anyDouble(), anyDouble())).thenReturn(0d);
    }

    @TestFactory
    Collection<DynamicNode> sumOfSeries() {
        // Arrange
        List<Object[]> testCases = Arrays.asList(new Object[][] {
                { 1, 2, 3 },
                { 4, 5, 6 }
        });

        return testCases.stream().map(testCase -> dynamicTest(
                "sumOfSeries(" + Arrays.toString(testCase) + ")", () -> {
                    // Act
                    double result = SumOfArithmeticSeries.sumOfSeries((double) testCase[0], (double) testCase[1], (int) testCase[2]);

                    // Assert
                    assertEquals(result, 0d, DELTA);
                })).collect(Collectors.toList());
    }
}
```
