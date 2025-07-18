query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.searches", "imports": ["com.thealgorithms.devutils.searches.SearchAlgorithm", "java.util.HashSet", "java.util.Random", "java.util.Set"], "classes": [{"class_name": "RandomSearch", "modifiers": ["public"], "fields": [{"name": "random", "type": "Random"}], "constructors": [], "methods": [{"name": "find", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "array", "type": "T"}, {"name": "key", "type": "T"}], "invocations": [{"qualifier": "visitedIndices", "member": "size", "arguments": []}, {"qualifier": "random", "member": "nextInt", "arguments": ["size"]}, {"qualifier": null, "member": "compareTo", "arguments": ["key"]}, {"qualifier": "visitedIndices", "member": "add", "arguments": ["randomIndex"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=array, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=randomIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=key, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}]}]}
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
package com.thealgorithms.searches;

import com.thealgorithms.devutils.searches.SearchAlgorithm;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RandomSearchTest {
    private SearchAlgorithm<Integer> randomSearch;
    private Set<Integer> visitedIndices = new HashSet<>();
    private Random random;

    @BeforeEach
    public void setUp() {
        random = mock(Random.class);
        randomSearch = new RandomSearch(random);
    }

    @Test
    public void find_shouldReturnIndexOfKeyInArray() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        Integer key = 3;
        when(random.nextInt(array.length)).thenReturn(2);

        // Act
        int result = randomSearch.find(array, key);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void find_shouldReturnMinusOneIfKeyIsNotInArray() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        Integer key = 6;
        when(random.nextInt(array.length)).thenReturn(2);

        // Act
        int result = randomSearch.find(array, key);

        // Assert
        assertEquals(-1, result);
    }
}
```
