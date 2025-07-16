query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.graphs", "imports": ["java.util.ArrayList", "java.util.List", "java.util.Stack"], "classes": [{"class_name": "Kosaraju", "modifiers": ["public"], "fields": [{"name": "stack", "type": "Stack"}, {"name": "scc", "type": "List"}, {"name": "sccsList", "type": "List"}], "constructors": [], "methods": [{"name": "kosaraju", "modifiers": ["public"], "return_type": "List", "parameters": [{"name": "v", "type": "int"}, {"name": "list", "type": "List"}], "invocations": [{"qualifier": "", "member": "sortEdgesByLowestFinishTime", "arguments": ["v", "list"]}, {"qualifier": "", "member": "createTransposeMatrix", "arguments": ["v", "list"]}, {"qualifier": "", "member": "findStronglyConnectedComponents", "arguments": ["v", "transposeGraph"]}], "conditionals": []}, {"name": "sortEdgesByLowestFinishTime", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "v", "type": "int"}, {"name": "list", "type": "List"}], "invocations": [{"qualifier": "", "member": "dfs", "arguments": ["i", "vis", "list"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=vis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "createTransposeMatrix", "modifiers": ["private"], "return_type": "List", "parameters": [{"name": "v", "type": "int"}, {"name": "list", "type": "List"}], "invocations": [{"qualifier": "transposeGraph", "member": "add", "arguments": ["ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[], dimensions=None, name=ArrayList, sub_type=None))"]}, {"qualifier": "list", "member": "get", "arguments": ["i"]}, {"qualifier": "transposeGraph", "member": "get", "arguments": ["neigh"]}, {"qualifier": null, "member": "add", "arguments": ["i"]}], "conditionals": []}, {"name": "findStronglyConnectedComponents", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "v", "type": "int"}, {"name": "transposeGraph", "type": "List"}], "invocations": [{"qualifier": "stack", "member": "isEmpty", "arguments": []}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "", "member": "dfs2", "arguments": ["node", "vis", "transposeGraph"]}, {"qualifier": "sccsList", "member": "add", "arguments": ["scc"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=vis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=node, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "dfs", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "node", "type": "int"}, {"name": "vis", "type": "int"}, {"name": "list", "type": "List"}], "invocations": [{"qualifier": "list", "member": "get", "arguments": ["node"]}, {"qualifier": "", "member": "dfs", "arguments": ["neighbour", "vis", "list"]}, {"qualifier": "stack", "member": "push", "arguments": ["node"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=vis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=neighbour, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "dfs2", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "node", "type": "int"}, {"name": "vis", "type": "int"}, {"name": "list", "type": "List"}], "invocations": [{"qualifier": "list", "member": "get", "arguments": ["node"]}, {"qualifier": "", "member": "dfs2", "arguments": ["neighbour", "vis", "list"]}, {"qualifier": "scc", "member": "add", "arguments": ["node"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=vis, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=neighbour, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}]}]}
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
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

class KosarajuTest {
    private Stack<Integer> stack = new Stack<>();
    private List<List<Integer>> sccsList = new ArrayList<>();
    private List<Integer> scc = new ArrayList<>();
    private List<Integer> transposeGraph = new ArrayList<>();

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void testKosaraju() {
        int v = 0;
        List<Integer> list = new ArrayList<>();
        kosaraju(v, list);
        verify(stack).isEmpty();
        verify(stack).pop();
        verify(this, times(1)).dfs2(anyInt(), anyInt(), anyList());
        verify(sccsList).add(anyList());
    }

    @Test
    public void testSortEdgesByLowestFinishTime() {
        int v = 0;
        List<Integer> list = new ArrayList<>();
        sortEdgesByLowestFinishTime(v, list);
        verify(this, times(1)).dfs(anyInt(), anyInt(), anyList());
    }

    @Test
    public void testCreateTransposeMatrix() {
        int v = 0;
        List<Integer> list = new ArrayList<>();
        createTransposeMatrix(v, list);
        verify(transposeGraph).add(anyInt(), anyList());
    }

    @Test
    public void testFindStronglyConnectedComponents() {
        int v = 0;
        List<Integer> transposeGraph = new ArrayList<>();
        findStronglyConnectedComponents(v, transposeGraph);
        verify(stack).isEmpty();
        verify(stack).pop();
        verify(this, times(1)).dfs2(anyInt(), anyInt(), anyList());
        verify(sccsList).add(anyList());
    }

    @Test
    public void testDfs() {
        int node = 0;
        int vis = 0;
        List<Integer> list = new ArrayList<>();
        dfs(node, vis, list);
        verify(list).get(anyInt());
        verify(this, times(1)).dfs(anyInt(), anyInt(), anyList());
    }

    @Test
    public void testDfs2() {
        int node = 0;
        int vis = 0;
        List<Integer> list = new ArrayList<>();
        dfs2(node, vis, list);
        verify(list).get(anyInt());
        verify(this, times(1)).dfs2(anyInt(), anyInt(), anyList());
    }
}
```
Note: This is just an example and may not cover all the possible cases.
