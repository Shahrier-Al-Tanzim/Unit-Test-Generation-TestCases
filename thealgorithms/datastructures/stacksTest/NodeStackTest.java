query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.stacks", "imports": [], "classes": [{"class_name": "NodeStack", "modifiers": ["public"], "fields": [{"name": "head", "type": "Node"}, {"name": "size", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "push", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "item", "type": "Item"}], "invocations": [], "conditionals": []}, {"name": "pop", "modifiers": ["public"], "return_type": "Item", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "peek", "modifiers": ["public"], "return_type": "Item", "parameters": [], "invocations": [{"qualifier": "", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "size", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}]}]}
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

result: Here's a possible solution for each method in the JSON array:

1. `push(Item item)`
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NodeStackTest {
    private NodeStack stack;
    private Item item;

    @BeforeEach
    void setUp() {
        stack = new NodeStack();
        item = Mockito.mock(Item.class);
    }

    @Test
    void push_shouldAddItemToTheTopOfTheStack() {
        // Arrange
        int initialSize = stack.size();

        // Act
        stack.push(item);

        // Assert
        assertEquals(initialSize + 1, stack.size());
        assertSame(item, stack.peek());
    }
}
```
2. `pop()`
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NodeStackTest {
    private NodeStack stack;
    private Item item;

    @BeforeEach
    void setUp() {
        stack = new NodeStack();
        item = Mockito.mock(Item.class);
    }

    @Test
    void pop_shouldRemoveTheTopItemFromTheStackAndReturnIt() {
        // Arrange
        int initialSize = stack.size();
        stack.push(item);

        // Act
        Item result = stack.pop();

        // Assert
        assertEquals(initialSize - 1, stack.size());
        assertSame(item, result);
    }
}
```
3. `peek()`
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NodeStackTest {
    private NodeStack stack;
    private Item item;

    @BeforeEach
    void setUp() {
        stack = new NodeStack();
        item = Mockito.mock(Item.class);
    }

    @Test
    void peek_shouldReturnTheTopItemOfTheStackWithoutRemovingIt() {
        // Arrange
        int initialSize = stack.size();
        stack.push(item);

        // Act
        Item result = stack.peek();

        // Assert
        assertEquals(initialSize, stack.size());
        assertSame(item, result);
    }
}
```
4. `isEmpty()`
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NodeStackTest {
    private NodeStack stack;
    private Item item;

    @BeforeEach
    void setUp() {
        stack = new NodeStack();
        item = Mockito.mock(Item.class);
    }

    @Test
    void isEmpty_shouldReturnTrueIfTheStackIsEmpty() {
        // Arrange
        int initialSize = stack.size();

        // Act
        boolean result = stack.isEmpty();

        // Assert
        assertEquals(initialSize, 0);
        assertTrue(result);
    }
}
```
5. `size()`
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NodeStackTest {
    private NodeStack stack;
    private Item item;

    @BeforeEach
    void setUp() {
        stack = new NodeStack();
        item = Mockito.mock(Item.class);
    }

    @Test
    void size_shouldReturnTheNumberOfItemsInTheStack() {
        // Arrange
        int initialSize = stack.size();
        stack.push(item);

        // Act
        int result = stack.size();

        // Assert
        assertEquals(initialSize + 1, result);
    }
}
```
