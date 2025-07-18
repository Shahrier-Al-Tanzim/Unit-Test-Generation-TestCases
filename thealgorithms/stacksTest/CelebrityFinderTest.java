query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.stacks", "imports": ["java.util.Stack"], "classes": [{"class_name": "CelebrityFinder", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "findCelebrity", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "party", "type": "int"}], "invocations": [{"qualifier": "stack", "member": "push", "arguments": ["i"]}, {"qualifier": "stack", "member": "size", "arguments": []}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "stack", "member": "push", "arguments": ["person2"]}, {"qualifier": "stack", "member": "push", "arguments": ["person1"]}, {"qualifier": "stack", "member": "pop", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=party, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=person1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=person2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=candidate, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=), operandr=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=party, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=candidate, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===), operandr=BinaryOperation(operandl=MemberReference(member=party, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=candidate, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=||), operator=&&)", "has_else": false}]}]}]}
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
import static org.mockito.Mockito.*;

import java.util.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CelebrityFinderTest {
    @Mock private Stack<Integer> stack;

    @BeforeEach
    public void setUp() {
        // Arrange
        when(stack.push(anyInt())).thenReturn(null);
        when(stack.size()).thenReturn(0);
        doNothing().when(stack).pop();
    }

    @Test
    public void findCelebrity_WhenPartyIsEven() {
        // Arrange
        int party = 2;
        int candidate = 1;

        // Act
        int result = CelebrityFinder.findCelebrity(party);

        // Assert
        assertEquals(candidate, result);
    }

    @Test
    public void findCelebrity_WhenPartyIsOdd() {
        // Arrange
        int party = 3;
        int candidate = 2;

        // Act
        int result = CelebrityFinder.findCelebrity(party);

        // Assert
        assertEquals(candidate, result);
    }
}
```
