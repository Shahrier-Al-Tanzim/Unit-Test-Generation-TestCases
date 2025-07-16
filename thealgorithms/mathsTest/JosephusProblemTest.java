query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "JosephusProblem", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "findTheWinner", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}, {"name": "k", "type": "int"}], "invocations": [{"qualifier": "", "member": "winner", "arguments": ["n", "k"]}], "conditionals": []}, {"name": "winner", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}, {"name": "k", "type": "int"}], "invocations": [{"qualifier": "", "member": "winner", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)", "k"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": false}]}]}]}
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
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class JosephusProblemTest {
    private JosephusProblem josephusProblem;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup
    }

    @Test
    public void findTheWinner_n1k2_shouldReturn1() {
        // Arrange
        int n = 1;
        int k = 2;
        Mockito.when(josephusProblem.winner(n, k)).thenReturn(1);

        // Act
        int result = josephusProblem.findTheWinner(n, k);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void findTheWinner_n2k3_shouldReturn2() {
        // Arrange
        int n = 2;
        int k = 3;
        Mockito.when(josephusProblem.winner(n, k)).thenReturn(2);

        // Act
        int result = josephusProblem.findTheWinner(n, k);

        // Assert
        assertEquals(2, result);
    }
}
```
