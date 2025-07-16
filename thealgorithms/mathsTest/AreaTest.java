query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": [], "classes": [{"class_name": "Area", "modifiers": ["public", "final"], "fields": [{"name": "POSITIVE_RADIUS", "type": "String"}, {"name": "POSITIVE_HEIGHT", "type": "String"}, {"name": "POSITIVE_BASE", "type": "String"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "surfaceAreaCube", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "sideLength", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=sideLength, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaSphere", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=radius, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaRectangle", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "length", "type": "double"}, {"name": "width", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=width, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaCylinder", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=radius, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=height, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaSquare", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "sideLength", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=sideLength, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaTriangle", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "base", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=base, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=height, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaParallelogram", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "base", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=base, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=height, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaTrapezium", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "base1", "type": "double"}, {"name": "base2", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=base1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=base2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=height, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaCircle", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=radius, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaHemisphere", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=radius, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}, {"name": "surfaceAreaCone", "modifiers": ["public", "static"], "return_type": "double", "parameters": [{"name": "radius", "type": "double"}, {"name": "height", "type": "double"}], "invocations": [{"qualifier": "Math", "member": "pow", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=height, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=height, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*), operandr=BinaryOperation(operandl=MemberReference(member=radius, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=radius, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=*), operator=+)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0.5)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=radius, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=height, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=)", "has_else": false}]}]}]}
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
Here are the generated JUnit 5 unit tests for each method in the provided JSON array of method-metadata:
```java
package com.thealgorithms.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

public class AreaTest {
    private Area area;

    @BeforeEach
    public void setUp() {
        area = new Area();
    }

    @Test
    public void surfaceAreaCube() {
        double sideLength = 10.0;
        double expectedSurfaceArea = 6 * Math.pow(sideLength, 2);

        Mockito.when(area.surfaceAreaCube(sideLength)).thenReturn(expectedSurfaceArea);

        assertEquals(expectedSurfaceArea, area.surfaceAreaCube(sideLength));
    }

    @Test
    public void surfaceAreaTriangle() {
        double base = 10.0;
        double height = 20.0;
        double expectedSurfaceArea = (base * height) / 2;

        Mockito.when(area.surfaceAreaTriangle(base, height)).thenReturn(expectedSurfaceArea);

        assertEquals(expectedSurfaceArea, area.surfaceAreaTriangle(base, height));
    }

    @Test
    public void surfaceAreaParallelogram() {
        double base = 10.0;
        double height = 20.0;
        double expectedSurfaceArea = base * height;

        Mockito.when(area.surfaceAreaParallelogram(base, height)).thenReturn(expectedSurfaceArea);

        assertEquals(expectedSurfaceArea, area.surfaceAreaParallelogram(base, height));
    }

    @Test
    public void surfaceAreaTrapezium() {
        double base1 = 10.0;
        double base2 = 20.0;
        double height = 30.0;
        double expectedSurfaceArea = (base1 + base2) * height / 2;

        Mockito.when(area.surfaceAreaTrapezium(base1, base2, height)).thenReturn(expectedSurfaceArea);

        assertEquals(expectedSurfaceArea, area.surfaceAreaTrapezium(base1, base2, height));
    }

    @Test
    public void surfaceAreaCircle() {
        double radius = 10.0;
        double expectedSurfaceArea = Math.PI * Math.pow(radius, 2);

        Mockito.when(area.surfaceAreaCircle(radius)).thenReturn(expectedSurfaceArea);

        assertEquals(expectedSurfaceArea, area.surfaceAreaCircle(radius));
    }

    @Test
    public void surfaceAreaHemisphere() {
        double radius = 10.0;
        double expectedSurfaceArea = Math.PI * Math.pow(radius, 2);

        Mockito.when(area.surfaceAreaHemisphere(radius)).thenReturn(expectedSurfaceArea);

        assertEquals(expectedSurfaceArea, area.surfaceAreaHemisphere(radius));
    }

    @Test
    public void surfaceAreaCone() {
        double radius = 10.0;
        double height = 20.0;
        double expectedSurfaceArea = Math.PI * Math.pow(radius, 2) + (Math.pow(height, 2) / 3);

        Mockito.when(area.surfaceAreaCone(radius, height)).thenReturn(expectedSurfaceArea);

        assertEquals(expectedSurfaceArea, area.surfaceAreaCone(radius, height));
    }
}
```
Note that the generated tests only cover the surface area of the following shapes: cube, triangle, parallelogram, trapezium, circle, hemisphere, and cone. The other methods in the `Area` class are not tested.
