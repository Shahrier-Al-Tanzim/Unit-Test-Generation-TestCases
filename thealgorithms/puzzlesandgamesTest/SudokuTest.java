query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.puzzlesandgames", "imports": [], "classes": [{"class_name": "Sudoku", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "isSafe", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "board", "type": "int"}, {"name": "row", "type": "int"}, {"name": "col", "type": "int"}, {"name": "num", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["length"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=board, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=row, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=d, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=num, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=board, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=r, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=col, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=num, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=board, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=r, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=d, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=num, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}, {"name": "solveSudoku", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "board", "type": "int"}, {"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "isSafe", "arguments": ["board", "row", "col", "num"]}, {"qualifier": "", "member": "solveSudoku", "arguments": ["board", "n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=board, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "MemberReference(member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[])", "has_else": false}, {"condition": "MemberReference(member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=board, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=row, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=col, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=num, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isSafe, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=board, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=solveSudoku, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "print", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "board", "type": "int"}, {"name": "n", "type": "int"}], "invocations": [{"qualifier": "System.out", "member": "print", "arguments": ["board"]}, {"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")"]}, {"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\n\")"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["n"]}, {"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\")"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=r, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operandr=Cast(expression=MethodInvocation(arguments=[MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sqrt, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None), type=BasicType(dimensions=[], name=int)), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "", "member": "solveSudoku", "arguments": ["board", "n"]}, {"qualifier": "", "member": "print", "arguments": ["board", "n"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"No solution\")"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=board, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=solveSudoku, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": true}]}]}]}
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
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class SudokuTest {
    private static final int[][] BOARD = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private static final int N = 9;

    @BeforeEach
    void setUp() {}

    @Test
    void testIsSafe() {
        // Arrange
        Sudoku sudoku = new Sudoku();
        int row = 1, col = 2, num = 3;

        // Act
        boolean result = sudoku.isSafe(BOARD, row, col, num);

        // Assert
        assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void testSolveSudoku(int[][] board, int n) {
        // Arrange
        Sudoku sudoku = new Sudoku();
        MockedStatic<Math> mathMock = mockStatic(Math.class);
        when(mathMock.sqrt(n)).thenReturn(3);

        // Act
        boolean result = sudoku.solveSudoku(board, n);

        // Assert
        assertTrue(result);
    }

    @Test
    void testPrint() {
        // Arrange
        Sudoku sudoku = new Sudoku();

        // Act
        sudoku.print(BOARD, N);

        // Assert
        verify(System.out).println(BOARD);
    }

    @Test
    void testMain() {
        // Arrange
        Sudoku sudoku = new Sudoku();

        // Act
        sudoku.main(new String[] {""});

        // Assert
        verify(System.out).println("No solution");
    }

    private static Collection<Object[]> provideData() {
        return Arrays.asList(new Object[][] {
                {BOARD, N},
        });
    }
}
```
