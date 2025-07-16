query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.misc", "imports": [], "classes": [{"class_name": "MedianOfRunningArrayInteger", "modifiers": ["public", "final"], "fields": [], "constructors": [], "methods": [{"name": "calculateAverage", "modifiers": ["public"], "return_type": "Integer", "parameters": [{"name": "a", "type": "Integer"}, {"name": "b", "type": "Integer"}], "invocations": [], "conditionals": []}]}]}
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
package com.thealgorithms.misc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class MedianOfRunningArrayIntegerTest {
    private MedianOfRunningArrayInteger medianOfRunningArrayInteger;

    @BeforeEach
    public void setUp() {
        // Instantiate the focal class
        medianOfRunningArrayInteger = new MedianOfRunningArrayInteger();
    }

    @Test
    public void testCalculateAverage() {
        // Arrange: Set up inputs, mocks, or stubs.
        Integer a = 5;
        Integer b = 10;

        // Stub the behavior of the method under test.
        when(medianOfRunningArrayInteger.calculateAverage(a, b)).thenReturn(15);

        // Act: Call the method under test.
        int result = medianOfRunningArrayInteger.calculateAverage(a, b);

        // Assert: Verify the results.
        assertEquals(15, result);
    }
}
```
