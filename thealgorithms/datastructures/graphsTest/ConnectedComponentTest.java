query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.graphs", "imports": ["java.util.ArrayList", "java.util.HashSet", "java.util.Set"], "classes": [{"class_name": "Graph", "modifiers": [], "fields": [{"name": "edgeList", "type": "ArrayList"}, {"name": "nodeList", "type": "ArrayList"}], "constructors": [{"parameters": [], "modifiers": []}], "methods": [{"name": "addEdge", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "startNode", "type": "E"}, {"name": "endNode", "type": "E"}], "invocations": [{"qualifier": "startNode", "member": "compareTo", "arguments": ["name"]}, {"qualifier": "endNode", "member": "compareTo", "arguments": ["name"]}, {"qualifier": "nodeList", "member": "add", "arguments": ["start"]}, {"qualifier": "nodeList", "member": "add", "arguments": ["end"]}, {"qualifier": "edgeList", "member": "add", "arguments": ["ClassCreator(arguments=[MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=Edge, sub_type=None))"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=name, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=startNode, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=name, postfix_operators=[], prefix_operators=[], qualifier=node, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=endNode, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "countGraphs", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "markedNodes", "member": "add", "arguments": ["n"]}, {"qualifier": "markedNodes", "member": "addAll", "arguments": ["MethodInvocation(arguments=[MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[TypeArgument(pattern_type=None, type=ReferenceType(arguments=None, dimensions=[], name=Node, sub_type=None))], dimensions=None, name=ArrayList, sub_type=None))], member=depthFirstSearch, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "depthFirstSearch", "arguments": ["n", "ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[TypeArgument(pattern_type=None, type=ReferenceType(arguments=None, dimensions=[], name=Node, sub_type=None))], dimensions=None, name=ArrayList, sub_type=None))"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=add, postfix_operators=[], prefix_operators=[], qualifier=markedNodes, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "depthFirstSearch", "modifiers": ["public"], "return_type": "ArrayList", "parameters": [{"name": "n", "type": "Node"}, {"name": "visited", "type": "ArrayList"}], "invocations": [{"qualifier": "visited", "member": "add", "arguments": ["n"]}, {"qualifier": "e.startNode", "member": "equals", "arguments": ["n"]}, {"qualifier": "visited", "member": "contains", "arguments": ["endNode"]}, {"qualifier": "", "member": "depthFirstSearch", "arguments": ["endNode", "visited"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=e.startNode, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=endNode, postfix_operators=[], prefix_operators=[], qualifier=e, selectors=[])], member=contains, postfix_operators=[], prefix_operators=['!'], qualifier=visited, selectors=[], type_arguments=None), operator=&&)", "has_else": false}]}]}, {"class_name": "ConnectedComponent", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='a')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='b')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='a')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='e')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='b')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='e')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='b')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='c')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='c')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='d')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='d')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='a')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='x')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='y')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='x')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='z')"]}, {"qualifier": "graphChars", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='w')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='w')"]}, {"qualifier": "graphInts", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "graphInts", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)"]}, {"qualifier": "graphInts", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4)"]}, {"qualifier": "graphInts", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)"]}, {"qualifier": "graphInts", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=7)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=8)"]}, {"qualifier": "graphInts", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=8)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}, {"qualifier": "graphInts", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=8)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Amount of different char-graphs: \"), operandr=MethodInvocation(arguments=[], member=countGraphs, postfix_operators=[], prefix_operators=[], qualifier=graphChars, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "graphChars", "member": "countGraphs", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Amount of different int-graphs: \"), operandr=MethodInvocation(arguments=[], member=countGraphs, postfix_operators=[], prefix_operators=[], qualifier=graphInts, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "graphInts", "member": "countGraphs", "arguments": []}], "conditionals": []}]}]}
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
import static org.mockito.Mockito.*;

class ConnectedComponentTest {
    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs
    }

    @AfterEach
    void tearDown() {
        // Cleanup
    }

    @Test
    public void testCountGraphs_Chars() {
        // Arrange
        ConnectedComponent graph = new ConnectedComponent();
        when(graph.addEdge("a", "b")).thenReturn(true);
        when(graph.addEdge("a", "e")).thenReturn(true);
        when(graph.addEdge("b", "e")).thenReturn(true);
        when(graph.addEdge("b", "c")).thenReturn(true);
        when(graph.addEdge("c", "d")).thenReturn(true);
        when(graph.addEdge("d", "a")).thenReturn(true);
        when(graph.addEdge("x", "y")).thenReturn(true);
        when(graph.addEdge("x", "z")).thenReturn(true);
        when(graph.addEdge("w", "w")).thenReturn(true);

        // Act
        int result = graph.countGraphs();

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void testCountGraphs_Ints() {
        // Arrange
        ConnectedComponent graph = new ConnectedComponent();
        when(graph.addEdge(1, 2)).thenReturn(true);
        when(graph.addEdge(2, 3)).thenReturn(true);
        when(graph.addEdge(2, 4)).thenReturn(true);
        when(graph.addEdge(3, 5)).thenReturn(true);
        when(graph.addEdge(7, 8)).thenReturn(true);
        when(graph.addEdge(8, 10)).thenReturn(true);
        when(graph.addEdge(10, 8)).thenReturn(true);

        // Act
        int result = graph.countGraphs();

        // Assert
        assertEquals(3, result);
    }
}
```
