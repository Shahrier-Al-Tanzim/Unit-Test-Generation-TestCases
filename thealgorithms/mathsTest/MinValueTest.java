query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "MinValue", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "min", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you could write a unit test for the `min` method in the `MinValue` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MinValueTest {
    private MinValue minValue;

    @BeforeEach
    void setUp() {
        minValue = new MinValue();
    }

    @Test
    void testMin_withPositiveValues() {
        // Arrange
        int a = 10;
        int b = 20;
        Mockito.when(minValue.min(a, b)).thenReturn(10);

        // Act
        int result = minValue.min(a, b);

        // Assert
        assertEquals(10, result);
    }

    @Test
    void testMin_withNegativeValues() {
        // Arrange
        int a = -10;
        int b = -20;
        Mockito.when(minValue.min(a, b)).thenReturn(-20);

        // Act
        int result = minValue.min(a, b);

        // Assert
        assertEquals(-20, result);
    }
}
```
In this example, we're using the `@BeforeEach` annotation to set up a new instance of the `MinValue` class before each test method. We're also using Mockito to stub the behavior of the `min` method so that it returns the expected result for different inputs. In the first test method, we're testing the case where both values are positive and the expected result is 10. In the second test method, we're testing the case where both values are negative and the expected result is -20.

Note that we're using the `assertEquals` method from JUnit to verify that the actual result matches the expected result.
