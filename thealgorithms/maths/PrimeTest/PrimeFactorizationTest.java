query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths.Prime", "imports": ["java.util.ArrayList", "java.util.List"], "classes": [{"class_name": "PrimeFactorization", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "pfactors", "modifiers": ["public", "static"], "return_type": "List", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "primeFactors", "member": "add", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["n"]}, {"qualifier": "primeFactors", "member": "add", "arguments": ["i"]}, {"qualifier": "primeFactors", "member": "add", "arguments": ["n"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=>)", "has_else": false}]}]}]}
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
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PrimeFactorizationTest {
    private static final int N = 10;
    private List<Integer> primeFactors;

    @BeforeEach
    void setUp() {
        primeFactors = new ArrayList<>();
    }

    @Test
    public void testPfactors_whenNIs2() {
        // Arrange
        Mockito.when(primeFactors.add(Mockito.anyInt())).thenReturn(true);
        Mockito.when(Math.sqrt(N)).thenReturn(1);
        Mockito.doNothing().when(primeFactors).add(2);
        Mockito.doNothing().when(primeFactors).add(N);

        // Act
        PrimeFactorization.pfactors(N);

        // Assert
        verify(primeFactors, times(1)).add(2);
        verify(primeFactors, times(1)).add(N);
    }

    @Test
    public void testPfactors_whenNIsGreaterThan2() {
        // Arrange
        Mockito.when(primeFactors.add(Mockito.anyInt())).thenReturn(true);
        Mockito.when(Math.sqrt(N)).thenReturn(10);
        for (int i = 3; i <= N / 2; i += 2) {
            Mockito.doNothing().when(primeFactors).add(i);
        }
        Mockito.doNothing().when(primeFactors).add(N);

        // Act
        PrimeFactorization.pfactors(N);

        // Assert
        verify(primeFactors, times(1)).add(3);
        verify(primeFactors, times(1)).add(5);
        verify(primeFactors, times(1)).add(7);
        verify(primeFactors, times(1)).add(N);
    }
}
```
