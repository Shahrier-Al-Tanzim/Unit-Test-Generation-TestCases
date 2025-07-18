query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.stacks", "imports": ["java.util.Stack"], "classes": [{"class_name": "NextGreaterElement", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "findNextGreaterElements", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "array", "type": "int"}], "invocations": [{"qualifier": "stack", "member": "isEmpty", "arguments": []}, {"qualifier": "stack", "member": "peek", "arguments": []}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "stack", "member": "push", "arguments": ["i"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}]}]}
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
package com.thealgorithms.stacks;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NextGreaterElement {
    private Stack<Integer> stack = new Stack<>();

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup
    }

    @Test
    public void findNextGreaterElements_emptyStack() {
        // Arrange
        Mockito.when(stack.isEmpty()).thenReturn(true);
        Mockito.when(stack.peek()).thenReturn(null);
        Mockito.doNothing().when(stack).push(Mockito.anyInt());

        // Act
        int result = findNextGreaterElements(new int[] {});

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void findNextGreaterElements_nonEmptyStack() {
        // Arrange
        Mockito.when(stack.isEmpty()).thenReturn(false);
        Mockito.when(stack.peek()).thenReturn(1);
        Mockito.doNothing().when(stack).push(Mockito.anyInt());

        // Act
        int result = findNextGreaterElements(new int[] {1, 2, 3});

        // Assert
        assertEquals(2, result);
    }
}
```
Note: This is just an example test class and may need to be modified based on the specific requirements of the class under test.
