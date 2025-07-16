query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling", "imports": ["com.thealgorithms.devutils.entities.ProcessDetails", "java.util.ArrayList", "java.util.List"], "classes": [{"class_name": "SJFScheduling", "modifiers": ["public"], "fields": [{"name": "processes", "type": "ArrayList"}, {"name": "schedule", "type": "ArrayList"}], "constructors": [{"parameters": [{"name": "processes", "type": "ArrayList"}], "modifiers": []}], "methods": [{"name": "sortProcessesByArrivalTime", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "processes", "type": "List"}], "invocations": [{"qualifier": "processes", "member": "size", "arguments": []}, {"qualifier": "processes", "member": "size", "arguments": []}, {"qualifier": "processes", "member": "get", "arguments": ["j"]}, {"qualifier": null, "member": "getArrivalTime", "arguments": []}, {"qualifier": "processes", "member": "get", "arguments": ["BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": null, "member": "getArrivalTime", "arguments": []}, {"qualifier": "processes", "member": "get", "arguments": ["j"]}, {"qualifier": "processes", "member": "set", "arguments": ["j", "MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)], member=get, postfix_operators=[], prefix_operators=[], qualifier=processes, selectors=[], type_arguments=None)"]}, {"qualifier": "processes", "member": "get", "arguments": ["BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "processes", "member": "set", "arguments": ["BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "temp"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=processes, selectors=[MethodInvocation(arguments=[], member=getArrivalTime, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)], member=get, postfix_operators=[], prefix_operators=[], qualifier=processes, selectors=[MethodInvocation(arguments=[], member=getArrivalTime, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operator=>)", "has_else": false}]}, {"name": "sortByArrivalTime", "modifiers": ["protected"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "sortProcessesByArrivalTime", "arguments": ["processes"]}], "conditionals": []}, {"name": "scheduleProcesses", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "processes", "member": "size", "arguments": []}, {"qualifier": "processes", "member": "get", "arguments": ["k"]}, {"qualifier": null, "member": "getArrivalTime", "arguments": []}, {"qualifier": "ready", "member": "add", "arguments": ["MethodInvocation(arguments=[MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=processes, selectors=[], type_arguments=None)"]}, {"qualifier": "processes", "member": "get", "arguments": ["k"]}, {"qualifier": "", "member": "findShortestJob", "arguments": ["ready"]}, {"qualifier": "running", "member": "getBurstTime", "arguments": []}, {"qualifier": "schedule", "member": "add", "arguments": ["MethodInvocation(arguments=[], member=getProcessId, postfix_operators=[], prefix_operators=[], qualifier=running, selectors=[], type_arguments=None)"]}, {"qualifier": "running", "member": "getProcessId", "arguments": []}, {"qualifier": "ready", "member": "remove", "arguments": ["running"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=running, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}]}, {"name": "findShortestJob", "modifiers": ["private"], "return_type": "ProcessDetails", "parameters": [{"name": "readyProcesses", "type": "List"}], "invocations": [{"qualifier": "readyProcesses", "member": "isEmpty", "arguments": []}, {"qualifier": "readyProcesses", "member": "size", "arguments": []}, {"qualifier": "readyProcesses", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": null, "member": "getBurstTime", "arguments": []}, {"qualifier": "readyProcesses", "member": "get", "arguments": ["i"]}, {"qualifier": null, "member": "getBurstTime", "arguments": []}, {"qualifier": "readyProcesses", "member": "get", "arguments": ["positionOfShortestJob"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=readyProcesses, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=minBurstTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=temp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": false}]}]}]}
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
package com.thealgorithms.scheduling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

class SJFSchedulingTest {
    private List<ProcessDetails> processes;
    private SJFScheduling sjfScheduling;

    @BeforeEach
    void setUp() {
        processes = new ArrayList<>();
        sjfScheduling = new SJFScheduling(processes);
    }

    @Test
    public void testSortProcessesByArrivalTime() {
        // Arrange
        ProcessDetails process1 = new ProcessDetails(1, 5);
        ProcessDetails process2 = new ProcessDetails(2, 3);
        processes.add(process1);
        processes.add(process2);

        // Act
        sjfScheduling.sortProcessesByArrivalTime(processes);

        // Assert
        assertEquals(process1, processes.get(0));
        assertEquals(process2, processes.get(1));
    }

    @Test
    public void testScheduleProcesses() {
        // Arrange
        ProcessDetails process1 = new ProcessDetails(1, 5);
        ProcessDetails process2 = new ProcessDetails(2, 3);
        processes.add(process1);
        processes.add(process2);

        // Act
        sjfScheduling.scheduleProcesses();

        // Assert
        assertEquals(process1, processes.get(0));
        assertEquals(process2, processes.get(1));
    }
}
```
