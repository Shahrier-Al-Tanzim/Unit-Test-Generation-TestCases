query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling.diskscheduling", "imports": ["java.util.ArrayList", "java.util.Collections", "java.util.List"], "classes": [{"class_name": "CircularLookScheduling", "modifiers": ["public"], "fields": [{"name": "currentPosition", "type": "int"}, {"name": "movingUp", "type": "boolean"}, {"name": "maxCylinder", "type": "int"}], "constructors": [{"parameters": [{"name": "startPosition", "type": "int"}, {"name": "movingUp", "type": "boolean"}, {"name": "maxCylinder", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "execute", "modifiers": ["public"], "return_type": "List", "parameters": [{"name": "requests", "type": "List"}], "invocations": [{"qualifier": "upRequests", "member": "add", "arguments": ["request"]}, {"qualifier": "downRequests", "member": "add", "arguments": ["request"]}, {"qualifier": "Collections", "member": "sort", "arguments": ["upRequests"]}, {"qualifier": "Collections", "member": "sort", "arguments": ["downRequests"]}, {"qualifier": "result", "member": "addAll", "arguments": ["upRequests"]}, {"qualifier": "result", "member": "addAll", "arguments": ["downRequests"]}, {"qualifier": "Collections", "member": "reverse", "arguments": ["downRequests"]}, {"qualifier": "result", "member": "addAll", "arguments": ["downRequests"]}, {"qualifier": "Collections", "member": "reverse", "arguments": ["upRequests"]}, {"qualifier": "result", "member": "addAll", "arguments": ["upRequests"]}, {"qualifier": "result", "member": "isEmpty", "arguments": []}, {"qualifier": "result", "member": "get", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=result, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "result", "member": "size", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=maxCylinder, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=currentPosition, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=currentPosition, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}, {"condition": "MemberReference(member=movingUp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": true}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=result, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "getCurrentPosition", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isMovingUp", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}]}]}
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
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.thealgorithms.scheduling.diskscheduling.CircularLookScheduling;

class CircularLookSchedulingTest {
    @Mock
    private List<Integer> requests;

    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs here
    }

    @Test
    public void testExecute() {
        // Arrange
        CircularLookScheduling circularLookScheduling = new CircularLookScheduling(0, true, 1);
        List<Integer> upRequests = new ArrayList<>();
        List<Integer> downRequests = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        // Act
        circularLookScheduling.execute(requests);

        // Assert
        verify(upRequests, times(1)).add("request");
        verify(downRequests, times(1)).add("request");
        verify(Collections, times(2)).sort(upRequests);
        verify(Collections, times(2)).sort(downRequests);
        verify(result, times(1)).addAll(upRequests);
        verify(result, times(1)).addAll(downRequests);
        verify(Collections, times(1)).reverse(downRequests);
        verify(result, times(1)).addAll(downRequests);
        verify(Collections, times(1)).reverse(upRequests);
        verify(result, times(1)).addAll(upRequests);
        assertFalse(result.isEmpty());
        assertEquals(result.get(0), "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=result, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)");
        assertEquals(result.size(), 1);
    }
}
```
