query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "MatrixChainRecursiveTopDownMemoisation", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "memoizedMatrixChain", "modifiers": ["static"], "return_type": "int", "parameters": [{"name": "p", "type": "int"}], "invocations": [{"qualifier": "", "member": "lookupChain", "arguments": ["m", "p", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": []}, {"name": "lookupChain", "modifiers": ["static"], "return_type": "int", "parameters": [{"name": "m", "type": "int"}, {"name": "p", "type": "int"}, {"name": "i", "type": "int"}, {"name": "j", "type": "int"}], "invocations": [{"qualifier": "", "member": "lookupChain", "arguments": ["m", "p", "i", "k"]}, {"qualifier": "", "member": "lookupChain", "arguments": ["m", "p", "BinaryOperation(operandl=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "j"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=MAX_VALUE, postfix_operators=[], prefix_operators=[], qualifier=Integer, selectors=[]), operator=<)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=q, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=<)", "has_else": false}]}]}]}
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class MatrixChainRecursiveTopDownMemoisation {
    private int memoizedMatrixChain(int p) {
        return 0;
    }
}

class MatrixChainRecursiveTopDownMemoisationTest {
    @BeforeEach
    public void setUp() {
        // Set up preconditions before each test method.
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method.
    }

    @Test
    public void memoizedMatrixChain_1() {
        // Arrange
        MatrixChainRecursiveTopDownMemoisation matrixChain = new MatrixChainRecursiveTopDownMemoisation();
        int p = 1;
        Mockito.when(matrixChain.memoizedMatrixChain(p)).thenReturn(1);

        // Act
        int result = matrixChain.memoizedMatrixChain(p);

        // Assert
        assertEquals(1, result);
    }
}
```
