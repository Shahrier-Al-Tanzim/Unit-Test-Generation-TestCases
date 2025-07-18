query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": ["java.util.Set"], "classes": [{"class_name": "CheckVowels", "modifiers": ["final", "public"], "fields": [{"name": "VOWELS", "type": "Set"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "hasVowels", "modifiers": ["static", "public"], "return_type": "boolean", "parameters": [{"name": "input", "type": "String"}], "invocations": [{"qualifier": "input", "member": "isEmpty", "arguments": []}, {"qualifier": "input", "member": "toLowerCase", "arguments": []}, {"qualifier": null, "member": "toCharArray", "arguments": []}, {"qualifier": "VOWELS", "member": "contains", "arguments": ["c"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=input, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=input, selectors=[], type_arguments=None), operator=||)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=contains, postfix_operators=[], prefix_operators=[], qualifier=VOWELS, selectors=[], type_arguments=None)", "has_else": false}]}]}]}
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
package com.thealgorithms.strings;

import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class CheckVowels {
    private Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    @BeforeEach
    void setUp() {
        // setup required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // cleanup
    }

    @Test
    public void hasVowels_emptyInput_returnsFalse() {
        // Arrange
        String input = "";
        CheckVowels checkVowels = new CheckVowels();
        Set<Character> mockSet = mock(Set.class);
        when(mockSet.contains('a')).thenReturn(false);
        when(mockSet.contains('e')).thenReturn(false);
        when(mockSet.contains('i')).thenReturn(false);
        when(mockSet.contains('o')).thenReturn(false);
        when(mockSet.contains('u')).thenReturn(false);

        // Act
        boolean result = checkVowels.hasVowels(input);

        // Assert
        verify(mockSet, times(5)).contains('a');
        verify(mockSet, times(5)).contains('e');
        verify(mockSet, times(5)).contains('i');
        verify(mockSet, times(5)).contains('o');
        verify(mockSet, times(5)).contains('u');
        assertFalse(result);
    }

    @Test
    public void hasVowels_nonEmptyInput_returnsTrue() {
        // Arrange
        String input = "hello";
        CheckVowels checkVowels = new CheckVowels();
        Set<Character> mockSet = mock(Set.class);
        when(mockSet.contains('a')).thenReturn(true);
        when(mockSet.contains('e')).thenReturn(true);
        when(mockSet.contains('i')).thenReturn(true);
        when(mockSet.contains('o')).thenReturn(true);
        when(mockSet.contains('u')).thenReturn(true);

        // Act
        boolean result = checkVowels.hasVowels(input);

        // Assert
        verify(mockSet, times(5)).contains('a');
        verify(mockSet, times(5)).contains('e');
        verify(mockSet, times(5)).contains('i');
        verify(mockSet, times(5)).contains('o');
        verify(mockSet, times(5)).contains('u');
        assertTrue(result);
    }
}
```
