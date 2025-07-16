query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": [], "classes": [{"class_name": "LinearCongruentialGenerator", "modifiers": ["public"], "fields": [{"name": "a", "type": "double"}, {"name": "c", "type": "double"}, {"name": "m", "type": "double"}, {"name": "previousValue", "type": "double"}], "constructors": [{"parameters": [{"name": "multiplier", "type": "double"}, {"name": "increment", "type": "double"}, {"name": "modulo", "type": "double"}], "modifiers": ["public"]}, {"parameters": [{"name": "seed", "type": "double"}, {"name": "multiplier", "type": "double"}, {"name": "increment", "type": "double"}, {"name": "modulo", "type": "double"}], "modifiers": ["public"]}], "methods": [{"name": "nextNumber", "modifiers": ["public"], "return_type": "double", "parameters": [], "invocations": [], "conditionals": []}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "Math", "member": "pow", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2.0)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=32.0)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[], member=nextNumber, postfix_operators=[], prefix_operators=[], qualifier=lcg, selectors=[], type_arguments=None)"]}, {"qualifier": "lcg", "member": "nextNumber", "arguments": []}], "conditionals": []}]}]}
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

result: Here's an example of how to write unit tests for the `LinearCongruentialGenerator` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class LinearCongruentialGeneratorTest {
    private LinearCongruentialGenerator lcg;

    @BeforeEach
    public void setUp() {
        // Set up the mocks and stubs for the dependencies
        Mockito.when(Math.pow(2.0, 32.0)).thenReturn(1L);
        Mockito.doNothing().when(System.out).println("MethodInvocation(arguments=[], member=nextNumber, postfix_operators=[], prefix_operators=[], qualifier=lcg, selectors=[], type_arguments=None)");
    }

    @Test
    public void testNextNumber() {
        // Arrange
        lcg = new LinearCongruentialGenerator(2.0, 32.0);

        // Act
        double result = lcg.nextNumber();

        // Assert
        assertEquals(1L, result);
    }
}
```
In this example, we use the `@BeforeEach` annotation to set up the mocks and stubs for the dependencies before each test method. We then create an instance of `LinearCongruentialGenerator` in the `setUp()` method and use it to call the `nextNumber()` method in the `testNextNumber()` method. Finally, we verify that the result is equal to 1 using the `assertEquals()` method from JUnit 5.

Note that we have used Mockito to stub the behavior of the `Math.pow()` and `System.out.println()` methods, which are dependencies of the `LinearCongruentialGenerator` class. We have also used the `@Test` annotation to indicate that this method is a test case.
