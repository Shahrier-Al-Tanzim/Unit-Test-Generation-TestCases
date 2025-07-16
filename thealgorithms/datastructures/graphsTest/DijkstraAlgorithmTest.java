query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.graphs", "imports": ["java.util.Arrays"], "classes": [{"class_name": "DijkstraAlgorithm", "modifiers": ["public"], "fields": [{"name": "vertexCount", "type": "int"}], "constructors": [{"parameters": [{"name": "vertexCount", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "run", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "graph", "type": "int"}, {"name": "source", "type": "int"}], "invocations": [{"qualifier": "Arrays", "member": "fill", "arguments": ["distances", "MAX_VALUE"]}, {"qualifier": "Arrays", "member": "fill", "arguments": ["processed", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false)"]}, {"qualifier": "", "member": "getMinDistanceVertex", "arguments": ["distances", "processed"]}, {"qualifier": "", "member": "printDistances", "arguments": ["distances"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=source, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<), operandr=BinaryOperation(operandl=MemberReference(member=source, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=vertexCount, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>=), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=processed, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[ArraySelector(index=MemberReference(member=v, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=BinaryOperation(operandl=MemberReference(member=graph, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=u, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=v, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=!=), operator=&&), operandr=BinaryOperation(operandl=MemberReference(member=distances, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=u, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=MAX_VALUE, postfix_operators=[], prefix_operators=[], qualifier=Integer, selectors=[]), operator=!=), operator=&&), operandr=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=distances, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=u, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=graph, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=u, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=v, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=+), operandr=MemberReference(member=distances, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=v, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=<), operator=&&)", "has_else": false}]}, {"name": "getMinDistanceVertex", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "distances", "type": "int"}, {"name": "processed", "type": "boolean"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=processed, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[ArraySelector(index=MemberReference(member=v, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=BinaryOperation(operandl=MemberReference(member=distances, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=v, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=min, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<=), operator=&&)", "has_else": false}]}, {"name": "printDistances", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "distances", "type": "int"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Vertex \\t Distance\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \\t \"), operator=+), operandr=MemberReference(member=distances, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=+)"]}], "conditionals": []}]}]}
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

result: Here are the generated JUnit 5 unit tests for the given method-metadata:
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class DijkstraAlgorithmTest {
    private DijkstraAlgorithm dijkstraAlgorithm;

    @BeforeEach
    void setUp() {
        dijkstraAlgorithm = new DijkstraAlgorithm(10);
    }

    @Test
    public void run_shouldReturnMinDistanceVertex() {
        // Arrange
        int[] graph = {0, 4, 2, 3, 5, 6, 7, 8, 9};
        int source = 0;
        boolean[] processed = new boolean[10];
        Arrays.fill(processed, false);
        int[] distances = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Arrays.fill(distances, MAX_VALUE);

        // Act
        int minDistanceVertex = dijkstraAlgorithm.run(graph, source);

        // Assert
        assertEquals(0, minDistanceVertex);
    }

    @Test
    public void getMinDistanceVertex_shouldReturnMinDistanceVertex() {
        // Arrange
        boolean[] processed = new boolean[10];
        Arrays.fill(processed, false);
        int[] distances = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Arrays.fill(distances, MAX_VALUE);

        // Act
        int minDistanceVertex = dijkstraAlgorithm.getMinDistanceVertex(distances, processed);

        // Assert
        assertEquals(0, minDistanceVertex);
    }

    @Test
    public void printDistances_shouldPrintDistances() {
        // Arrange
        int[] distances = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};

        // Act
        dijkstraAlgorithm.printDistances(distances);

        // Assert
        verify(System.out).println("Vertex      Distance");
        verify(System.out).println("0           0");
    }
}
```
Note: The above test classes are just examples and may need to be modified based on the specific requirements of your project.
