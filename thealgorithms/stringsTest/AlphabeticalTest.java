query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": [], "classes": [{"class_name": "Alphabetical", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "", "member": "isAlphabetical", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"123abc\")"]}, {"qualifier": "", "member": "isAlphabetical", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"aBC\")"]}, {"qualifier": "", "member": "isAlphabetical", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"abc\")"]}, {"qualifier": "", "member": "isAlphabetical", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"xyzabc\")"]}, {"qualifier": "", "member": "isAlphabetical", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"abcxyz\")"]}], "conditionals": []}, {"name": "isAlphabetical", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "s", "type": "String"}], "invocations": [{"qualifier": "s", "member": "toLowerCase", "arguments": []}, {"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "Character", "member": "isLetter", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)"]}, {"qualifier": "s", "member": "charAt", "arguments": ["i"]}, {"qualifier": "s", "member": "charAt", "arguments": ["i"]}, {"qualifier": "s", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)], member=isLetter, postfix_operators=[], prefix_operators=['!'], qualifier=Character, selectors=[], type_arguments=None), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=<=), operator=||)", "has_else": false}]}]}]}
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

result: Here are the generated JUnit 5 unit tests for each of the methods in the given JSON array:
```java
package com.thealgorithms.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AlphabeticalTest {
    private Alphabetical alphabetical;

    @BeforeEach
    void setUp() {
        alphabetical = new Alphabetical();
    }

    @Test
    void testIsAlphabetical_validInputs() {
        // Arrange
        String s1 = "123abc";
        String s2 = "aBC";
        String s3 = "abc";
        String s4 = "xyzabc";
        String s5 = "abcxyz";
        when(alphabetical.isAlphabetical(s1)).thenReturn(true);
        when(alphabetical.isAlphabetical(s2)).thenReturn(true);
        when(alphabetical.isAlphabetical(s3)).thenReturn(true);
        when(alphabetical.isAlphabetical(s4)).thenReturn(false);
        when(alphabetical.isAlphabetical(s5)).thenReturn(false);

        // Act
        boolean result1 = alphabetical.isAlphabetical(s1);
        boolean result2 = alphabetical.isAlphabetical(s2);
        boolean result3 = alphabetical.isAlphabetical(s3);
        boolean result4 = alphabetical.isAlphabetical(s4);
        boolean result5 = alphabetical.isAlphabetical(s5);

        // Assert
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertFalse(result4);
        assertFalse(result5);
    }
}
```
Note that this is just one possible way to write the tests, and there are many other ways to do it. The most important thing is to make sure that the tests accurately test the functionality of the method being tested.
