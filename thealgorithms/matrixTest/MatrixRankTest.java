query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.matrix", "imports": ["com.thealgorithms.matrix.utils.MatrixUtil.validateInputMatrix"], "classes": [{"class_name": "MatrixRank", "modifiers": ["public", "final"], "fields": [{"name": "EPSILON", "type": "double"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "computeRank", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "matrix", "type": "double"}], "invocations": [{"qualifier": "", "member": "validateInputMatrix", "arguments": ["matrix"]}, {"qualifier": "", "member": "deepCopy", "arguments": ["matrix"]}, {"qualifier": "", "member": "findPivotRow", "arguments": ["matrixCopy", "rowMarked", "colIndex"]}, {"qualifier": "", "member": "normalizePivotRow", "arguments": ["matrixCopy", "pivotRow", "colIndex"]}, {"qualifier": "", "member": "eliminateRows", "arguments": ["matrixCopy", "pivotRow", "colIndex"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=pivotRow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=numRows, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=)", "has_else": false}]}, {"name": "isZero", "modifiers": ["static", "private"], "return_type": "boolean", "parameters": [{"name": "value", "type": "double"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["value"]}], "conditionals": []}, {"name": "deepCopy", "modifiers": ["static", "private"], "return_type": "double", "parameters": [{"name": "matrix", "type": "double"}], "invocations": [{"qualifier": "System", "member": "arraycopy", "arguments": ["matrix", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "matrixCopy", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "numColumns"]}], "conditionals": []}, {"name": "findPivotRow", "modifiers": ["static", "private"], "return_type": "int", "parameters": [{"name": "matrix", "type": "double"}, {"name": "rowMarked", "type": "boolean"}, {"name": "colIndex", "type": "int"}], "invocations": [{"qualifier": "", "member": "isZero", "arguments": ["matrix"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=rowMarked, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[ArraySelector(index=MemberReference(member=pivotRow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MethodInvocation(arguments=[MemberReference(member=matrix, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=pivotRow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=colIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=isZero, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[], type_arguments=None), operator=&&)", "has_else": false}]}, {"name": "normalizePivotRow", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "matrix", "type": "double"}, {"name": "pivotRow", "type": "int"}, {"name": "colIndex", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "eliminateRows", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "matrix", "type": "double"}, {"name": "pivotRow", "type": "int"}, {"name": "colIndex", "type": "int"}], "invocations": [{"qualifier": "", "member": "isZero", "arguments": ["matrix"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=otherRow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=pivotRow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=), operandr=MethodInvocation(arguments=[MemberReference(member=matrix, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=otherRow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=colIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=isZero, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[], type_arguments=None), operator=&&)", "has_else": false}]}]}]}
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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MatrixRankTest {
    private double[][] matrix;
    private int rank;

    @BeforeEach
    public void setUp() {
        // Set up inputs, mocks, or stubs
        matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i + j;
            }
        }
    }

    @Test
    public void computeRank() {
        // Arrange
        MatrixRank ranker = new MatrixRank();
        double[][] matrixCopy = deepCopy(matrix);
        int pivotRow = findPivotRow(matrixCopy, true, 0);
        normalizePivotRow(matrixCopy, pivotRow, 0);
        eliminateRows(matrixCopy, pivotRow, 0);

        // Act
        rank = ranker.computeRank(matrix);

        // Assert
        assertEquals(2, rank);
    }

    @Test
    public void isZero() {
        // Arrange
        MatrixRank ranker = new MatrixRank();
        double value = 0;

        // Act
        boolean result = ranker.isZero(value);

        // Assert
        assertTrue(result);
    }

    @Test
    public void deepCopy() {
        // Arrange
        MatrixRank ranker = new MatrixRank();
        double[][] matrixCopy = new double[3][3];

        // Act
        ranker.deepCopy(matrix, matrixCopy);

        // Assert
        assertEquals(matrix, matrixCopy);
    }

    @Test
    public void findPivotRow() {
        // Arrange
        MatrixRank ranker = new MatrixRank();
        double[][] matrixCopy = deepCopy(matrix);
        boolean rowMarked = false;
        int colIndex = 0;

        // Act
        int pivotRow = ranker.findPivotRow(matrixCopy, rowMarked, colIndex);

        // Assert
        assertEquals(1, pivotRow);
    }

    @Test
    public void normalizePivotRow() {
        // Arrange
        MatrixRank ranker = new MatrixRank();
        double[][] matrixCopy = deepCopy(matrix);
        int pivotRow = 0;
        int colIndex = 0;

        // Act
        ranker.normalizePivotRow(matrixCopy, pivotRow, colIndex);

        // Assert
        assertEquals(1, matrixCopy[pivotRow][colIndex]);
    }

    @Test
    public void eliminateRows() {
        // Arrange
        MatrixRank ranker = new MatrixRank();
        double[][] matrixCopy = deepCopy(matrix);
        int pivotRow = 0;
        int colIndex = 0;

        // Act
        ranker.eliminateRows(matrixCopy, pivotRow, colIndex);

        // Assert
        assertEquals(1, matrixCopy[pivotRow][colIndex]);
    }
}
```
