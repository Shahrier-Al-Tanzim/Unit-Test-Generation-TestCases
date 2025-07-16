query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.stacks", "imports": ["java.util.NoSuchElementException"], "classes": [{"class_name": "StackOfLinkedList", "modifiers": ["final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": []}, {"class_name": "Node", "modifiers": [], "fields": [{"name": "data", "type": "int"}, {"name": "next", "type": "Node"}], "constructors": [{"parameters": [{"name": "data", "type": "int"}], "modifiers": []}], "methods": []}, {"class_name": "LinkedListStack", "modifiers": [], "fields": [{"name": "head", "type": "Node"}, {"name": "size", "type": "int"}], "constructors": [{"parameters": [], "modifiers": []}], "methods": [{"name": "push", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "x", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "pop", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "peek", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "builder", "member": "append", "arguments": ["data"]}, {"qualifier": null, "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"->\")"]}, {"qualifier": "builder", "member": "replace", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=builder, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=-)", "MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=builder, selectors=[], type_arguments=None)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\")"]}, {"qualifier": null, "member": "toString", "arguments": []}, {"qualifier": "builder", "member": "length", "arguments": []}, {"qualifier": "builder", "member": "length", "arguments": []}], "conditionals": []}, {"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "getSize", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "makeEmpty", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [], "conditionals": []}]}]}
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class StackOfLinkedListTest {
    private StackOfLinkedList stack;

    @BeforeEach
    void setUp() {
        stack = new StackOfLinkedList();
    }

    @Test
    public void testPush() {
        // Arrange
        int x = 10;

        // Act
        boolean result = stack.push(x);

        // Assert
        assertTrue(result);
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testPop() {
        // Arrange
        int x = 10;
        Mockito.when(stack.push(x)).thenReturn(true);

        // Act
        int result = stack.pop();

        // Assert
        assertEquals(x, result);
    }

    @Test
    public void testPeek() {
        // Arrange
        int x = 10;
        Mockito.when(stack.push(x)).thenReturn(true);

        // Act
        int result = stack.peek();

        // Assert
        assertEquals(x, result);
    }

    @Test
    public void testToString() {
        // Arrange
        StringBuilder builder = new StringBuilder();
        Mockito.when(builder.append("data")).thenReturn(builder);
        Mockito.when(builder.append("->")).thenReturn(builder);
        Mockito.when(builder.replace(2, 0, "")).thenReturn(builder);
        Mockito.when(builder.length()).thenReturn(10);

        // Act
        String result = stack.toString();

        // Assert
        assertEquals("data->", result);
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        Mockito.when(stack.getSize()).thenReturn(0);

        // Act
        boolean result = stack.isEmpty();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testGetSize() {
        // Arrange
        Mockito.when(stack.getSize()).thenReturn(10);

        // Act
        int result = stack.getSize();

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void testMakeEmpty() {
        // Arrange
        Mockito.when(stack.makeEmpty()).thenReturn(true);

        // Act
        boolean result = stack.makeEmpty();

        // Assert
        assertTrue(result);
    }
}
```
Note that the generated tests are based on the given method-metadata and may not cover all possible scenarios or edge cases.
