query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": [], "classes": [{"class_name": "StalinSort", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["array"]}, {"qualifier": "java.lang.reflect.Array", "member": "newInstance", "arguments": ["MethodInvocation(arguments=[], member=getClass, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[MethodInvocation(arguments=[], member=getComponentType, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "BinaryOperation(operandl=MemberReference(member=currentIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "array", "member": "getClass", "arguments": []}, {"qualifier": null, "member": "getComponentType", "arguments": []}, {"qualifier": "System", "member": "arraycopy", "arguments": ["array", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "result", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=currentIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=currentIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>=)", "has_else": false}]}]}]}
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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class StalinSortTest {
    private StalinSort stalinSort;

    @BeforeEach
    void setUp() {
        // Instantiate the focal class
        stalinSort = new StalinSort();
    }

    @Test
    public void sort_shouldReturnEmptyArrayForEmptyInput() {
        // Arrange: Set up inputs, mocks, or stubs.
        int[] input = {};

        // Act: Call the method under test.
        int[] result = stalinSort.sort(input);

        // Assert: Verify the results.
        assertEquals(0, result.length);
    }

    @Test
    public void sort_shouldReturnArrayWithNoDuplicates() {
        // Arrange: Set up inputs, mocks, or stubs.
        int[] input = {1, 2, 3, 4, 5};

        // Act: Call the method under test.
        int[] result = stalinSort.sort(input);

        // Assert: Verify the results.
        assertEquals(5, result.length);
        for (int i = 0; i < result.length - 1; i++) {
            assertNotEquals(result[i], result[i + 1]);
        }
    }

    @Test
    public void sort_shouldReturnArrayInNonDescendingOrder() {
        // Arrange: Set up inputs, mocks, or stubs.
        int[] input = {5, 4, 3, 2, 1};

        // Act: Call the method under test.
        int[] result = stalinSort.sort(input);

        // Assert: Verify the results.
        assertEquals(5, result.length);
        for (int i = 0; i < result.length - 1; i++) {
            assertTrue(result[i] <= result[i + 1]);
        }
    }
}
```
