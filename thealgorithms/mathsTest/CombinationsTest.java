query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "Combinations", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "factorial", "modifiers": ["public", "static"], "return_type": "long", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "factorial", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}, {"name": "combinations", "modifiers": ["public", "static"], "return_type": "long", "parameters": [{"name": "n", "type": "int"}, {"name": "k", "type": "int"}], "invocations": [{"qualifier": "", "member": "factorial", "arguments": ["n"]}, {"qualifier": "", "member": "factorial", "arguments": ["k"]}, {"qualifier": "", "member": "factorial", "arguments": ["BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)"]}], "conditionals": []}, {"name": "combinationsOptimized", "modifiers": ["public", "static"], "return_type": "long", "parameters": [{"name": "n", "type": "int"}, {"name": "k", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": false}]}]}]}
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

result: 
Here are the generated JUnit 5 unit tests for each of the methods in the provided JSON array:
```json
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class CombinationsTest {
    private Combinations combinations;

    @BeforeEach
    public void setUp() {
        combinations = new Combinations();
    }

    @Test
    public void testFactorial() {
        int n = 5;
        long result = combinations.factorial(n);
        assertEquals(120, result);
    }

    @Test
    public void testCombinations() {
        int n = 5;
        int k = 3;
        long result = combinations.combinations(n, k);
        assertEquals(10, result);
    }

    @Test
    public void testCombinationsOptimized() {
        int n = 5;
        int k = 3;
        long result = combinations.combinationsOptimized(n, k);
        assertEquals(10, result);
    }
}
```
Note that the generated tests are based on the provided method metadata and do not include any additional logic or dependencies beyond what is necessary to test the methods.
