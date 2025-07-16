query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.lists", "imports": ["java.util.ArrayList", "java.util.Arrays", "java.util.Collections", "java.util.List", "java.util.Objects", "java.util.Random", "java.util.stream.Collectors", "java.util.stream.IntStream"], "classes": [{"class_name": "SkipList", "modifiers": ["public"], "fields": [{"name": "head", "type": "Node"}, {"name": "height", "type": "int"}, {"name": "heightStrategy", "type": "HeightStrategy"}, {"name": "size", "type": "int"}, {"name": "DEFAULT_CAPACITY", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["public"]}, {"parameters": [{"name": "expectedCapacity", "type": "int"}, {"name": "heightStrategy", "type": "HeightStrategy"}], "modifiers": ["public"]}], "methods": [{"name": "add", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "e", "type": "E"}], "invocations": [{"qualifier": "Objects", "member": "requireNonNull", "arguments": ["e"]}, {"qualifier": "current", "member": "next", "arguments": ["layer"]}, {"qualifier": "next", "member": "getValue", "arguments": []}, {"qualifier": null, "member": "compareTo", "arguments": ["e"]}, {"qualifier": "heightStrategy", "member": "nodeHeight", "arguments": ["height"]}, {"qualifier": null, "member": "next", "arguments": ["i"]}, {"qualifier": "node", "member": "setNext", "arguments": ["i", "toFix"]}, {"qualifier": null, "member": "next", "arguments": ["i"]}, {"qualifier": null, "member": "next", "arguments": ["i"]}, {"qualifier": null, "member": "setPrevious", "arguments": ["i", "node"]}, {"qualifier": null, "member": "setNext", "arguments": ["i", "node"]}, {"qualifier": "node", "member": "setPrevious", "arguments": ["i", "toFix"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=next, selectors=[MethodInvocation(arguments=[MemberReference(member=e, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>), operator=||)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=toFix, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=next, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}]}, {"name": "get", "modifiers": ["public"], "return_type": "E", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "current", "member": "next", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": []}, {"name": "remove", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "e", "type": "E"}], "invocations": [{"qualifier": "Objects", "member": "requireNonNull", "arguments": ["e"]}, {"qualifier": "current", "member": "next", "arguments": ["layer"]}, {"qualifier": "e", "member": "equals", "arguments": ["MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[], type_arguments=None)"]}, {"qualifier": "current", "member": "getValue", "arguments": []}, {"qualifier": "next", "member": "getValue", "arguments": []}, {"qualifier": null, "member": "compareTo", "arguments": ["e"]}, {"qualifier": "current", "member": "previous", "arguments": ["i"]}, {"qualifier": null, "member": "setNext", "arguments": ["i", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=next, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[], type_arguments=None)"]}, {"qualifier": "current", "member": "next", "arguments": ["i"]}, {"qualifier": "current", "member": "next", "arguments": ["i"]}, {"qualifier": "current", "member": "next", "arguments": ["i"]}, {"qualifier": null, "member": "setPrevious", "arguments": ["i", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=previous, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[], type_arguments=None)"]}, {"qualifier": "current", "member": "previous", "arguments": ["i"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[], type_arguments=None)], member=equals, postfix_operators=[], prefix_operators=[], qualifier=e, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=next, selectors=[MethodInvocation(arguments=[MemberReference(member=e, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>), operator=||)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=next, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}]}, {"name": "contains", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "e", "type": "E"}], "invocations": [{"qualifier": "Objects", "member": "requireNonNull", "arguments": ["e"]}, {"qualifier": "current", "member": "next", "arguments": ["layer"]}, {"qualifier": "e", "member": "equals", "arguments": ["MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[], type_arguments=None)"]}, {"qualifier": "current", "member": "getValue", "arguments": []}, {"qualifier": "next", "member": "getValue", "arguments": []}, {"qualifier": null, "member": "compareTo", "arguments": ["e"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=current, selectors=[], type_arguments=None)], member=equals, postfix_operators=[], prefix_operators=[], qualifier=e, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=next, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=next, selectors=[MethodInvocation(arguments=[MemberReference(member=e, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>), operator=||)", "has_else": true}]}, {"name": "size", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "layers", "member": "add", "arguments": ["ArrayCreator(dimensions=[MemberReference(member=sizeWithHeader, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], initializer=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=BasicType(dimensions=None, name=boolean))"]}, {"qualifier": "layers", "member": "get", "arguments": ["i"]}, {"qualifier": "current", "member": "next", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "Collections", "member": "reverse", "arguments": ["layers"]}, {"qualifier": "layers", "member": "stream", "arguments": []}, {"qualifier": null, "member": "map", "arguments": ["LambdaExpression(body=[LocalVariableDeclaration(annotations=[], declarators=[VariableDeclarator(dimensions=[], initializer=ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=StringBuilder, sub_type=None)), name=acc)], modifiers=set(), type=ReferenceType(arguments=None, dimensions=[], name=StringBuilder, sub_type=None)), ForStatement(body=BlockStatement(label=None, statements=[IfStatement(condition=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), else_statement=BlockStatement(label=None, statements=[StatementExpression(expression=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"---\")], member=append, postfix_operators=[], prefix_operators=[], qualifier=acc, selectors=[], type_arguments=None), label=None)]), label=None, then_statement=BlockStatement(label=None, statements=[StatementExpression(expression=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"[ ]\")], member=append, postfix_operators=[], prefix_operators=[], qualifier=acc, selectors=[], type_arguments=None), label=None)])), StatementExpression(expression=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")], member=append, postfix_operators=[], prefix_operators=[], qualifier=acc, selectors=[], type_arguments=None), label=None)]), control=EnhancedForControl(iterable=MemberReference(member=layer, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), var=VariableDeclaration(annotations=[], declarators=[VariableDeclarator(dimensions=None, initializer=None, name=b)], modifiers=set(), type=BasicType(dimensions=[], name=boolean))), label=None), ReturnStatement(expression=MethodInvocation(arguments=[], member=toString, postfix_operators=[], prefix_operators=[], qualifier=acc, selectors=[], type_arguments=None), label=None)], parameters=[MemberReference(member=layer, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "acc", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"[ ]\")"]}, {"qualifier": "acc", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"---\")"]}, {"qualifier": "acc", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")"]}, {"qualifier": "acc", "member": "toString", "arguments": []}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\n\")], member=joining, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "joining", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\n\")"]}, {"qualifier": "IntStream", "member": "range", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)", "BinaryOperation(operandl=MemberReference(member=sizeWithHeader, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": null, "member": "mapToObj", "arguments": ["LambdaExpression(body=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%3d\"), MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=format, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None), parameters=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "String", "member": "format", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%3d\")", "i"]}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")], member=joining, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "joining", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")"]}, {"qualifier": "String", "member": "format", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%n H %s%n\")", "positions"]}], "conditionals": [{"condition": "MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": true}]}]}]}
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

