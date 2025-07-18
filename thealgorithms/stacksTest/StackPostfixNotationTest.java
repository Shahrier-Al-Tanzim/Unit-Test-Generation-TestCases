query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.stacks", "imports": ["java.util.Scanner", "java.util.Stack", "java.util.function.BiFunction"], "classes": [{"class_name": "StackPostfixNotation", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "getOperator", "modifiers": ["private", "static"], "return_type": "BiFunction", "parameters": [{"name": "operationSymbol", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "performOperation", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "s", "type": "Stack"}, {"name": "operationSymbol", "type": "String"}], "invocations": [{"qualifier": "s", "member": "size", "arguments": []}, {"qualifier": "s", "member": "push", "arguments": ["MethodInvocation(arguments=[MemberReference(member=operationSymbol, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=getOperator, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[MethodInvocation(arguments=[MethodInvocation(arguments=[], member=pop, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), MethodInvocation(arguments=[], member=pop, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)], member=apply, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)"]}, {"qualifier": "", "member": "getOperator", "arguments": ["operationSymbol"]}, {"qualifier": null, "member": "apply", "arguments": ["MethodInvocation(arguments=[], member=pop, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[], member=pop, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)"]}, {"qualifier": "s", "member": "pop", "arguments": []}, {"qualifier": "s", "member": "pop", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2), operator=<)", "has_else": false}]}, {"name": "consumeExpression", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "s", "type": "Stack"}, {"name": "exp", "type": "String"}], "invocations": [{"qualifier": "tokens", "member": "hasNext", "arguments": []}, {"qualifier": "tokens", "member": "hasNextInt", "arguments": []}, {"qualifier": "s", "member": "push", "arguments": ["MethodInvocation(arguments=[], member=nextInt, postfix_operators=[], prefix_operators=[], qualifier=tokens, selectors=[], type_arguments=None)"]}, {"qualifier": "tokens", "member": "nextInt", "arguments": []}, {"qualifier": "", "member": "performOperation", "arguments": ["s", "MethodInvocation(arguments=[], member=next, postfix_operators=[], prefix_operators=[], qualifier=tokens, selectors=[], type_arguments=None)"]}, {"qualifier": "tokens", "member": "next", "arguments": []}, {"qualifier": "tokens", "member": "close", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=hasNextInt, postfix_operators=[], prefix_operators=[], qualifier=tokens, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "postfixEvaluate", "modifiers": ["static", "public"], "return_type": "int", "parameters": [{"name": "exp", "type": "String"}], "invocations": [{"qualifier": "", "member": "consumeExpression", "arguments": ["s", "exp"]}, {"qualifier": "s", "member": "size", "arguments": []}, {"qualifier": "s", "member": "pop", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=!=)", "has_else": false}]}]}]}
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

result: 
Here are the generated JUnit 5 unit tests for each method in the JSON array of method-metadata:
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

class StackPostfixNotationTest {
    private Stack<Integer> s;
    private Scanner scanner;
    private BiFunction<String, String> getOperator;

    @BeforeEach
    void setUp() {
        s = new Stack<>();
        scanner = new Scanner("1 2 +");
        getOperator = (operationSymbol) -> {
            if ("+".equals(operationSymbol)) {
                return (a, b) -> a + b;
            } else if ("-".equals(operationSymbol)) {
                return (a, b) -> a - b;
            } else if ("*".equals(operationSymbol)) {
                return (a, b) -> a * b;
            } else if ("/".equals(operationSymbol)) {
                return (a, b) -> a / b;
            } else {
                throw new IllegalArgumentException("Unsupported operation symbol: " + operationSymbol);
            }
        };
    }

    @Test
    void getOperator_plus() {
        String operationSymbol = "+";
        BiFunction<String, String> operator = getOperator.apply(operationSymbol);
        assertEquals((a, b) -> a + b, operator);
    }

    @Test
    void getOperator_minus() {
        String operationSymbol = "-";
        BiFunction<String, String> operator = getOperator.apply(operationSymbol);
        assertEquals((a, b) -> a - b, operator);
    }

    @Test
    void getOperator_multiply() {
        String operationSymbol = "*";
        BiFunction<String, String> operator = getOperator.apply(operationSymbol);
        assertEquals((a, b) -> a * b, operator);
    }

    @Test
    void getOperator_divide() {
        String operationSymbol = "/";
        BiFunction<String, String> operator = getOperator.apply(operationSymbol);
        assertEquals((a, b) -> a / b, operator);
    }

    @Test
    void performOperation_plus() {
        StackPostfixNotation.performOperation(s, "+");
        verify(s).push(1);
        verify(s).push(2);
        verify(s).pop();
        verify(s).pop();
        assertEquals(3, s.size());
    }

    @Test
    void performOperation_minus() {
        StackPostfixNotation.performOperation(s, "-");
        verify(s).push(1);
        verify(s).push(2);
        verify(s).pop();
        verify(s).pop();
        assertEquals(3, s.size());
    }

    @Test
    void performOperation_multiply() {
        StackPostfixNotation.performOperation(s, "*");
        verify(s).push(1);
        verify(s).push(2);
        verify(s).pop();
        verify(s).pop();
        assertEquals(3, s.size());
    }

    @Test
    void performOperation_divide() {
        StackPostfixNotation.performOperation(s, "/");
        verify(s).push(1);
        verify(s).push(2);
        verify(s).pop();
        verify(s).pop();
        assertEquals(3, s.size());
    }

    @Test
    void consumeExpression_emptyStack() {
        StackPostfixNotation.consumeExpression(s, "");
        verify(s).push(1);
        verify(s).push(2);
        verify(s).pop();
        verify(s).pop();
        assertEquals(3, s.size());
    }

    @Test
    void consumeExpression_nonEmptyStack() {
        StackPostfixNotation.consumeExpression(s, "1 2 +");
        verify(s).push(1);
        verify(s).push(2);
        verify(s).pop();
        verify(s).pop();
        assertEquals(3, s.size());
    }

    @Test
    void postfixEvaluate_emptyStack() {
        int result = StackPostfixNotation.postfixEvaluate("");
        assertEquals(0, result);
    }

    @Test
    void postfixEvaluate_nonEmptyStack() {
        int result = StackPostfixNotation.postfixEvaluate("1 2 +");
        assertEquals(3, result);
    }
}
```
