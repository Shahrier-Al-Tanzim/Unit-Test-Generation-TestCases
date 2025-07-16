query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.lineclipping", "imports": ["com.thealgorithms.lineclipping.utils.Line", "com.thealgorithms.lineclipping.utils.Point"], "classes": [{"class_name": "CohenSutherland", "modifiers": ["public"], "fields": [{"name": "INSIDE", "type": "int"}, {"name": "LEFT", "type": "int"}, {"name": "RIGHT", "type": "int"}, {"name": "BOTTOM", "type": "int"}, {"name": "TOP", "type": "int"}, {"name": "xMin", "type": "double"}, {"name": "yMin", "type": "double"}, {"name": "xMax", "type": "double"}, {"name": "yMax", "type": "double"}], "constructors": [{"parameters": [{"name": "xMin", "type": "double"}, {"name": "yMin", "type": "double"}, {"name": "xMax", "type": "double"}, {"name": "yMax", "type": "double"}], "modifiers": ["public"]}], "methods": [{"name": "computeCode", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "x", "type": "double"}, {"name": "y", "type": "double"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=xMin, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=x, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=xMax, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=yMin, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=y, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=yMax, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": false}]}, {"name": "cohenSutherlandClip", "modifiers": ["public"], "return_type": "Line", "parameters": [{"name": "line", "type": "Line"}], "invocations": [{"qualifier": "", "member": "computeCode", "arguments": ["x1", "y1"]}, {"qualifier": "", "member": "computeCode", "arguments": ["x2", "y2"]}, {"qualifier": "", "member": "computeCode", "arguments": ["x1", "y1"]}, {"qualifier": "", "member": "computeCode", "arguments": ["x2", "y2"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=code1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operandr=BinaryOperation(operandl=MemberReference(member=code2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===), operator=&&)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=code1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=code2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=&), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=!=)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=codeOut, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=TOP, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=&), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=!=)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=codeOut, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=BOTTOM, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=&), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=!=)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=codeOut, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=RIGHT, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=&), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=!=)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=codeOut, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=LEFT, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=&), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=!=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=codeOut, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=code1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}, {"condition": "MemberReference(member=accept, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": true}]}]}]}
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

import com.thealgorithms.lineclipping.utils.Line;
import com.thealgorithms.lineclipping.utils.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CohenSutherlandTest {
    @Mock private Line line;
    @Mock private Point point1, point2;

    private CohenSutherland cohenSutherland;

    @BeforeEach
    void setUp() {
        cohenSutherland = new CohenSutherland(0.0, 0.0, 1.0, 1.0);
    }

    @Test
    void computeCode_xInside() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(INSIDE, code);
    }

    @Test
    void computeCode_xOutside() {
        when(point1.getX()).thenReturn(-0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT, code);
    }

    @Test
    void computeCode_yOutside() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(-0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(BOTTOM, code);
    }

    @Test
    void computeCode_xEqual() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(INSIDE, code);
    }

    @Test
    void computeCode_yEqual() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(INSIDE, code);
    }

    @Test
    void computeCode_xEqualYOutside() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(-0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(BOTTOM, code);
    }

    @Test
    void computeCode_xOutsideYEqual() {
        when(point1.getX()).thenReturn(-0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT, code);
    }

    @Test
    void computeCode_xOutsideYOutside() {
        when(point1.getX()).thenReturn(-0.5);
        when(point2.getY()).thenReturn(-0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }

    @Test
    void computeCode_xOutsideYEqualXOutside() {
        when(point1.getX()).thenReturn(-0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }

    @Test
    void computeCode_xEqualYOutsideXOutside() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(-0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }

    @Test
    void computeCode_xOutsideYEqualXOutside() {
        when(point1.getX()).thenReturn(-0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }

    @Test
    void computeCode_xOutsideYEqualXEqual() {
        when(point1.getX()).thenReturn(-0.5);
        when(point2.getY()).thenReturn(0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }

    @Test
    void computeCode_xEqualYOutsideXEqual() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(-0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }

    @Test
    void computeCode_xEqualYEqualXOutside() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(-0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }

    @Test
    void computeCode_xEqualYEqualXEqual() {
        when(point1.getX()).thenReturn(0.5);
        when(point2.getY()).thenReturn(-0.5);
        int code = cohenSutherland.computeCode(point1, point2);
        assertEquals(LEFT | BOTTOM, code);
    }
}
```
