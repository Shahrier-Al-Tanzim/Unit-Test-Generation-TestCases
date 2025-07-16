query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling.diskscheduling", "imports": ["java.util.ArrayList", "java.util.Collections", "java.util.List"], "classes": [{"class_name": "ScanScheduling", "modifiers": ["public"], "fields": [{"name": "headPosition", "type": "int"}, {"name": "diskSize", "type": "int"}, {"name": "movingUp", "type": "boolean"}], "constructors": [{"parameters": [{"name": "headPosition", "type": "int"}, {"name": "movingUp", "type": "boolean"}, {"name": "diskSize", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "execute", "modifiers": ["public"], "return_type": "List", "parameters": [{"name": "requests", "type": "List"}], "invocations": [{"qualifier": "requests", "member": "isEmpty", "arguments": []}, {"qualifier": "left", "member": "add", "arguments": ["request"]}, {"qualifier": "right", "member": "add", "arguments": ["request"]}, {"qualifier": "Collections", "member": "sort", "arguments": ["left"]}, {"qualifier": "Collections", "member": "sort", "arguments": ["right"]}, {"qualifier": "result", "member": "addAll", "arguments": ["right"]}, {"qualifier": "result", "member": "add", "arguments": ["BinaryOperation(operandl=MemberReference(member=diskSize, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "Collections", "member": "reverse", "arguments": ["left"]}, {"qualifier": "result", "member": "addAll", "arguments": ["left"]}, {"qualifier": "Collections", "member": "reverse", "arguments": ["left"]}, {"qualifier": "result", "member": "addAll", "arguments": ["left"]}, {"qualifier": "result", "member": "add", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "result", "member": "addAll", "arguments": ["right"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=requests, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=headPosition, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": true}, {"condition": "MemberReference(member=movingUp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": true}]}, {"name": "getHeadPosition", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isMovingUp", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}]}]}
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
Here's an example of how you can write unit tests for the `ScanScheduling` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.scheduling.diskscheduling;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScanSchedulingTest {
    private ScanScheduling scanScheduling;

    @BeforeEach
    void setUp() {
        this.scanScheduling = new ScanScheduling(10, true, 2);
    }

    @Test
    void execute_whenRequestsIsEmpty_shouldReturnEmptyList() {
        List<Integer> requests = new ArrayList<>();
        Mockito.when(requests.isEmpty()).thenReturn(true);

        List<Integer> result = scanScheduling.execute(requests);

        assertEquals(Collections.emptyList(), result);
    }

    @Test
    void execute_whenRequestsIsNotEmpty_shouldSortAndReverse() {
        List<Integer> requests = new ArrayList<>();
        requests.add(10);
        requests.add(5);
        requests.add(2);

        Mockito.when(requests.isEmpty()).thenReturn(false);
        Mockito.doNothing().when(requests).add(Mockito.anyInt());
        Mockito.when(Collections.sort(requests)).thenReturn(null);
        Mockito.when(Collections.reverse(requests)).thenReturn(null);

        List<Integer> result = scanScheduling.execute(requests);

        assertEquals(Arrays.asList(10, 5, 2), result);
    }
}
```
In this example, we first create a `ScanScheduling` object with the necessary parameters using the `@BeforeEach` method. Then, we write two test methods: one for testing the case where the `requests` list is empty, and another for testing the case where it's not empty.

For the first test method, we use Mockito to stub the behavior of the `isEmpty()` method of the `requests` list so that it returns `true`. We then call the `execute()` method with an empty list as input, and assert that the result is an empty list using `assertEquals()`.

For the second test method, we first add three elements to the `requests` list: 10, 5, and 2. We then use Mockito to stub the behavior of the `add()` and `sort()` methods of the `requests` list so that they do nothing and return null respectively. We also use Mockito to stub the behavior of the `reverse()` method so that it returns an empty list.

Finally, we call the `execute()` method with the non-empty `requests` list as input, and assert that the result is a sorted and reversed list containing the three elements: 10, 5, and 2.
