query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": ["java.math.BigInteger"], "classes": [{"class_name": "KaratsubaMultiplication", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "karatsuba", "modifiers": ["public", "static"], "return_type": "BigInteger", "parameters": [{"name": "x", "type": "BigInteger"}, {"name": "y", "type": "BigInteger"}], "invocations": [{"qualifier": "x", "member": "bitLength", "arguments": []}, {"qualifier": "y", "member": "bitLength", "arguments": []}, {"qualifier": "x", "member": "multiply", "arguments": ["y"]}, {"qualifier": "Math", "member": "max", "arguments": ["MethodInvocation(arguments=[], member=bitLength, postfix_operators=[], prefix_operators=[], qualifier=x, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[], member=bitLength, postfix_operators=[], prefix_operators=[], qualifier=y, selectors=[], type_arguments=None)"]}, {"qualifier": "x", "member": "bitLength", "arguments": []}, {"qualifier": "y", "member": "bitLength", "arguments": []}, {"qualifier": "x", "member": "shiftRight", "arguments": ["m"]}, {"qualifier": "x", "member": "subtract", "arguments": ["MethodInvocation(arguments=[MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=shiftLeft, postfix_operators=[], prefix_operators=[], qualifier=high1, selectors=[], type_arguments=None)"]}, {"qualifier": "high1", "member": "shiftLeft", "arguments": ["m"]}, {"qualifier": "y", "member": "shiftRight", "arguments": ["m"]}, {"qualifier": "y", "member": "subtract", "arguments": ["MethodInvocation(arguments=[MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=shiftLeft, postfix_operators=[], prefix_operators=[], qualifier=high2, selectors=[], type_arguments=None)"]}, {"qualifier": "high2", "member": "shiftLeft", "arguments": ["m"]}, {"qualifier": "", "member": "karatsuba", "arguments": ["low1", "low2"]}, {"qualifier": "", "member": "karatsuba", "arguments": ["MethodInvocation(arguments=[MemberReference(member=high1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=low1, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=high2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=low2, selectors=[], type_arguments=None)"]}, {"qualifier": "low1", "member": "add", "arguments": ["high1"]}, {"qualifier": "low2", "member": "add", "arguments": ["high2"]}, {"qualifier": "", "member": "karatsuba", "arguments": ["high1", "high2"]}, {"qualifier": "z2", "member": "shiftLeft", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operandr=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*)"]}, {"qualifier": null, "member": "add", "arguments": ["MethodInvocation(arguments=[MemberReference(member=z2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=subtract, postfix_operators=[], prefix_operators=[], qualifier=z1, selectors=[MethodInvocation(arguments=[MemberReference(member=z0, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=subtract, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None), MethodInvocation(arguments=[MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=shiftLeft, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)"]}, {"qualifier": "z1", "member": "subtract", "arguments": ["z2"]}, {"qualifier": null, "member": "subtract", "arguments": ["z0"]}, {"qualifier": null, "member": "shiftLeft", "arguments": ["m"]}, {"qualifier": null, "member": "add", "arguments": ["z0"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MethodInvocation(arguments=[], member=bitLength, postfix_operators=[], prefix_operators=[], qualifier=x, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4), operator=<=), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=bitLength, postfix_operators=[], prefix_operators=[], qualifier=y, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4), operator=<=), operator=||)", "has_else": false}]}]}]}
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

result: Here's an example of how you could write a unit test for the `karatsuba` method in the `KaratsubaMultiplication` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigInteger;

class KaratsubaMultiplicationTest {
    private KaratsubaMultiplication karatsubaMultiplication;
    private BigInteger x, y, z0, z1, z2;

    @BeforeEach
    void setUp() {
        // Set up the inputs and mocks for each test method
        x = new BigInteger("123456789");
        y = new BigInteger("987654321");
        z0 = new BigInteger("123456789");
        z1 = new BigInteger("987654321");
        z2 = new BigInteger("123456789");
    }

    @Test
    void testKaratsuba() {
        // Arrange
        BigInteger expectedResult = x.multiply(y);
        Mockito.when(x.bitLength()).thenReturn(4);
        Mockito.when(y.bitLength()).thenReturn(4);
        Mockito.when(x.shiftRight(2)).thenReturn(z0);
        Mockito.when(y.shiftRight(2)).thenReturn(z1);
        Mockito.when(x.subtract(z0)).thenReturn(z2);
        Mockito.when(y.subtract(z1)).thenReturn(z2);
        Mockito.when(z0.add(z1)).thenReturn(expectedResult);

        // Act
        BigInteger actualResult = karatsubaMultiplication.karatsuba(x, y);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
```
In this example, we're using the `@BeforeEach` annotation to set up the inputs and mocks for each test method. We're also using Mockito to stub the behavior of the `bitLength`, `shiftRight`, `subtract`, and `add` methods on the `BigInteger` class.

The `testKaratsuba` method is an example of an Arrange-Act-Assert format, where we first set up the inputs and mocks for the test, then call the method under test, and finally verify that the results are as expected.

Note that this is just one possible way to write a unit test for the `karatsuba` method using JUnit 5 and Mockito. There are many other ways to do it, and the specific approach you choose will depend on your needs and preferences.
