query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths.Prime", "imports": ["java.util.Scanner"], "classes": [{"class_name": "PrimeCheck", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter a number: \")"]}, {"qualifier": "scanner", "member": "nextInt", "arguments": []}, {"qualifier": "", "member": "isPrime", "arguments": ["n"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"algo1 verify that \"), operandr=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" is a prime number\"), operator=+)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"algo1 verify that \"), operandr=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" is not a prime number\"), operator=+)"]}, {"qualifier": "", "member": "fermatPrimeChecking", "arguments": ["n", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=20)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"algo2 verify that \"), operandr=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" is a prime number\"), operator=+)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"algo2 verify that \"), operandr=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" is not a prime number\"), operator=+)"]}, {"qualifier": "scanner", "member": "close", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isPrime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "MethodInvocation(arguments=[MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=20)], member=fermatPrimeChecking, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "isPrime", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=<), operandr=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "fermatPrimeChecking", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "n", "type": "int"}, {"name": "iteration", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "floor", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=MethodInvocation(arguments=[], member=random, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None), operandr=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=up, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=down, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operator=*), operandr=MemberReference(member=down, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "Math", "member": "random", "arguments": []}, {"qualifier": "", "member": "modPow", "arguments": ["a", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)", "n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=modPow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=!=)", "has_else": false}]}, {"name": "modPow", "modifiers": ["static", "private"], "return_type": "long", "parameters": [{"name": "a", "type": "long"}, {"name": "b", "type": "long"}, {"name": "c", "type": "long"}], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you could write a JUnit test for the `PrimeCheck` class using the above JSON metadata:
```java
package com.thealgorithms.maths.Prime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PrimeCheckTest {
    private Scanner scanner;

    @BeforeEach
    public void setUp() {
        scanner = mock(Scanner.class);
    }

    @Test
    public void testIsPrime() {
        int n = 10;
        when(scanner.nextInt()).thenReturn(n);

        boolean result = PrimeCheck.isPrime(n);

        assertTrue(result);
    }

    @Test
    public void testFermatPrimeChecking() {
        int n = 10;
        when(scanner.nextInt()).thenReturn(n);

        boolean result = PrimeCheck.fermatPrimeChecking(n, 20);

        assertTrue(result);
    }
}
```
Note that this is just one possible way to write the tests, and there are many other ways to do it depending on your specific needs and preferences.
