query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": ["java.util.Scanner"], "classes": [{"class_name": "RabinKarp", "modifiers": ["final", "public"], "fields": [{"name": "scanner", "type": "Scanner"}, {"name": "ALPHABET_SIZE", "type": "int"}], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter String\")"]}, {"qualifier": "scanner", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter pattern\")"]}, {"qualifier": "scanner", "member": "nextLine", "arguments": []}, {"qualifier": "", "member": "searchPat", "arguments": ["text", "pattern", "q"]}], "conditionals": []}, {"name": "searchPat", "modifiers": ["private", "static"], "return_type": "void", "parameters": [{"name": "text", "type": "String"}, {"name": "pattern", "type": "String"}, {"name": "q", "type": "int"}], "invocations": [{"qualifier": "pattern", "member": "length", "arguments": []}, {"qualifier": "text", "member": "length", "arguments": []}, {"qualifier": "Math", "member": "pow", "arguments": ["ALPHABET_SIZE", "BinaryOperation(operandl=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=-)"]}, {"qualifier": "pattern", "member": "charAt", "arguments": ["i"]}, {"qualifier": "text", "member": "charAt", "arguments": ["i"]}, {"qualifier": "text", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "pattern", "member": "charAt", "arguments": ["j"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Pattern found at index \"), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "text", "member": "charAt", "arguments": ["i"]}, {"qualifier": "text", "member": "charAt", "arguments": ["BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=p, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=t, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=text, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=pattern, selectors=[], type_arguments=None), operator=!=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), operator=<)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=t, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}]}]}
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

result: Here's an example of how you could write a unit test for the `searchPat` method using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class RabinKarpTest {
    private RabinKarp rabinKarp;
    private Scanner scanner;

    @BeforeEach
    public void setUp() {
        this.scanner = Mockito.mock(Scanner.class);
        this.rabinKarp = new RabinKarp(this.scanner);
    }

    @Test
    public void testSearchPat() {
        // Arrange
        String text = "Hello World";
        String pattern = "World";
        int q = 1;
        Mockito.when(this.scanner.nextLine()).thenReturn(text);
        Mockito.when(this.scanner.nextLine()).thenReturn(pattern);

        // Act
        this.rabinKarp.searchPat();

        // Assert
        verify(this.scanner, times(1)).nextLine();
        verify(this.scanner, times(1)).nextLine();
        verify(this.rabinKarp, times(1)).searchPat(text, pattern, q);
    }
}
```
In this example, we use Mockito to mock the `Scanner` class and create a stub for the `nextLine()` method. We then set up the inputs for the test by calling `Mockito.when()` on the `scanner` object and specifying the expected behavior for each invocation of `nextLine()`.

We then call the `searchPat()` method on our `RabinKarp` instance, which will execute the code under test. Finally, we verify that the correct methods were called on the `scanner` and `rabinKarp` objects using Mockito's `verify()` method.

Note that this is just one possible way to write a unit test for the `searchPat()` method. There are many other ways to approach this task, and the specific approach you choose will depend on your requirements and preferences.
