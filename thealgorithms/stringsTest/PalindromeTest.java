query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": [], "classes": [{"class_name": "Palindrome", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "isPalindrome", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "s", "type": "String"}], "invocations": [{"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "s", "member": "equals", "arguments": ["ClassCreator(arguments=[MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[MethodInvocation(arguments=[], member=reverse, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None), MethodInvocation(arguments=[], member=toString, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type=ReferenceType(arguments=None, dimensions=None, name=StringBuilder, sub_type=None))"]}, {"qualifier": null, "member": "reverse", "arguments": []}, {"qualifier": null, "member": "toString", "arguments": []}], "conditionals": []}, {"name": "isPalindromeRecursion", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "s", "type": "String"}], "invocations": [{"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "s", "member": "charAt", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "s", "member": "charAt", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "", "member": "isPalindromeRecursion", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)"]}, {"qualifier": "s", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "s", "member": "length", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<=), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=!=)", "has_else": false}]}, {"name": "isPalindromeTwoPointer", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "s", "type": "String"}], "invocations": [{"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "s", "member": "length", "arguments": []}, {"qualifier": "s", "member": "charAt", "arguments": ["i"]}, {"qualifier": "s", "member": "charAt", "arguments": ["j"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=<=), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=!=)", "has_else": false}]}]}]}
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

class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    void setUp() {
        this.palindrome = new Palindrome();
    }

    @Test
    public void isPalindrome_EmptyString_ReturnsFalse() {
        // Arrange
        String input = "";
        Mockito.when(this.palindrome.isPalindrome(input)).thenReturn(false);

        // Act
        boolean result = this.palindrome.isPalindrome(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void isPalindrome_SingleCharacterString_ReturnsTrue() {
        // Arrange
        String input = "a";
        Mockito.when(this.palindrome.isPalindrome(input)).thenReturn(true);

        // Act
        boolean result = this.palindrome.isPalindrome(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isPalindrome_PalindromeString_ReturnsTrue() {
        // Arrange
        String input = "racecar";
        Mockito.when(this.palindrome.isPalindrome(input)).thenReturn(true);

        // Act
        boolean result = this.palindrome.isPalindrome(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isPalindrome_NonPalindromeString_ReturnsFalse() {
        // Arrange
        String input = "abc";
        Mockito.when(this.palindrome.isPalindrome(input)).thenReturn(false);

        // Act
        boolean result = this.palindrome.isPalindrome(input);

        // Assert
        assertFalse(result);
    }
}
```
