query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.maths", "imports": ["java.util.HashMap", "java.util.Map"], "classes": [{"class_name": "StrobogrammaticNumber", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "isStrobogrammatic", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "number", "type": "String"}], "invocations": [{"qualifier": "strobogrammaticMap", "member": "put", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='0')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='0')"]}, {"qualifier": "strobogrammaticMap", "member": "put", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='1')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='1')"]}, {"qualifier": "strobogrammaticMap", "member": "put", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='6')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='9')"]}, {"qualifier": "strobogrammaticMap", "member": "put", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='8')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='8')"]}, {"qualifier": "strobogrammaticMap", "member": "put", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='9')", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value='6')"]}, {"qualifier": "number", "member": "length", "arguments": []}, {"qualifier": "number", "member": "charAt", "arguments": ["left"]}, {"qualifier": "number", "member": "charAt", "arguments": ["right"]}, {"qualifier": "strobogrammaticMap", "member": "containsKey", "arguments": ["leftChar"]}, {"qualifier": "strobogrammaticMap", "member": "get", "arguments": ["leftChar"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=leftChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=[], prefix_operators=['!'], qualifier=strobogrammaticMap, selectors=[], type_arguments=None), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=leftChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=strobogrammaticMap, selectors=[], type_arguments=None), operandr=MemberReference(member=rightChar, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=!=), operator=||)", "has_else": false}]}]}]}
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
package com.thealgorithms.maths;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class StrobogrammaticNumberTest {
    private Map<Character, Character> strobogrammaticMap;
    private String number;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.strobogrammaticMap = new HashMap<>();
        this.strobogrammaticMap.put('0', '0');
        this.strobogrammaticMap.put('1', '1');
        this.strobogrammaticMap.put('6', '9');
        this.strobogrammaticMap.put('8', '8');
        this.strobogrammaticMap.put('9', '6');
    }

    @Test
    void testIsStrobogrammatic() {
        // Arrange
        String number = "0";

        // Act
        boolean result = StrobogrammaticNumber.isStrobogrammatic(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsNotStrobogrammatic() {
        // Arrange
        String number = "123";

        // Act
        boolean result = StrobogrammaticNumber.isStrobogrammatic(number);

        // Assert
        assertFalse(result);
    }
}
```
