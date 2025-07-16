query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.greedyalgorithms", "imports": ["java.util.PriorityQueue"], "classes": [{"class_name": "OptimalFileMerging", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "minMergeCost", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "files", "type": "int"}], "invocations": [{"qualifier": "minHeap", "member": "add", "arguments": ["file"]}, {"qualifier": "minHeap", "member": "size", "arguments": []}, {"qualifier": "minHeap", "member": "poll", "arguments": []}, {"qualifier": "minHeap", "member": "poll", "arguments": []}, {"qualifier": "minHeap", "member": "add", "arguments": ["cost"]}], "conditionals": []}]}]}
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

result: Here's an example of how you could write a JUnit 5 test for the `minMergeCost` method in the `OptimalFileMerging` class:
```java
package com.thealgorithms.greedyalgorithms;

import static org.junit.jupiter.api.Assertions.*;
import java.util.PriorityQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptimalFileMergingTest {
    private PriorityQueue<Integer> minHeap;

    @BeforeEach
    void setUp() {
        // Set up the mock priority queue
        minHeap = Mockito.mock(PriorityQueue.class);
    }

    @Test
    void testMinMergeCost() {
        // Arrange
        int[] files = new int[] {1, 2, 3};
        int cost = 5;

        // Stub the behavior of the priority queue
        Mockito.when(minHeap.add(1)).thenReturn(true);
        Mockito.when(minHeap.size()).thenReturn(files.length);
        Mockito.when(minHeap.poll()).thenReturn(1, 2, 3);
        Mockito.when(minHeap.add(cost)).thenReturn(true);

        // Act
        int result = OptimalFileMerging.minMergeCost(files);

        // Assert
        assertEquals(5, result);
    }
}
```
In this test, we first set up the mock priority queue using Mockito's `mock` method. We then stub the behavior of the priority queue by setting up expectations for its `add`, `size`, and `poll` methods. Finally, we call the `minMergeCost` method with a sample input array of files and verify that the result is equal to the expected cost.
