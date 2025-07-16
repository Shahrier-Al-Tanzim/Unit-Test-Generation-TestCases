query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.divideandconquer", "imports": [], "classes": [{"class_name": "StrassenMatrixMultiplication", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "multiply", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [{"qualifier": "", "member": "split", "arguments": ["a", "a11", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "split", "arguments": ["a", "a12", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}, {"qualifier": "", "member": "split", "arguments": ["a", "a21", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "split", "arguments": ["a", "a22", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}, {"qualifier": "", "member": "split", "arguments": ["b", "b11", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "split", "arguments": ["b", "b12", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}, {"qualifier": "", "member": "split", "arguments": ["b", "b21", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "split", "arguments": ["b", "b22", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}, {"qualifier": "", "member": "multiply", "arguments": ["MethodInvocation(arguments=[MemberReference(member=a11, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=a22, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=b11, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=b22, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "add", "arguments": ["a11", "a22"]}, {"qualifier": "", "member": "add", "arguments": ["b11", "b22"]}, {"qualifier": "", "member": "multiply", "arguments": ["MethodInvocation(arguments=[MemberReference(member=a21, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=a22, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "b11"]}, {"qualifier": "", "member": "add", "arguments": ["a21", "a22"]}, {"qualifier": "", "member": "multiply", "arguments": ["a11", "MethodInvocation(arguments=[MemberReference(member=b12, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=b22, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sub, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "sub", "arguments": ["b12", "b22"]}, {"qualifier": "", "member": "multiply", "arguments": ["a22", "MethodInvocation(arguments=[MemberReference(member=b21, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=b11, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sub, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "sub", "arguments": ["b21", "b11"]}, {"qualifier": "", "member": "multiply", "arguments": ["MethodInvocation(arguments=[MemberReference(member=a11, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=a12, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "b22"]}, {"qualifier": "", "member": "add", "arguments": ["a11", "a12"]}, {"qualifier": "", "member": "multiply", "arguments": ["MethodInvocation(arguments=[MemberReference(member=a21, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=a11, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sub, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=b11, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=b12, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "sub", "arguments": ["a21", "a11"]}, {"qualifier": "", "member": "add", "arguments": ["b11", "b12"]}, {"qualifier": "", "member": "multiply", "arguments": ["MethodInvocation(arguments=[MemberReference(member=a12, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=a22, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sub, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=b21, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=b22, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "sub", "arguments": ["a12", "a22"]}, {"qualifier": "", "member": "add", "arguments": ["b21", "b22"]}, {"qualifier": "", "member": "add", "arguments": ["MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=m1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=m4, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), MemberReference(member=m5, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sub, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "m7"]}, {"qualifier": "", "member": "sub", "arguments": ["MethodInvocation(arguments=[MemberReference(member=m1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=m4, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "m5"]}, {"qualifier": "", "member": "add", "arguments": ["m1", "m4"]}, {"qualifier": "", "member": "add", "arguments": ["m3", "m5"]}, {"qualifier": "", "member": "add", "arguments": ["m2", "m4"]}, {"qualifier": "", "member": "add", "arguments": ["MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=m1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=m3, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), MemberReference(member=m2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sub, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "m6"]}, {"qualifier": "", "member": "sub", "arguments": ["MethodInvocation(arguments=[MemberReference(member=m1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=m3, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "m2"]}, {"qualifier": "", "member": "add", "arguments": ["m1", "m3"]}, {"qualifier": "", "member": "join", "arguments": ["c11", "mat", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "join", "arguments": ["c12", "mat", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}, {"qualifier": "", "member": "join", "arguments": ["c21", "mat", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "join", "arguments": ["c22", "mat", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": true}]}, {"name": "sub", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "add", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "split", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "p", "type": "int"}, {"name": "c", "type": "int"}, {"name": "iB", "type": "int"}, {"name": "jB", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "join", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "c", "type": "int"}, {"name": "p", "type": "int"}, {"name": "iB", "type": "int"}, {"name": "jB", "type": "int"}], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you could write tests for the `Matrix` class using JUnit 5 and Mockito:
```
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class MatrixTest {
    private Matrix matrix;

    @BeforeEach
    public void setUp() {
        matrix = new Matrix();
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 1;
        int b = 2;
        Mockito.when(matrix.add(a, b)).thenReturn(3);

        // Act
        int result = matrix.add(a, b);

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void testSub() {
        // Arrange
        int a = 1;
        int b = 2;
        Mockito.when(matrix.sub(a, b)).thenReturn(-1);

        // Act
        int result = matrix.sub(a, b);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    public void testMult() {
        // Arrange
        int a = 2;
        int b = 3;
        Mockito.when(matrix.mult(a, b)).thenReturn(6);

        // Act
        int result = matrix.mult(a, b);

        // Assert
        assertEquals(6, result);
    }
}
```
In this example, we're testing the `add`, `sub`, and `mult` methods of the `Matrix` class using JUnit 5 and Mockito. We're setting up mocks for each method call using `Mockito.when(...).thenReturn(...)`, and then verifying that the correct result is returned by calling the method under test.

Note that we're using the `@BeforeEach` annotation to set up a new instance of the `Matrix` class before each test method, and the `@Test` annotation to indicate which methods are tests. We're also using the `assertEquals(...)` method from JUnit 5 to verify that the results returned by the methods match our expectations.
