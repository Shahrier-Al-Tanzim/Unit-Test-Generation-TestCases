query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "SumOfDigits", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "sumOfDigits", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["number"]}], "conditionals": []}, {"name": "sumOfDigitsRecursion", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "abs", "arguments": ["number"]}, {"qualifier": "", "member": "sumOfDigitsRecursion", "arguments": ["BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=base, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=/)"]}], "conditionals": []}, {"name": "sumOfDigitsFast", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "String", "member": "valueOf", "arguments": ["MethodInvocation(arguments=[MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=abs, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None)"]}, {"qualifier": null, "member": "chars", "arguments": []}, {"qualifier": null, "member": "map", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='0'), operator=-), parameters=[MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": null, "member": "reduce", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "MethodReference(expression=MemberReference(member=Integer, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=sum, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": "Math", "member": "abs", "arguments": ["number"]}], "conditionals": []}]}]}
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

result: Here are the generated JUnit 5 unit test classes for each of the methods in the JSON array:
```java
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

public class SumOfDigitsTest {
    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void sumOfDigits_shouldReturnSumOfPositiveNumber() {
        // Arrange: Set up inputs, mocks, or stubs
        int number = 123;
        Math absMock = mock(Math.class);
        when(absMock.abs(number)).thenReturn(123);

        // Act: Call the method under test
        int result = SumOfDigits.sumOfDigits(number);

        // Assert: Verify the results
        assertEquals(123, result);
    }

    @Test
    public void sumOfDigits_shouldReturnSumOfNegativeNumber() {
        // Arrange: Set up inputs, mocks, or stubs
        int number = -123;
        Math absMock = mock(Math.class);
        when(absMock.abs(number)).thenReturn(-123);

        // Act: Call the method under test
        int result = SumOfDigits.sumOfDigits(number);

        // Assert: Verify the results
        assertEquals(-123, result);
    }
}
```
```java
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

public class SumOfDigitsRecursionTest {
    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void sumOfDigitsRecursion_shouldReturnSumOfPositiveNumber() {
        // Arrange: Set up inputs, mocks, or stubs
        int number = 123;
        Math absMock = mock(Math.class);
        when(absMock.abs(number)).thenReturn(123);

        // Act: Call the method under test
        int result = SumOfDigitsRecursion.sumOfDigitsRecursion(number);

        // Assert: Verify the results
        assertEquals(123, result);
    }

    @Test
    public void sumOfDigitsRecursion_shouldReturnSumOfNegativeNumber() {
        // Arrange: Set up inputs, mocks, or stubs
        int number = -123;
        Math absMock = mock(Math.class);
        when(absMock.abs(number)).thenReturn(-123);

        // Act: Call the method under test
        int result = SumOfDigitsRecursion.sumOfDigitsRecursion(number);

        // Assert: Verify the results
        assertEquals(-123, result);
    }
}
```
```java
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

public class SumOfDigitsFastTest {
    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void sumOfDigitsFast_shouldReturnSumOfPositiveNumber() {
        // Arrange: Set up inputs, mocks, or stubs
        int number = 123;
        String stringMock = mock(String.class);
        when(stringMock.valueOf(number)).thenReturn("123");
        char[] charsMock = mock(char[].class);
        when(stringMock.chars()).thenReturn(charsMock);
        int[] reduceMock = mock(int[].class);
        when(reduceMock.length).thenReturn(3);
        when(reduceMock[0]).thenReturn(1);
        when(reduceMock[1]).thenReturn(2);
        when(reduceMock[2]).thenReturn(3);
        int sum = mock(int.class);
        when(sum.sumOfDigitsFast(number)).thenReturn(6);

        // Act: Call the method under test
        int result = SumOfDigitsFast.sumOfDigitsFast(number);

        // Assert: Verify the results
        assertEquals(6, result);
    }

    @Test
    public void sumOfDigitsFast_shouldReturnSumOfNegativeNumber() {
        // Arrange: Set up inputs, mocks, or stubs
        int number = -123;
        String stringMock = mock(String.class);
        when(stringMock.valueOf(number)).thenReturn("-123");
        char[] charsMock = mock(char[].class);
        when(stringMock.chars()).thenReturn(charsMock);
        int[] reduceMock = mock(int[].class);
        when(reduceMock.length).thenReturn(4);
        when(reduceMock[0]).thenReturn(-1);
        when(reduceMock[1]).thenReturn(2);
        when(reduceMock[2]).thenReturn(3);
        int sum = mock(int.class);
        when(sum.sumOfDigitsFast(number)).thenReturn(-6);

        // Act: Call the method under test
        int result = SumOfDigitsFast.sumOfDigitsFast(number);

        // Assert: Verify the results
        assertEquals(-6, result);
    }
}
```
