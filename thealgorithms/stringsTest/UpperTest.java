query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.strings", "imports": [], "classes": [{"class_name": "Upper", "modifiers": ["final", "public"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "main", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "", "member": "toUpperCase", "arguments": ["s"]}, {"qualifier": null, "member": "equals", "arguments": ["MethodInvocation(arguments=[], member=toUpperCase, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)"]}, {"qualifier": "s", "member": "toUpperCase", "arguments": []}], "conditionals": []}, {"name": "toUpperCase", "modifiers": ["static", "public"], "return_type": "String", "parameters": [{"name": "s", "type": "String"}], "invocations": [{"qualifier": "s", "member": "isEmpty", "arguments": []}, {"qualifier": "result", "member": "length", "arguments": []}, {"qualifier": "result", "member": "charAt", "arguments": ["i"]}, {"qualifier": "Character", "member": "isLetter", "arguments": ["currentChar"]}, {"qualifier": "Character", "member": "isLowerCase", "arguments": ["currentChar"]}, {"qualifier": "result", "member": "setCharAt", "arguments": ["i", "MethodInvocation(arguments=[MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=toUpperCase, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None)"]}, {"qualifier": "Character", "member": "toUpperCase", "arguments": ["currentChar"]}, {"qualifier": "result", "member": "toString", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isLetter, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isLowerCase, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None), operator=&&)", "has_else": false}]}]}]}
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

result: Here's a possible solution for each method in the JSON array you provided:
```json
[
  {
    "package": "com.thealgorithms.strings",
    "imports": ["java.util.Scanner"],
    "classes": [
      {
        "class_name": "Upper",
        "modifiers": ["final", "public"],
        "fields": [],
        "constructors": [{"parameters": [], "modifiers": ["private"]}],
        "methods": [
          {
            "name": "main",
            "modifiers": ["static", "public"],
            "return_type": "void",
            "parameters": [{"name": "args", "type": "String"}],
            "invocations": [
              {"qualifier": "", "member": "toUpperCase", "arguments": ["s"]},
              {"qualifier": null, "member": "equals", "arguments": ["MethodInvocation(arguments=[], member=toUpperCase, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)"]},
              {"qualifier": "s", "member": "toUpperCase", "arguments": []}
            ],
            "conditionals": [
              {
                "condition": "BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)",
                "has_else": false
              },
              {
                "condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)",
                "has_else": false
              },
              {
                "condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isLetter, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isLowerCase, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None), operator=&&)",
                "has_else": false
              }
            ]
          },
          {
            "name": "toUpperCase",
            "modifiers": ["static", "public"],
            "return_type": "String",
            "parameters": [{"name": "s", "type": "String"}],
            "invocations": [
              {"qualifier": "s", "member": "isEmpty", "arguments": []},
              {"qualifier": "result", "member": "length", "arguments": []},
              {"qualifier": "result", "member": "charAt", "arguments": ["i"]},
              {"qualifier": "Character", "member": "isLetter", "arguments": ["currentChar"]},
              {"qualifier": "Character", "member": "isLowerCase", "arguments": ["currentChar"]},
              {"qualifier": "result", "member": "setCharAt", "arguments": ["i", "MethodInvocation(arguments=[], member=toUpperCase, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)"]},
              {"qualifier": "Character", "member": "toUpperCase", "arguments": ["currentChar"]},
              {"qualifier": "result", "member": "toString", "arguments": []}
            ],
            "conditionals": [
              {
                "condition": "BinaryOperation(operandl=MemberReference(member=s, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)",
                "has_else": false
              },
              {
                "condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None)",
                "has_else": false
              },
              {
                "condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isLetter, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=currentChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=isLowerCase, postfix_operators=[], prefix_operators=[], qualifier=Character, selectors=[], type_arguments=None), operator=&&)",
                "has_else": false
              }
            ]
          }
        ]
      }
    ]
  }
]
```
Here's a possible JUnit test class for the `Upper` class:
```java
package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class UpperTest {
    private Upper upper;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void testMain() {
        // Arrange
        String[] args = new String[0];
        MockedStatic<Scanner> scannerMockedStatic = Mockito.mockStatic(Scanner.class);
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextLine()).thenReturn("Hello, World!");
        upper = new Upper();

        // Act
        upper.main(args);

        // Assert
        verify(scanner).nextLine();
    }
}
```
Note that this is just one possible solution and there may be other ways to write the test class depending on your specific requirements and preferences.
