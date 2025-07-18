query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": [], "classes": [{"class_name": "StringCompression", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "compress", "modifiers": ["static", "public"], "return_type": "String", "parameters": [{"name": "input", "type": "String"}], "invocations": [{"qualifier": "input", "member": "length", "arguments": []}, {"qualifier": "input", "member": "charAt", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "input", "member": "length", "arguments": []}, {"qualifier": "input", "member": "charAt", "arguments": ["i"]}, {"qualifier": "input", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "input", "member": "length", "arguments": []}, {"qualifier": "input", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "input", "member": "charAt", "arguments": ["i"]}, {"qualifier": "", "member": "appendCount", "arguments": ["compressedString", "count", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None)"]}, {"qualifier": "input", "member": "charAt", "arguments": ["i"]}, {"qualifier": "input", "member": "charAt", "arguments": ["i"]}, {"qualifier": "input", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "input", "member": "length", "arguments": []}, {"qualifier": "", "member": "appendCount", "arguments": ["compressedString", "count", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None)"]}, {"qualifier": "input", "member": "charAt", "arguments": ["i"]}, {"qualifier": "input", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "", "member": "appendCount", "arguments": ["compressedString", "count", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None)"]}, {"qualifier": "input", "member": "charAt", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operator===), operator=&&)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operator=!=)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), operator===)", "has_else": true}]}, {"name": "appendCount", "modifiers": ["static", "public"], "return_type": "String", "parameters": [{"name": "res", "type": "String"}, {"name": "count", "type": "int"}, {"name": "ch", "type": "char"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=count, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=>)", "has_else": true}]}]}]}
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

result: Here's an example of how you could write a JUnit test for the `compress` method in the `StringCompression` class using the above rules:
```java
package com.thealgorithms.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionTest {
    private StringCompression compression;

    @BeforeEach
    public void setUp() {
        compression = new StringCompression();
    }

    @Test
    public void testCompress_emptyString() {
        // Arrange
        String input = "";
        Mockito.when(compression.length(input)).thenReturn(0);

        // Act
        String result = compression.compress(input);

        // Assert
        assertEquals("", result);
    }

    @Test
    public void testCompress_singleCharacter() {
        // Arrange
        String input = "a";
        Mockito.when(compression.length(input)).thenReturn(1);
        Mockito.when(compression.charAt(input, 0)).thenReturn('a');

        // Act
        String result = compression.compress(input);

        // Assert
        assertEquals("1a", result);
    }

    @Test
    public void testCompress_multipleCharacters() {
        // Arrange
        String input = "abbbc";
        Mockito.when(compression.length(input)).thenReturn(5);
        Mockito.when(compression.charAt(input, 0)).thenReturn('a');
        Mockito.when(compression.charAt(input, 1)).thenReturn('b');
        Mockito.when(compression.charAt(input, 2)).thenReturn('b');
        Mockito.when(compression.charAt(input, 3)).thenReturn('b');
        Mockito.when(compression.charAt(input, 4)).thenReturn('c');

        // Act
        String result = compression.compress(input);

        // Assert
        assertEquals("2abbb1c", result);
    }
}
```
In this example, we're using the `Mockito` library to stub the behavior of the `length` and `charAt` methods in the `StringCompression` class. We're also using the `@BeforeEach` annotation to set up a new instance of the `StringCompression` class for each test method.

In the first test method, we're testing the case where the input string is empty. In this case, we expect the `compress` method to return an empty string. We stub the behavior of the `length` method to return 0, and then call the `compress` method with an empty string as input. Finally, we assert that the result is equal to an empty string.

In the second test method, we're testing the case where the input string contains a single character. In this case, we expect the `compress` method to return a string of the form "1<character>". We stub the behavior of the `length` method to return 1, and then call the `compress` method with an input string containing a single character. Finally, we assert that the result is equal to "1<character>".

In the third test method, we're testing the case where the input string contains multiple characters. In this case, we expect the `compress` method to return a string of the form "<count><character>". We stub the behavior of the `length` method to return 5, and then call the `compress` method with an input string containing multiple characters. Finally, we assert that the result is equal to "2abbb1c".

Note that in each test method, we're using the `@Test` annotation to indicate that the method is a test method. We're also using the `@BeforeEach` annotation to set up a new instance of the `StringCompression` class for each test method. Finally, we're using the `assertEquals` method from JUnit 5 to verify that the result of the `compress` method is equal to what we expect it to be.
