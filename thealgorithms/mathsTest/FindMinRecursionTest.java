query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "FindMinRecursion", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "min", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "array", "type": "int"}, {"name": "low", "type": "int"}, {"name": "high", "type": "int"}], "invocations": [{"qualifier": "", "member": "min", "arguments": ["array", "low", "mid"]}, {"qualifier": "", "member": "min", "arguments": ["array", "BinaryOperation(operandl=MemberReference(member=mid, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "high"]}, {"qualifier": "Math", "member": "min", "arguments": ["leftMin", "rightMin"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=low, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=high, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}, {"name": "min", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "", "member": "min", "arguments": ["array", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": []}]}]}
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

result: Here's an example of how you can write a JUnit 5 unit test for the `min` method in the `FindMinRecursion` class using Mockito:
```java
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FindMinRecursionTest {
    private FindMinRecursion findMinRecursion;
    private int[] array;

    @BeforeEach
    void setUp() {
        // Set up the focal class and input array
        findMinRecursion = new FindMinRecursion();
        array = new int[] { 1, 2, 3, 4, 5 };
    }

    @Test
    void testMin() {
        // Arrange: Set up the mocks and stubs
        Mockito.when(findMinRecursion.min(array, 0, array.length - 1)).thenReturn(1);

        // Act: Call the method under test
        int result = findMinRecursion.min(array);

        // Assert: Verify the results
        assertEquals(1, result);
    }
}
```
In this example, we use Mockito to stub the behavior of the `min` method in the `FindMinRecursion` class. We set up a mock for the `min` method and specify that it should return 1 when called with the input array and indices 0 and length - 1.

We then call the `min` method on the focal class using the input array, and verify that the result is equal to 1 using the `assertEquals` method from JUnit.

Note that we use the `@BeforeEach` annotation to set up the focal class and input array before each test method, and the `@Test` annotation to indicate that this is a test method.
