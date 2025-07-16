query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "WildcardMatching", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "isMatch", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "text", "type": "String"}, {"name": "pattern", "type": "String"}], "invocations": [{"qualifier": "text", "member": "length", "arguments": []}, {"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "pattern", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "text", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "pattern", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=pattern, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='*'), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=patternChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=textChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===), operandr=BinaryOperation(operandl=MemberReference(member=patternChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='?'), operator===), operator=||)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=patternChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='*'), operator===)", "has_else": true}]}]}]}
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
import org.mockito.Mockito;

class WildcardMatchingTest {
    private WildcardMatching wildcardMatching;

    @BeforeEach
    void setUp() {
        wildcardMatching = new WildcardMatching();
    }

    @Test
    public void testIsMatch_emptyTextAndPattern() {
        // Arrange
        String text = "";
        String pattern = "";
        Mockito.when(wildcardMatching.isMatch(text, pattern)).thenReturn(true);

        // Act
        boolean result = wildcardMatching.isMatch(text, pattern);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsMatch_emptyTextAndNonEmptyPattern() {
        // Arrange
        String text = "";
        String pattern = "abc";
        Mockito.when(wildcardMatching.isMatch(text, pattern)).thenReturn(false);

        // Act
        boolean result = wildcardMatching.isMatch(text, pattern);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsMatch_nonEmptyTextAndEmptyPattern() {
        // Arrange
        String text = "abc";
        String pattern = "";
        Mockito.when(wildcardMatching.isMatch(text, pattern)).thenReturn(false);

        // Act
        boolean result = wildcardMatching.isMatch(text, pattern);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsMatch_nonEmptyTextAndNonEmptyPattern() {
        // Arrange
        String text = "abc";
        String pattern = "a*c";
        Mockito.when(wildcardMatching.isMatch(text, pattern)).thenReturn(true);

        // Act
        boolean result = wildcardMatching.isMatch(text, pattern);

        // Assert
        assertTrue(result);
    }
}
```
