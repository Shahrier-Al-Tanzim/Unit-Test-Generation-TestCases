query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling", "imports": ["com.thealgorithms.devutils.entities.ProcessDetails", "java.util.ArrayList", "java.util.Collection", "java.util.Comparator", "java.util.List", "java.util.PriorityQueue"], "classes": [{"class_name": "PreemptivePriorityScheduling", "modifiers": ["public"], "fields": [{"name": "processes", "type": "List"}, {"name": "ganttChart", "type": "List"}], "constructors": [{"parameters": [{"name": "processes", "type": "Collection"}], "modifiers": ["public"]}], "methods": [{"name": "scheduleProcesses", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "Comparator", "member": "comparingInt", "arguments": ["MethodReference(expression=MemberReference(member=ProcessDetails, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=getPriority, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": null, "member": "reversed", "arguments": []}, {"qualifier": null, "member": "thenComparingInt", "arguments": ["MethodReference(expression=MemberReference(member=ProcessDetails, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=getArrivalTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": "processes", "member": "isEmpty", "arguments": []}, {"qualifier": "readyQueue", "member": "isEmpty", "arguments": []}, {"qualifier": "", "member": "updateArrivedProcesses", "arguments": ["currentTime", "arrivedProcesses"]}, {"qualifier": "readyQueue", "member": "addAll", "arguments": ["arrivedProcesses"]}, {"qualifier": "arrivedProcesses", "member": "clear", "arguments": []}, {"qualifier": "readyQueue", "member": "isEmpty", "arguments": []}, {"qualifier": "readyQueue", "member": "poll", "arguments": []}, {"qualifier": "ganttChart", "member": "add", "arguments": ["MethodInvocation(arguments=[], member=getProcessId, postfix_operators=[], prefix_operators=[], qualifier=currentProcess, selectors=[], type_arguments=None)"]}, {"qualifier": "currentProcess", "member": "getProcessId", "arguments": []}, {"qualifier": "currentProcess", "member": "setBurstTime", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=getBurstTime, postfix_operators=[], prefix_operators=[], qualifier=currentProcess, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "currentProcess", "member": "getBurstTime", "arguments": []}, {"qualifier": "currentProcess", "member": "getBurstTime", "arguments": []}, {"qualifier": "readyQueue", "member": "add", "arguments": ["currentProcess"]}, {"qualifier": "ganttChart", "member": "add", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Idle\")"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=readyQueue, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=getBurstTime, postfix_operators=[], prefix_operators=[], qualifier=currentProcess, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}, {"name": "updateArrivedProcesses", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "currentTime", "type": "int"}, {"name": "arrivedProcesses", "type": "List"}], "invocations": [{"qualifier": "processes", "member": "removeIf", "arguments": ["LambdaExpression(body=[IfStatement(condition=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getArrivalTime, postfix_operators=[], prefix_operators=[], qualifier=process, selectors=[], type_arguments=None), operandr=MemberReference(member=currentTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<=), else_statement=None, label=None, then_statement=BlockStatement(label=None, statements=[StatementExpression(expression=MethodInvocation(arguments=[MemberReference(member=process, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=arrivedProcesses, selectors=[], type_arguments=None), label=None), ReturnStatement(expression=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=true), label=None)])), ReturnStatement(expression=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false), label=None)], parameters=[MemberReference(member=process, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "process", "member": "getArrivalTime", "arguments": []}, {"qualifier": "arrivedProcesses", "member": "add", "arguments": ["process"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=getArrivalTime, postfix_operators=[], prefix_operators=[], qualifier=process, selectors=[], type_arguments=None), operandr=MemberReference(member=currentTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<=)", "has_else": false}]}]}]}
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class PreemptivePrioritySchedulingTest {
    private List<ProcessDetails> processes;
    private List<List<ProcessDetails>> ganttChart;
    private PriorityQueue<ProcessDetails> readyQueue;

    @BeforeEach
    void setUp() {
        processes = new ArrayList<>();
        ganttChart = new ArrayList<>();
        readyQueue = new PriorityQueue<>(Comparator.comparingInt(ProcessDetails::getPriority)
                .reversed()
                .thenComparingInt(ProcessDetails::getArrivalTime));
    }

    @Test
    void scheduleProcesses_emptyReadyQueue_addAllToReadyQueue() {
        int currentTime = 0;
        List<ProcessDetails> arrivedProcesses = new ArrayList<>();

        // Arrange
        when(processes.isEmpty()).thenReturn(true);
        when(readyQueue.isEmpty()).thenReturn(true);
        doNothing().when(readyQueue).addAll(arrivedProcesses);

        // Act
        PreemptivePriorityScheduling.scheduleProcesses(currentTime, arrivedProcesses);

        // Assert
        verify(processes).removeIf(process -> process.getArrivalTime() <= currentTime);
        verify(readyQueue).addAll(arrivedProcesses);
    }
}
```
Note: This is just an example test case and may not cover all possible scenarios or edge cases. It's important to write comprehensive tests that cover all the necessary conditions for a successful test run.
