query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "ComplexNumber", "modifiers": [], "fields": [{"name": "real", "type": "Double"}, {"name": "imaginary", "type": "Double"}], "constructors": [{"parameters": [{"name": "real", "type": "double"}, {"name": "imaginary", "type": "double"}], "modifiers": []}, {"parameters": [{"name": "real", "type": "double"}], "modifiers": []}], "methods": []}, {"class_name": "QuadraticEquationSolver", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "solveEquation", "modifiers": ["public"], "return_type": "ComplexNumber", "parameters": [{"name": "a", "type": "double"}, {"name": "b", "type": "double"}, {"name": "c", "type": "double"}], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["discriminant"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["discriminant"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["discriminant"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=discriminant, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=discriminant, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=discriminant, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}]}]}
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
Here's an example of how to write a unit test for the `solveEquation` method in the `QuadraticEquationSolver` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class QuadraticEquationSolverTest {
    private QuadraticEquationSolver solver;

    @BeforeEach
    public void setUp() {
        // Set up the mock for the Math class
        Mockito.when(Math.sqrt(Mockito.anyDouble())).thenReturn(10.0);

        // Instantiate the focal class
        solver = new QuadraticEquationSolver();
    }

    @Test
    public void testSolveEquation() {
        // Arrange
        double a = 2.0;
        double b = -3.0;
        double c = 1.0;

        // Act
        ComplexNumber result = solver.solveEquation(a, b, c);

        // Assert
        assertEquals(new ComplexNumber(5.0, 2.0), result);
    }
}
```
In this example, we first set up the mock for the `Math` class using Mockito's `when` method. We then instantiate the focal class and use it to call the `solveEquation` method with some input values. Finally, we verify that the result is what we expect it to be using JUnit 5's `assertEquals` method.

Note that we are only testing one specific case here, but you could add more test cases by creating additional methods in the test class and calling them from the `@Test` annotation.
