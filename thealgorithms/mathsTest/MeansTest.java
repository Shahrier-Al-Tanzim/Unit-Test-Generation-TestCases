query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": ["java.util.stream.StreamSupport", "org.apache.commons.collections4.IterableUtils"], "classes": [{"class_name": "Means", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "arithmetic", "modifiers": ["public", "static"], "return_type": "Double", "parameters": [{"name": "numbers", "type": "Iterable"}], "invocations": [{"qualifier": "", "member": "checkIfNotEmpty", "arguments": ["numbers"]}, {"qualifier": "StreamSupport", "member": "stream", "arguments": ["MethodInvocation(arguments=[], member=spliterator, postfix_operators=[], prefix_operators=[], qualifier=numbers, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false)"]}, {"qualifier": null, "member": "reduce", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), parameters=[InferredFormalParameter(name=x), InferredFormalParameter(name=y)])"]}, {"qualifier": null, "member": "get", "arguments": []}, {"qualifier": "numbers", "member": "spliterator", "arguments": []}, {"qualifier": "IterableUtils", "member": "size", "arguments": ["numbers"]}], "conditionals": []}, {"name": "geometric", "modifiers": ["public", "static"], "return_type": "Double", "parameters": [{"name": "numbers", "type": "Iterable"}], "invocations": [{"qualifier": "", "member": "checkIfNotEmpty", "arguments": ["numbers"]}, {"qualifier": "Math", "member": "pow", "arguments": ["MethodInvocation(arguments=[MethodInvocation(arguments=[], member=spliterator, postfix_operators=[], prefix_operators=[], qualifier=numbers, selectors=[], type_arguments=None), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false)], member=stream, postfix_operators=[], prefix_operators=[], qualifier=StreamSupport, selectors=[MethodInvocation(arguments=[LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*), parameters=[InferredFormalParameter(name=x), InferredFormalParameter(name=y)])], member=reduce, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None), MethodInvocation(arguments=[], member=get, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1d), operandr=MethodInvocation(arguments=[MemberReference(member=numbers, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=size, postfix_operators=[], prefix_operators=[], qualifier=IterableUtils, selectors=[], type_arguments=None), operator=/)"]}, {"qualifier": "StreamSupport", "member": "stream", "arguments": ["MethodInvocation(arguments=[], member=spliterator, postfix_operators=[], prefix_operators=[], qualifier=numbers, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false)"]}, {"qualifier": null, "member": "reduce", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*), parameters=[InferredFormalParameter(name=x), InferredFormalParameter(name=y)])"]}, {"qualifier": null, "member": "get", "arguments": []}, {"qualifier": "numbers", "member": "spliterator", "arguments": []}, {"qualifier": "IterableUtils", "member": "size", "arguments": ["numbers"]}], "conditionals": []}, {"name": "harmonic", "modifiers": ["public", "static"], "return_type": "Double", "parameters": [{"name": "numbers", "type": "Iterable"}], "invocations": [{"qualifier": "", "member": "checkIfNotEmpty", "arguments": ["numbers"]}, {"qualifier": "IterableUtils", "member": "size", "arguments": ["numbers"]}, {"qualifier": "StreamSupport", "member": "stream", "arguments": ["MethodInvocation(arguments=[], member=spliterator, postfix_operators=[], prefix_operators=[], qualifier=numbers, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false)"]}, {"qualifier": null, "member": "reduce", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0d)", "LambdaExpression(body=BinaryOperation(operandl=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1d), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=/), operator=+), parameters=[InferredFormalParameter(name=x), InferredFormalParameter(name=y)])"]}, {"qualifier": "numbers", "member": "spliterator", "arguments": []}], "conditionals": []}, {"name": "checkIfNotEmpty", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "numbers", "type": "Iterable"}], "invocations": [{"qualifier": "numbers", "member": "iterator", "arguments": []}, {"qualifier": null, "member": "hasNext", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=iterator, postfix_operators=[], prefix_operators=['!'], qualifier=numbers, selectors=[MethodInvocation(arguments=[], member=hasNext, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": false}]}]}]}
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

result: Here's an example of how to write unit tests for the `Means` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;

import com.thealgorithms.maths.Means;

class MeansTest {
    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @ParameterizedTest
    @MethodSource("methodMetadata")
    void arithmetic(String methodName, Iterable<Double> numbers) {
        // Arrange
        Means means = new Means();
        MockedStatic<StreamSupport> streamSupportMock = mockStatic(StreamSupport.class);
        when(streamSupportMock.stream(numbers)).thenReturn(Stream.of(1d, 2d));

        // Act
        Double result = (Double) means.getClass().getMethod(methodName).invoke(means, numbers);

        // Assert
        assertEquals(3d, result, 0.001);
    }

    @ParameterizedTest
    @MethodSource("methodMetadata")
    void geometric(String methodName, Iterable<Double> numbers) {
        // Arrange
        Means means = new Means();
        MockedStatic<StreamSupport> streamSupportMock = mockStatic(StreamSupport.class);
        when(streamSupportMock.stream(numbers)).thenReturn(Stream.of(1d, 2d));

        // Act
        Double result = (Double) means.getClass().getMethod(methodName).invoke(means, numbers);

        // Assert
        assertEquals(Math.pow(3d, 1d / 2), result, 0.001);
    }

    @ParameterizedTest
    @MethodSource("methodMetadata")
    void harmonic(String methodName, Iterable<Double> numbers) {
        // Arrange
        Means means = new Means();
        MockedStatic<StreamSupport> streamSupportMock = mockStatic(StreamSupport.class);
        when(streamSupportMock.stream(numbers)).thenReturn(Stream.of(1d, 2d));

        // Act
        Double result = (Double) means.getClass().getMethod(methodName).invoke(means, numbers);

        // Assert
        assertEquals(Math.log(6d), result, 0.001);
    }

    private static Stream<Arguments> methodMetadata() {
        return Stream.of(
                arguments("arithmetic", Arrays.asList(1d, 2d)),
                arguments("geometric", Arrays.asList(1d, 2d)),
                arguments("harmonic", Arrays.asList(1d, 2d))
        );
    }
}
```
This test class uses the `@ParameterizedTest` annotation to run multiple tests with different input parameters. The `methodMetadata()` method provides a stream of `Arguments` objects that contain the name of the method and an iterable of doubles as input for each test case.

The `arithmetic()`, `geometric()`, and `harmonic()` methods use the `@MethodSource` annotation to provide the input data for each test case. The `when()` method is used to stub the behavior of the `StreamSupport.stream()` method, which is called by the `Means` class during the calculation of the mean.

The `assertEquals()` method is used to verify that the result of the calculation matches the expected value.
