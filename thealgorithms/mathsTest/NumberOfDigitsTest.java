query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "NumberOfDigits", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "numberOfDigits", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "numberOfDigitsFast", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "floor", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=abs, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None)], member=log10, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "Math", "member": "log10", "arguments": ["MethodInvocation(arguments=[MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=abs, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None)"]}, {"qualifier": "Math", "member": "abs", "arguments": ["number"]}], "conditionals": []}, {"name": "numberOfDigitsFaster", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "numberOfDigitsRecursion", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "", "member": "numberOfDigitsRecursion", "arguments": ["BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10), operator=/)"]}], "conditionals": []}]}]}
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

result: Here's an example of how you could write a unit test for the `numberOfDigits` method using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NumberOfDigitsTest {
    @Mock
    private Math math;

    @InjectMocks
    private NumberOfDigits numberOfDigits;

    @BeforeEach
    public void setUp() {
        // Set up any necessary preconditions before each test method
    }

    @Test
    public void testNumberOfDigits() {
        // Arrange
        int input = 123456789;
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Stub the behavior of Math.floor() and Math.log10()
        when(math.floor(input)).thenReturn(1);
        when(math.log10(1)).thenReturn(1);

        // Act
        List<Integer> actualOutput = numberOfDigits.numberOfDigits(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}
```
This test class uses the `@Mock` annotation to create a mock instance of the `Math` class and inject it into the `NumberOfDigits` class using the `@InjectMocks` annotation. The `setUp()` method is used to set up any necessary preconditions before each test method. The `testNumberOfDigits()` method uses the Arrange-Act-Assert format to test the `numberOfDigits()` method. It first sets up the input and expected output values, then stubs the behavior of the `Math.floor()` and `Math.log10()` methods using Mockito's `when()` and `thenReturn()` methods. Finally, it calls the `numberOfDigits()` method with the input value and verifies that the output is equal to the expected output using JUnit 5's `assertEquals()` method.
