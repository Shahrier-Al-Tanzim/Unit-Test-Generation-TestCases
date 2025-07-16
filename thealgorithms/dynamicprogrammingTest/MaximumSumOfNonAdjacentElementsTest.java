query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "MaximumSumOfNonAdjacentElements", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "getMaxSumApproach1", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "arr", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "max", "arguments": ["take", "notTake"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=arr, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=ind, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=>)", "has_else": false}]}, {"name": "getMaxSumApproach2", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "arr", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "max", "arguments": ["take", "notTake"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=arr, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=ind, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=>)", "has_else": false}]}]}]}
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
import com.thealgorithms.dynamicprogramming.MaximumSumOfNonAdjacentElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class MaximumSumOfNonAdjacentElementsTest {
    private MaximumSumOfNonAdjacentElements maximumSumOfNonAdjacentElements;

    @BeforeEach
    void setUp() {
        maximumSumOfNonAdjacentElements = new MaximumSumOfNonAdjacentElements();
    }

    @Test
    public void getMaxSumApproach1_shouldReturnCorrectResult() {
        // Arrange
        int[] arr = {1, 2, 3, 4};
        MockedStatic<Math> mathMockedStatic = Mockito.mockStatic(Math.class);
        mathMockedStatic.when(() -> Math.max(arr[0], arr[1])).thenReturn(5);
        mathMockedStatic.when(() -> Math.max(arr[2], arr[3])).thenReturn(7);
        mathMockedStatic.when(() -> Math.max(5, 7)).thenReturn(7);
        int expectedResult = 7;

        // Act
        int actualResult = maximumSumOfNonAdjacentElements.getMaxSumApproach1(arr);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getMaxSumApproach2_shouldReturnCorrectResult() {
        // Arrange
        int[] arr = {1, 2, 3, 4};
        MockedStatic<Math> mathMockedStatic = Mockito.mockStatic(Math.class);
        mathMockedStatic.when(() -> Math.max(arr[0], arr[1])).thenReturn(5);
        mathMockedStatic.when(() -> Math.max(arr[2], arr[3])).thenReturn(7);
        mathMockedStatic.when(() -> Math.max(5, 7)).thenReturn(7);
        int expectedResult = 7;

        // Act
        int actualResult = maximumSumOfNonAdjacentElements.getMaxSumApproach2(arr);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
```
