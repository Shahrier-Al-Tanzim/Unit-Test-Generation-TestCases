query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.graphs", "imports": ["java.util.ArrayList", "java.util.Scanner"], "classes": [{"class_name": "Cycle", "modifiers": [], "fields": [{"name": "nodes", "type": "int"}, {"name": "adjacencyMatrix", "type": "int"}, {"name": "visited", "type": "boolean"}, {"name": "cycles", "type": "ArrayList"}], "constructors": [{"parameters": [], "modifiers": []}], "methods": [{"name": "start", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "dfs", "arguments": ["i", "i", "temp"]}], "conditionals": []}, {"name": "dfs", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "start", "type": "Integer"}, {"name": "curr", "type": "Integer"}, {"name": "temp", "type": "ArrayList"}], "invocations": [{"qualifier": "temp", "member": "add", "arguments": ["curr"]}, {"qualifier": "cycles", "member": "add", "arguments": ["ClassCreator(arguments=[MemberReference(member=temp, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[TypeArgument(pattern_type=None, type=ReferenceType(arguments=None, dimensions=[], name=Integer, sub_type=None))], dimensions=None, name=ArrayList, sub_type=None))"]}, {"qualifier": "", "member": "dfs", "arguments": ["start", "i", "temp"]}, {"qualifier": "temp", "member": "size", "arguments": []}, {"qualifier": "temp", "member": "remove", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=temp, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "temp", "member": "size", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=adjacencyMatrix, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=curr, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}, {"condition": "MemberReference(member=visited, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=temp, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}, {"name": "printAll", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "cycles", "member": "size", "arguments": []}, {"qualifier": "cycles", "member": "get", "arguments": ["i"]}, {"qualifier": null, "member": "size", "arguments": []}, {"qualifier": "System.out", "member": "print", "arguments": ["BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=cycles, selectors=[MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" -> \"), operator=+)"]}, {"qualifier": "cycles", "member": "get", "arguments": ["i"]}, {"qualifier": null, "member": "get", "arguments": ["j"]}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=cycles, selectors=[MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=get, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)"]}, {"qualifier": "cycles", "member": "get", "arguments": ["i"]}, {"qualifier": null, "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": []}]}, {"class_name": "Cycles", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "c", "member": "start", "arguments": []}, {"qualifier": "c", "member": "printAll", "arguments": []}], "conditionals": []}]}]}
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
import org.mockito.Mockito;

import java.util.ArrayList;

class Cycle {
    private int nodes;
    private int adjacencyMatrix[];
    private boolean visited[];
    private ArrayList<Integer> cycles = new ArrayList<>();

    public void start() {
        for (int i = 0; i < this.nodes; i++) {
            dfs(i, i, new ArrayList<>());
        }
    }

    private void dfs(int start, int curr, ArrayList<Integer> temp) {
        temp.add(curr);
        cycles.add(ClassCreator(arguments = [MemberReference(member = temp, postfix_operators = [], prefix_operators = [], qualifier = , selectors = [])], body = None, constructor_type_arguments = None, postfix_operators = [], prefix_operators = [], qualifier = None, selectors = [], type = ReferenceType(arguments = [TypeArgument(pattern_type = None, type = ReferenceType(arguments = None, dimensions = [], name = Integer, sub_type = None))], dimensions = None, name = ArrayList, sub_type = None)))
        if (start == curr) {
            cycles.add(ClassCreator(arguments = [MemberReference(member = temp, postfix_operators = [], prefix_operators = [], qualifier = , selectors = [])], body = None, constructor_type_arguments = None, postfix_operators = [], prefix_operators = [], qualifier = None, selectors = [], type = ReferenceType(arguments = [TypeArgument(pattern_type = None, type = ReferenceType(arguments = None, dimensions = [], name = Integer, sub_type = None))], dimensions = None, name = ArrayList, sub_type = None)))
        }
        if (visited[i]) {
            cycles.add(ClassCreator(arguments = [MemberReference(member = temp, postfix_operators = [], prefix_operators = [], qualifier = , selectors = [])], body = None, constructor_type_arguments = None, postfix_operators = [], prefix_operators = [], qualifier = None, selectors = [], type = ReferenceType(arguments = [TypeArgument(pattern_type = None, type = ReferenceType(arguments = None, dimensions = [], name = Integer, sub_type = None))], dimensions = None, name = ArrayList, sub_type = None)))
        }
    }

    public void printAll() {
        System.out.println(cycles.size());
        for (int i = 0; i < cycles.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < cycles.get(i).size(); j++) {
                System.out.print(cycles.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Cycles {
    public static void main(String[] args) {
        Cycle c = new Cycle();
        c.start();
        c.printAll();
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

class CycleTest {
    private Cycle cycle;

    @BeforeEach
    public void setUp() {
        this.cycle = new Cycle();
    }

    @Test
    public void testStart() {
        // Arrange
        Mockito.when(this.cycle.dfs(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyList())).thenReturn(null);

        // Act
        this.cycle.start();

        // Assert
        Mockito.verify(this.cycle, Mockito.times(1)).dfs(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyList());
    }

    @Test
    public void testPrintAll() {
        // Arrange
        ArrayList<Integer> cycles = new ArrayList<>();
        cycles.add(0);
        cycles.add(1);
        cycles.add(2);
        Mockito.when(this.cycle.cycles).thenReturn(cycles);

        // Act
        this.cycle.printAll();

        // Assert
        Mockito.verify(this.cycle, Mockito.times(1)).cycles;
    }
}
```
