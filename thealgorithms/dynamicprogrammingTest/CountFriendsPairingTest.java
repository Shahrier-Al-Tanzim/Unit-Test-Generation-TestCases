query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "CountFriendsPairing", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "countFriendsPairing", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "n", "type": "int"}, {"name": "a", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-))]), operandr=MemberReference(member=dp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=!=)", "has_else": false}]}]}]}
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
package com.thealgorithms.dynamicprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CountFriendsPairing {
    private int n;
    private int a;
    private int[] dp;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void countFriendsPairing_shouldReturnTrueForValidInputs() {
        // Arrange
        n = 2;
        a = 1;
        dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;

        // Act
        boolean result = CountFriendsPairing.countFriendsPairing(n, a);

        // Assert
        assertTrue(result);
    }

    @Test
    public void countFriendsPairing_shouldReturnFalseForInvalidInputs() {
        // Arrange
        n = 2;
        a = 1;
        dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;

        // Act
        boolean result = CountFriendsPairing.countFriendsPairing(n, a);

        // Assert
        assertFalse(result);
    }
}
```
