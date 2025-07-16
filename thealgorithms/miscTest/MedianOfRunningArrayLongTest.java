query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.misc", "imports": [], "classes": [{"class_name": "MedianOfRunningArrayLong", "modifiers": ["public", "final"], "fields": [], "constructors": [], "methods": [{"name": "calculateAverage", "modifiers": ["public"], "return_type": "Long", "parameters": [{"name": "a", "type": "Long"}, {"name": "b", "type": "Long"}], "invocations": [], "conditionals": []}]}]}
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
public class MedianOfRunningArrayLongTest {
  @Mock private Long a;
  @Mock private Long b;
  @InjectMocks private MedianOfRunningArrayLong medianOfRunningArrayLong;

  @BeforeEach
  public void setUp() {
    // Set up inputs, mocks, or stubs.
  }

  @Test
  public void testCalculateAverage() {
    // Arrange: Set up inputs, mocks, or stubs.
    when(a).thenReturn(1L);
    when(b).thenReturn(2L);

    // Act: Call the method under test.
    Long result = medianOfRunningArrayLong.calculateAverage(a, b);

    // Assert: Verify the results.
    assertEquals(1.5, result);
  }
}
```
