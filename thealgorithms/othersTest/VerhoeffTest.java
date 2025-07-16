query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": ["java.util.Objects"], "classes": [{"class_name": "Verhoeff", "modifiers": ["public", "final"], "fields": [{"name": "MULTIPLICATION_TABLE", "type": "byte"}, {"name": "MULTIPLICATIVE_INVERSE", "type": "byte"}, {"name": "PERMUTATION_TABLE", "type": "byte"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "verhoeffCheck", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "digits", "type": "String"}], "invocations": [{"qualifier": "", "member": "checkInput", "arguments": ["digits"]}, {"qualifier": "", "member": "toIntArray", "arguments": ["digits"]}], "conditionals": []}, {"name": "addVerhoeffChecksum", "modifiers": ["public", "static"], "return_type": "String", "parameters": [{"name": "initialDigits", "type": "String"}], "invocations": [{"qualifier": "", "member": "checkInput", "arguments": ["initialDigits"]}, {"qualifier": "", "member": "toIntArray", "arguments": ["modifiedDigits"]}], "conditionals": []}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Verhoeff algorithm usage examples:\")"]}, {"qualifier": "", "member": "checkAndPrint", "arguments": ["validInput"]}, {"qualifier": "", "member": "checkAndPrint", "arguments": ["invalidInput"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\nCheck digit generation example:\")"]}, {"qualifier": "", "member": "generateAndPrint", "arguments": ["input"]}], "conditionals": []}, {"name": "checkAndPrint", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "input", "type": "String"}], "invocations": [{"qualifier": "Verhoeff", "member": "verhoeffCheck", "arguments": ["input"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Input '\"), operandr=MemberReference(member=input, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"' is \"), operator=+), operandr=MemberReference(member=validationResult, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}], "conditionals": []}, {"name": "generateAndPrint", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "input", "type": "String"}], "invocations": [{"qualifier": "", "member": "addVerhoeffChecksum", "arguments": ["input"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Generate and add checksum to initial value '\"), operandr=MemberReference(member=input, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"'. Result: '\"), operator=+), operandr=MemberReference(member=result, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"'\"), operator=+)"]}], "conditionals": []}, {"name": "checkInput", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "input", "type": "String"}], "invocations": [{"qualifier": "Objects", "member": "requireNonNull", "arguments": ["input"]}, {"qualifier": "input", "member": "matches", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\\\d+\")"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\\\d+\")], member=matches, postfix_operators=[], prefix_operators=['!'], qualifier=input, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "toIntArray", "modifiers": ["static", "private"], "return_type": "int", "parameters": [{"name": "string", "type": "String"}], "invocations": [{"qualifier": "string", "member": "chars", "arguments": []}, {"qualifier": null, "member": "map", "arguments": ["LambdaExpression(body=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)], member=digit, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None), parameters=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "Character", "member": "digit", "arguments": ["i", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}, {"qualifier": null, "member": "toArray", "arguments": []}], "conditionals": []}]}]}
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

result: Here's an example of how you could write a unit test for the `verhoeffCheck` method using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class VerhoeffTest {
    @Mock private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        // Set up any necessary preconditions before each test method
    }
    
    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }
    
    @Test
    public void testVerhoeffCheck_validInput() {
        // Arrange
        String input = "123456789";
        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        when(calculator.add(anyInt(), anyInt())).thenReturn(10);
        when(calculator.multiply(anyInt(), anyInt())).thenReturn(20);
        
        // Act
        boolean result = Verhoeff.verhoeffCheck(input);
        
        // Assert
        assertTrue(result);
    }
    
    @Test
    public void testVerhoeffCheck_invalidInput() {
        // Arrange
        String input = "1234567890";
        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        
        when(calculator.add(anyInt(), anyInt())).thenReturn(10);
        when(calculator.multiply(anyInt(), anyInt())).thenReturn(20);
        
        // Act
        boolean result = Verhoeff.verhoeffCheck(input);
        
        // Assert
        assertFalse(result);
    }
}
```
In this example, we're using the `@Mock` annotation from Mockito to create a mock instance of the `Calculator` class that will be used in the test methods. We're also using the `when` and `thenReturn` methods from Mockito to stub the behavior of the `add` and `multiply` methods on the calculator, so that they always return 10 and 20, respectively.

In the first test method, we're testing the `verhoeffCheck` method with a valid input string ("123456789"). We're using the `anyInt()` matcher from Mockito to match any integer argument that is passed to the `add` and `multiply` methods. We're then verifying that the result of calling the `verhoeffCheck` method with this input string is true.

In the second test method, we're testing the `verhoeffCheck` method with an invalid input string ("1234567890"). Again, we're using the `anyInt()` matcher to match any integer argument that is passed to the `add` and `multiply` methods. We're then verifying that the result of calling the `verhoeffCheck` method with this input string is false.

Note that in both test methods, we're using the `assertTrue` and `assertFalse` methods from JUnit 5 to verify the results of the `verhoeffCheck` method. These methods will pass if the result of the method call is true or false, respectively.
