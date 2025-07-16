query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": ["java.util.Arrays"], "classes": [{"class_name": "MinimumSumPartition", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "throwIfInvalidInput", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "anyMatch", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), parameters=[MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=stream, postfix_operators=[], prefix_operators=[], qualifier=Arrays, selectors=[MethodInvocation(arguments=[LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), parameters=[MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=anyMatch, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": false}]}, {"name": "minimumSumPartition", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "", "member": "throwIfInvalidInput", "arguments": ["array"]}, {"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "sum", "arguments": []}, {"qualifier": "Math", "member": "max", "arguments": ["closestPartitionSum", "j"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<=)", "has_else": false}, {"condition": "MemberReference(member=dp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])", "has_else": false}]}]}]}
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

result: Here's the complete Java test class for the `MinimumSumPartition` method:
```java
package com.thealgorithms.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MinimumSumPartitionTest {
    private static final int[] array = new int[]{1, 2, 3, 4};
    private static final int closestPartitionSum = 6;
    private static final int j = 3;
    private static final int i = 0;
    private MinimumSumPartition dp;

    @BeforeEach
    void setUp() {
        dp = new MinimumSumPartition();
    }

    @Test
    void throwIfInvalidInput() {
        // Arrange
        int[] invalidArray = new int[]{1, 2, 3};
        Mockito.when(dp.throwIfInvalidInput(invalidArray)).thenReturn(true);

        // Act
        dp.throwIfInvalidInput(invalidArray);

        // Assert
        verify(dp).throwIfInvalidInput(invalidArray);
    }

    @Test
    void minimumSumPartition() {
        // Arrange
        Mockito.when(dp.minimumSumPartition(array)).thenReturn(closestPartitionSum);

        // Act
        int result = dp.minimumSumPartition(array);

        // Assert
        assertEquals(result, closestPartitionSum);
    }
}
```
Note that this test class uses Mockito to stub the behavior of the `throwIfInvalidInput` method and verify its call. It also uses JUnit's `@BeforeEach` annotation to set up a new instance of the `MinimumSumPartition` class for each test method.
