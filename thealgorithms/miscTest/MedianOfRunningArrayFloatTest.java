query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.misc", "imports": [], "classes": [{"class_name": "MedianOfRunningArrayFloat", "modifiers": ["public", "final"], "fields": [], "constructors": [], "methods": [{"name": "calculateAverage", "modifiers": ["public"], "return_type": "Float", "parameters": [{"name": "a", "type": "Float"}, {"name": "b", "type": "Float"}], "invocations": [], "conditionals": []}]}]}
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

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MedianOfRunningArrayFloatTest {
  @Mock private Float a;
  @Mock private Float b;
  @InjectMocks private MedianOfRunningArrayFloat medianOfRunningArrayFloat;

  @BeforeEach
  public void setUp() {
    // Set up inputs, mocks, or stubs.
  }

  @Test
  public void calculateAverage_shouldReturnMedianForEvenLengthList() {
    // Arrange: Set up inputs, mocks, or stubs.
    List<Float> list = Arrays.asList(1f, 2f, 3f, 4f);
    when(a).thenReturn(list.get(0));
    when(b).thenReturn(list.get(1));

    // Act: Call the method under test.
    Float result = medianOfRunningArrayFloat.calculateAverage(a, b);

    // Assert: Verify the results.
    assertEquals(2f, result);
  }

  @Test
  public void calculateAverage_shouldReturnMedianForOddLengthList() {
    // Arrange: Set up inputs, mocks, or stubs.
    List<Float> list = Arrays.asList(1f, 2f, 3f, 4f);
    when(a).thenReturn(list.get(0));
    when(b).thenReturn(list.get(1));

    // Act: Call the method under test.
    Float result = medianOfRunningArrayFloat.calculateAverage(a, b);

    // Assert: Verify the results.
    assertEquals(2f, result);
  }
}
```
