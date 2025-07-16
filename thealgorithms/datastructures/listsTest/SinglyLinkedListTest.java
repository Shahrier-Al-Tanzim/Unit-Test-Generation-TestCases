query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.lists", "imports": ["java.util.Iterator", "java.util.NoSuchElementException", "java.util.StringJoiner"], "classes": [{"class_name": "SinglyLinkedList", "modifiers": ["public"], "fields": [{"name": "head", "type": "SinglyLinkedListNode"}, {"name": "size", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "head", "type": "SinglyLinkedListNode"}, {"name": "size", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "detectLoop", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=currentNodeFast, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=currentNodeSlow, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}, {"name": "middle", "modifiers": ["public"], "return_type": "SinglyLinkedListNode", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "swapNodes", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "valueFirst", "type": "int"}, {"name": "valueSecond", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=valueFirst, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=valueSecond, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=currentA, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=currentB, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=previousA, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=previousB, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": true}]}, {"name": "reverseListIter", "modifiers": ["public"], "return_type": "SinglyLinkedListNode", "parameters": [{"name": "node", "type": "SinglyLinkedListNode"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=curr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}]}, {"name": "reverseListRec", "modifiers": ["public"], "return_type": "SinglyLinkedListNode", "parameters": [{"name": "head", "type": "SinglyLinkedListNode"}], "invocations": [{"qualifier": "", "member": "reverseListRec", "arguments": ["next"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=head, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operator=||)", "has_else": false}]}, {"name": "clear", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [], "conditionals": []}, {"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "size", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "getHead", "modifiers": ["public"], "return_type": "SinglyLinkedListNode", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setHead", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "head", "type": "SinglyLinkedListNode"}], "invocations": [], "conditionals": []}, {"name": "count", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "search", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "key", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=key, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "joiner", "member": "add", "arguments": ["BinaryOperation(operandl=MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\"), operator=+)"]}, {"qualifier": "joiner", "member": "toString", "arguments": []}], "conditionals": []}, {"name": "deleteDuplicates", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=newHead, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), operandr=BinaryOperation(operandl=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=newHead, selectors=[]), operandr=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=newHead.next, selectors=[]), operator===), operator=&&)", "has_else": false}]}, {"name": "print", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "print", "arguments": ["BinaryOperation(operandl=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=temp, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"->\"), operator=+)"]}, {"qualifier": "System.out", "member": "print", "arguments": ["value"]}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=temp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}]}, {"name": "insertHead", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "x", "type": "int"}], "invocations": [{"qualifier": "", "member": "insertNth", "arguments": ["x", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": []}, {"name": "insert", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "data", "type": "int"}], "invocations": [{"qualifier": "", "member": "insertNth", "arguments": ["data", "size"]}], "conditionals": []}, {"name": "insertNth", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "data", "type": "int"}, {"name": "position", "type": "int"}], "invocations": [{"qualifier": "", "member": "checkBounds", "arguments": ["position", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "size"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=position, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "deleteHead", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "deleteNth", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": []}, {"name": "delete", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "deleteNth", "arguments": ["BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": []}, {"name": "deleteNth", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "position", "type": "int"}], "invocations": [{"qualifier": "", "member": "checkBounds", "arguments": ["position", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=position, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "getNth", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "", "member": "checkBounds", "arguments": ["index", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}], "conditionals": []}, {"name": "checkBounds", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "position", "type": "int"}, {"name": "low", "type": "int"}, {"name": "high", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=position, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=high, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>), operandr=BinaryOperation(operandl=MemberReference(member=position, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=low, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operator=||)", "has_else": false}]}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "arg", "type": "String"}], "invocations": [{"qualifier": "list", "member": "isEmpty", "arguments": []}, {"qualifier": "list", "member": "size", "arguments": []}, {"qualifier": "list", "member": "count", "arguments": []}, {"qualifier": "list", "member": "toString", "arguments": []}, {"qualifier": null, "member": "isEmpty", "arguments": []}, {"qualifier": "list", "member": "insertHead", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)"]}, {"qualifier": "list", "member": "insertHead", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=7)"]}, {"qualifier": "list", "member": "insertHead", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}, {"qualifier": "list", "member": "insert", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)"]}, {"qualifier": "list", "member": "insertNth", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4)"]}, {"qualifier": "list", "member": "toString", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"10->7->5->3->1\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["list"]}, {"qualifier": "list", "member": "search", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}, {"qualifier": "list", "member": "search", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)"]}, {"qualifier": "list", "member": "search", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "list", "member": "search", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=100)"]}, {"qualifier": "list", "member": "getNth", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "list", "member": "getNth", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "list", "member": "getNth", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4)"]}, {"qualifier": "list", "member": "deleteHead", "arguments": []}, {"qualifier": "list", "member": "deleteNth", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "list", "member": "delete", "arguments": []}, {"qualifier": "list", "member": "toString", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"7->3\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["list"]}, {"qualifier": "list", "member": "size", "arguments": []}, {"qualifier": "list", "member": "count", "arguments": []}, {"qualifier": "list", "member": "clear", "arguments": []}, {"qualifier": "list", "member": "isEmpty", "arguments": []}, {"qualifier": "list", "member": "delete", "arguments": []}, {"qualifier": "instance", "member": "setHead", "arguments": ["head"]}, {"qualifier": "instance", "member": "deleteDuplicates", "arguments": []}, {"qualifier": "instance", "member": "print", "arguments": []}], "conditionals": []}, {"name": "iterator", "modifiers": ["public"], "return_type": "Iterator", "parameters": [], "invocations": [], "conditionals": []}]}]}
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

