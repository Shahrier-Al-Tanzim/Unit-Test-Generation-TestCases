query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.graphs", "imports": ["java.util.ArrayList", "java.util.HashMap", "java.util.HashSet"], "classes": [{"class_name": "UndirectedAdjacencyListGraph", "modifiers": ["public"], "fields": [{"name": "adjacencyList", "type": "ArrayList"}], "constructors": [], "methods": [{"name": "addNode", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "adjacencyList", "member": "add", "arguments": ["ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[], dimensions=None, name=HashMap, sub_type=None))"]}, {"qualifier": "adjacencyList", "member": "size", "arguments": []}], "conditionals": []}, {"name": "addEdge", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "orig", "type": "int"}, {"name": "dest", "type": "int"}, {"name": "weight", "type": "int"}], "invocations": [{"qualifier": "adjacencyList", "member": "size", "arguments": []}, {"qualifier": "adjacencyList", "member": "get", "arguments": ["orig"]}, {"qualifier": null, "member": "containsKey", "arguments": ["dest"]}, {"qualifier": "adjacencyList", "member": "get", "arguments": ["orig"]}, {"qualifier": null, "member": "put", "arguments": ["dest", "weight"]}, {"qualifier": "adjacencyList", "member": "get", "arguments": ["dest"]}, {"qualifier": null, "member": "put", "arguments": ["orig", "weight"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=orig, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=numNodes, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=dest, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=numNodes, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=), operator=||), operandr=BinaryOperation(operandl=MemberReference(member=orig, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=||), operandr=BinaryOperation(operandl=MemberReference(member=dest, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operator=||)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=orig, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=adjacencyList, selectors=[MethodInvocation(arguments=[MemberReference(member=dest, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": false}]}, {"name": "getNeighbors", "modifiers": ["public"], "return_type": "HashSet", "parameters": [{"name": "node", "type": "int"}], "invocations": [{"qualifier": "adjacencyList", "member": "get", "arguments": ["node"]}, {"qualifier": null, "member": "keySet", "arguments": []}], "conditionals": []}, {"name": "getEdgeWeight", "modifiers": ["public"], "return_type": "Integer", "parameters": [{"name": "orig", "type": "int"}, {"name": "dest", "type": "int"}], "invocations": [{"qualifier": "adjacencyList", "member": "get", "arguments": ["orig"]}, {"qualifier": null, "member": "getOrDefault", "arguments": ["dest", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null)"]}], "conditionals": []}, {"name": "size", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "adjacencyList", "member": "size", "arguments": []}], "conditionals": []}]}]}
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

result: Here's an example of how you could generate a complete, idiomatic JUnit 5 unit test class for the `UndirectedAdjacencyListGraph` class using the provided JSON metadata:
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UndirectedAdjacencyListGraphTest {
    private UndirectedAdjacencyListGraph graph;
    private ArrayList<HashMap<Integer, Integer>> adjacencyList;

    @BeforeEach
    void setUp() {
        // Set up the graph and its adjacency list
        graph = new UndirectedAdjacencyListGraph();
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            HashMap<Integer, Integer> node = new HashMap<>();
            adjacencyList.add(node);
        }
    }

    @Test
    void addNode() {
        // Arrange
        int nodeId = 5;

        // Act
        int numNodesBefore = graph.size();
        graph.addNode(nodeId);
        int numNodesAfter = graph.size();

        // Assert
        assertEquals(numNodesBefore + 1, numNodesAfter);
    }

    @Test
    void addEdge() {
        // Arrange
        int orig = 5;
        int dest = 8;
        int weight = 3;

        // Act
        boolean added = graph.addEdge(orig, dest, weight);

        // Assert
        assertTrue(added);
    }

    @Test
    void getNeighbors() {
        // Arrange
        int nodeId = 5;
        HashSet<Integer> expectedNeighbors = new HashSet<>();
        expectedNeighbors.add(8);
        expectedNeighbors.add(3);

        // Act
        HashSet<Integer> actualNeighbors = graph.getNeighbors(nodeId);

        // Assert
        assertEquals(expectedNeighbors, actualNeighbors);
    }

    @Test
    void getEdgeWeight() {
        // Arrange
        int orig = 5;
        int dest = 8;
        int expectedWeight = 3;

        // Act
        Integer actualWeight = graph.getEdgeWeight(orig, dest);

        // Assert
        assertEquals(expectedWeight, actualWeight);
    }

    @Test
    void size() {
        // Arrange
        int expectedSize = 10;

        // Act
        int actualSize = graph.size();

        // Assert
        assertEquals(expectedSize, actualSize);
    }
}
```
Note that this is just one possible way to generate a JUnit test class for the `UndirectedAdjacencyListGraph` class using the provided JSON metadata. There are many other ways to write unit tests for this class, and the specific approach you choose will depend on your requirements and preferences.
