query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": [], "classes": [{"class_name": "TwoPointers", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "isPairedSum", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "arr", "type": "int"}, {"name": "key", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=sum, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=key, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=sum, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=key, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": true}]}]}]}
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TwoPointersTest {
    private TwoPointers twoPointers;

    @BeforeEach
    void setUp() {
        twoPointers = new TwoPointers();
    }

    @Test
    public void isPairedSum_shouldReturnTrueForValidInput() {
        // Arrange
        int[] arr = {1, 2, 3, 4};
        int key = 6;
        Mockito.when(twoPointers.sum(arr)).thenReturn(key);

        // Act
        boolean result = twoPointers.isPairedSum(arr, key);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isPairedSum_shouldReturnFalseForInvalidInput() {
        // Arrange
        int[] arr = {1, 2, 3, 4};
        int key = 5;
        Mockito.when(twoPointers.sum(arr)).thenReturn(key);

        // Act
        boolean result = twoPointers.isPairedSum(arr, key);

        // Assert
        assertFalse(result);
    }
}
```
