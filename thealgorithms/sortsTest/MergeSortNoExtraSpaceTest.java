query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.Arrays"], "classes": [{"class_name": "MergeSortNoExtraSpace", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "sort", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "anyMatch", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), parameters=[MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "max", "arguments": []}, {"qualifier": null, "member": "getAsInt", "arguments": []}, {"qualifier": "", "member": "mergeSort", "arguments": ["array", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)", "maxElement"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=stream, postfix_operators=[], prefix_operators=[], qualifier=Arrays, selectors=[MethodInvocation(arguments=[LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), parameters=[MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=anyMatch, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": false}]}, {"name": "mergeSort", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "array", "type": "int"}, {"name": "start", "type": "int"}, {"name": "end", "type": "int"}, {"name": "maxElement", "type": "int"}], "invocations": [{"qualifier": "", "member": "mergeSort", "arguments": ["array", "start", "middle", "maxElement"]}, {"qualifier": "", "member": "mergeSort", "arguments": ["array", "BinaryOperation(operandl=MemberReference(member=middle, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "end", "maxElement"]}, {"qualifier": "", "member": "merge", "arguments": ["array", "start", "middle", "end", "maxElement"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}]}, {"name": "merge", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "array", "type": "int"}, {"name": "start", "type": "int"}, {"name": "middle", "type": "int"}, {"name": "end", "type": "int"}, {"name": "maxElement", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=maxElement, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=maxElement, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operator=<=)", "has_else": true}]}]}]}
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
package com.thealgorithms.sorts;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MergeSortNoExtraSpaceTest {
    private int[] array;
    private int start, end, maxElement;

    @BeforeEach
    void setUp() {
        // Arrange
        array = new int[]{1, 2, 3, 4, 5};
        start = 0;
        end = array.length - 1;
        maxElement = Arrays.stream(array).max().getAsInt();
    }

    @Test
    void sort() {
        // Act
        MergeSortNoExtraSpace.sort(array, start, end, maxElement);

        // Assert
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}
```
