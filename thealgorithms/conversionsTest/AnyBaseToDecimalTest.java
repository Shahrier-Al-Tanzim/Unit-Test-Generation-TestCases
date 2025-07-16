query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.conversions", "imports": [], "classes": [{"class_name": "AnyBaseToDecimal", "modifiers": ["public", "final"], "fields": [{"name": "CHAR_OFFSET_FOR_DIGIT", "type": "int"}, {"name": "CHAR_OFFSET_FOR_UPPERCASE", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "convertToDecimal", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "input", "type": "String"}, {"name": "radix", "type": "int"}], "invocations": [{"qualifier": "input", "member": "length", "arguments": []}, {"qualifier": "", "member": "valOfChar", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None)"]}, {"qualifier": "input", "member": "charAt", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=digit, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=radix, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=)", "has_else": false}]}, {"name": "valOfChar", "modifiers": ["static", "private"], "return_type": "int", "parameters": [{"name": "character", "type": "char"}], "invocations": [{"qualifier": "Character", "member": "isDigit", "arguments": ["character"]}, {"qualifier": "Character", "member": "isUpperCase", "arguments": ["character"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=character, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isDigit, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "MethodInvocation(arguments=[MemberReference(member=character, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isUpperCase, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None)", "has_else": true}]}]}]}
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
package com.thealgorithms.conversions;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class AnyBaseToDecimalTest {
    private static final int CHAR_OFFSET_FOR_DIGIT = 48;
    private static final int CHAR_OFFSET_FOR_UPPERCASE = 65;

    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs.
    }

    @AfterEach
    void tearDown() {
        // Cleanup.
    }

    @Test
    public void testConvertToDecimal_WhenInputIsNullAndRadixIs10_ReturnsZero() {
        // Arrange: Set up inputs, mocks, or stubs.
        String input = null;
        int radix = 10;

        // Act: Call the method under test.
        int result = AnyBaseToDecimal.convertToDecimal(input, radix);

        // Assert: Verify the results.
        assertEquals(0, result);
    }

    @Test
    public void testConvertToDecimal_WhenInputIsEmptyAndRadixIs10_ReturnsZero() {
        // Arrange: Set up inputs, mocks, or stubs.
        String input = "";
        int radix = 10;

        // Act: Call the method under test.
        int result = AnyBaseToDecimal.convertToDecimal(input, radix);

        // Assert: Verify the results.
        assertEquals(0, result);
    }

    @Test
    public void testConvertToDecimal_WhenInputIsSingleDigitAndRadixIs10_ReturnsCorrectValue() {
        // Arrange: Set up inputs, mocks, or stubs.
        String input = "5";
        int radix = 10;

        // Act: Call the method under test.
        int result = AnyBaseToDecimal.convertToDecimal(input, radix);

        // Assert: Verify the results.
        assertEquals(5, result);
    }

    @Test
    public void testConvertToDecimal_WhenInputIsSingleDigitAndRadixIs16_ReturnsCorrectValue() {
        // Arrange: Set up inputs, mocks, or stubs.
        String input = "F";
        int radix = 16;

        // Act: Call the method under test.
        int result = AnyBaseToDecimal.convertToDecimal(input, radix);

        // Assert: Verify the results.
        assertEquals(15, result);
    }

    @Test
    public void testConvertToDecimal_WhenInputIsSingleDigitAndRadixIs36_ReturnsCorrectValue() {
        // Arrange: Set up inputs, mocks, or stubs.
        String input = "Z";
        int radix = 36;

        // Act: Call the method under test.
        int result = AnyBaseToDecimal.convertToDecimal(input, radix);

        // Assert: Verify the results.
        assertEquals(35, result);
    }
}
```
