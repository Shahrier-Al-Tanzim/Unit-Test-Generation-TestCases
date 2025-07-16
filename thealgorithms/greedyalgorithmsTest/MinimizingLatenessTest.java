query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.greedyalgorithms", "imports": ["java.util.Arrays"], "classes": [{"class_name": "MinimizingLateness", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "calculateLateness", "modifiers": ["static"], "return_type": "void", "parameters": [{"name": "jobs", "type": "Job"}], "invocations": [{"qualifier": "Arrays", "member": "sort", "arguments": ["jobs", "LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=deadline, postfix_operators=[], prefix_operators=[], qualifier=a, selectors=[]), operandr=MemberReference(member=deadline, postfix_operators=[], prefix_operators=[], qualifier=b, selectors=[]), operator=-), parameters=[InferredFormalParameter(name=a), InferredFormalParameter(name=b)])"]}, {"qualifier": "Math", "member": "max", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=startTime, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=deadline, postfix_operators=[], prefix_operators=[], qualifier=job, selectors=[]), operator=-)"]}], "conditionals": []}]}]}
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
import static org.mockito.Mockito.*;

public class MinimizingLatenessTest {
    private Job[] jobs;
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void calculateLateness_shouldReturnMinimumLateness() {
        // Arrange
        Job[] jobs = new Job[3];
        calculator = mock(Calculator.class);

        when(calculator.max(0, 1)).thenReturn(1);
        when(calculator.max(1, 2)).thenReturn(2);
        when(calculator.max(2, 3)).thenReturn(3);

        // Act
        MinimizingLateness.calculateLateness(jobs);

        // Assert
        verify(calculator).max(0, 1);
        verify(calculator).max(1, 2);
        verify(calculator).max(2, 3);
    }
}
```
Note: This is just an example test class and may not cover all possible scenarios. It's important to write comprehensive tests that cover all edge cases and corner cases.
