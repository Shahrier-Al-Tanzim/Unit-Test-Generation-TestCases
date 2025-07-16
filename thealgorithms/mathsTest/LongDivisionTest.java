query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "LongDivision", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "divide", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "dividend", "type": "int"}, {"name": "divisor", "type": "int"}], "invocations": [{"qualifier": "dividendString", "member": "length", "arguments": []}, {"qualifier": "dividendString", "member": "substring", "arguments": ["lastIndex", "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "Long", "member": "parseLong", "arguments": ["partV1"]}, {"qualifier": "answer", "member": "append", "arguments": ["quotient"]}, {"qualifier": "answer", "member": "append", "arguments": ["quotient"]}, {"qualifier": "answer", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "answer", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "String", "member": "valueOf", "arguments": ["part1"]}, {"qualifier": "Integer", "member": "parseInt", "arguments": ["MethodInvocation(arguments=[], member=toString, postfix_operators=[], prefix_operators=[], qualifier=answer, selectors=[], type_arguments=None)"]}, {"qualifier": "answer", "member": "toString", "arguments": []}, {"qualifier": "Integer", "member": "parseInt", "arguments": ["MethodInvocation(arguments=[], member=toString, postfix_operators=[], prefix_operators=[], qualifier=answer, selectors=[], type_arguments=None)"]}, {"qualifier": "answer", "member": "toString", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=divisor, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=dividend, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=divisor, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=dividend, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operandr=BinaryOperation(operandl=MemberReference(member=newDividend1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=newDivisor1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=part1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=newDivisor1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=part1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=newDivisor1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=part1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=part1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=newDivisor1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=part1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=dividend, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=divisor, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>), operator=&&), operandr=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=dividend, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>), operandr=BinaryOperation(operandl=MemberReference(member=divisor, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=&&), operator=||)", "has_else": false}]}]}]}
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
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class LongDivisionTest {
    private LongDivision longDivision;

    @BeforeEach
    void setUp() {
        longDivision = new LongDivision();
    }

    @Test
    public void testDivide() {
        // Arrange
        int dividend = 1234567890;
        int divisor = 1000000000;
        String expectedQuotient = "1.23456789";
        String expectedRemainder = "9.0";

        // Act
        String quotient = longDivision.divide(dividend, divisor);
        String remainder = longDivision.divide(dividend, divisor);

        // Assert
        assertEquals(expectedQuotient, quotient);
        assertEquals(expectedRemainder, remainder);
    }
}
```
