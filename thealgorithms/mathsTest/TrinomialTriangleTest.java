query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "TrinomialTriangle", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "trinomialValue", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}, {"name": "k", "type": "int"}], "invocations": [{"qualifier": "", "member": "trinomialValue", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)", "BinaryOperation(operandl=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "", "member": "trinomialValue", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)", "k"]}, {"qualifier": "", "member": "trinomialValue", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)", "BinaryOperation(operandl=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operandr=BinaryOperation(operandl=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=n, postfix_operators=[], prefix_operators=['-'], qualifier=, selectors=[]), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>), operator=||)", "has_else": false}]}, {"name": "printTrinomial", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "System.out", "member": "print", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=trinomialValue, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \"), operator=+)"]}, {"qualifier": "", "member": "trinomialValue", "arguments": ["i", "j"]}, {"qualifier": "System.out", "member": "print", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=trinomialValue, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \"), operator=+)"]}, {"qualifier": "", "member": "trinomialValue", "arguments": ["i", "j"]}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": []}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "argc", "type": "String"}], "invocations": [{"qualifier": "", "member": "printTrinomial", "arguments": ["n"]}], "conditionals": []}]}]}
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
import org.mockito.Mockito;

public class TrinomialTriangleTest {
    private TrinomialTriangle trinomialTriangle;

    @BeforeEach
    public void setUp() {
        trinomialTriangle = new TrinomialTriangle();
    }

    @Test
    public void testTrinomialValue() {
        // Arrange
        int n = 3;
        int k = 2;
        Mockito.when(trinomialTriangle.trinomialValue(n, k)).thenReturn(1);

        // Act
        int result = trinomialTriangle.trinomialValue(n, k);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testPrintTrinomial() {
        // Arrange
        int n = 3;
        Mockito.when(trinomialTriangle.printTrinomial(n)).thenReturn("");

        // Act
        String result = trinomialTriangle.printTrinomial(n);

        // Assert
        assertEquals("", result);
    }

    @Test
    public void testMain() {
        // Arrange
        int n = 3;
        Mockito.when(trinomialTriangle.main(n)).thenReturn("");

        // Act
        String result = trinomialTriangle.main(n);

        // Assert
        assertEquals("", result);
    }
}
```
