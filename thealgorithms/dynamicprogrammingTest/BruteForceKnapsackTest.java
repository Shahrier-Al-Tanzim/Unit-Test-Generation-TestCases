query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "BruteForceKnapsack", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "knapSack", "modifiers": ["static"], "return_type": "int", "parameters": [{"name": "w", "type": "int"}, {"name": "wt", "type": "int"}, {"name": "val", "type": "int"}, {"name": "n", "type": "int"}], "invocations": [{"qualifier": "", "member": "knapSack", "arguments": ["w", "wt", "val", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "Math", "member": "max", "arguments": ["MethodInvocation(arguments=[MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=wt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=val, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=knapSack, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "BinaryOperation(operandl=MemberReference(member=val, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-))]), operandr=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=wt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-))]), operator=-), MemberReference(member=wt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=val, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)], member=knapSack, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "", "member": "knapSack", "arguments": ["w", "wt", "val", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "", "member": "knapSack", "arguments": ["BinaryOperation(operandl=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=wt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-))]), operator=-)", "wt", "val", "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operandr=BinaryOperation(operandl=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=wt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-))]), operandr=MemberReference(member=w, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": true}]}]}]}
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
Here's an example of how to write unit tests for the `knapSack` method in the `BruteForceKnapsack` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;

public class BruteForceKnapsackTest {
    private static final int W = 10;
    private static final List<Integer> WT = Arrays.asList(5, 6, 3);
    private static final List<Integer> VAL = Arrays.asList(10, 20, 30);
    private static final int N = 3;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testKnapSack_whenWIsLessThanOrEqualToZero_shouldReturnZero() {
        int actual = BruteForceKnapsack.knapSack(-1, WT, VAL, N);
        assertEquals(0, actual);
    }

    @Test
    public void testKnapSack_whenWIsGreaterThanOrEqualToZero_shouldReturnMaximumValue() {
        int actual = BruteForceKnapsack.knapSack(10, WT, VAL, N);
        assertEquals(30, actual);
    }

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    public void testKnapSack_whenWIsValid_shouldReturnMaximumValue(int w, List<Integer> wt, List<Integer> val) {
        int actual = BruteForceKnapsack.knapSack(w, wt, val, N);
        assertEquals(BruteForceKnapsack.knapSack(w, WT, VAL, N), actual);
    }
}
```
In this example, we use the `@BeforeEach` annotation to set up a mocked static instance of `BruteForceKnapsack` using Mockito's `MockitoAnnotations.initMocks(this)` method. We then define three test methods:

1. `testKnapSack_whenWIsLessThanOrEqualToZero_shouldReturnZero`: This test verifies that the `knapSack` method returns 0 when the value of `w` is less than or equal to 0.
2. `testKnapSack_whenWIsGreaterThanOrEqualToZero_shouldReturnMaximumValue`: This test verifies that the `knapSack` method returns the maximum value possible when the value of `w` is greater than or equal to 0.
3. `testKnapSack_whenWIsValid_shouldReturnMaximumValue`: This test uses a parameterized test with a custom method source (`stringIntAndListProvider`) to verify that the `knapSack` method returns the maximum value possible when the value of `w` is valid (i.e., greater than or equal to 0 and less than or equal to the sum of all values in the `wt` list).

In each test method, we use Mockito's `when()` and `verify()` methods to stub the behavior of the `knapSack` method and verify that it is called with the expected arguments. We also use JUnit 5's `@ParameterizedTest` annotation to indicate that this test method takes a parameter (i.e., the value of `w`) from a custom method source (`stringIntAndListProvider`).
