query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": [], "classes": [{"class_name": "ReverseStringRecursive", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "reverse", "modifiers": ["static", "public"], "return_type": "String", "parameters": [{"name": "str", "type": "String"}], "invocations": [{"qualifier": "str", "member": "isEmpty", "arguments": []}, {"qualifier": "", "member": "reverse", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=str, selectors=[], type_arguments=None)"]}, {"qualifier": "str", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "str", "member": "charAt", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=str, selectors=[], type_arguments=None)", "has_else": true}]}]}]}
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

result: Here's an example of how you could write a JUnit 5 unit test for the `reverse` method in the `ReverseStringRecursive` class using Mockito:
```java
package com.thealgorithms.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReverseStringRecursiveTest {
    private ReverseStringRecursive reverseStringRecursive;

    @BeforeEach
    void setUp() {
        reverseStringRecursive = new ReverseStringRecursive();
    }

    @Test
    void testReverse_emptyString() {
        // Arrange
        String input = "";
        Mockito.when(reverseStringRecursive.isEmpty(input)).thenReturn(true);

        // Act
        String result = reverseStringRecursive.reverse(input);

        // Assert
        assertEquals("", result);
    }

    @Test
    void testReverse_nonEmptyString() {
        // Arrange
        String input = "hello";
        Mockito.when(reverseStringRecursive.isEmpty(input)).thenReturn(false);
        Mockito.when(reverseStringRecursive.substring(input, 1)).thenReturn("olleh");
        Mockito.when(reverseStringRecursive.charAt(input, 0)).thenReturn('h');

        // Act
        String result = reverseStringRecursive.reverse(input);

        // Assert
        assertEquals("hello", result);
    }
}
```
In this example, we're using the `@BeforeEach` annotation to set up a new instance of the `ReverseStringRecursive` class for each test method. We're also using Mockito to stub the behavior of the `isEmpty`, `substring`, and `charAt` methods. In the first test method, we're testing the case where the input string is empty, and in the second test method, we're testing the case where the input string is non-empty.

In both cases, we're verifying that the `reverse` method returns the expected result by using the `assertEquals` method from JUnit 5.
