query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "PronicNumber", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "isPronic", "modifiers": ["static"], "return_type": "boolean", "parameters": [{"name": "inputNumber", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=inputNumber, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+), operator=*), operandr=MemberReference(member=inputNumber, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===), operandr=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=inputNumber, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=), operator=&&)", "has_else": false}]}, {"name": "isPronicNumber", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "number", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "sqrt", "arguments": ["number"]}], "conditionals": []}]}]}
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
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import com.thealgorithms.maths.PronicNumber;

class PronicNumberTest {
    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @BeforeAll
    static void setupOnce() {
        // Set up once before all tests
    }

    @Test
    public void isPronic_WhenInputNumberIs1_ReturnsTrue() {
        // Arrange
        int inputNumber = 1;
        PronicNumber pronicNumber = new PronicNumber();
        Mockito.when(pronicNumber.isPronic(inputNumber)).thenReturn(true);

        // Act
        boolean result = pronicNumber.isPronic(inputNumber);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isPronic_WhenInputNumberIs2_ReturnsTrue() {
        // Arrange
        int inputNumber = 2;
        PronicNumber pronicNumber = new PronicNumber();
        Mockito.when(pronicNumber.isPronic(inputNumber)).thenReturn(true);

        // Act
        boolean result = pronicNumber.isPronic(inputNumber);

        // Assert
        assertTrue(result);
    }

    @Test
    public void isPronic_WhenInputNumberIs3_ReturnsFalse() {
        // Arrange
        int inputNumber = 3;
        PronicNumber pronicNumber = new PronicNumber();
        Mockito.when(pronicNumber.isPronic(inputNumber)).thenReturn(false);

        // Act
        boolean result = pronicNumber.isPronic(inputNumber);

        // Assert
        assertFalse(result);
    }
}
```
