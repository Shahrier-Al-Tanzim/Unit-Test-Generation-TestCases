query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "PythagoreanTriple", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "", "member": "isPythagTriple", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)"]}, {"qualifier": "", "member": "isPythagTriple", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=12)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=13)"]}, {"qualifier": "", "member": "isPythagTriple", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=6)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=8)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}, {"qualifier": "", "member": "isPythagTriple", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=20)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=30)"]}, {"qualifier": "", "member": "isPythagTriple", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=6)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=8)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=100)"]}, {"qualifier": "", "member": "isPythagTriple", "arguments": ["Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}], "conditionals": []}, {"name": "isPythagTriple", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}, {"name": "c", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operandr=BinaryOperation(operandl=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operator=||), operandr=BinaryOperation(operandl=MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operator=||)", "has_else": true}]}]}]}
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
import org.mockito.Mockito;

class PythagoreanTripleTest {
    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void testIsPythagoreanTriple_1() {
        // Arrange
        int a = 3;
        int b = 4;
        int c = 5;
        PythagoreanTriple triple = new PythagoreanTriple();
        Mockito.when(triple.isPythagoreanTriple(a, b, c)).thenReturn(true);

        // Act
        boolean result = triple.isPythagoreanTriple(a, b, c);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPythagoreanTriple_2() {
        // Arrange
        int a = 5;
        int b = 12;
        int c = 13;
        PythagoreanTriple triple = new PythagoreanTriple();
        Mockito.when(triple.isPythagoreanTriple(a, b, c)).thenReturn(true);

        // Act
        boolean result = triple.isPythagoreanTriple(a, b, c);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPythagoreanTriple_3() {
        // Arrange
        int a = 6;
        int b = 8;
        int c = 10;
        PythagoreanTriple triple = new PythagoreanTriple();
        Mockito.when(triple.isPythagoreanTriple(a, b, c)).thenReturn(true);

        // Act
        boolean result = triple.isPythagoreanTriple(a, b, c);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPythagoreanTriple_4() {
        // Arrange
        int a = 10;
        int b = 20;
        int c = 30;
        PythagoreanTriple triple = new PythagoreanTriple();
        Mockito.when(triple.isPythagoreanTriple(a, b, c)).thenReturn(true);

        // Act
        boolean result = triple.isPythagoreanTriple(a, b, c);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPythagoreanTriple_5() {
        // Arrange
        int a = 6;
        int b = 8;
        int c = 100;
        PythagoreanTriple triple = new PythagoreanTriple();
        Mockito.when(triple.isPythagoreanTriple(a, b, c)).thenReturn(true);

        // Act
        boolean result = triple.isPythagoreanTriple(a, b, c);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPythagoreanTriple_6() {
        // Arrange
        int a = 1;
        int b = 1;
        int c = 1;
        PythagoreanTriple triple = new PythagoreanTriple();
        Mockito.when(triple.isPythagoreanTriple(a, b, c)).thenReturn(false);

        // Act
        boolean result = triple.isPythagoreanTriple(a, b, c);

        // Assert
        assertFalse(result);
    }
}
```
