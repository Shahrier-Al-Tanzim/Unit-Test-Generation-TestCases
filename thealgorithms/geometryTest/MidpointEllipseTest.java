query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.geometry", "imports": ["java.util.ArrayList", "java.util.Collection", "java.util.List"], "classes": [{"class_name": "MidpointEllipse", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "drawEllipse", "modifiers": ["public", "static"], "return_type": "List", "parameters": [{"name": "centerX", "type": "int"}, {"name": "centerY", "type": "int"}, {"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [{"qualifier": "points", "member": "add", "arguments": ["ArrayCreator(dimensions=[None], initializer=ArrayInitializer(initializers=[MemberReference(member=centerX, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=centerY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])]), postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=int))"]}, {"qualifier": "points", "member": "add", "arguments": ["ArrayCreator(dimensions=[None], initializer=ArrayInitializer(initializers=[MemberReference(member=centerX, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])]), postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=int))"]}, {"qualifier": "points", "member": "add", "arguments": ["ArrayCreator(dimensions=[None], initializer=ArrayInitializer(initializers=[MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=centerY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])]), postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=int))"]}, {"qualifier": "", "member": "computeEllipsePoints", "arguments": ["points", "centerX", "centerY", "a", "b"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operandr=BinaryOperation(operandl=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "computeEllipsePoints", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "points", "type": "Collection"}, {"name": "centerX", "type": "int"}, {"name": "centerY", "type": "int"}, {"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [{"qualifier": "", "member": "addEllipsePoints", "arguments": ["points", "centerX", "centerY", "x", "y"]}, {"qualifier": "", "member": "addEllipsePoints", "arguments": ["points", "centerX", "centerY", "x", "y"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=d1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=d2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": true}]}, {"name": "addEllipsePoints", "modifiers": ["static", "private"], "return_type": "void", "parameters": [{"name": "points", "type": "Collection"}, {"name": "centerX", "type": "int"}, {"name": "centerY", "type": "int"}, {"name": "x", "type": "int"}, {"name": "y", "type": "int"}], "invocations": [{"qualifier": "points", "member": "add", "arguments": ["ArrayCreator(dimensions=[None], initializer=ArrayInitializer(initializers=[BinaryOperation(operandl=MemberReference(member=centerX, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), BinaryOperation(operandl=MemberReference(member=centerY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)]), postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=int))"]}, {"qualifier": "points", "member": "add", "arguments": ["ArrayCreator(dimensions=[None], initializer=ArrayInitializer(initializers=[BinaryOperation(operandl=MemberReference(member=centerX, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), BinaryOperation(operandl=MemberReference(member=centerY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)]), postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=int))"]}, {"qualifier": "points", "member": "add", "arguments": ["ArrayCreator(dimensions=[None], initializer=ArrayInitializer(initializers=[BinaryOperation(operandl=MemberReference(member=centerX, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), BinaryOperation(operandl=MemberReference(member=centerY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)]), postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=int))"]}, {"qualifier": "points", "member": "add", "arguments": ["ArrayCreator(dimensions=[None], initializer=ArrayInitializer(initializers=[BinaryOperation(operandl=MemberReference(member=centerX, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), BinaryOperation(operandl=MemberReference(member=centerY, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-)]), postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=int))"]}], "conditionals": []}]}]}
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class MidpointEllipseTest {
    @Mock private Collection<int[]> points;
    private int centerX = 10;
    private int centerY = 20;
    private int a = 5;
    private int b = 3;

    @BeforeEach
    void setUp() {
        // Arrange
        when(points.add(anyInt())).thenReturn(true);
    }

    @Test
    void drawEllipse_validInputs_shouldAddPointsToCollection() {
        // Act
        MidpointEllipse.drawEllipse(centerX, centerY, a, b, points);

        // Assert
        verify(points, times(4)).add(anyInt());
    }
}
```
