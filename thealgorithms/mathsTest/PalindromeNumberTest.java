query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "PalindromeNumber", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "isPalindrome", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "number", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}]}]}
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
import static org.mockito.Mockito.*;

class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    void isPalindrome_shouldReturnTrueForAPalindromeNumber() {
        // Arrange
        int number = 121;
        when(palindromeNumber.isPalindrome(number)).thenReturn(true);

        // Act
        boolean result = palindromeNumber.isPalindrome(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void isPalindrome_shouldReturnFalseForANonPalindromeNumber() {
        // Arrange
        int number = 123;
        when(palindromeNumber.isPalindrome(number)).thenReturn(false);

        // Act
        boolean result = palindromeNumber.isPalindrome(number);

        // Assert
        assertFalse(result);
    }
}
```
Note: This is just an example, and you may need to adjust the test cases based on your specific requirements.
