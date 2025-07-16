query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.graphs", "imports": ["java.util.ArrayList"], "classes": [{"class_name": "AdjacencyListGraph", "modifiers": [], "fields": [{"name": "vertices", "type": "ArrayList"}], "constructors": [{"parameters": [], "modifiers": []}], "methods": [{"name": "removeEdge", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "from", "type": "E"}, {"name": "to", "type": "E"}], "invocations": [{"qualifier": "from", "member": "compareTo", "arguments": ["data"]}, {"qualifier": "fromV", "member": "removeAdjacentVertex", "arguments": ["to"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=v, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=from, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=fromV, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "addEdge", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "from", "type": "E"}, {"name": "to", "type": "E"}], "invocations": [{"qualifier": "from", "member": "compareTo", "arguments": ["data"]}, {"qualifier": "to", "member": "compareTo", "arguments": ["data"]}, {"qualifier": "vertices", "member": "add", "arguments": ["fromV"]}, {"qualifier": "vertices", "member": "add", "arguments": ["toV"]}, {"qualifier": "fromV", "member": "addAdjacentVertex", "arguments": ["toV"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=v, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=from, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=data, postfix_operators=[], prefix_operators=[], qualifier=v, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=to, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=fromV, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), operandr=BinaryOperation(operandl=MemberReference(member=toV, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=fromV, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=toV, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Vertex: \")"]}, {"qualifier": "sb", "member": "append", "arguments": ["data"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\n\")"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Adjacent vertices: \")"]}, {"qualifier": "sb", "member": "append", "arguments": ["data"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \")"]}, {"qualifier": "sb", "member": "append", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\\n\")"]}, {"qualifier": "sb", "member": "toString", "arguments": []}], "conditionals": []}]}, {"class_name": "Graphs", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)"]}, {"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=5)"]}, {"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}, {"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)"]}, {"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4)"]}, {"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=4)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "graph", "member": "addEdge", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["graph"]}], "conditionals": []}]}]}
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

result: Here are the generated JUnit 5 unit tests for each of the methods in the JSON array:
```java
package com.thealgorithms.datastructures.graphs;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class AdjacencyListGraphTest {
    private ArrayList<Vertex> vertices;
    private Vertex fromV, toV;

    @BeforeEach
    void setUp() {
        vertices = new ArrayList<>();
        fromV = new Vertex(1);
        toV = new Vertex(2);
    }

    @Test
    public void testRemoveEdge() {
        // Arrange
        vertices.add(fromV);
        vertices.add(toV);
        AdjacencyListGraph graph = new AdjacencyListGraph(vertices);

        // Act
        boolean result = graph.removeEdge(fromV, toV);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testAddEdge() {
        // Arrange
        vertices.add(fromV);
        vertices.add(toV);
        AdjacencyListGraph graph = new AdjacencyListGraph(vertices);

        // Act
        boolean result = graph.addEdge(fromV, toV);

        // Assert
        assertTrue(result);
    }
}
```
```java
package com.thealgorithms.datastructures.graphs;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class GraphsTest {
    private ArrayList<Vertex> vertices;
    private Vertex fromV, toV;

    @BeforeEach
    void setUp() {
        vertices = new ArrayList<>();
        fromV = new Vertex(1);
        toV = new Vertex(2);
    }

    @Test
    public void testMain() {
        // Arrange
        AdjacencyListGraph graph = new AdjacencyListGraph();
        vertices.add(fromV);
        vertices.add(toV);
        graph.addEdge(fromV, toV);
        graph.addEdge(fromV, toV);
        graph.addEdge(fromV, toV);
        graph.addEdge(fromV, toV);
        graph.addEdge(fromV, toV);
        graph.addEdge(fromV, toV);
        System.out.println(graph);
    }
}
```
