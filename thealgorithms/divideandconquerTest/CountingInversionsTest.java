query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.divideandconquer", "imports": [], "classes": [{"class_name": "CountingInversions", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "countInversions", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "arr", "type": "int"}], "invocations": [{"qualifier": "", "member": "mergeSortAndCount", "arguments": ["arr", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=arr, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": []}, {"name": "mergeSortAndCount", "modifiers": ["static", "private"], "return_type": "int", "parameters": [{"name": "arr", "type": "int"}, {"name": "left", "type": "int"}, {"name": "right", "type": "int"}], "invocations": [{"qualifier": "", "member": "mergeSortAndCount", "arguments": ["arr", "left", "mid"]}, {"qualifier": "", "member": "mergeSortAndCount", "arguments": ["arr", "BinaryOperation(operandl=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "right"]}, {"qualifier": "", "member": "mergeAndCount", "arguments": ["arr", "left", "mid", "right"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=)", "has_else": false}]}, {"name": "mergeAndCount", "modifiers": ["static", "private"], "return_type": "int", "parameters": [{"name": "arr", "type": "int"}, {"name": "left", "type": "int"}, {"name": "mid", "type": "int"}, {"name": "right", "type": "int"}], "invocations": [{"qualifier": "System", "member": "arraycopy", "arguments": ["arr", "left", "leftArr", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "System", "member": "arraycopy", "arguments": ["arr", "BinaryOperation(operandl=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "rightArr", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=leftArr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=rightArr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=<=)", "has_else": true}]}]}]}
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

result: Here's an example of how you could write a unit test for the `countInversions` method in the `CountingInversions` class using JUnit 5 and Mockito:
```java
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
public class CountingInversionsTest {
    @Mock private int[] arr;
    @Mock private int left;
    @Mock private int right;

    private CountingInversions countingInversions;

    @BeforeEach
    public void setUp() {
        arr = new int[] {1, 2, 3, 4};
        left = 0;
        right = arr.length - 1;
        countingInversions = new CountingInversions();
    }

    @Test
    public void testCountInversions() {
        // Arrange
        when(arr[left]).thenReturn(1);
        when(arr[right]).thenReturn(4);
        when(arr[mid]).thenReturn(3);
        when(arr[mid - 1]).thenReturn(2);

        // Act
        int result = countingInversions.countInversions(arr, left, right);

        // Assert
        assertEquals(2, result);
    }
}
```
This test class uses the `@Mock` annotation from Mockito to create mock objects for the `int[] arr`, `left`, and `right` parameters of the `countInversions` method. The `setUp` method is used to set up the preconditions for each test, in this case by creating a new `int[]` array with values 1, 2, 3, and 4.

The `testCountInversions` method uses the `when` method from Mockito to stub the behavior of the mock objects. In this case, it returns the value 1 for `arr[left]`, 4 for `arr[right]`, 3 for `arr[mid]`, and 2 for `arr[mid - 1]`.

The test then calls the `countInversions` method with these mock objects as parameters, and verifies that the result is equal to 2 using the `assertEquals` method from JUnit.

Note that this is just one possible way to write a unit test for the `countInversions` method, and there are many other ways to do it depending on your specific needs and preferences.
