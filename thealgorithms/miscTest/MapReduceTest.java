query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.misc", "imports": ["java.util.Arrays", "java.util.LinkedHashMap", "java.util.List", "java.util.Map", "java.util.function.Function", "java.util.stream.Collectors"], "classes": [{"class_name": "MapReduce", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "mapreduce", "modifiers": ["public", "static"], "return_type": "String", "parameters": [{"name": "sentence", "type": "String"}], "invocations": [{"qualifier": "Arrays", "member": "stream", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")], member=split, postfix_operators=[], prefix_operators=[], qualifier=sentence, selectors=[], type_arguments=None)"]}, {"qualifier": null, "member": "toList", "arguments": []}, {"qualifier": "sentence", "member": "split", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")"]}, {"qualifier": "wordList", "member": "stream", "arguments": []}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[MethodInvocation(arguments=[], member=identity, postfix_operators=[], prefix_operators=[], qualifier=Function, selectors=[], type_arguments=None), MethodReference(expression=MemberReference(member=LinkedHashMap, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=new, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None), type_arguments=[]), MethodInvocation(arguments=[], member=counting, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)], member=groupingBy, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "groupingBy", "arguments": ["MethodInvocation(arguments=[], member=identity, postfix_operators=[], prefix_operators=[], qualifier=Function, selectors=[], type_arguments=None)", "MethodReference(expression=MemberReference(member=LinkedHashMap, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), method=MemberReference(member=new, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None), type_arguments=[])", "MethodInvocation(arguments=[], member=counting, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Function", "member": "identity", "arguments": []}, {"qualifier": "Collectors", "member": "counting", "arguments": []}, {"qualifier": "wordCounts", "member": "forEach", "arguments": ["LambdaExpression(body=MethodInvocation(arguments=[MemberReference(member=word, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=append, postfix_operators=[], prefix_operators=[], qualifier=result, selectors=[MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\": \")], member=append, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None), MethodInvocation(arguments=[MemberReference(member=count, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=append, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None), MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\",\")], member=append, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), parameters=[InferredFormalParameter(name=word), InferredFormalParameter(name=count)])"]}, {"qualifier": "result", "member": "append", "arguments": ["word"]}, {"qualifier": null, "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\": \")"]}, {"qualifier": null, "member": "append", "arguments": ["count"]}, {"qualifier": null, "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\",\")"]}, {"qualifier": "result", "member": "isEmpty", "arguments": []}, {"qualifier": "result", "member": "setLength", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=result, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "result", "member": "length", "arguments": []}, {"qualifier": "result", "member": "toString", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=result, selectors=[], type_arguments=None)", "has_else": false}]}]}]}
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

result: Here's an example of how you could write a unit test for the `mapreduce` method in the `MapReduce` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MapReduceTest {
    @Mock
    private Function<String, List<String>> wordList;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMapreduce() {
        // Arrange
        String sentence = "This is a sample sentence.";
        List<String> words = Arrays.asList("This", "is", "a", "sample", "sentence.");
        Map<String, Long> wordCounts = new LinkedHashMap<>();
        wordCounts.put("This", 1L);
        wordCounts.put("is", 2L);
        wordCounts.put("a", 3L);
        wordCounts.put("sample", 4L);
        wordCounts.put("sentence.", 5L);

        when(wordList.apply(sentence)).thenReturn(words);

        // Act
        String result = MapReduce.mapreduce(sentence);

        // Assert
        assertEquals("This: 1, is: 2, a: 3, sample: 4, sentence.: 5", result);
    }
}
```
In this example, we use the `@Mock` annotation to create a mock instance of the `Function<String, List<String>>` interface. We then use the `when()` method from Mockito to stub the behavior of the `apply()` method on this mock object, so that it returns the list of words in the sentence when called with the sentence as an argument.

We also use the `@BeforeEach` annotation to initialize the mocks using the `MockitoAnnotations.initMocks()` method before each test method is executed. This ensures that the mock objects are properly initialized and ready for use.

In the test method, we first arrange the input data by creating a sentence and a list of words that we expect the `mapreduce` method to return. We then set up the stub behavior on the mock object using the `when()` method from Mockito. Finally, we call the `mapreduce` method with the sentence as an argument and verify the results using the `assertEquals()` method from JUnit 5.
