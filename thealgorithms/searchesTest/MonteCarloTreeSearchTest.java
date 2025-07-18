query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.searches", "imports": ["java.util.ArrayList", "java.util.Collections", "java.util.Comparator", "java.util.Random"], "classes": [{"class_name": "MonteCarloTreeSearch", "modifiers": ["public"], "fields": [{"name": "WIN_SCORE", "type": "int"}, {"name": "TIME_LIMIT", "type": "int"}], "constructors": [], "methods": [{"name": "monteCarloTreeSearch", "modifiers": ["public"], "return_type": "Node", "parameters": [{"name": "rootNode", "type": "Node"}], "invocations": [{"qualifier": "", "member": "addChildNodes", "arguments": ["rootNode", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}, {"qualifier": "System", "member": "currentTimeMillis", "arguments": []}, {"qualifier": "System", "member": "currentTimeMillis", "arguments": []}, {"qualifier": "", "member": "getPromisingNode", "arguments": ["rootNode"]}, {"qualifier": "promisingNode.childNodes", "member": "size", "arguments": []}, {"qualifier": "", "member": "addChildNodes", "arguments": ["promisingNode", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=10)"]}, {"qualifier": "", "member": "simulateRandomPlay", "arguments": ["promisingNode"]}, {"qualifier": "", "member": "getWinnerNode", "arguments": ["rootNode"]}, {"qualifier": "", "member": "printScores", "arguments": ["rootNode"]}, {"qualifier": "System.out", "member": "format", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%nThe optimal node is: %02d%n\")", "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=winnerNode, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=indexOf, postfix_operators=[], prefix_operators=[], qualifier=rootNode.childNodes, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "rootNode.childNodes", "member": "indexOf", "arguments": ["winnerNode"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=promisingNode.childNodes, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "addChildNodes", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "node", "type": "Node"}, {"name": "childCount", "type": "int"}], "invocations": [{"qualifier": "node.childNodes", "member": "add", "arguments": ["ClassCreator(arguments=[MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=isPlayersTurn, postfix_operators=[], prefix_operators=['!'], qualifier=node, selectors=[])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=Node, sub_type=None))"]}], "conditionals": []}, {"name": "getPromisingNode", "modifiers": ["public"], "return_type": "Node", "parameters": [{"name": "rootNode", "type": "Node"}], "invocations": [{"qualifier": "promisingNode.childNodes", "member": "size", "arguments": []}, {"qualifier": "promisingNode.childNodes", "member": "size", "arguments": []}, {"qualifier": "promisingNode.childNodes", "member": "get", "arguments": ["i"]}, {"qualifier": "Math", "member": "sqrt", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=visitCount, postfix_operators=[], prefix_operators=[], qualifier=promisingNode, selectors=[])], member=log, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None), operandr=Cast(expression=MemberReference(member=visitCount, postfix_operators=[], prefix_operators=[], qualifier=childNode, selectors=[]), type=BasicType(dimensions=[], name=double)), operator=/)"]}, {"qualifier": "Math", "member": "log", "arguments": ["visitCount"]}, {"qualifier": "promisingNode.childNodes", "member": "get", "arguments": ["nodeIndex"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=visitCount, postfix_operators=[], prefix_operators=[], qualifier=childNode, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=uctTemp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=uctIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=>)", "has_else": false}]}, {"name": "simulateRandomPlay", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "promisingNode", "type": "Node"}], "invocations": [{"qualifier": "rand", "member": "nextInt", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=6)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=isPlayersTurn, postfix_operators=[], prefix_operators=[], qualifier=tempNode, selectors=[]), operandr=MemberReference(member=isPlayerWinner, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=&&), operandr=BinaryOperation(operandl=MemberReference(member=isPlayersTurn, postfix_operators=[], prefix_operators=['!'], qualifier=tempNode, selectors=[]), operandr=MemberReference(member=isPlayerWinner, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[]), operator=&&), operator=||)", "has_else": false}]}, {"name": "getWinnerNode", "modifiers": ["public"], "return_type": "Node", "parameters": [{"name": "rootNode", "type": "Node"}], "invocations": [{"qualifier": "Collections", "member": "max", "arguments": ["childNodes", "MethodInvocation(arguments=[LambdaExpression(body=MemberReference(member=score, postfix_operators=[], prefix_operators=[], qualifier=c, selectors=[]), parameters=[MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])], member=comparing, postfix_operators=[], prefix_operators=[], qualifier=Comparator, selectors=[], type_arguments=None)"]}, {"qualifier": "Comparator", "member": "comparing", "arguments": ["LambdaExpression(body=MemberReference(member=score, postfix_operators=[], prefix_operators=[], qualifier=c, selectors=[]), parameters=[MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}], "conditionals": []}, {"name": "printScores", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "rootNode", "type": "Node"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"N.\\tScore\\t\\tVisits\")"]}, {"qualifier": "rootNode.childNodes", "member": "size", "arguments": []}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%02d\\t%d\\t\\t%d%n\")", "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=rootNode.childNodes, selectors=[MemberReference(member=score, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None)], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=rootNode.childNodes, selectors=[MemberReference(member=visitCount, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None)], type_arguments=None)"]}, {"qualifier": "rootNode.childNodes", "member": "get", "arguments": ["i"]}, {"qualifier": "rootNode.childNodes", "member": "get", "arguments": ["i"]}], "conditionals": []}]}]}
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

result: ```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class MonteCarloTreeSearchTest {
    private Node rootNode;
    private Node promisingNode;
    private Node winnerNode;
    private Random rand;

    @BeforeEach
    void setUp() {
        rootNode = new Node();
        promisingNode = new Node();
        winnerNode = new Node();
        rand = mock(Random.class);
    }

    @Test
    public void testMonteCarloTreeSearch() {
        when(rand.nextInt(6)).thenReturn(10);
        when(rootNode.addChildNodes(any())).thenReturn(promisingNode);
        when(promisingNode.get(anyInt())).thenReturn(winnerNode);
        when(Math.sqrt(anyDouble())).thenReturn(visitCount);
        when(Math.log(anyDouble())).thenReturn(uctTemp);
        when(uctIndex).thenReturn(nodeIndex);

        simulateRandomPlay(promisingNode);

        verify(rand, times(1)).nextInt(6);
        verify(rootNode, times(1)).addChildNodes(any());
        verify(promisingNode, times(1)).get(anyInt());
        verify(Math, times(1)).sqrt(visitCount);
        verify(Math, times(1)).log(visitCount);
        verify(promisingNode, times(1)).get(nodeIndex);
    }
}
```
Note: This is just one possible way to write the test case. The actual implementation may vary depending on the specific requirements of the project.
