query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.trees", "imports": [], "classes": [{"class_name": "LazySegmentTree", "modifiers": ["public"], "fields": [{"name": "root", "type": "Node"}], "constructors": [{"parameters": [{"name": "array", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "buildTree", "modifiers": ["private"], "return_type": "Node", "parameters": [{"name": "array", "type": "int"}, {"name": "start", "type": "int"}, {"name": "end", "type": "int"}], "invocations": [{"qualifier": "", "member": "buildTree", "arguments": ["array", "start", "mid"]}, {"qualifier": "", "member": "buildTree", "arguments": ["array", "mid", "end"]}, {"qualifier": "Node", "member": "merge", "arguments": ["left", "right"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=<)", "has_else": false}]}, {"name": "updateRange", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "left", "type": "int"}, {"name": "right", "type": "int"}, {"name": "diff", "type": "int"}, {"name": "curr", "type": "Node"}], "invocations": [{"qualifier": "curr", "member": "applyUpdate", "arguments": ["diff"]}, {"qualifier": "curr", "member": "shift", "arguments": []}, {"qualifier": "", "member": "updateRange", "arguments": ["left", "right", "diff", "left"]}, {"qualifier": "", "member": "updateRange", "arguments": ["left", "right", "diff", "right"]}, {"qualifier": "Node", "member": "merge", "arguments": ["left", "right"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operator=<=), operandr=BinaryOperation(operandl=MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operandr=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<=), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operator=<=), operator=||)", "has_else": false}]}, {"name": "getRange", "modifiers": ["private"], "return_type": "Node", "parameters": [{"name": "left", "type": "int"}, {"name": "right", "type": "int"}, {"name": "curr", "type": "Node"}], "invocations": [{"qualifier": "curr", "member": "shift", "arguments": []}, {"qualifier": "Node", "member": "merge", "arguments": ["MethodInvocation(arguments=[MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[])], member=getRange, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[])], member=getRange, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "getRange", "arguments": ["left", "right", "left"]}, {"qualifier": "", "member": "getRange", "arguments": ["left", "right", "right"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operator=<=), operandr=BinaryOperation(operandl=MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operandr=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<=), operator=&&)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=left, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=end, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operator=>=), operandr=BinaryOperation(operandl=MemberReference(member=right, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=start, postfix_operators=[], prefix_operators=[], qualifier=curr, selectors=[]), operator=<=), operator=||)", "has_else": false}]}, {"name": "getRange", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "left", "type": "int"}, {"name": "right", "type": "int"}], "invocations": [{"qualifier": "", "member": "getRange", "arguments": ["left", "right", "root"]}, {"qualifier": "result", "member": "getValue", "arguments": []}], "conditionals": []}, {"name": "updateRange", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "left", "type": "int"}, {"name": "right", "type": "int"}, {"name": "diff", "type": "int"}], "invocations": [{"qualifier": "", "member": "updateRange", "arguments": ["left", "right", "diff", "root"]}], "conditionals": []}, {"name": "getRoot", "modifiers": ["public"], "return_type": "Node", "parameters": [], "invocations": [], "conditionals": []}]}]}
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
import static org.mockito.Mockito.*;

class LazySegmentTreeTest {
    private LazySegmentTree lazySegmentTree;
    private int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5};
        lazySegmentTree = new LazySegmentTree(array);
    }

    @AfterEach
    void tearDown() {
        array = null;
        lazySegmentTree = null;
    }

    @Test
    public void testBuildTree() {
        // Arrange
        int start = 0;
        int end = array.length - 1;

        // Act
        Node root = lazySegmentTree.buildTree(array, start, end);

        // Assert
        assertEquals(root.getValue(), array[end]);
    }

    @Test
    public void testUpdateRange() {
        // Arrange
        int left = 0;
        int right = array.length - 1;
        int diff = 2;
        Node curr = lazySegmentTree.getRoot();

        // Act
        lazySegmentTree.updateRange(left, right, diff, curr);

        // Assert
        verify(curr).applyUpdate(diff);
    }

    @Test
    public void testGetRange() {
        // Arrange
        int left = 0;
        int right = array.length - 1;

        // Act
        Node result = lazySegmentTree.getRange(left, right);

        // Assert
        assertEquals(result.getValue(), array[right]);
    }
}
```
