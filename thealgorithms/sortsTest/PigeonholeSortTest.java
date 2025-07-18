query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.ArrayList", "java.util.Arrays", "java.util.List"], "classes": [{"class_name": "PigeonholeSort", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "sort", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "", "member": "checkForNegativeInput", "arguments": ["array"]}, {"qualifier": "Arrays", "member": "stream", "arguments": ["array"]}, {"qualifier": null, "member": "max", "arguments": []}, {"qualifier": null, "member": "orElseThrow", "arguments": []}, {"qualifier": "", "member": "createPigeonHoles", "arguments": ["maxElement"]}, {"qualifier": "", "member": "populatePigeonHoles", "arguments": ["array", "pigeonHoles"]}, {"qualifier": "", "member": "collectFromPigeonHoles", "arguments": ["array", "pigeonHoles"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "checkForNegativeInput", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "array", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}, {"name": "createPigeonHoles", "modifiers": ["private", "static"], "return_type": "List", "parameters": [{"name": "maxElement", "type": "int"}], "invocations": [{"qualifier": "pigeonHoles", "member": "add", "arguments": ["ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[], dimensions=None, name=ArrayList, sub_type=None))"]}], "conditionals": []}, {"name": "populatePigeonHoles", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "array", "type": "int"}, {"name": "pigeonHoles", "type": "List"}], "invocations": [{"qualifier": "pigeonHoles", "member": "get", "arguments": ["element"]}, {"qualifier": null, "member": "add", "arguments": ["element"]}], "conditionals": []}, {"name": "collectFromPigeonHoles", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "array", "type": "int"}, {"name": "pigeonHoles", "type": "Iterable"}], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you could write unit tests for the `PigeonholeSort` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.sorts;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PigeonholeSortTest {
    @Mock
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        // Set up the mock list with some values
        when(list.size()).thenReturn(5);
        when(list.get(0)).thenReturn(1);
        when(list.get(1)).thenReturn(2);
        when(list.get(2)).thenReturn(3);
        when(list.get(3)).thenReturn(4);
        when(list.get(4)).thenReturn(5);
    }

    @Test
    public void testSort() {
        // Arrange
        PigeonholeSort sorter = new PigeonholeSort();

        // Act
        int result = sorter.sort(list);

        // Assert
        assertEquals(5, result);
    }
}
```
In this example, we're using JUnit 5 and Mockito to write unit tests for the `PigeonholeSort` class. We've created a mock list with some values using Mockito, and then set up the mock list with some values in the `@BeforeEach` method. In the test method, we create an instance of the `PigeonholeSort` class and call its `sort` method with the mock list as input. Finally, we assert that the result is equal to 5.

Note that we've also used the `@ExtendWith(MockitoExtension.class)` annotation to enable Mockito for this test class. This allows us to use the `when` and `verify` methods provided by Mockito to stub the behavior of the mock list and verify method calls, respectively.
