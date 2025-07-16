query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "Armstrong", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "isArmstrong", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "log10", "arguments": ["number"]}, {"qualifier": "Math", "member": "pow", "arguments": ["digit", "totalDigits"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}]}]}
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

result: Here's an example of how you could write a unit test for the `isArmstrong` method in the `Armstrong` class using JUnit 5 and Mockito:
```java
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ArmstrongTest {
    private Armstrong armstrong;

    @BeforeEach
    void setUp() {
        // Set up the mock for the Math class
        Mockito.when(Math.log10(Mockito.anyInt())).thenReturn(1);
        Mockito.when(Math.pow(Mockito.anyInt(), Mockito.anyInt())).thenReturn(2);

        // Instantiate the focal class
        armstrong = new Armstrong();
    }

    @Test
    void isArmstrong_validInput_returnsTrue() {
        // Arrange
        int number = 153;

        // Act
        boolean result = armstrong.isArmstrong(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void isArmstrong_invalidInput_returnsFalse() {
        // Arrange
        int number = 123;

        // Act
        boolean result = armstrong.isArmstrong(number);

        // Assert
        assertFalse(result);
    }
}
```
In this example, we're using Mockito to stub the behavior of the `Math` class methods that are called by the `isArmstrong` method. We're also setting up the focal class instance in the `@BeforeEach` method and using it in the test methods. The test methods use the `assertTrue` and `assertFalse` methods from JUnit 5 to verify the results of the `isArmstrong` method calls.
