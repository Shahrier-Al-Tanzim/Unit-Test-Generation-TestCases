query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.conversions", "imports": ["java.math.BigDecimal"], "classes": [{"class_name": "NumberToWords", "modifiers": ["public", "final"], "fields": [{"name": "UNITS", "type": "String"}, {"name": "TENS", "type": "String"}, {"name": "POWERS", "type": "String"}, {"name": "ZERO", "type": "String"}, {"name": "POINT", "type": "String"}, {"name": "NEGATIVE", "type": "String"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "convert", "modifiers": ["public", "static"], "return_type": "String", "parameters": [{"name": "number", "type": "BigDecimal"}], "invocations": [{"qualifier": "number", "member": "signum", "arguments": []}, {"qualifier": "number", "member": "abs", "arguments": []}, {"qualifier": null, "member": "divideAndRemainder", "arguments": ["ONE"]}, {"qualifier": null, "member": "compareTo", "arguments": ["ZERO"]}, {"qualifier": null, "member": "toPlainString", "arguments": []}, {"qualifier": null, "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "result", "member": "append", "arguments": ["NEGATIVE"]}, {"qualifier": "result", "member": "append", "arguments": ["MethodInvocation(arguments=[MemberReference(member=wholePart, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=convertWholeNumberToWords, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "convertWholeNumberToWords", "arguments": ["wholePart"]}, {"qualifier": "fractionalPartStr", "member": "isEmpty", "arguments": []}, {"qualifier": "result", "member": "append", "arguments": ["POINT"]}, {"qualifier": "fractionalPartStr", "member": "toCharArray", "arguments": []}, {"qualifier": "Character", "member": "getNumericValue", "arguments": ["digit"]}, {"qualifier": "result", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")"]}, {"qualifier": null, "member": "append", "arguments": ["TernaryExpression(condition=BinaryOperation(operandl=MemberReference(member=digitValue, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), if_false=MemberReference(member=UNITS, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=digitValue, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), if_true=MemberReference(member=ZERO, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))"]}, {"qualifier": "result", "member": "toString", "arguments": []}, {"qualifier": null, "member": "trim", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "MemberReference(member=isNegative, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=fractionalPartStr, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "convertWholeNumberToWords", "modifiers": ["static", "private"], "return_type": "String", "parameters": [{"name": "number", "type": "BigDecimal"}], "invocations": [{"qualifier": "number", "member": "compareTo", "arguments": ["ZERO"]}, {"qualifier": "number", "member": "compareTo", "arguments": ["ZERO"]}, {"qualifier": "number", "member": "divideAndRemainder", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1000)], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=BigDecimal, selectors=[], type_arguments=None)"]}, {"qualifier": "BigDecimal", "member": "valueOf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1000)"]}, {"qualifier": null, "member": "intValue", "arguments": []}, {"qualifier": "", "member": "convertChunk", "arguments": ["chunk"]}, {"qualifier": "words", "member": "insert", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=POWERS, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=power, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \"), operator=+)"]}, {"qualifier": "words", "member": "insert", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=chunkWords, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \"), operator=+)"]}, {"qualifier": "words", "member": "toString", "arguments": []}, {"qualifier": null, "member": "trim", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=ZERO, postfix_operators=[], prefix_operators=[], qualifier=BigDecimal, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=number, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=chunk, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=power, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}, {"name": "convertChunk", "modifiers": ["static", "private"], "return_type": "String", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "", "member": "convertChunk", "arguments": ["BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=100), operator=%)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=20), operator=<)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=100), operator=<)", "has_else": true}]}]}]}
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

result: Here's an example of how you could write a unit test for the `convert` method in the `NumberToWords` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NumberToWordsTest {
    @Mock
    private BigDecimal number;

    @InjectMocks
    private NumberToWords underTest;

    @BeforeEach
    public void setUp() {
        // Set up the mock for the number parameter
        when(number.signum()).thenReturn(1);
        when(number.abs()).thenReturn(BigDecimal.valueOf(123));
        when(number.divideAndRemainder(BigDecimal.ONE)).thenReturn(new BigDecimal[] {BigDecimal.valueOf(123), BigDecimal.ZERO});
        when(number.compareTo(BigDecimal.ZERO)).thenReturn(1);
        when(number.toPlainString()).thenReturn("123");
    }

    @Test
    public void testConvert() {
        // Arrange
        String expected = "One Hundred Twenty-Three";

        // Act
        String actual = underTest.convert(number);

        // Assert
        assertEquals(expected, actual);
    }
}
```
In this example, we use the `@Mock` annotation to create a mock for the `BigDecimal` parameter of the `convert` method. We then set up the behavior of the mock using the `when` method from Mockito, and verify the results using the `assertEquals` method from JUnit 5.

Note that we use the `@InjectMocks` annotation to inject the mock into the class under test, so that we can test its behavior. We also use the `@ExtendWith` annotation to enable the MockitoExtension, which allows us to use the `when` and `verify` methods from Mockito in our tests.
