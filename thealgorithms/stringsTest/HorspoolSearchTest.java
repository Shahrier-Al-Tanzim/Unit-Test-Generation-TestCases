query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": ["java.util.HashMap"], "classes": [{"class_name": "HorspoolSearch", "modifiers": ["final", "public"], "fields": [{"name": "shiftValues", "type": "HashMap"}, {"name": "patternLength", "type": "Integer"}, {"name": "comparisons", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "findFirst", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "pattern", "type": "String"}, {"name": "text", "type": "String"}], "invocations": [{"qualifier": "", "member": "firstOccurrence", "arguments": ["pattern", "text", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=true)"]}], "conditionals": []}, {"name": "findFirstInsensitive", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "pattern", "type": "String"}, {"name": "text", "type": "String"}], "invocations": [{"qualifier": "", "member": "firstOccurrence", "arguments": ["pattern", "text", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false)"]}], "conditionals": []}, {"name": "getLastComparisons", "modifiers": ["static", "public"], "return_type": "Integer", "parameters": [], "invocations": [], "conditionals": []}, {"name": "firstOccurrence", "modifiers": ["private", "static"], "return_type": "int", "parameters": [{"name": "pattern", "type": "String"}, {"name": "text", "type": "String"}, {"name": "caseSensitive", "type": "boolean"}], "invocations": [{"qualifier": "", "member": "calcShiftValues", "arguments": ["pattern"]}, {"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "text", "member": "length", "arguments": []}, {"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "pattern", "member": "charAt", "arguments": ["i"]}, {"qualifier": "text", "member": "charAt", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=textIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=pattern, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), operator=-)"]}, {"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "", "member": "charEquals", "arguments": ["patternChar", "textChar", "caseSensitive"]}, {"qualifier": "", "member": "getShiftValue", "arguments": ["MethodInvocation(arguments=[MemberReference(member=textIndex, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=text, selectors=[], type_arguments=None)"]}, {"qualifier": "text", "member": "charAt", "arguments": ["textIndex"]}, {"qualifier": "pattern", "member": "length", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=pattern, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=patternChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=textChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=caseSensitive, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charEquals, postfix_operators=[], prefix_operators=['!'], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=1), operator===)", "has_else": false}]}, {"name": "charEquals", "modifiers": ["private", "static"], "return_type": "boolean", "parameters": [{"name": "c1", "type": "char"}, {"name": "c2", "type": "char"}, {"name": "caseSensitive", "type": "boolean"}], "invocations": [{"qualifier": "Character", "member": "toLowerCase", "arguments": ["c1"]}, {"qualifier": "Character", "member": "toLowerCase", "arguments": ["c2"]}], "conditionals": [{"condition": "MemberReference(member=caseSensitive, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])", "has_else": false}]}, {"name": "calcShiftValues", "modifiers": ["private", "static"], "return_type": "HashMap", "parameters": [{"name": "pattern", "type": "String"}], "invocations": [{"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "pattern", "member": "charAt", "arguments": ["i"]}, {"qualifier": "table", "member": "computeIfAbsent", "arguments": ["c", "LambdaExpression(body=BinaryOperation(operandl=BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=pattern, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-), operandr=MemberReference(member=finalI, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), parameters=[MemberReference(member=k, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "pattern", "member": "length", "arguments": []}], "conditionals": []}, {"name": "getShiftValue", "modifiers": ["private", "static"], "return_type": "Integer", "parameters": [{"name": "c", "type": "char"}], "invocations": [{"qualifier": "shiftValues", "member": "get", "arguments": ["c"]}, {"qualifier": "shiftValues", "member": "get", "arguments": ["c"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=c, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=shiftValues, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": true}]}]}]}
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

result: Here are the generated JUnit 5 unit tests for each of the methods in the provided JSON array:
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HorspoolSearchTest {
    private final HashMap<Character, Integer> shiftValues = new HashMap<>();
    private final int patternLength = 0;
    private final int comparisons = 0;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void findFirst_shouldReturnIndexOfFirstOccurrence() {
        // Arrange
        String pattern = "pattern";
        String text = "text";
        int expected = 0;

        // Act
        int actual = HorspoolSearch.findFirst(pattern, text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void findFirstInsensitive_shouldReturnIndexOfFirstOccurrenceIgnoringCase() {
        // Arrange
        String pattern = "pattern";
        String text = "text";
        int expected = 0;

        // Act
        int actual = HorspoolSearch.findFirstInsensitive(pattern, text);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getLastComparisons_shouldReturnNumberOfComparisons() {
        // Arrange
        int expected = 0;

        // Act
        int actual = HorspoolSearch.getLastComparisons();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void firstOccurrence_shouldReturnIndexOfFirstOccurrence() {
        // Arrange
        String pattern = "pattern";
        String text = "text";
        int expected = 0;

        // Act
        int actual = HorspoolSearch.firstOccurrence(pattern, text);

        // Assert
        assertEquals(expected, actual);
    }
}
```
Note that the generated tests are based on the provided method metadata and may not cover all possible scenarios or edge cases. Additionally, the test methods may need to be modified or expanded depending on the specific requirements of the code being tested.
