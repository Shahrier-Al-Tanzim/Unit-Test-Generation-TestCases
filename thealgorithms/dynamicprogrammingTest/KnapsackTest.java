query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": ["java.util.Arrays"], "classes": [{"class_name": "Knapsack", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "throwIfInvalidInput", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "weightCapacity", "type": "int"}, {"name": "weights", "type": "int"}, {"name": "values", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["weights"]}, {"qualifier": null, "member": "anyMatch", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), parameters=[MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=weightCapacity, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=weights, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=values, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operator=||), operandr=BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=weights, selectors=[]), operandr=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=values, selectors=[]), operator=!=), operator=||)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=weights, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=stream, postfix_operators=[], prefix_operators=[], qualifier=Arrays, selectors=[MethodInvocation(arguments=[LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), parameters=[MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=anyMatch, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": false}]}, {"name": "knapSack", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "weightCapacity", "type": "int"}, {"name": "weights", "type": "int"}, {"name": "values", "type": "int"}], "invocations": [{"qualifier": "", "member": "throwIfInvalidInput", "arguments": ["weightCapacity", "weights", "values"]}, {"qualifier": "Math", "member": "max", "arguments": ["dp", "BinaryOperation(operandl=MemberReference(member=dp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=weights, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=-))]), operandr=MemberReference(member=values, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=weights, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<=)", "has_else": false}]}]}]}
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
package com.thealgorithms.dynamicprogramming;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class KnapsackTest {
    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs
    }

    @AfterEach
    void tearDown() {
        // Cleanup
    }

    @Test
    public void testThrowIfInvalidInput() {
        // Arrange
        int weightCapacity = 10;
        int[] weights = new int[]{1, 2, 3};
        int[] values = new int[]{10, 20, 30};

        // Act
        Knapsack.throwIfInvalidInput(weightCapacity, weights, values);

        // Assert
        verify(Arrays.stream(weights)).anyMatch((w) -> w <= 0);
        verify(Arrays.stream(values)).anyMatch((v) -> v <= 0);
    }

    @Test
    public void testKnapSack() {
        // Arrange
        int weightCapacity = 10;
        int[] weights = new int[]{1, 2, 3};
        int[] values = new int[]{10, 20, 30};

        // Act
        int result = Knapsack.knapSack(weightCapacity, weights, values);

        // Assert
        assertEquals(30, result);
    }
}
```
