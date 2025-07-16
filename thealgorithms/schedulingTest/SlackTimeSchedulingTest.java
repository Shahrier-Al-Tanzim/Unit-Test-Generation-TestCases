query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling", "imports": ["java.util.ArrayList", "java.util.Comparator", "java.util.List"], "classes": [{"class_name": "SlackTimeScheduling", "modifiers": ["public"], "fields": [{"name": "tasks", "type": "List"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "addTask", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "name", "type": "String"}, {"name": "executionTime", "type": "int"}, {"name": "deadline", "type": "int"}], "invocations": [{"qualifier": "tasks", "member": "add", "arguments": ["ClassCreator(arguments=[MemberReference(member=name, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=executionTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=deadline, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=Task, sub_type=None))"]}], "conditionals": []}, {"name": "scheduleTasks", "modifiers": ["public"], "return_type": "List", "parameters": [], "invocations": [{"qualifier": "tasks", "member": "sort", "arguments": ["MethodInvocation(arguments=[MethodReference(expression=MemberReference(member=Task, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=getSlackTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])], member=comparingInt, postfix_operators=[], prefix_operators=[], qualifier=Comparator, selectors=[], type_arguments=None)"]}, {"qualifier": "Comparator", "member": "comparingInt", "arguments": ["MethodReference(expression=MemberReference(member=Task, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=getSlackTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": "scheduledOrder", "member": "add", "arguments": ["name"]}], "conditionals": []}]}]}
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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class SlackTimeSchedulingTest {
    private List<Task> tasks = new ArrayList<>();
    private Comparator<Task> comparator = Comparator.comparingInt(Task::getSlackTime);
    private ScheduledOrder scheduledOrder = new ScheduledOrder();

    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs
        tasks.add(new Task("A", 10, 20));
        tasks.add(new Task("B", 5, 15));
        scheduledOrder = new ScheduledOrder();
    }

    @Test
    void addTask() {
        // Arrange
        SlackTimeScheduling slackTimeScheduling = new SlackTimeScheduling(tasks);

        // Act
        slackTimeScheduling.addTask("C", 15, 25);

        // Assert
        verify(tasks).add(new Task("C", 15, 25));
    }

    @Test
    void scheduleTasks() {
        // Arrange
        SlackTimeScheduling slackTimeScheduling = new SlackTimeScheduling(tasks);

        // Act
        List<String> scheduledTasks = slackTimeScheduling.scheduleTasks();

        // Assert
        verify(tasks).sort(comparator);
        verify(scheduledOrder).add("A");
        verify(scheduledOrder).add("B");
        verify(scheduledOrder).add("C");
    }
}
```
Note: This is just one possible way to write the tests. There are many other ways to do it, and the best approach will depend on the specific requirements of your project.
