query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": [], "classes": [{"class_name": "Rotation", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "", "member": "rotation", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"abcdef\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": null, "member": "equals", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"cdefab\")"]}, {"qualifier": null, "member": "toCharArray", "arguments": []}, {"qualifier": "", "member": "rotation", "arguments": ["values", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": null, "member": "equals", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"cdefab\")"]}], "conditionals": []}, {"name": "rotation", "modifiers": ["static", "public"], "return_type": "String", "parameters": [{"name": "s", "type": "String"}, {"name": "n", "type": "int"}], "invocations": [{"qualifier": "s", "member": "substring", "arguments": ["n"]}, {"qualifier": "s", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "n"]}], "conditionals": []}, {"name": "rotation", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "values", "type": "char"}, {"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "reverse", "arguments": ["values", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "", "member": "reverse", "arguments": ["values", "n", "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=values, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "", "member": "reverse", "arguments": ["values", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=values, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": []}, {"name": "reverse", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "values", "type": "char"}, {"name": "from", "type": "int"}, {"name": "to", "type": "int"}], "invocations": [], "conditionals": []}]}]}
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
import org.mockito.Mockito;

class RotationTest {
    private Rotation rotation;

    @BeforeEach
    void setUp() {
        rotation = new Rotation();
    }

    @Test
    public void testMain() {
        // Arrange
        String[] args = {"abcdef", "2"};
        Mockito.when(rotation.main(args)).thenReturn("cdefab");

        // Act
        rotation.main(args);

        // Assert
        verify(rotation).main(args);
    }

    @Test
    public void testRotation() {
        // Arrange
        String s = "abcdef";
        int n = 2;
        char[] values = {'a', 'b', 'c', 'd', 'e', 'f'};
        Mockito.when(rotation.rotation(s, n)).thenReturn("cdefab");

        // Act
        String result = rotation.rotation(s, n);

        // Assert
        assertEquals("cdefab", result);
    }

    @Test
    public void testReverse() {
        // Arrange
        char[] values = {'a', 'b', 'c', 'd', 'e', 'f'};
        int from = 0;
        int to = 1;
        Mockito.when(rotation.reverse(values, from, to)).thenReturn("ab");

        // Act
        String result = rotation.reverse(values, from, to);

        // Assert
        assertEquals("ab", result);
    }
}
```
Note that the generated tests are based on the given JSON array and may not cover all possible scenarios or edge cases.
