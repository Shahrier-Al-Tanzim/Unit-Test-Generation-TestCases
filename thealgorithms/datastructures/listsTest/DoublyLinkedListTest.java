query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.lists", "imports": [], "classes": [{"class_name": "DoublyLinkedList", "modifiers": ["public", "final"], "fields": [{"name": "head", "type": "Link"}, {"name": "tail", "type": "Link"}, {"name": "linkOperations", "type": "LinkOperations"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "array", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": []}, {"name": "display", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "current", "member": "displayLink", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": []}, {"name": "displayBackwards", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "current", "member": "displayLink", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": []}]}, {"class_name": "Link", "modifiers": [], "fields": [{"name": "value", "type": "int"}, {"name": "next", "type": "Link"}, {"name": "previous", "type": "Link"}], "constructors": [{"parameters": [{"name": "value", "type": "int"}], "modifiers": []}], "methods": [{"name": "displayLink", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "print", "arguments": ["BinaryOperation(operandl=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \"), operator=+)"]}], "conditionals": []}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "linkOperations", "member": "insertHead", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=13)", "myList"]}, {"qualifier": "linkOperations", "member": "insertHead", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=7)", "myList"]}, {"qualifier": "linkOperations", "member": "insertHead", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)", "myList"]}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "myList", "member": "displayBackwards", "arguments": []}, {"qualifier": "linkOperations", "member": "insertTail", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=11)", "myList"]}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "myList", "member": "displayBackwards", "arguments": []}, {"qualifier": "linkOperations", "member": "deleteTail", "arguments": []}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "myList", "member": "displayBackwards", "arguments": []}, {"qualifier": "linkOperations", "member": "delete", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=7)"]}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "myList", "member": "displayBackwards", "arguments": []}, {"qualifier": "linkOperations", "member": "insertOrdered", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=23)", "myList"]}, {"qualifier": "linkOperations", "member": "insertOrdered", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=67)", "myList"]}, {"qualifier": "linkOperations", "member": "insertOrdered", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)", "myList"]}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "linkOperations", "member": "insertElementByIndex", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "myList"]}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "myList", "member": "displayBackwards", "arguments": []}, {"qualifier": "linkOperations", "member": "reverse", "arguments": []}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "linkOperations", "member": "clearList", "arguments": []}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "myList", "member": "displayBackwards", "arguments": []}, {"qualifier": "linkOperations", "member": "insertHead", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=20)", "myList"]}, {"qualifier": "myList", "member": "display", "arguments": []}, {"qualifier": "myList", "member": "displayBackwards", "arguments": []}], "conditionals": []}]}, {"class_name": "LinkOperations", "modifiers": [], "fields": [{"name": "head", "type": "Link"}, {"name": "tail", "type": "Link"}, {"name": "size", "type": "int"}], "constructors": [], "methods": [{"name": "insertHead", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "x", "type": "int"}, {"name": "doublyLinkedList", "type": "DoublyLinkedList"}], "invocations": [{"qualifier": "doublyLinkedList", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=doublyLinkedList, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "insertTail", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "x", "type": "int"}, {"name": "doublyLinkedList", "type": "DoublyLinkedList"}], "invocations": [{"qualifier": "doublyLinkedList", "member": "isEmpty", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=doublyLinkedList, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "insertElementByIndex", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "x", "type": "int"}, {"name": "index", "type": "int"}, {"name": "doublyLinkedList", "type": "DoublyLinkedList"}], "invocations": [{"qualifier": "", "member": "insertHead", "arguments": ["x", "doublyLinkedList"]}, {"qualifier": "", "member": "insertTail", "arguments": ["x", "doublyLinkedList"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=index, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=size, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}]}, {"name": "deleteHead", "modifiers": ["public"], "return_type": "Link", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}]}, {"name": "deleteTail", "modifiers": ["public"], "return_type": "Link", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=tail, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}]}, {"name": "delete", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "x", "type": "int"}], "invocations": [{"qualifier": "", "member": "deleteHead", "arguments": []}, {"qualifier": "", "member": "deleteTail", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=tail, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=tail, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}]}, {"name": "insertOrdered", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "x", "type": "int"}, {"name": "doublyLinkedList", "type": "DoublyLinkedList"}], "invocations": [{"qualifier": "", "member": "insertHead", "arguments": ["x", "doublyLinkedList"]}, {"qualifier": "", "member": "insertTail", "arguments": ["x", "doublyLinkedList"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=current, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}]}, {"name": "deleteNode", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "z", "type": "Link"}], "invocations": [{"qualifier": "", "member": "deleteTail", "arguments": []}, {"qualifier": "", "member": "deleteHead", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=z, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=z, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=head, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}]}, {"name": "removeDuplicates", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "l", "type": "DoublyLinkedList"}], "invocations": [{"qualifier": "", "member": "delete", "arguments": ["value"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=linkOne, selectors=[]), operandr=MemberReference(member=value, postfix_operators=[], prefix_operators=[], qualifier=linkTwo, selectors=[]), operator===)", "has_else": false}]}, {"name": "reverse", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [], "conditionals": []}, {"name": "clearList", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [], "conditionals": []}]}]}
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

result: ```
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.Mock;

public class DoublyLinkedListTest {
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    public void cleanup() {
        // Clean up any resources used by the test
    }

    @Test
    public void testInsertHead() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertHead(value);
        assertEquals(list.head.value, value);
    }

    @Test
    public void testInsertTail() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertTail(value);
        assertEquals(list.tail.value, value);
    }

    @Test
    public void testDeleteHead() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertHead(value);
        list.deleteHead();
        assertEquals(list.head, null);
    }

    @Test
    public void testDeleteTail() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertTail(value);
        list.deleteTail();
        assertEquals(list.tail, null);
    }

    @Test
    public void testDeleteNode() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertHead(value);
        list.deleteNode(list.head);
        assertEquals(list.head, null);
    }

    @Test
    public void testRemoveDuplicates() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertHead(value);
        list.removeDuplicates(list);
        assertEquals(list.head, null);
    }

    @Test
    public void testReverse() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertHead(value);
        list.reverse();
        assertEquals(list.head, null);
    }

    @Test
    public void testClearList() {
        DoublyLinkedList list = new DoublyLinkedList();
        int value = 10;
        list.insertHead(value);
        list.clearList();
        assertEquals(list.head, null);
    }
}
```
