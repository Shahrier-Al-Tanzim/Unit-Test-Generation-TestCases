query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": ["java.util.LinkedHashSet", "java.util.Set", "org.apache.commons.lang3.tuple.Pair"], "classes": [{"class_name": "AmicableNumber", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "findAllInRange", "modifiers": ["public", "static"], "return_type": "Set", "parameters": [{"name": "from", "type": "int"}, {"name": "to", "type": "int"}], "invocations": [{"qualifier": "", "member": "isAmicableNumber", "arguments": ["i", "j"]}, {"qualifier": "result", "member": "add", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=of, postfix_operators=[], prefix_operators=[], qualifier=Pair, selectors=[], type_arguments=None)"]}, {"qualifier": "Pair", "member": "of", "arguments": ["i", "j"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=from, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operandr=BinaryOperation(operandl=MemberReference(member=to, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operator=||), operandr=BinaryOperation(operandl=MemberReference(member=to, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=from, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=<), operator=||)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isAmicableNumber, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "isAmicableNumber", "modifiers": ["public", "static"], "return_type": "boolean", "parameters": [{"name": "a", "type": "int"}, {"name": "b", "type": "int"}], "invocations": [{"qualifier": "", "member": "sumOfDividers", "arguments": ["a", "a"]}, {"qualifier": "", "member": "sumOfDividers", "arguments": ["b", "b"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=a, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operandr=BinaryOperation(operandl=MemberReference(member=b, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<=), operator=||)", "has_else": false}]}, {"name": "sumOfDividers", "modifiers": ["static", "private"], "return_type": "int", "parameters": [{"name": "number", "type": "int"}, {"name": "divisor", "type": "int"}], "invocations": [{"qualifier": "", "member": "sumOfDividers", "arguments": ["number", "divisor"]}, {"qualifier": "", "member": "sumOfDividers", "arguments": ["number", "divisor"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=divisor, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=number, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=divisor, postfix_operators=[], prefix_operators=['--'], qualifier=, selectors=[]), operator=%), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}]}]}]}
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
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import com.thealgorithms.maths.AmicableNumber;

class AmicableNumberTest {
    private AmicableNumber amicableNumber;

    @BeforeEach
    void setUp() {
        amicableNumber = new AmicableNumber();
    }

    @Test
    public void findAllInRange_fromTo_shouldReturnSetOfAmicableNumbers() {
        // Arrange
        int from = 1;
        int to = 20;
        Set<Integer> expectedResult = new LinkedHashSet<>();
        for (int i = from; i <= to; i++) {
            if (amicableNumber.isAmicableNumber(i, i)) {
                expectedResult.add(i);
            }
        }

        // Act
        Set<Integer> result = amicableNumber.findAllInRange(from, to);

        // Assert
        assertEquals(expectedResult, result);
    }
}
```
Note: This is just an example and may need to be modified based on the specific requirements of the class under test.
