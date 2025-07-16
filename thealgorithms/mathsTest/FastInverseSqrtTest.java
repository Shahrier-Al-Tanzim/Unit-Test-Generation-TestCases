query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "FastInverseSqrt", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "inverseSqrt", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "number", "type": "float"}], "invocations": [{"qualifier": "Float", "member": "floatToIntBits", "arguments": ["x"]}, {"qualifier": "Float", "member": "intBitsToFloat", "arguments": ["i"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["number"]}], "conditionals": []}, {"name": "inverseSqrt", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "number", "type": "double"}], "invocations": [{"qualifier": "Double", "member": "doubleToLongBits", "arguments": ["x"]}, {"qualifier": "Double", "member": "longBitsToDouble", "arguments": ["i"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["number"]}], "conditionals": []}]}]}
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

result: Here's a possible solution for the given JSON array of method-metadata for the class under test:
```json
[
  {
    "package": "com.thealgorithms.maths",
    "imports": ["java.lang.Math"],
    "classes": [
      {
        "class_name": "FastInverseSqrt",
        "modifiers": ["public", "final"],
        "fields": [],
        "constructors": [{"parameters": [], "modifiers": ["private"]}],
        "methods": [
          {
            "name": "inverseSqrt",
            "modifiers": ["public", "static"],
            "return_type": "boolean",
            "parameters": [{"name": "number", "type": "float"}],
            "invocations": [
              {"qualifier": "Float", "member": "floatToIntBits", "arguments": ["x"]},
              {"qualifier": "Float", "member": "intBitsToFloat", "arguments": ["i"]},
              {"qualifier": "Math", "member": "sqrt", "arguments": ["number"]}
            ],
            "conditionals": []
          },
          {
            "name": "inverseSqrt",
            "modifiers": ["public", "static"],
            "return_type": "boolean",
            "parameters": [{"name": "number", "type": "double"}],
            "invocations": [
              {"qualifier": "Double", "member": "doubleToLongBits", "arguments": ["x"]},
              {"qualifier": "Double", "member": "longBitsToDouble", "arguments": ["i"]},
              {"qualifier": "Math", "member": "sqrt", "arguments": ["number"]}
            ],
            "conditionals": []
          }
        ]
      }
    ]
  }
]
```
Here's a possible JUnit 5 test class for the `FastInverseSqrt` class:
```java
package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.lang.Math;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FastInverseSqrtTest {
  @Mock private Float floatMock;
  @Mock private Double doubleMock;

  @BeforeEach
  public void setUp() {
    // Set up mocks for the Float and Double classes
    when(floatMock.floatToIntBits(anyFloat())).thenReturn(1);
    when(doubleMock.doubleToLongBits(anyDouble())).thenReturn(1L);
  }

  @Test
  public void testInverseSqrt_float() {
    // Arrange
    float number = 2f;
    FastInverseSqrt fastInverseSqrt = new FastInverseSqrt();

    // Act
    boolean result = fastInverseSqrt.inverseSqrt(number);

    // Assert
    assertTrue(result);
  }

  @Test
  public void testInverseSqrt_double() {
    // Arrange
    double number = 2d;
    FastInverseSqrt fastInverseSqrt = new FastInverseSqrt();

    // Act
    boolean result = fastInverseSqrt.inverseSqrt(number);

    // Assert
    assertTrue(result);
  }
}
```
Note that this is just one possible solution, and there may be other ways to write the test class depending on the specific requirements of the project.
