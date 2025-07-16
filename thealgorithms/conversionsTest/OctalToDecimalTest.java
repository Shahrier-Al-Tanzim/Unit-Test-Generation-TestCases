query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.conversions", "imports": [], "classes": [{"class_name": "OctalToDecimal", "modifiers": ["public", "final"], "fields": [{"name": "OCTAL_BASE", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "convertOctalToDecimal", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "inputOctal", "type": "String"}], "invocations": [{"qualifier": "inputOctal", "member": "isEmpty", "arguments": []}, {"qualifier": "inputOctal", "member": "length", "arguments": []}, {"qualifier": "inputOctal", "member": "charAt", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=inputOctal, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=inputOctal, selectors=[], type_arguments=None), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='0'), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='7'), operator=>), operator=||)", "has_else": false}]}]}]}
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

result: Here's an example of how to write unit tests for the `convertOctalToDecimal` method using JUnit 5:
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class OctalToDecimalTest {
    private static final int OCTAL_BASE = 8;
    private OctalToDecimal octalToDecimal;

    @BeforeEach
    void setUp() {
        octalToDecimal = new OctalToDecimal();
    }

    @Test
    public void testConvertOctalToDecimal() {
        // Arrange
        String inputOctal = "1234567";
        MockedStatic<String> mockedStatic = Mockito.mockStatic(String.class);
        mockedStatic.when(() -> String.valueOf(inputOctal)).thenReturn("1234567");
        mockedStatic.when(() -> String.length(inputOctal)).thenReturn(7);
        mockedStatic.when(() -> String.charAt(inputOctal, 0)).thenReturn('1');
        mockedStatic.when(() -> String.charAt(inputOctal, 1)).thenReturn('2');
        mockedStatic.when(() -> String.charAt(inputOctal, 2)).thenReturn('3');
        mockedStatic.when(() -> String.charAt(inputOctal, 3)).thenReturn('4');
        mockedStatic.when(() -> String.charAt(inputOctal, 4)).thenReturn('5');
        mockedStatic.when(() -> String.charAt(inputOctal, 5)).thenReturn('6');
        mockedStatic.when(() -> String.charAt(inputOctal, 6)).thenReturn('7');

        // Act
        int result = octalToDecimal.convertOctalToDecimal(inputOctal);

        // Assert
        assertEquals(493, result);
    }
}
```
In this example, we use Mockito to mock the `String` class and stub its behavior for the `valueOf`, `length`, and `charAt` methods. We then call the `convertOctalToDecimal` method with the input octal string "1234567" and assert that the result is equal to 493.

Note that we use the `@BeforeEach` annotation to set up the `octalToDecimal` instance before each test method, and the `@Test` annotation to indicate that this method is a unit test. We also import only what is necessary for this example, which includes JUnit 5, Mockito, and the class under test.
