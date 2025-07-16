query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "EulersFunction", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "checkInput", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "n", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "getEuler", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "checkInput", "arguments": ["n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=>)", "has_else": false}]}]}]}
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import com.thealgorithms.maths.EulersFunction;

class EulersFunctionTest {
    private EulersFunction euler;

    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs
        euler = new EulersFunction();
    }

    @Test
    void checkInput_nIsZero_ReturnsFalse() {
        // Arrange
        int n = 0;

        // Act
        boolean result = euler.checkInput(n);

        // Assert
        assertFalse(result);
    }

    @Test
    void checkInput_nIsOne_ReturnsTrue() {
        // Arrange
        int n = 1;

        // Act
        boolean result = euler.checkInput(n);

        // Assert
        assertTrue(result);
    }

    @Test
    void getEuler_nIsZero_ReturnsZero() {
        // Arrange
        int n = 0;

        // Act
        int result = euler.getEuler(n);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void getEuler_nIsOne_ReturnsOne() {
        // Arrange
        int n = 1;

        // Act
        int result = euler.getEuler(n);

        // Assert
        assertEquals(1, result);
    }
}
```
