query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.Random"], "classes": [{"class_name": "SortUtilsRandomGenerator", "modifiers": ["final", "public"], "fields": [{"name": "RANDOM", "type": "Random"}, {"name": "SEED", "type": "long"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "generateArray", "modifiers": ["static", "public"], "return_type": "Double", "parameters": [{"name": "size", "type": "int"}], "invocations": [{"qualifier": "", "member": "generateDouble", "arguments": []}], "conditionals": []}, {"name": "generateDouble", "modifiers": ["static", "public"], "return_type": "Double", "parameters": [], "invocations": [{"qualifier": "RANDOM", "member": "nextDouble", "arguments": []}], "conditionals": []}, {"name": "generateInt", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "n", "type": "int"}], "invocations": [{"qualifier": "RANDOM", "member": "nextInt", "arguments": ["n"]}], "conditionals": []}]}]}
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
package com.thealgorithms.sorts;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class SortUtilsRandomGeneratorTest {
    private static final Random RANDOM = new Random();
    private long SEED;
    private SortUtilsRandomGenerator utils;

    @BeforeEach
    void setUp() {
        SEED = 1234567890L;
        utils = new SortUtilsRandomGenerator(SEED);
    }

    @Test
    public void generateArray_sizeIsPositive_returnsDoubleArray() {
        // Arrange
        int size = 10;
        MockedStatic<Random> randomMock = Mockito.mockStatic(Random.class, Mockito.CALLS_REAL_METHODS);
        Random mockRandom = new Random();
        randomMock.when(() -> RANDOM.nextDouble()).thenReturn(1.0);

        // Act
        double[] result = utils.generateArray(size);

        // Assert
        assertEquals(size, result.length);
        assertTrue(result[0] == 1.0);

        randomMock.close();
    }

    @Test
    public void generateDouble_noArgs_returnsRandomDouble() {
        // Arrange
        MockedStatic<Random> randomMock = Mockito.mockStatic(Random.class, Mockito.CALLS_REAL_METHODS);
        Random mockRandom = new Random();
        randomMock.when(() -> RANDOM.nextDouble()).thenReturn(1.0);

        // Act
        double result = utils.generateDouble();

        // Assert
        assertEquals(1.0, result);

        randomMock.close();
    }

    @Test
    public void generateInt_nIsPositive_returnsRandomInt() {
        // Arrange
        int n = 10;
        MockedStatic<Random> randomMock = Mockito.mockStatic(Random.class, Mockito.CALLS_REAL_METHODS);
        Random mockRandom = new Random();
        randomMock.when(() -> RANDOM.nextInt(n)).thenReturn(5);

        // Act
        int result = utils.generateInt(n);

        // Assert
        assertEquals(5, result);

        randomMock.close();
    }
}
```
