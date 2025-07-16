query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": [], "classes": [{"class_name": "GaussLegendre", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=pi, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "pi", "arguments": ["i"]}], "conditionals": []}, {"name": "pi", "modifiers": ["static"], "return_type": "double", "parameters": [{"name": "l", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "pow", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)", "Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=0.5)"]}, {"qualifier": "", "member": "update", "arguments": ["a", "b", "t", "p"]}, {"qualifier": "Math", "member": "pow", "arguments": ["BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}], "conditionals": []}, {"name": "update", "modifiers": ["static"], "return_type": "double", "parameters": [{"name": "a", "type": "double"}, {"name": "b", "type": "double"}, {"name": "t", "type": "double"}, {"name": "p", "type": "double"}], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*)"]}, {"qualifier": "Math", "member": "pow", "arguments": ["BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=values, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0))]), operator=-)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}], "conditionals": []}]}]}
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
package com.thealgorithms.others;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class GaussLegendreTest {
    private static final double EPSILON = 1e-6;

    @BeforeEach
    void setUp() {
        // Set up preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @ParameterizedTest(name = "test{index}")
    @MethodSource("methodMetadata")
    void testMain(String[] args) {
        // Arrange
        MockedStatic<System> mockedSystem = mockStatic(System.class);
        mockedSystem.when(() -> System.out.println(anyString())).thenReturn(null);

        // Act
        GaussLegendre.main(args);

        // Assert
        verify(mockedSystem, times(1)).when(() -> System.out.println("MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=pi, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"));
        verify(mockedSystem, times(1)).when(() -> System.out.println("MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=pi, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"));
        verifyNoMoreInteractions(mockedSystem);
    }

    @Test
    void testPi() {
        // Arrange
        Mockito.when(() -> Math.pow(2, 0.5)).thenReturn(1.0);
        Mockito.when(() -> Math.sqrt(anyDouble())).thenReturn(1.0);
        Mockito.when(() -> Math.pow(anyDouble(), anyDouble())).thenReturn(1.0);

        // Act
        double result = GaussLegendre.pi(2);

        // Assert
        assertEquals(result, 1.0, EPSILON);
    }

    @Test
    void testUpdate() {
        // Arrange
        Mockito.when(() -> Math.pow(anyDouble(), anyDouble())).thenReturn(1.0);

        // Act
        double result = GaussLegendre.update(1, 2, 3, 4);

        // Assert
        assertEquals(result, 1.0, EPSILON);
    }

    private static Stream<Arguments> methodMetadata() {
        return Stream.of(
                arguments("apple", 1, Arrays.asList("a", "b")),
                arguments("lemon", 2, Arrays.asList("x", "y")));
    }
}
```
