query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": [], "classes": [{"class_name": "CRC16", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Hello World!\")], member=crc16, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "crc16", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Hello World!\")"]}], "conditionals": []}, {"name": "crc16", "modifiers": ["public", "static"], "return_type": "String", "parameters": [{"name": "message", "type": "String"}], "invocations": [{"qualifier": "message", "member": "getBytes", "arguments": []}, {"qualifier": "Integer", "member": "toHexString", "arguments": ["crc"]}, {"qualifier": null, "member": "toUpperCase", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=c15, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=bit, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=^)", "has_else": false}]}]}]}
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
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class CRC16Test {
    private static final String MESSAGE = "Hello World!";

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup
    }

    @Test
    public void main_shouldPrintMessage() {
        // Arrange
        String[] args = new String[1];
        args[0] = MESSAGE;

        // Act
        CRC16.main(args);

        // Assert
        verify(System.out).println("MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Hello World!\")], member=crc16, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)");
        verify(System.out).println("MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Hello World!\")], member=crc16, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)");
    }

    @ParameterizedTest
    @MethodSource("crc16Provider")
    public void crc16_shouldReturnExpectedValue(String message, String expectedCRC) {
        // Arrange
        CRC16 crc16 = new CRC16();
        byte[] bytes = message.getBytes();

        // Act
        int crc = crc16.crc16(bytes);

        // Assert
        assertEquals(expectedCRC, Integer.toHexString(crc).toUpperCase());
    }

    private static Stream<Arguments> crc16Provider() {
        return Stream.of(
                arguments("Hello World!", "0x29B1"),
                arguments("Goodbye World!", "0x29B1")
        );
    }
}
```
