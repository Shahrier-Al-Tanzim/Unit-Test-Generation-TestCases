query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": ["java.util.stream.IntStream"], "classes": [{"class_name": "AliquotSum", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "getAliquotValue", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "IntStream", "member": "iterate", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "LambdaExpression(body=MemberReference(member=i, postfix_operators=[], prefix_operators=['++'], qualifier=, selectors=[]), parameters=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": null, "member": "limit", "arguments": ["BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=/)"]}, {"qualifier": null, "member": "filter", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), parameters=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": null, "member": "forEach", "arguments": ["LambdaExpression(body=Assignment(expressionl=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=sumWrapper, selectors=[]), type=+=, value=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), parameters=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}], "conditionals": []}, {"name": "getAliquotSum", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=root, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Cast(expression=MemberReference(member=root, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type=BasicType(dimensions=[], name=int)), operator===)", "has_else": false}]}]}]}
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

import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AliquotSumTest {
    private AliquotSum aliquotSum;
    private int number = 10;
    private int root;
    private int sumWrapper;
    private int value;

    @BeforeEach
    void setUp() {
        aliquotSum = new AliquotSum();
        root = (int) Math.sqrt(number);
        sumWrapper = 0;
    }

    @Test
    public void getAliquotValue_shouldReturnCorrectValue() {
        // Arrange
        int expected = IntStream.iterate(1, i -> i + 1)
                .limit(number / 2)
                .filter(i -> number % i == 0)
                .forEach(i -> sumWrapper += i);

        // Act
        int actual = aliquotSum.getAliquotValue(number);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getAliquotSum_shouldReturnCorrectSum() {
        // Arrange
        when(Math.sqrt(number)).thenReturn(root);
        doNothing().when(IntStream.iterate(1, i -> i + 1)
                .limit(number / 2)
                .filter(i -> number % i == 0));
        int expected = root * (root + 1) / 2;

        // Act
        int actual = aliquotSum.getAliquotSum(number);

        // Assert
        assertEquals(expected, actual);
    }
}
```
