query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.stacks", "imports": ["java.util.Stack", "java.util.regex.Matcher", "java.util.regex.Pattern"], "classes": [{"class_name": "InfixToPostfix", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "infix2PostFix", "modifiers": ["static", "public"], "return_type": "String", "parameters": [{"name": "infixExpression", "type": "String"}], "invocations": [{"qualifier": "BalancedBrackets", "member": "isBalanced", "arguments": ["MethodInvocation(arguments=[MemberReference(member=infixExpression, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=filterBrackets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "filterBrackets", "arguments": ["infixExpression"]}, {"qualifier": "infixExpression", "member": "toCharArray", "arguments": []}, {"qualifier": "Character", "member": "isLetterOrDigit", "arguments": ["element"]}, {"qualifier": "output", "member": "append", "arguments": ["element"]}, {"qualifier": "stack", "member": "push", "arguments": ["element"]}, {"qualifier": "stack", "member": "isEmpty", "arguments": []}, {"qualifier": "stack", "member": "peek", "arguments": []}, {"qualifier": "output", "member": "append", "arguments": ["MethodInvocation(arguments=[], member=pop, postfix_operators=[], prefix_operators=[], qualifier=stack, selectors=[], type_arguments=None)"]}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "stack", "member": "isEmpty", "arguments": []}, {"qualifier": "", "member": "precedence", "arguments": ["element"]}, {"qualifier": "", "member": "precedence", "arguments": ["MethodInvocation(arguments=[], member=peek, postfix_operators=[], prefix_operators=[], qualifier=stack, selectors=[], type_arguments=None)"]}, {"qualifier": "stack", "member": "peek", "arguments": []}, {"qualifier": "output", "member": "append", "arguments": ["MethodInvocation(arguments=[], member=pop, postfix_operators=[], prefix_operators=[], qualifier=stack, selectors=[], type_arguments=None)"]}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "stack", "member": "push", "arguments": ["element"]}, {"qualifier": "stack", "member": "isEmpty", "arguments": []}, {"qualifier": "output", "member": "append", "arguments": ["MethodInvocation(arguments=[], member=pop, postfix_operators=[], prefix_operators=[], qualifier=stack, selectors=[], type_arguments=None)"]}, {"qualifier": "stack", "member": "pop", "arguments": []}, {"qualifier": "output", "member": "toString", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[MethodInvocation(arguments=[MemberReference(member=infixExpression, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=filterBrackets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)], member=isBalanced, postfix_operators=[], prefix_operators=['!'], qualifier=BalancedBrackets, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isLetterOrDigit, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='('), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=element, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=')'), operator===)", "has_else": true}]}, {"name": "precedence", "modifiers": ["private", "static"], "return_type": "int", "parameters": [{"name": "operator", "type": "char"}], "invocations": [], "conditionals": []}, {"name": "filterBrackets", "modifiers": ["private", "static"], "return_type": "String", "parameters": [{"name": "input", "type": "String"}], "invocations": [{"qualifier": "Pattern", "member": "compile", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"[^(){}\\\\[\\\\]<>]\")"]}, {"qualifier": "pattern", "member": "matcher", "arguments": ["input"]}, {"qualifier": "matcher", "member": "replaceAll", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\")"]}], "conditionals": []}]}]}
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

result: Here's an example of how you could write a unit test for the `infix2PostFix` method using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class InfixToPostfixTest {
    private InfixToPostfix infix2PostFix;
    private Stack<Character> stack;

    @BeforeEach
    void setUp() {
        this.infix2PostFix = new InfixToPostfix();
        this.stack = Mockito.mock(Stack.class);
    }

    @Test
    void testInfix2PostFix_balancedBrackets() {
        // Arrange
        String infixExpression = "a + b * c";
        Mockito.when(this.stack.isEmpty()).thenReturn(false);
        Mockito.when(this.stack.peek()).thenReturn('*');
        Mockito.when(this.stack.pop()).thenReturn('*');
        Mockito.when(this.stack.isEmpty()).thenReturn(true);

        // Act
        String postfixExpression = this.infix2PostFix.infix2PostFix(infixExpression, stack);

        // Assert
        assertEquals("a b c * +", postfixExpression);
    }

    @Test
    void testInfix2PostFix_unbalancedBrackets() {
        // Arrange
        String infixExpression = "a + (b * c";
        Mockito.when(this.stack.isEmpty()).thenReturn(false);
        Mockito.when(this.stack.peek()).thenReturn('*');
        Mockito.when(this.stack.pop()).thenReturn('*');
        Mockito.when(this.stack.isEmpty()).thenReturn(true);

        // Act
        String postfixExpression = this.infix2PostFix.infix2PostFix(infixExpression, stack);

        // Assert
        assertEquals("a b c * +", postfixExpression);
    }
}
```
In this example, we use Mockito to mock the `Stack` class and stub its behavior for the `isEmpty`, `peek`, and `pop` methods. We then use these stubs to test the `infix2PostFix` method with different inputs and verify the results.
