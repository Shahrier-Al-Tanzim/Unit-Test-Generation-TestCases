query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling.diskscheduling", "imports": ["java.util.ArrayList", "java.util.Collections", "java.util.List"], "classes": [{"class_name": "LookScheduling", "modifiers": ["public"], "fields": [{"name": "maxTrack", "type": "int"}, {"name": "currentPosition", "type": "int"}, {"name": "movingUp", "type": "boolean"}, {"name": "farthestPosition", "type": "int"}], "constructors": [{"parameters": [{"name": "startPosition", "type": "int"}, {"name": "initialDirection", "type": "boolean"}, {"name": "maxTrack", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "execute", "modifiers": ["public"], "return_type": "List", "parameters": [{"name": "requests", "type": "List"}], "invocations": [{"qualifier": "lower", "member": "add", "arguments": ["request"]}, {"qualifier": "upper", "member": "add", "arguments": ["request"]}, {"qualifier": "Collections", "member": "sort", "arguments": ["lower"]}, {"qualifier": "Collections", "member": "sort", "arguments": ["upper"]}, {"qualifier": "result", "member": "addAll", "arguments": ["upper"]}, {"qualifier": "upper", "member": "isEmpty", "arguments": []}, {"qualifier": "upper", "member": "get", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=upper, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "upper", "member": "size", "arguments": []}, {"qualifier": "Collections", "member": "reverse", "arguments": ["lower"]}, {"qualifier": "result", "member": "addAll", "arguments": ["lower"]}, {"qualifier": "lower", "member": "isEmpty", "arguments": []}, {"qualifier": "Math", "member": "max", "arguments": ["farthestPosition", "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=get, postfix_operators=[], prefix_operators=[], qualifier=lower, selectors=[], type_arguments=None)"]}, {"qualifier": "lower", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "Collections", "member": "reverse", "arguments": ["lower"]}, {"qualifier": "result", "member": "addAll", "arguments": ["lower"]}, {"qualifier": "lower", "member": "isEmpty", "arguments": []}, {"qualifier": "lower", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "result", "member": "addAll", "arguments": ["upper"]}, {"qualifier": "upper", "member": "isEmpty", "arguments": []}, {"qualifier": "Math", "member": "max", "arguments": ["farthestPosition", "MethodInvocation(arguments=[BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=upper, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=get, postfix_operators=[], prefix_operators=[], qualifier=upper, selectors=[], type_arguments=None)"]}, {"qualifier": "upper", "member": "get", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=upper, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "upper", "member": "size", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=maxTrack, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=request, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=currentPosition, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": true}, {"condition": "MemberReference(member=movingUp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": true}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=upper, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=lower, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=lower, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=upper, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "getCurrentPosition", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isMovingUp", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "getFarthestPosition", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}]}]}
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

import com.thealgorithms.scheduling.diskscheduling.LookScheduling;

class LookSchedulingTest {
    @Mock
    private List<Integer> requests;

    @BeforeEach
    void setUp() {
        // Arrange
        requests = mock(List.class);
    }

    @Test
    void execute_shouldReturnSortedResult() {
        // Arrange
        int startPosition = 0;
        boolean initialDirection = true;
        int maxTrack = 10;
        LookScheduling lookScheduling = new LookScheduling(startPosition, initialDirection, maxTrack);

        // Act
        List<Integer> result = lookScheduling.execute(requests);

        // Assert
        assertEquals(result, Collections.emptyList());
    }
}
```
