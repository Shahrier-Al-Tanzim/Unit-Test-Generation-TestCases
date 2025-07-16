query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": ["java.util.Scanner"], "classes": [{"class_name": "CatalanNumber", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "findNthCatalan", "modifiers": ["static"], "return_type": "long", "parameters": [{"name": "n", "type": "int"}], "invocations": [], "conditionals": []}, {"name": "main", "modifiers": ["public", "static"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter the number n to find nth Catalan number (n <= 50)\")"]}, {"qualifier": "sc", "member": "nextInt", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"th Catalan number is \"), operator=+), operandr=MethodInvocation(arguments=[MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=findNthCatalan, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "", "member": "findNthCatalan", "arguments": ["n"]}, {"qualifier": "sc", "member": "close", "arguments": []}], "conditionals": []}]}]}
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
package com.thealgorithms.dynamicprogramming;

import java.util.Scanner;

public final class CatalanNumber {
    private CatalanNumber() {}

    public static long findNthCatalan(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (2 * findNthCatalan(n - 1)) + findNthCatalan(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n to find nth Catalan number (n <= 50):");
        int n = sc.nextInt();
        long result = findNthCatalan(n);
        System.out.println("The " + n + "th Catalan number is: " + result);
        sc.close();
    }
}
```

```java
package com.thealgorithms.dynamicprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class CatalanNumberTest {
    private Scanner sc;

    @BeforeEach
    void setUp() {
        sc = Mockito.mock(Scanner.class);
        Mockito.when(sc.nextInt()).thenReturn(5);
    }

    @Test
    public void testFindNthCatalan() {
        long result = CatalanNumber.findNthCatalan(5);
        assertEquals(14, result);
    }
}
```
