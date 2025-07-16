query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "GCD", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "gcd", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "num1", "type": "int"}, {"name": "num2", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["BinaryOperation(operandl=MemberReference(member=num1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=num2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=num1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=num2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=num1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operandr=BinaryOperation(operandl=MemberReference(member=num2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=||)", "has_else": false}]}, {"name": "gcd", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "numbers", "type": "int"}], "invocations": [{"qualifier": "", "member": "gcd", "arguments": ["result", "number"]}], "conditionals": []}]}]}
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

result: Here are the generated JUnit 5 unit test classes for each of the methods in the JSON array:
```java
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class GCDTest {
    private GCD gcd;

    @BeforeEach
    public void setUp() {
        gcd = new GCD();
    }

    @Test
    public void testGCD_TwoNumbers() {
        // Arrange
        int num1 = 24;
        int num2 = 36;
        int expectedResult = 12;
        when(Math.abs(num1)).thenReturn(num1);
        when(Math.abs(num2)).thenReturn(num2);

        // Act
        int result = gcd.gcd(num1, num2);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGCD_OneNumber() {
        // Arrange
        int num1 = 48;
        int expectedResult = 48;
        when(Math.abs(num1)).thenReturn(num1);

        // Act
        int result = gcd.gcd(num1);

        // Assert
        assertEquals(expectedResult, result);
    }
}
```
```java
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class GCDTest {
    private GCD gcd;

    @BeforeEach
    public void setUp() {
        gcd = new GCD();
    }

    @Test
    public void testGCD_TwoNumbers() {
        // Arrange
        int num1 = 24;
        int num2 = 36;
        int expectedResult = 12;
        when(Math.abs(num1)).thenReturn(num1);
        when(Math.abs(num2)).thenReturn(num2);

        // Act
        int result = gcd.gcd(num1, num2);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGCD_OneNumber() {
        // Arrange
        int num1 = 48;
        int expectedResult = 48;
        when(Math.abs(num1)).thenReturn(num1);

        // Act
        int result = gcd.gcd(num1);

        // Assert
        assertEquals(expectedResult, result);
    }
}
```
Note that these test classes are just examples and may need to be modified based on the specific requirements of your project.
