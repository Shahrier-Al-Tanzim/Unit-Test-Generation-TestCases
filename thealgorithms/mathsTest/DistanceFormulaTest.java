query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "DistanceFormula", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "euclideanDistance", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "x1", "type": "double"}, {"name": "y1", "type": "double"}, {"name": "x2", "type": "double"}, {"name": "y2", "type": "double"}], "invocations": [{"qualifier": "Math", "member": "pow", "arguments": ["BinaryOperation(operandl=MemberReference(member=x2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "Math", "member": "pow", "arguments": ["BinaryOperation(operandl=MemberReference(member=y2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["BinaryOperation(operandl=MemberReference(member=dX, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=dY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}], "conditionals": []}, {"name": "manhattanDistance", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "x1", "type": "double"}, {"name": "y1", "type": "double"}, {"name": "x2", "type": "double"}, {"name": "y2", "type": "double"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["BinaryOperation(operandl=MemberReference(member=x1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)"]}, {"qualifier": "Math", "member": "abs", "arguments": ["BinaryOperation(operandl=MemberReference(member=y1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)"]}], "conditionals": []}, {"name": "hammingDistance", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "b1", "type": "int"}, {"name": "b2", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["BinaryOperation(operandl=MemberReference(member=b1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=b2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=b1, selectors=[]), operandr=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=b2, selectors=[]), operator=!=)", "has_else": false}]}, {"name": "minkowskiDistance", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "p1", "type": "double"}, {"name": "p2", "type": "double"}, {"name": "p", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=p1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=p2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=-), MemberReference(member=p, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=pow, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None)"]}, {"qualifier": "Math", "member": "pow", "arguments": ["BinaryOperation(operandl=MemberReference(member=p1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=p2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=-)", "p"]}, {"qualifier": "Math", "member": "pow", "arguments": ["distance", "BinaryOperation(operandl=Cast(expression=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), type=BasicType(dimensions=[], name=double)), operandr=MemberReference(member=p, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=/)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=p1, selectors=[]), operandr=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=p2, selectors=[]), operator=!=)", "has_else": false}]}]}]}
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

result: 
Here are the generated JUnit 5 unit tests for each method in the JSON array of method-metadata:
```java
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class DistanceFormulaTest {
    private DistanceFormula distanceFormula;

    @BeforeEach
    public void setUp() {
        distanceFormula = new DistanceFormula();
    }

    @Test
    public void testEuclideanDistance() {
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 5.0;
        double y2 = 7.0;

        Mockito.when(Math.pow(x2 - x1, 2)).thenReturn(4.0);
        Mockito.when(Math.pow(y2 - y1, 2)).thenReturn(9.0);
        Mockito.when(Math.sqrt(Mockito.anyDouble())).thenAnswer((InvocationOnMock invocation) -> {
            double value = (double) invocation.getArguments()[0];
            return Math.sqrt(value);
        });

        double result = distanceFormula.euclideanDistance(x1, y1, x2, y2);

        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testManhattanDistance() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 7;

        Mockito.when(Math.abs(x2 - x1)).thenReturn(3);
        Mockito.when(Math.abs(y2 - y1)).thenReturn(4);

        int result = distanceFormula.manhattanDistance(x1, y1, x2, y2);

        assertEquals(7, result);
    }

    @Test
    public void testHammingDistance() {
        int b1 = 0b1010;
        int b2 = 0b1011;

        Mockito.when(Math.abs(b2 - b1)).thenReturn(3);

        int result = distanceFormula.hammingDistance(b1, b2);

        assertEquals(1, result);
    }

    @Test
    public void testMinkowskiDistance() {
        double p1 = 2.0;
        double p2 = 3.0;
        int p = 5;

        Mockito.when(Math.abs(p2 - p1)).thenReturn(3);
        Mockito.when(Math.pow(Mockito.anyDouble(), p)).thenAnswer((InvocationOnMock invocation) -> {
            double value = (double) invocation.getArguments()[0];
            return Math.pow(value, p);
        });
        Mockito.when(Math.sqrt(Mockito.anyDouble())).thenAnswer((InvocationOnMock invocation) -> {
            double value = (double) invocation.getArguments()[0];
            return Math.sqrt(value);
        });

        double result = distanceFormula.minkowskiDistance(p1, p2, p);

        assertEquals(5.0, result, 0.001);
    }
}
```
