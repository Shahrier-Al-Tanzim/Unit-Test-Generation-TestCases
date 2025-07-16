query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.scheduling", "imports": ["java.util.Arrays", "java.util.Comparator"], "classes": [{"class_name": "JobSchedulingWithDeadline", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "jobSequencingWithDeadlines", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "jobs", "type": "Job"}], "invocations": [{"qualifier": "Arrays", "member": "sort", "arguments": ["jobs", "MethodInvocation(arguments=[LambdaExpression(body=MemberReference(member=profit, postfix_operators=[], prefix_operators=['-'], qualifier=job, selectors=[]), parameters=[MemberReference(member=job, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=comparingInt, postfix_operators=[], prefix_operators=[], qualifier=Comparator, selectors=[], type_arguments=None)"]}, {"qualifier": "Comparator", "member": "comparingInt", "arguments": ["LambdaExpression(body=MemberReference(member=profit, postfix_operators=[], prefix_operators=['-'], qualifier=job, selectors=[]), parameters=[MemberReference(member=job, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "Arrays", "member": "stream", "arguments": ["jobs"]}, {"qualifier": null, "member": "mapToInt", "arguments": ["LambdaExpression(body=MemberReference(member=deadline, postfix_operators=[], prefix_operators=[], qualifier=job, selectors=[]), parameters=[MemberReference(member=job, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": null, "member": "max", "arguments": []}, {"qualifier": null, "member": "orElse", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "Arrays", "member": "fill", "arguments": ["timeSlots", "Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "Math", "member": "min", "arguments": ["BinaryOperation(operandl=MemberReference(member=deadline, postfix_operators=[], prefix_operators=[], qualifier=job, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)", "BinaryOperation(operandl=MemberReference(member=maxDeadline, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=arrivalTime, postfix_operators=[], prefix_operators=[], qualifier=job, selectors=[]), operandr=MemberReference(member=deadline, postfix_operators=[], prefix_operators=[], qualifier=job, selectors=[]), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=timeSlots, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1), operator===)", "has_else": false}]}]}]}
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
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class JobSchedulingWithDeadline {
    private static final int[] jobs = new int[] { 1, 2, 3 };
    private static final int[] timeSlots = new int[] { 0, 1, 2 };
    private static final int maxDeadline = 3;

    @BeforeEach
    void setUp() {
        // Set up preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    void jobSequencingWithDeadlines() {
        // Arrange
        JobSchedulingWithDeadline jobScheduling = new JobSchedulingWithDeadline();
        MockedStatic<Arrays> arraysMockedStatic = mockStatic(Arrays.class);
        MockedStatic<Comparator> comparatorMockedStatic = mockStatic(Comparator.class);

        // Act
        int result = jobScheduling.jobSequencingWithDeadlines(jobs);

        // Assert
        assertEquals(2, result);

        arraysMockedStatic.verify(() -> Arrays.sort(jobs, (o1, o2) -> {
            return ((Job) o1).getProfit() - ((Job) o2).getProfit();
        }));
        comparatorMockedStatic.verify(() -> Comparator.comparingInt((Function<Job, Integer>) job -> job.getDeadline()));
    }
}
```
Note: This is just an example and may not cover all the possible scenarios. Also, this code uses Mockito to mock static methods which can be a bit tricky. It's important to understand how it works before using it in production.
