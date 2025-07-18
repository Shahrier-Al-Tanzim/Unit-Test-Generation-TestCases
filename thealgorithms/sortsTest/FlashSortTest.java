query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": [], "classes": [{"class_name": "FlashSort", "modifiers": ["public"], "fields": [{"name": "classificationRatio", "type": "double"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "classificationRatio", "type": "double"}], "modifiers": ["public"]}], "methods": [{"name": "getClassificationRatio", "modifiers": ["public"], "return_type": "double", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setClassificationRatio", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "classificationRatio", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=classificationRatio, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operandr=BinaryOperation(operandl=MemberReference(member=classificationRatio, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=>=), operator=||)", "has_else": false}]}, {"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "flashSort", "arguments": ["array"]}], "conditionals": []}, {"name": "flashSort", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "arr", "type": "T"}], "invocations": [{"qualifier": "", "member": "findMin", "arguments": ["arr"]}, {"qualifier": "", "member": "findMaxIndex", "arguments": ["arr"]}, {"qualifier": null, "member": "compareTo", "arguments": ["min"]}, {"qualifier": null, "member": "compareTo", "arguments": ["min"]}, {"qualifier": "", "member": "classify", "arguments": ["arr", "classificationArray", "c1", "min"]}, {"qualifier": "", "member": "transform", "arguments": ["classificationArray"]}, {"qualifier": "", "member": "permute", "arguments": ["arr", "classificationArray", "c1", "min", "length", "m"]}, {"qualifier": "", "member": "insertionSort", "arguments": ["arr"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=arr, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=arr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=maxIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=min, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "findMin", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "arr", "type": "T"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["min"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=arr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=min, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}, {"name": "findMaxIndex", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "arr", "type": "T"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["arr"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=arr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=arr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=maxIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}, {"name": "classify", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "arr", "type": "T"}, {"name": "classificationArray", "type": "int"}, {"name": "c1", "type": "double"}, {"name": "min", "type": "T"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["min"]}], "conditionals": []}, {"name": "transform", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "classificationArray", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "permute", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "arr", "type": "T"}, {"name": "classificationArray", "type": "int"}, {"name": "c1", "type": "double"}, {"name": "min", "type": "T"}, {"name": "n", "type": "int"}, {"name": "m", "type": "int"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["min"]}, {"qualifier": "flash", "member": "compareTo", "arguments": ["min"]}], "conditionals": []}, {"name": "insertionSort", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "arr", "type": "T"}], "invocations": [{"qualifier": null, "member": "compareTo", "arguments": ["key"]}], "conditionals": []}]}]}
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
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FlashSortTest {
    private static final double EPSILON = 1e-6;

    @Mock
    private Calculator calculator;

    private FlashSort flashSort;

    @BeforeEach
    public void setUp() {
        flashSort = new FlashSort();
    }

    @Test
    public void testGetClassificationRatio() {
        double expected = 0.5;
        flashSort.setClassificationRatio(expected);
        assertEquals(expected, flashSort.getClassificationRatio(), EPSILON);
    }

    @Test
    public void testSetClassificationRatio() {
        double expected = 0.75;
        flashSort.setClassificationRatio(expected);
        assertEquals(expected, flashSort.getClassificationRatio(), EPSILON);
    }

    @Test
    public void testSort() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        when(calculator.compareTo(anyInt())).thenReturn(0);
        flashSort.sort(arr);
        assertEquals(expected, Arrays.asList(arr));
    }
}
```
Note: This is just one possible way to write the test class for the given method-metadata. The actual implementation may vary depending on the specific requirements of the project.
