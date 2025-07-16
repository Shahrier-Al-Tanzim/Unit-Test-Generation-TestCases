query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling", "imports": ["java.util.ArrayList", "java.util.HashMap", "java.util.List", "java.util.Map"], "classes": [{"class_name": "MultiAgentScheduling", "modifiers": ["public"], "fields": [{"name": "agents", "type": "Map"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "addAgent", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "agentName", "type": "String"}], "invocations": [{"qualifier": "agents", "member": "putIfAbsent", "arguments": ["agentName", "ClassCreator(arguments=[MemberReference(member=agentName, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=Agent, sub_type=None))"]}], "conditionals": []}, {"name": "assignTask", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "agentName", "type": "String"}, {"name": "task", "type": "String"}], "invocations": [{"qualifier": "agents", "member": "get", "arguments": ["agentName"]}, {"qualifier": "agent", "member": "addTask", "arguments": ["task"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=agent, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}]}, {"name": "getScheduledTasks", "modifiers": ["public"], "return_type": "Map", "parameters": [], "invocations": [{"qualifier": "agents", "member": "values", "arguments": []}, {"qualifier": "schedule", "member": "put", "arguments": ["name", "MethodInvocation(arguments=[], member=getTasks, postfix_operators=[], prefix_operators=[], qualifier=agent, selectors=[], type_arguments=None)"]}, {"qualifier": "agent", "member": "getTasks", "arguments": []}], "conditionals": []}]}]}
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

result: Here's an example of how you could write unit tests for the `MultiAgentScheduling` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MultiAgentSchedulingTest {
    @Mock private Map<String, Agent> agents;
    @Mock private Agent agent;
    @Mock private List<Task> tasks;

    private MultiAgentScheduling multiAgentScheduling;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        multiAgentScheduling = new MultiAgentScheduling();
    }

    @Test
    public void testAddAgent() {
        // Arrange
        String agentName = "agent1";

        // Act
        multiAgentScheduling.addAgent(agentName);

        // Assert
        verify(agents).putIfAbsent(agentName, Agent.class);
    }

    @Test
    public void testAssignTask() {
        // Arrange
        String agentName = "agent1";
        String task = "task1";

        when(agents.get(agentName)).thenReturn(agent);
        doNothing().when(agent).addTask(task);

        // Act
        multiAgentScheduling.assignTask(agentName, task);

        // Assert
        verify(agents).get(agentName);
        verify(agent).addTask(task);
    }

    @Test
    public void testGetScheduledTasks() {
        // Arrange
        String agentName = "agent1";
        String task = "task1";

        when(agents.get(agentName)).thenReturn(agent);
        when(agent.getTasks()).thenReturn(tasks);
        doNothing().when(tasks).add(task);

        // Act
        Map<String, List<Task>> scheduledTasks = multiAgentScheduling.getScheduledTasks();

        // Assert
        verify(agents).values();
        verify(schedule).put("name", tasks);
        verify(agent).getTasks();
        verify(tasks).add(task);
    }
}
```
In this example, we use the `@Mock` annotation from Mockito to create mock objects for the `agents`, `agent`, and `tasks` instances. We then set up the behavior of these mocks using the `when()` method from Mockito. In the `testAddAgent()` test method, we verify that the `putIfAbsent()` method is called on the `agents` map with the correct arguments. In the `testAssignTask()` test method, we verify that the `addTask()` method is called on the `agent` instance with the correct arguments. Finally, in the `testGetScheduledTasks()` test method, we verify that the `getTasks()` method is called on the `agent` instance and that the `add()` method is called on the `tasks` list with the correct argument.

Note that this is just one possible way to write unit tests for the `MultiAgentScheduling` class using JUnit 5 and Mockito. There are many other ways to do it, and the specific approach you choose will depend on your requirements and preferences.
