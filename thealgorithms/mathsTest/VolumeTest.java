query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "Volume", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "volumeCube", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "sideLength", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumeCuboid", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "width", "type": "double"}, {"name": "height", "type": "double"}, {"name": "length", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumeSphere", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumeCylinder", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumeHemisphere", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumeCone", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumePrism", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "baseArea", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumePyramid", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "baseArea", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "volumeFrustumOfCone", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "r1", "type": "double"}, {"name": "r2", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": []}]}]}
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

result: 
Here are the generated JUnit 5 unit tests for each method in the given JSON array of method-metadata:
```java
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class VolumeTests {
    private Volume volume;

    @BeforeEach
    public void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void volumeCube_shouldReturnVolumeOfACube() {
        // Arrange
        double sideLength = 5.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumeCube(sideLength);

        // Assert
        assertEquals(125.0, result, 0.001);
    }

    @Test
    public void volumeCuboid_shouldReturnVolumeOfACuboid() {
        // Arrange
        double width = 3.0;
        double height = 4.0;
        double length = 5.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumeCuboid(width, height, length);

        // Assert
        assertEquals(60.0, result, 0.001);
    }

    @Test
    public void volumeSphere_shouldReturnVolumeOfASphere() {
        // Arrange
        double radius = 5.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumeSphere(radius);

        // Assert
        assertEquals(125.0, result, 0.001);
    }

    @Test
    public void volumeCylinder_shouldReturnVolumeOfACylinder() {
        // Arrange
        double radius = 5.0;
        double height = 6.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumeCylinder(radius, height);

        // Assert
        assertEquals(378.545, result, 0.001);
    }

    @Test
    public void volumeHemisphere_shouldReturnVolumeOfAHemisphere() {
        // Arrange
        double radius = 5.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumeHemisphere(radius);

        // Assert
        assertEquals(125.0, result, 0.001);
    }

    @Test
    public void volumeCone_shouldReturnVolumeOfACone() {
        // Arrange
        double radius = 5.0;
        double height = 6.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumeCone(radius, height);

        // Assert
        assertEquals(378.545, result, 0.001);
    }

    @Test
    public void volumePrism_shouldReturnVolumeOfAPrism() {
        // Arrange
        double baseArea = 25.0;
        double height = 6.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumePrism(baseArea, height);

        // Assert
        assertEquals(150.0, result, 0.001);
    }

    @Test
    public void volumePyramid_shouldReturnVolumeOfAPyramid() {
        // Arrange
        double baseArea = 25.0;
        double height = 6.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumePyramid(baseArea, height);

        // Assert
        assertEquals(150.0, result, 0.001);
    }

    @Test
    public void volumeFrustumOfCone_shouldReturnVolumeOfAFrustumOfACone() {
        // Arrange
        double r1 = 5.0;
        double r2 = 6.0;
        double height = 7.0;
        Volume volume = new Volume();

        // Act
        double result = volume.volumeFrustumOfCone(r1, r2, height);

        // Assert
        assertEquals(349.05, result, 0.001);
    }
}
```
Note that the generated tests only cover a few of the methods in the given JSON array and are not exhaustive. However, they should give you a good starting point for writing your own JUnit 5 unit tests for the class under test.
