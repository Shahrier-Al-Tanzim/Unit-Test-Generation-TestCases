query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": ["java.util.ArrayList", "java.util.Arrays"], "classes": [{"class_name": "MatrixChainMultiplication", "modifiers": ["public", "final"], "fields": [{"name": "m", "type": "int"}, {"name": "s", "type": "int"}, {"name": "p", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "calculateMatrixChainOrder", "modifiers": ["public", "static"], "return_type": "Result", "parameters": [{"name": "matrices", "type": "ArrayList"}], "invocations": [{"qualifier": "matrices", "member": "size", "arguments": []}, {"qualifier": "Arrays", "member": "fill", "arguments": ["m", "Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "Arrays", "member": "fill", "arguments": ["s", "Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "matrices", "member": "get", "arguments": ["i"]}, {"qualifier": null, "member": "col", "arguments": []}, {"qualifier": "matrices", "member": "get", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": null, "member": "row", "arguments": []}, {"qualifier": "", "member": "matrixChainOrder", "arguments": ["size"]}], "conditionals": []}, {"name": "matrixChainOrder", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "size", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=q, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=<)", "has_else": false}]}]}]}
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
package com.thealgorithms.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class MatrixChainMultiplicationTest {
    private MatrixChainMultiplication matrixChainMultiplication;

    @BeforeEach
    public void setUp() {
        matrixChainMultiplication = new MatrixChainMultiplication();
    }

    @Test
    public void testCalculateMatrixChainOrder() {
        // Arrange
        ArrayList<int[]> matrices = new ArrayList<>();
        matrices.add(new int[]{1, 2});
        matrices.add(new int[]{3, 4});
        matrices.add(new int[]{5, 6});

        // Act
        Result result = matrixChainMultiplication.calculateMatrixChainOrder(matrices);

        // Assert
        assertEquals(120, result.getResult());
    }
}
```
Note: This is just an example test class and may need to be modified based on the specific requirements of the project.
