query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.others", "imports": ["java.util.Scanner"], "classes": [{"class_name": "BrianKernighanAlgorithm", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "countSetBits", "modifiers": ["static"], "return_type": "int", "parameters": [{"name": "num", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "sc", "member": "nextInt", "arguments": []}, {"qualifier": "", "member": "countSetBits", "arguments": ["num"]}, {"qualifier": "System.out", "member": "println", "arguments": ["setBitCount"]}, {"qualifier": "sc", "member": "close", "arguments": []}], "conditionals": []}]}]}
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
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class BrianKernighanAlgorithmTest {
    private Scanner sc;

    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void countSetBits_shouldReturnCorrectValueForGivenNumber() {
        // Arrange
        int num = 10;
        BrianKernighanAlgorithm brianKernighanAlgorithm = new BrianKernighanAlgorithm();

        // Act
        int setBitCount = brianKernighanAlgorithm.countSetBits(num);

        // Assert
        assertEquals(2, setBitCount);
    }

    @Test
    public void main_shouldPrintCorrectValueForGivenNumber() {
        // Arrange
        String[] args = new String[0];
        BrianKernighanAlgorithm brianKernighanAlgorithm = new BrianKernighanAlgorithm();
        MockedStatic<Scanner> scMockedStatic = mockStatic(Scanner.class);
        Scanner scMock = mock(Scanner.class);
        when(scMock.nextInt()).thenReturn(10);
        when(scMock.close()).thenReturn();
        scMockedStatic.when(() -> Scanner.open("")).thenReturn(scMock);

        // Act
        brianKernighanAlgorithm.main(args);

        // Assert
        verify(scMock, times(1)).nextInt();
        verify(scMock, times(1)).close();
    }
}
```
