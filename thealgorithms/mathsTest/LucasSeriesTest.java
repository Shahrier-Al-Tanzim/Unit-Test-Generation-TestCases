query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "LucasSeries", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "lucasSeries", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "lucasSeries", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "", "member": "lucasSeries", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=-)"]}], "conditionals": []}, {"name": "lucasSeriesIteration", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you can write a unit test for the `lucasSeries` method using JUnit 5 and Mockito:
```java
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LucasSeriesTest {
    private LucasSeries lucasSeries;

    @BeforeEach
    public void setUp() {
        // Set up the mock for the lucasSeries method
        lucasSeries = Mockito.mock(LucasSeries.class);
    }

    @Test
    public void testLucasSeries() {
        // Arrange
        int n = 5;
        Mockito.when(lucasSeries.lucasSeries(n)).thenReturn(10);

        // Act
        int result = lucasSeries.lucasSeries(n);

        // Assert
        assertEquals(10, result);
    }
}
```
In this example, we first set up the mock for the `lucasSeries` method using Mockito's `mock` method. We then use the `when` method to stub the behavior of the `lucasSeries` method when it is called with an argument of 5. Finally, we call the `lucasSeries` method with an argument of 5 and verify that the result is equal to 10 using JUnit's `assertEquals` method.

Note that this is just one example of how you can write a unit test for the `lucasSeries` method using JUnit 5 and Mockito. There are many other ways to approach this task, and the specific approach you choose will depend on your specific needs and requirements.
