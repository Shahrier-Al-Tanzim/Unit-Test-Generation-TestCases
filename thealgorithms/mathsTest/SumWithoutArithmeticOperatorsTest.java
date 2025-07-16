query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "SumWithoutArithmeticOperators", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "getSum", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [{"qualifier": "", "member": "getSum", "arguments": ["sum", "carry"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}]}]}
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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class SumWithoutArithmeticOperatorsTest {
    private SumWithoutArithmeticOperators sum;

    @BeforeEach
    void setUp() {
        sum = new SumWithoutArithmeticOperators();
    }

    @Test
    public void getSum_whenCalledWith2And3_returns5() {
        // Arrange
        int a = 2;
        int b = 3;
        int expectedResult = 5;

        // Act
        int actualResult = sum.getSum(a, b);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
```
