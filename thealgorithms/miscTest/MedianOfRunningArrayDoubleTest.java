query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.misc", "imports": [], "classes": [{"class_name": "MedianOfRunningArrayDouble", "modifiers": ["public", "final"], "fields": [], "constructors": [], "methods": [{"name": "calculateAverage", "modifiers": ["public"], "return_type": "Double", "parameters": [{"name": "a", "type": "Double"}, {"name": "b", "type": "Double"}], "invocations": [], "conditionals": []}]}]}
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MedianOfRunningArrayDoubleTest {
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateAverage_withValidInput_shouldReturnCorrectResult() {
        // Arrange
        MedianOfRunningArrayDouble medianOfRunningArrayDouble = new MedianOfRunningArrayDouble();
        double a = 1.0;
        double b = 2.0;
        Mockito.when(medianOfRunningArrayDouble.calculateAverage(a, b)).thenReturn(1.5);

        // Act
        double result = medianOfRunningArrayDouble.calculateAverage(a, b);

        // Assert
        assertEquals(1.5, result);
    }
}
```
