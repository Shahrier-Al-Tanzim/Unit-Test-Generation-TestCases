query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.ArrayList", "java.util.Arrays", "java.util.List"], "classes": [{"class_name": "StrandSort", "modifiers": ["final", "public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "Arrays", "member": "asList", "arguments": ["array"]}, {"qualifier": "", "member": "strandSort", "arguments": ["unsortedList"]}, {"qualifier": "sortedList", "member": "toArray", "arguments": ["array"]}], "conditionals": []}, {"name": "strandSort", "modifiers": ["private", "static"], "return_type": "List", "parameters": [{"name": "list", "type": "List"}], "invocations": [{"qualifier": "list", "member": "size", "arguments": []}, {"qualifier": "list", "member": "isEmpty", "arguments": []}, {"qualifier": "sorted", "member": "add", "arguments": ["MethodInvocation(arguments=[], member=removeFirst, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None)"]}, {"qualifier": "list", "member": "removeFirst", "arguments": []}, {"qualifier": "list", "member": "size", "arguments": []}, {"qualifier": "sorted", "member": "getLast", "arguments": []}, {"qualifier": null, "member": "compareTo", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None)"]}, {"qualifier": "list", "member": "get", "arguments": ["i"]}, {"qualifier": "sorted", "member": "add", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=remove, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None)"]}, {"qualifier": "list", "member": "remove", "arguments": ["i"]}, {"qualifier": "", "member": "merge", "arguments": ["result", "sorted"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=getLast, postfix_operators=[], prefix_operators=[], qualifier=sorted, selectors=[MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=list, selectors=[], type_arguments=None)], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": true}]}, {"name": "merge", "modifiers": ["private", "static"], "return_type": "List", "parameters": [{"name": "left", "type": "List"}, {"name": "right", "type": "List"}], "invocations": [{"qualifier": "left", "member": "size", "arguments": []}, {"qualifier": "right", "member": "size", "arguments": []}, {"qualifier": "left", "member": "get", "arguments": ["i"]}, {"qualifier": null, "member": "compareTo", "arguments": ["MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=right, selectors=[], type_arguments=None)"]}, {"qualifier": "right", "member": "get", "arguments": ["j"]}, {"qualifier": "result", "member": "add", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=left, selectors=[], type_arguments=None)"]}, {"qualifier": "left", "member": "get", "arguments": ["i"]}, {"qualifier": "result", "member": "add", "arguments": ["MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=right, selectors=[], type_arguments=None)"]}, {"qualifier": "right", "member": "get", "arguments": ["j"]}, {"qualifier": "result", "member": "addAll", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=left, selectors=[], type_arguments=None)], member=subList, postfix_operators=[], prefix_operators=[], qualifier=left, selectors=[], type_arguments=None)"]}, {"qualifier": "left", "member": "subList", "arguments": ["i", "MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=left, selectors=[], type_arguments=None)"]}, {"qualifier": "left", "member": "size", "arguments": []}, {"qualifier": "result", "member": "addAll", "arguments": ["MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=right, selectors=[], type_arguments=None)], member=subList, postfix_operators=[], prefix_operators=[], qualifier=right, selectors=[], type_arguments=None)"]}, {"qualifier": "right", "member": "subList", "arguments": ["j", "MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=right, selectors=[], type_arguments=None)"]}, {"qualifier": "right", "member": "size", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=left, selectors=[MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=right, selectors=[], type_arguments=None)], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": true}]}]}]}
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
import static org.mockito.Mockito.*;

class StrandSortTest {
    private StrandSort strandSort;
    private List<Integer> unsortedList, sortedList;

    @BeforeEach
    void setUp() {
        unsortedList = new ArrayList<>();
        sortedList = new ArrayList<>();
        strandSort = new StrandSort();
    }

    @Test
    void testSort() {
        // Arrange
        unsortedList.add(3);
        unsortedList.add(1);
        unsortedList.add(2);
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        when(Arrays.asList(unsortedList)).thenReturn(unsortedList);
        when(strandSort.strandSort(unsortedList)).thenReturn(sortedList);
        when(sortedList.toArray()).thenReturn(new Integer[] {1, 2, 3});

        // Act
        T result = strandSort.sort(unsortedList);

        // Assert
        assertEquals(result, sortedList);
    }
}
```
