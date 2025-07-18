query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.Arrays", "java.util.List"], "classes": []}
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
package com.thealgorithms.sorts;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class SortTests {
    private Sort sort;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void testBubbleSort() {
        // Arrange: Set up inputs, mocks, or stubs
        List<Integer> input = Arrays.asList(5, 2, 8, 3, 1, 6, 4);
        Sort sort = new BubbleSort();

        // Act: Call the method under test
        List<Integer> result = sort.sort(input);

        // Assert: Verify the results
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 8), result);
    }

    @Test
    public void testQuickSort() {
        // Arrange: Set up inputs, mocks, or stubs
        List<Integer> input = Arrays.asList(5, 2, 8, 3, 1, 6, 4);
        Sort sort = new QuickSort();

        // Act: Call the method under test
        List<Integer> result = sort.sort(input);

        // Assert: Verify the results
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 8), result);
    }
}
```
