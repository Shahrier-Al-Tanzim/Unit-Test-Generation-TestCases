query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "VectorCrossProduct", "modifiers": ["public"], "fields": [{"name": "x", "type": "int"}, {"name": "y", "type": "int"}, {"name": "z", "type": "int"}], "constructors": [{"parameters": [], "modifiers": []}, {"parameters": [{"name": "vectorX", "type": "int"}, {"name": "vectorY", "type": "int"}, {"name": "vectorZ", "type": "int"}], "modifiers": []}], "methods": [{"name": "magnitude", "modifiers": [], "return_type": "double", "parameters": [], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*), operandr=BinaryOperation(operandl=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*), operator=+), operandr=BinaryOperation(operandl=MemberReference(member=z, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=z, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*), operator=+)"]}], "conditionals": []}, {"name": "dotProduct", "modifiers": [], "return_type": "int", "parameters": [{"name": "b", "type": "VectorCrossProduct"}], "invocations": [], "conditionals": []}, {"name": "crossProduct", "modifiers": [], "return_type": "VectorCrossProduct", "parameters": [{"name": "b", "type": "VectorCrossProduct"}], "invocations": [], "conditionals": []}, {"name": "displayVector", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"x : \"), operandr=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\ty : \"), operator=+), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\tz : \"), operator=+), operandr=MemberReference(member=z, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}], "conditionals": []}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "", "member": "test", "arguments": []}], "conditionals": []}, {"name": "test", "modifiers": ["static"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "a", "member": "crossProduct", "arguments": ["b"]}, {"qualifier": "crossProd", "member": "displayVector", "arguments": []}, {"qualifier": "a", "member": "dotProduct", "arguments": ["b"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Dot Product of a and b: \"), operandr=MemberReference(member=dotProd, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}], "conditionals": []}]}]}
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
import static org.mockito.Mockito.*;

public class VectorCrossProductTest {
    private VectorCrossProduct a, b, crossProd;

    @BeforeEach
    void setUp() {
        a = new VectorCrossProduct(1, 2, 3);
        b = new VectorCrossProduct(4, 5, 6);
        crossProd = a.crossProduct(b);
    }

    @Test
    public void testMagnitude() {
        double expected = Math.sqrt((1 * 1) + (2 * 2) + (3 * 3));
        assertEquals(expected, a.magnitude());
    }

    @Test
    public void testDotProduct() {
        int expected = 1 * 4 + 2 * 5 + 3 * 6;
        assertEquals(expected, a.dotProduct(b));
    }

    @Test
    public void testCrossProduct() {
        VectorCrossProduct expected = new VectorCrossProduct(-3, 6, -3);
        assertEquals(expected, crossProd);
    }
}
```
