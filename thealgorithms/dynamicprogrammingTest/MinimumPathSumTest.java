query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "MinimumPathSum", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "minimumPathSum", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "grid", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "min", "arguments": ["dp", "dp"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=numCols, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}]}]}
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

result: Here's a possible solution for the given JSON array of method-metadata for the class `MinimumPathSum`:
```java
package com.thealgorithms.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class MinimumPathSumTest {
    private static final int[][] GRID = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void minimumPathSum_shouldReturnMinimumPathSumForGivenGrid() {
        // Arrange
        int[][] grid = GRID;
        MockedStatic<Math> mathMock = Mockito.mockStatic(Math.class);
        mathMock.when(() -> Math.min(1, 2)).thenReturn(1);
        mathMock.when(() -> Math.min(3, 4)).thenReturn(3);
        mathMock.when(() -> Math.min(5, 6)).thenReturn(5);
        mathMock.when(() -> Math.min(7, 8)).thenReturn(7);
        mathMock.when(() -> Math.min(9, 10)).thenReturn(9);

        // Act
        int result = MinimumPathSum.minimumPathSum(grid);

        // Assert
        assertEquals(15, result);
    }
}
```
Note that this is just one possible solution, and there may be other ways to write the test case depending on the specific requirements of the class under test.
