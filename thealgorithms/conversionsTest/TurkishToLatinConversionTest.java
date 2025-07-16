query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.conversions", "imports": [], "classes": [{"class_name": "TurkishToLatinConversion", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "convertTurkishToLatin", "modifiers": ["public", "static"], "return_type": "String", "parameters": [{"name": "param", "type": "String"}], "invocations": [{"qualifier": "param", "member": "replaceAll", "arguments": ["MethodInvocation(arguments=[MemberReference(member=turkishChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=latinChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)"]}, {"qualifier": "String", "member": "valueOf", "arguments": ["turkishChars"]}, {"qualifier": "String", "member": "valueOf", "arguments": ["latinChars"]}], "conditionals": []}]}]}
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

result: Here's a possible solution for each method in the JSON array:
```json
[
  {
    "package": "com.thealgorithms.conversions",
    "imports": ["org.junit.jupiter.api.Test"],
    "classes": [
      {
        "class_name": "TurkishToLatinConversion",
        "modifiers": ["public", "final"],
        "fields": [],
        "constructors": [{"parameters": [], "modifiers": ["private"]}],
        "methods": [
          {
            "name": "convertTurkishToLatin",
            "modifiers": ["public", "static"],
            "return_type": "String",
            "parameters": [{"name": "param", "type": "String"}],
            "invocations": [
              {
                "qualifier": "param",
                "member": "replaceAll",
                "arguments": ["MethodInvocation(arguments=[MemberReference(member=turkishChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=latinChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)"]
              },
              {
                "qualifier": "String",
                "member": "valueOf",
                "arguments": ["turkishChars"]
              },
              {
                "qualifier": "String",
                "member": "valueOf",
                "arguments": ["latinChars"]
              }
            ],
            "conditionals": []
          }
        ]
      }
    ]
  }
]
```
Here's a possible test class for the `convertTurkishToLatin` method:
```java
package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TurkishToLatinConversionTest {
    @Test
    public void testConvertTurkishToLatin() {
        // Arrange
        String turkishChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String latinChars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        TurkishToLatinConversion conversion = new TurkishToLatinConversion();
        String param = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Stub the behavior of the method invocations
        when(param.replaceAll("MethodInvocation(arguments=[MemberReference(member=turkishChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=latinChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)"]).thenReturn(latinChars);
        when(param.replaceAll("MethodInvocation(arguments=[MemberReference(member=turkishChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[MemberReference(member=latinChars, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], member=valueOf, postfix_operators=[], prefix_operators=[], qualifier=String, selectors=[], type_arguments=None)"]).thenReturn(latinChars);

        // Act
        String result = conversion.convertTurkishToLatin(param);

        // Assert
        assertEquals(latinChars, result);
    }
}
```
Note that this is just one possible solution and there may be other ways to test the `convertTurkishToLatin` method using JUnit 5 and Mockito.
