query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.matrix", "imports": ["com.thealgorithms.matrix.utils.MatrixUtil"], "classes": [{"class_name": "MirrorOfMatrix", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "mirrorMatrix", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "originalMatrix", "type": "double"}], "invocations": [{"qualifier": "MatrixUtil", "member": "validateInputMatrix", "arguments": ["originalMatrix"]}, {"qualifier": "MatrixUtil", "member": "reverseRow", "arguments": ["originalMatrix"]}], "conditionals": []}]}]}
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
package com.thealgorithms.matrix;

import com.thealgorithms.matrix.utils.MatrixUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MirrorOfMatrixTest {
    private MirrorOfMatrix mirrorOfMatrix;

    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void mirrorMatrix_validInputMatrix_shouldReturnReversedRow() {
        // Arrange
        double[][] originalMatrix = {{1, 2}, {3, 4}};
        MatrixUtil matrixUtilMock = mock(MatrixUtil.class);
        when(matrixUtilMock.validateInputMatrix(originalMatrix)).thenReturn(true);
        when(matrixUtilMock.reverseRow(originalMatrix)).thenReturn(new double[][]{{2, 1}, {4, 3}});
        mirrorOfMatrix = new MirrorOfMatrix();

        // Act
        double[][] result = mirrorOfMatrix.mirrorMatrix(originalMatrix);

        // Assert
        assertEquals(new double[][]{{2, 1}, {4, 3}}, result);
    }
}
```
