query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": ["java.util.ArrayList", "java.util.List"], "classes": [{"class_name": "PrintAMatrixInSpiralOrder", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "print", "modifiers": ["public"], "return_type": "List", "parameters": [{"name": "matrix", "type": "int"}, {"name": "row", "type": "int"}, {"name": "col", "type": "int"}], "invocations": [{"qualifier": "result", "member": "add", "arguments": ["matrix"]}, {"qualifier": "result", "member": "add", "arguments": ["matrix"]}, {"qualifier": "result", "member": "add", "arguments": ["matrix"]}, {"qualifier": "result", "member": "add", "arguments": ["matrix"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=r, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=row, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=col, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}]}]}]}
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
package com.thealgorithms.others;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PrintAMatrixInSpiralOrderTest {
    private PrintAMatrixInSpiralOrder printMatrix;
    private List<Integer> result;

    @BeforeEach
    void setUp() {
        printMatrix = new PrintAMatrixInSpiralOrder();
        result = new ArrayList<>();
    }

    @Test
    public void testPrint_1x1Matrix() {
        int[][] matrix = {{1}};
        int row = 0;
        int col = 0;

        Mockito.when(printMatrix.print(matrix, row, col)).thenReturn(result);

        printMatrix.print(matrix, row, col);

        verify(printMatrix).print(matrix, row, col);
        assertEquals(1, result.size());
    }

    @Test
    public void testPrint_2x2Matrix() {
        int[][] matrix = {{1, 2}, {3, 4}};
        int row = 0;
        int col = 0;

        Mockito.when(printMatrix.print(matrix, row, col)).thenReturn(result);

        printMatrix.print(matrix, row, col);

        verify(printMatrix).print(matrix, row, col);
        assertEquals(4, result.size());
    }

    @Test
    public void testPrint_3x3Matrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 0;
        int col = 0;

        Mockito.when(printMatrix.print(matrix, row, col)).thenReturn(result);

        printMatrix.print(matrix, row, col);

        verify(printMatrix).print(matrix, row, col);
        assertEquals(9, result.size());
    }
}
```