result: Here's an example of how you could write unit tests for the `LinkedList` class using JUnit 5 and Mockito:
```
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LinkedListTest {
  @Mock private Iterator<Integer> iterator;
  private LinkedList<Integer> list;

  @BeforeEach
  public void setUp() {
    list = new LinkedList<>();
  }

  @Test
  public void testAddFirst() {
    // Arrange
    when(iterator.hasNext()).thenReturn(true);
    when(iterator.next()).thenReturn(1, 2, 3);

    // Act
    list.addFirst(iterator);

    // Assert
    assertEquals(3, list.size());
    assertTrue(list.contains(1));
    assertTrue(list.contains(2));
    assertTrue(list.contains(3));
  }

  @Test
  public void testAddLast() {
    // Arrange
    when(iterator.hasNext()).thenReturn(true);
    when(iterator.next()).thenReturn(1, 2, 3);

    // Act
    list.addLast(iterator);

    // Assert
    assertEquals(3, list.size());
    assertTrue(list.contains(1));
    assertTrue(list.contains(2));
    assertTrue(list.contains(3));
  }

  @Test
  public void testRemoveFirst() {
    // Arrange
    when(iterator.hasNext()).thenReturn(true);
    when(iterator.next()).thenReturn(1, 2, 3);

    list.addLast(iterator);

    // Act
    Integer first = list.removeFirst();

    // Assert
    assertEquals(Integer.valueOf(1), first);
    assertEquals(2, list.size());
    assertTrue(list.contains(2));
    assertTrue(list.contains(3));
  }

  @Test
  public void testRemoveLast() {
    // Arrange
    when(iterator.hasNext()).thenReturn(true);
    when(iterator.next()).thenReturn(1, 2, 3);

    list.addLast(iterator);

    // Act
    Integer last = list.removeLast();

    // Assert
    assertEquals(Integer.valueOf(3), last);
    assertEquals(2, list.size());
    assertTrue(list.contains(1));
    assertTrue(list.contains(2));
  }
}
```
In this example, we use the `@Mock` annotation to create a mock instance of the `Iterator<Integer>` class and inject it into the `LinkedList` class under test using the `@InjectMocks` annotation. We then set up the behavior of the mock iterator using the `when()` method from Mockito, and verify that the expected methods are called on the iterator in the `addFirst()`, `addLast()`, `removeFirst()`, and `removeLast()` methods.

Note that we use the `@BeforeEach` annotation to create a new instance of the `LinkedList<Integer>` class for each test method, and the `@Test` annotation to define the individual tests. We also use the `@ExtendWith(MockitoExtension.class)` annotation to enable Mockito in our JUnit 5 test class.
