query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.ArrayList", "java.util.List"], "classes": [{"class_name": "MergeSortRecursive", "modifiers": ["public"], "fields": [{"name": "arr", "type": "List"}], "constructors": [{"parameters": [{"name": "arr", "type": "List"}], "modifiers": ["public"]}], "methods": [{"name": "mergeSort", "modifiers": ["public"], "return_type": "List", "parameters": [], "invocations": [{"qualifier": "", "member": "merge", "arguments": ["arr"]}], "conditionals": []}, {"name": "merge", "modifiers": ["private", "static"], "return_type": "List", "parameters": [{"name": "arr", "type": "List"}], "invocations": [{"qualifier": "arr", "member": "size", "arguments": []}, {"qualifier": "arr", "member": "size", "arguments": []}, {"qualifier": "arr", "member": "subList", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "half"]}, {"qualifier": "arr", "member": "subList", "arguments": ["half", "MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=arr, selectors=[], type_arguments=None)"]}, {"qualifier": "arr", "member": "size", "arguments": []}, {"qualifier": "", "member": "merge", "arguments": ["arrA"]}, {"qualifier": "", "member": "merge", "arguments": ["arrB"]}, {"qualifier": "", "member": "sort", "arguments": ["arrA", "arrB"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=arr, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<=)", "has_else": false}]}, {"name": "sort", "modifiers": ["private", "static"], "return_type": "List", "parameters": [{"name": "unsortedA", "type": "List"}, {"name": "unsortedB", "type": "List"}], "invocations": [{"qualifier": "unsortedA", "member": "isEmpty", "arguments": []}, {"qualifier": "unsortedB", "member": "isEmpty", "arguments": []}, {"qualifier": "unsortedA", "member": "isEmpty", "arguments": []}, {"qualifier": "unsortedB", "member": "isEmpty", "arguments": []}, {"qualifier": "unsortedA", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "unsortedB", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "add", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=get, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None)"]}, {"qualifier": "unsortedA", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "newAl", "member": "addAll", "arguments": ["MethodInvocation(arguments=[MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None)], member=subList, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None), MemberReference(member=unsortedB, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=sort, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "sort", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None)], member=subList, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None)", "unsortedB"]}, {"qualifier": "unsortedA", "member": "subList", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None)"]}, {"qualifier": "unsortedA", "member": "size", "arguments": []}, {"qualifier": "", "member": "add", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=get, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None)"]}, {"qualifier": "unsortedB", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "newAl", "member": "addAll", "arguments": ["MethodInvocation(arguments=[MemberReference(member=unsortedA, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None)], member=subList, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None)], member=sort, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "sort", "arguments": ["unsortedA", "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None)], member=subList, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None)"]}, {"qualifier": "unsortedB", "member": "subList", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None)"]}, {"qualifier": "unsortedB", "member": "size", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None), operator=&&)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=get, postfix_operators=[], prefix_operators=[], qualifier=unsortedA, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=get, postfix_operators=[], prefix_operators=[], qualifier=unsortedB, selectors=[], type_arguments=None), operator=<=)", "has_else": true}]}]}]}
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

result: Here are the JUnit test classes for each of the given Java methods:
```java
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MergeSortRecursiveTest {
    private List<Integer> arr;

    @BeforeEach
    void setUp() {
        arr = new ArrayList<>();
    }

    @Test
    public void testMergeSort() {
        // Arrange
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<Integer> expected = Arrays.asList(1, 2, 3);

        // Act
        List<Integer> actual = MergeSortRecursive.mergeSort(arr);

        // Assert
        assertEquals(expected, actual);
    }
}
```
```java
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ExternalMethodSourceDemoTest {
    private List<Integer> unsortedA;
    private List<Integer> unsortedB;
    private List<Integer> newAl;

    @BeforeEach
    void setUp() {
        unsortedA = new ArrayList<>();
        unsortedB = new ArrayList<>();
        newAl = new ArrayList<>();
    }

    @Test
    public void testSort() {
        // Arrange
        unsortedA.add(1);
        unsortedA.add(2);
        unsortedA.add(3);
        unsortedB.add(4);
        unsortedB.add(5);
        unsortedB.add(6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Act
        List<Integer> actual = ExternalMethodSourceDemo.sort(unsortedA, unsortedB);

        // Assert
        assertEquals(expected, actual);
    }
}
```
Note: These are just examples and may need to be modified based on the specific requirements of the project.