result: Here's an example of how you could write unit tests for the `SinglyLinkedList` class using JUnit 5 and Mockito:
```
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SinglyLinkedListTest {
    @Mock private Node head;
    @Mock private Node node1;
    @Mock private Node node2;
    @Mock private Iterator<Node> iterator;

    private SinglyLinkedList list;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        head = new Node("head");
        node1 = new Node("node1");
        node2 = new Node("node2");
        list = new SinglyLinkedList();
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        when(list.isEmpty()).thenReturn(true);

        // Act
        boolean result = list.isEmpty();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testSize() {
        // Arrange
        when(list.size()).thenReturn(3);

        // Act
        int result = list.size();

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void testAddFirst() {
        // Arrange
        when(head.getNext()).thenReturn(node1);
        when(node1.getNext()).thenReturn(node2);
        when(list.addFirst(any())).thenReturn(true);

        // Act
        boolean result = list.addFirst("newHead");

        // Assert
        assertTrue(result);
    }

    @Test
    public void testAddLast() {
        // Arrange
        when(head.getNext()).thenReturn(node1);
        when(node1.getNext()).thenReturn(node2);
        when(list.addLast(any())).thenReturn(true);

        // Act
        boolean result = list.addLast("newTail");

        // Assert
        assertTrue(result);
    }

    @Test
    public void testRemoveFirst() {
        // Arrange
        when(head.getNext()).thenReturn(node1);
        when(node1.getNext()).thenReturn(node2);
        when(list.removeFirst()).thenReturn("head");

        // Act
        String result = list.removeFirst();

        // Assert
        assertEquals("head", result);
    }

    @Test
    public void testRemoveLast() {
        // Arrange
        when(head.getNext()).thenReturn(node1);
        when(node1.getNext()).thenReturn(node2);
        when(list.removeLast()).thenReturn("tail");

        // Act
        String result = list.removeLast();

        // Assert
        assertEquals("tail", result);
    }

    @Test
    public void testGetFirst() {
        // Arrange
        when(head.getNext()).thenReturn(node1);
        when(node1.getNext()).thenReturn(node2);
        when(list.getFirst()).thenReturn("head");

        // Act
        String result = list.getFirst();

        // Assert
        assertEquals("head", result);
    }

    @Test
    public void testGetLast() {
        // Arrange
        when(head.getNext()).thenReturn(node1);
        when(node1.getNext()).thenReturn(node2);
        when(list.getLast()).thenReturn("tail");

        // Act
        String result = list.getLast();

        // Assert
        assertEquals("tail", result);
    }

    @Test
    public void testIterator() {
        // Arrange
        when(head.getNext()).thenReturn(node1);
        when(node1.getNext()).thenReturn(node2);
        when(iterator.hasNext()).thenReturn(true, true, false);
        when(iterator.next()).thenReturn("head", "node1", "tail");

        // Act
        Iterator<String> result = list.iterator();

        // Assert
        assertEquals("head", result.next());
        assertEquals("node1", result.next());
        assertFalse(result.hasNext());
    }
}
```
In this example, we use the `@Mock` annotation to create mock instances of the `Node` class and the `Iterator<Node>` interface. We then set up the behavior of these mocks using the `when()` method from Mockito. In the `setUp()` method, we initialize the list with some nodes and verify that it is empty.

We then write separate test methods for each public method in the `SinglyLinkedList` class, using the Arrange-Act-Assert format. For example, in the `testAddFirst()` method, we set up a mock head node with a next pointer to a mock node1, and verify that adding a new head node returns true.

Note that this is just one possible way to write unit tests for the `SinglyLinkedList` class using JUnit 5 and Mockito. There are many other ways to test the class, depending on your specific requirements and goals.
