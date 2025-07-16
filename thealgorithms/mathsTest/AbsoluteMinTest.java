query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": ["java.util.Arrays"], "classes": [{"class_name": "AbsoluteMin", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "getMinValue", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "numbers", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["numbers"]}, {"qualifier": null, "member": "skip", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": null, "member": "filter", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=abs, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=absMinWrapper, selectors=[])], member=abs, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None), operator=<=), parameters=[MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "Math", "member": "abs", "arguments": ["number"]}, {"qualifier": "Math", "member": "abs", "arguments": ["value"]}, {"qualifier": null, "member": "forEach", "arguments": ["LambdaExpression(body=Assignment(expressionl=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=absMinWrapper, selectors=[]), type==, value=MethodInvocation(arguments=[MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=absMinWrapper, selectors=[]), MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=min, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None)), parameters=[MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "Math", "member": "min", "arguments": ["value", "number"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=numbers, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}]}]}
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
Here are the generated JUnit 5 unit tests for the given method-metadata:
```java
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class AbsoluteMinTest {
    private static final int[] numbers = new int[]{1, 2, -3, 4, -5};
    private static final int expectedResult = -3;

    @BeforeEach
    void setUp() {
        // Set up inputs and mocks
        MockedStatic<Arrays> arraysMockedStatic = Mockito.mockStatic(Arrays.class);
        arraysMockedStatic.when(() -> Arrays.stream(numbers)).thenReturn(Arrays.stream(numbers));
    }

    @Test
    void getMinValue() {
        // Arrange
        AbsoluteMin absoluteMin = new AbsoluteMin();

        // Act
        int actualResult = absoluteMin.getMinValue(numbers);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
```
Note that this is just one possible way to write the test case, and there are many other ways to do it depending on your specific requirements and preferences.
