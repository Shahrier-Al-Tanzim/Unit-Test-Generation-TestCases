query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.greedyalgorithms", "imports": ["java.util.Arrays", "java.util.Comparator"], "classes": [{"class_name": "FractionalKnapsack", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "fractionalKnapsack", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "weight", "type": "int"}, {"name": "value", "type": "int"}, {"name": "capacity", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "sort", "arguments": ["ratio", "MethodInvocation(arguments=[LambdaExpression(body=MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1))]), parameters=[MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=comparingDouble, postfix_operators=[], prefix_operators=[], qualifier=Comparator, selectors=[], type_arguments=None)"]}, {"qualifier": "Comparator", "member": "comparingDouble", "arguments": ["LambdaExpression(body=MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1))]), parameters=[MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=weight, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=>=)", "has_else": true}]}]}]}
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
package com.thealgorithms.greedyalgorithms;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class FractionalKnapsackTest {
    private final int weight = 10;
    private final int value = 20;
    private final int capacity = 30;

    @BeforeEach
    public void setUp() {
        // Set up inputs, mocks, or stubs.
    }

    @Test
    public void testFractionalKnapsack() {
        // Arrange: Set up inputs, mocks, or stubs.
        int[] items = new int[2];
        items[0] = 1;
        items[1] = 2;
        Arrays.sort(items, Comparator.comparingDouble((o) -> o));

        // Act: Call the method under test.
        int result = FractionalKnapsack.fractionalKnapsack(weight, value, capacity);

        // Assert: Verify the results.
        assertEquals(20, result);
    }
}
```
