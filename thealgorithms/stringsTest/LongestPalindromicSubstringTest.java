query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": [], "classes": [{"class_name": "LongestPalindromicSubstring", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "longestPalindrome", "modifiers": ["static", "public"], "return_type": "String", "parameters": [{"name": "s", "type": "String"}], "invocations": [{"qualifier": "s", "member": "isEmpty", "arguments": []}, {"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "", "member": "isValid", "arguments": ["s", "i", "j"]}, {"qualifier": "maxStr", "member": "length", "arguments": []}, {"qualifier": "s", "member": "substring", "arguments": ["i", "BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isValid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operandr=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operandr=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=maxStr, selectors=[], type_arguments=None), operator=>), operator=&&)", "has_else": false}]}, {"name": "isValid", "modifiers": ["private", "static"], "return_type": "boolean", "parameters": [{"name": "s", "type": "String"}, {"name": "lo", "type": "int"}, {"name": "hi", "type": "int"}], "invocations": [{"qualifier": "s", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=lo, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "s", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=hi, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=lo, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=hi, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=!=)", "has_else": false}]}]}]}
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
package com.thealgorithms.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeEach
    void setUp() {
        this.longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    void testLongestPalindrome_emptyString() {
        // Arrange
        String s = "";

        // Act
        String result = longestPalindromicSubstring.longestPalindrome(s);

        // Assert
        assertEquals("", result);
    }

    @Test
    void testLongestPalindrome_singleCharacter() {
        // Arrange
        String s = "a";

        // Act
        String result = longestPalindromicSubstring.longestPalindrome(s);

        // Assert
        assertEquals("a", result);
    }

    @Test
    void testLongestPalindrome_multipleCharacter() {
        // Arrange
        String s = "abcdcba";

        // Act
        String result = longestPalindromicSubstring.longestPalindrome(s);

        // Assert
        assertEquals("abc", result);
    }
}
```
