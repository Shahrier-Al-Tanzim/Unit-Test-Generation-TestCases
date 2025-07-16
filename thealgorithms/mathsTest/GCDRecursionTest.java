query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "GCDRecursion", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=20), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=15)], member=gcd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "gcd", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=20)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=15)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=8)], member=gcd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "gcd", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=8)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)], member=gcd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)], member=gcd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)], member=gcd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "gcd", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)], member=gcd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)], member=gcd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "gcd", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)"]}, {"qualifier": "", "member": "gcd", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}], "conditionals": []}, {"name": "gcd", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)"]}, {"qualifier": "", "member": "gcd", "arguments": ["b", "BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operandr=BinaryOperation(operandl=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}]}]}]}
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

class GCDRecursionTest {
    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void testGCD_10_5() {
        // Arrange
        int a = 10;
        int b = 5;
        GCDRecursion gcd = new GCDRecursion();
        Mockito.when(gcd.gcd(a, b)).thenReturn(2);

        // Act
        int result = gcd.gcd(a, b);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void testGCD_10_8() {
        // Arrange
        int a = 10;
        int b = 8;
        GCDRecursion gcd = new GCDRecursion();
        Mockito.when(gcd.gcd(a, b)).thenReturn(2);

        // Act
        int result = gcd.gcd(a, b);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void testGCD_15_20() {
        // Arrange
        int a = 15;
        int b = 20;
        GCDRecursion gcd = new GCDRecursion();
        Mockito.when(gcd.gcd(a, b)).thenReturn(5);

        // Act
        int result = gcd.gcd(a, b);

        // Assert
        assertEquals(5, result);
    }
}
```
