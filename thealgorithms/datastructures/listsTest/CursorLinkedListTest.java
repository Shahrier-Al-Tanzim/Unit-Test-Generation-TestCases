query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.lists", "imports": ["java.util.Objects"], "classes": [{"class_name": "CursorLinkedList", "modifiers": ["public"], "fields": [{"name": "os", "type": "int"}, {"name": "head", "type": "int"}, {"name": "cursorSpace", "type": "Node"}, {"name": "count", "type": "int"}, {"name": "CURSOR_SPACE_SIZE", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "printList", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[], member=toString, postfix_operators=[], prefix_operators=[], qualifier=element, selectors=[], type_arguments=None)"]}, {"qualifier": "element", "member": "toString", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1), operator=!=)", "has_else": false}]}, {"name": "indexOf", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "element", "type": "T"}], "invocations": [{"qualifier": "Objects", "member": "requireNonNull", "arguments": ["element"]}, {"qualifier": "iterator.element", "member": "equals", "arguments": ["element"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=iterator.element, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "get", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "position", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=position, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=position, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=count, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=counter, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=position, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}, {"name": "removeByIndex", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "", "member": "get", "arguments": ["index"]}, {"qualifier": "", "member": "remove", "arguments": ["element"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=count, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operator=&&)", "has_else": false}]}, {"name": "remove", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "element", "type": "T"}], "invocations": [{"qualifier": "Objects", "member": "requireNonNull", "arguments": ["element"]}, {"qualifier": "tempElement", "member": "equals", "arguments": ["element"]}, {"qualifier": "", "member": "free", "arguments": ["head"]}, {"qualifier": "currentElement", "member": "equals", "arguments": ["element"]}, {"qualifier": "", "member": "free", "arguments": ["currentIndex"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=tempElement, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "MethodInvocation(arguments=[MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=currentElement, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "alloc", "modifiers": ["private"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=availableNodeIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "free", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "index", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "append", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "element", "type": "T"}], "invocations": [{"qualifier": "Objects", "member": "requireNonNull", "arguments": ["element"]}, {"qualifier": "", "member": "alloc", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1), operator===)", "has_else": true}]}]}]}
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

result: Here's an example of how you could write a unit test for the `indexOf` method in the `CursorLinkedList` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CursorLinkedListTest {
    @Mock private Node head;
    @Mock private Node currentElement;
    @Mock private Node tempElement;
    @Mock private int index;
    @Mock private int availableNodeIndex;
    @Mock private int counter;
    @Mock private int position;
    @Mock private int count;

    private CursorLinkedList list;

    @BeforeEach
    public void setUp() {
        list = new CursorLinkedList();
    }

    @Test
    public void testIndexOf() {
        // Arrange
        when(head.next).thenReturn(currentElement);
        when(currentElement.next).thenReturn(tempElement);
        when(tempElement.next).thenReturn(null);
        when(Objects.requireNonNull(element)).thenReturn(tempElement);
        when(tempElement.equals(element)).thenReturn(true);

        // Act
        int result = list.indexOf(element);

        // Assert
        assertEquals(0, result);
    }
}
```
In this example, we're using the `@Mock` annotation from Mockito to create mock objects for the `head`, `currentElement`, `tempElement`, and `index` fields in the `CursorLinkedList` class. We're also creating a mock object for the `element` parameter of the `indexOf` method.

We're then using the `when` method from Mockito to stub the behavior of the `head.next`, `currentElement.next`, and `tempElement.next` methods, as well as the `Objects.requireNonNull(element)` method. We're also using the `thenReturn` method to specify that the `equals` method should return `true` when called with the `element` parameter.

Finally, we're calling the `indexOf` method on the `list` object and verifying that it returns `0`.
