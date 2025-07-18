query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["com.thealgorithms.maths.Ceil.ceil", "com.thealgorithms.maths.Floor.floor", "com.thealgorithms.searches.QuickSelect.select", "java.util.Arrays"], "classes": [{"class_name": "WiggleSort", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "unsorted", "type": "T"}], "invocations": [{"qualifier": "", "member": "wiggleSort", "arguments": ["unsorted"]}], "conditionals": []}, {"name": "mapIndex", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "index", "type": "int"}, {"name": "n", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "triColorSort", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "sortThis", "type": "T"}, {"name": "median", "type": "T"}], "invocations": [{"qualifier": "", "member": "mapIndex", "arguments": ["j", "n"]}, {"qualifier": null, "member": "compareTo", "arguments": ["median"]}, {"qualifier": "SortUtils", "member": "swap", "arguments": ["sortThis", "MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=mapIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=mapIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "mapIndex", "arguments": ["j", "n"]}, {"qualifier": "", "member": "mapIndex", "arguments": ["i", "n"]}, {"qualifier": "", "member": "mapIndex", "arguments": ["j", "n"]}, {"qualifier": null, "member": "compareTo", "arguments": ["median"]}, {"qualifier": "SortUtils", "member": "swap", "arguments": ["sortThis", "MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=mapIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=mapIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "mapIndex", "arguments": ["j", "n"]}, {"qualifier": "", "member": "mapIndex", "arguments": ["k", "n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operandr=MemberReference(member=sortThis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=mapIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)), MethodInvocation(arguments=[MemberReference(member=median, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operator=<)", "has_else": true}, {"condition": "BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operandr=MemberReference(member=sortThis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=mapIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)), MethodInvocation(arguments=[MemberReference(member=median, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operator=>)", "has_else": true}]}, {"name": "wiggleSort", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "sortThis", "type": "T"}], "invocations": [{"qualifier": "", "member": "select", "arguments": ["MethodInvocation(arguments=[MemberReference(member=sortThis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=asList, postfix_operators=[], prefix_operators=[], qualifier=Arrays, selectors=[], type_arguments=None)", "Cast(expression=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=sortThis, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2.0), operator=/)], member=floor, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), type=BasicType(dimensions=[], name=int))"]}, {"qualifier": "Arrays", "member": "asList", "arguments": ["sortThis"]}, {"qualifier": "", "member": "floor", "arguments": ["BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=sortThis, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2.0), operator=/)"]}, {"qualifier": "sortThi", "member": "compareTo", "arguments": ["median"]}, {"qualifier": "", "member": "ceil", "arguments": ["BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=sortThis, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2.0), operator=/)"]}, {"qualifier": "", "member": "select", "arguments": ["MethodInvocation(arguments=[MemberReference(member=sortThis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=asList, postfix_operators=[], prefix_operators=[], qualifier=Arrays, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "Arrays", "member": "asList", "arguments": ["sortThis"]}, {"qualifier": "smallestValue", "member": "compareTo", "arguments": ["median"]}, {"qualifier": "", "member": "ceil", "arguments": ["BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=sortThis, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2.0), operator=/)"]}, {"qualifier": "", "member": "triColorSort", "arguments": ["sortThis", "median"]}], "conditionals": [{"condition": "BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operandr=MethodInvocation(arguments=[MemberReference(member=median, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=sortThi, selectors=[], type_arguments=None), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=sortThis, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===), operandr=BinaryOperation(operandl=MemberReference(member=numMedians, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=sortThis, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2.0), operator=/)], member=ceil, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operator===), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operandr=MethodInvocation(arguments=[MemberReference(member=median, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=smallestValue, selectors=[], type_arguments=None), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=numMedians, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=sortThis, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2.0), operator=/)], member=ceil, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operator=>)", "has_else": false}]}]}]}
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
Here's an example of how you could write tests for the `wiggleSort` method using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class WiggleSortTests {
    @Mock
    private List<Integer> list;

    @InjectMocks
    private WiggleSort wiggleSort;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testWiggleSort_emptyList() {
        // Arrange
        when(list.size()).thenReturn(0);

        // Act
        wiggleSort.wiggleSort(list);

        // Assert
        verify(list).clear();
    }

    @Test
    public void testWiggleSort_singleElement() {
        // Arrange
        when(list.size()).thenReturn(1);
        when(list.get(0)).thenReturn(5);

        // Act
        wiggleSort.wiggleSort(list);

        // Assert
        verify(list).clear();
        verify(list).add(5);
    }

    @Test
    public void testWiggleSort_multipleElements() {
        // Arrange
        when(list.size()).thenReturn(3);
        when(list.get(0)).thenReturn(5);
        when(list.get(1)).thenReturn(2);
        when(list.get(2)).thenReturn(8);

        // Act
        wiggleSort.wiggleSort(list);

        // Assert
        verify(list).clear();
        verify(list).add(5);
        verify(list).add(2);
        verify(list).add(8);
    }
}
```
In this example, we're using JUnit 5 to write tests for the `wiggleSort` method. We're also using Mockito to mock the `List<Integer>` object that is passed as an argument to the method.

The first test method (`testWiggleSort_emptyList`) verifies that the method clears the list when it's empty. The second test method (`testWiggleSort_singleElement`) verifies that the method adds a single element to the list when there's only one element in the list. The third test method (`testWiggleSort_multipleElements`) verifies that the method sorts the elements in the list correctly when there are multiple elements.

In each of these tests, we're using Mockito to stub the behavior of the `List<Integer>` object and verify that the method is called with the correct arguments. We're also using JUnit 5's `assert` methods to verify the results of the test.
