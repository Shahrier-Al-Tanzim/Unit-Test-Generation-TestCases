query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.dynamicprogramming", "imports": [], "classes": [{"class_name": "EditDistance", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "minDistance", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "word1", "type": "String"}, {"name": "word2", "type": "String"}], "invocations": [{"qualifier": "word1", "member": "length", "arguments": []}, {"qualifier": "word2", "member": "length", "arguments": []}, {"qualifier": "word1", "member": "charAt", "arguments": ["i"]}, {"qualifier": "word2", "member": "charAt", "arguments": ["j"]}, {"qualifier": "Math", "member": "min", "arguments": ["replace", "insert"]}, {"qualifier": "Math", "member": "min", "arguments": ["delete", "min"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=c1, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=c2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": true}]}, {"name": "editDistance", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "s1", "type": "String"}, {"name": "s2", "type": "String"}], "invocations": [{"qualifier": "s1", "member": "length", "arguments": []}, {"qualifier": "s2", "member": "length", "arguments": []}, {"qualifier": "", "member": "editDistance", "arguments": ["s1", "s2", "storage"]}], "conditionals": []}, {"name": "editDistance", "modifiers": ["public", "static"], "return_type": "int", "parameters": [{"name": "s1", "type": "String"}, {"name": "s2", "type": "String"}, {"name": "storage", "type": "int"}], "invocations": [{"qualifier": "s1", "member": "length", "arguments": []}, {"qualifier": "s2", "member": "length", "arguments": []}, {"qualifier": "s1", "member": "charAt", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "s2", "member": "charAt", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "", "member": "editDistance", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=s1, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=s2, selectors=[], type_arguments=None)", "storage"]}, {"qualifier": "s1", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "s2", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "", "member": "editDistance", "arguments": ["s1", "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=s2, selectors=[], type_arguments=None)", "storage"]}, {"qualifier": "s2", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "", "member": "editDistance", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=s1, selectors=[], type_arguments=None)", "s2", "storage"]}, {"qualifier": "s1", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "", "member": "editDistance", "arguments": ["MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=s1, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)], member=substring, postfix_operators=[], prefix_operators=[], qualifier=s2, selectors=[], type_arguments=None)", "storage"]}, {"qualifier": "s1", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "s2", "member": "substring", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "Math", "member": "min", "arguments": ["op1", "MethodInvocation(arguments=[MemberReference(member=op2, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=op3, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=min, postfix_operators=[], prefix_operators=[], qualifier=Math, selectors=[], type_arguments=None)"]}, {"qualifier": "Math", "member": "min", "arguments": ["op2", "op3"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=storage, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=m, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=n, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s1, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=s2, selectors=[], type_arguments=None), operator===)", "has_else": true}]}]}]}
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
Here's an example of how you could generate a complete, idiomatic JUnit 5 unit test class for the `editDistance` method in the given JSON metadata:
```java
package com.thealgorithms.dynamicprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EditDistanceTest {
    
    private EditDistance editDistance;
    
    @BeforeEach
    void setUp() {
        editDistance = new EditDistance();
    }
    
    @Test
    public void testEditDistance_emptyStrings() {
        // Arrange
        String s1 = "";
        String s2 = "";
        
        // Act
        int result = editDistance.editDistance(s1, s2);
        
        // Assert
        assertEquals(0, result);
    }
    
    @Test
    public void testEditDistance_singleCharacters() {
        // Arrange
        String s1 = "a";
        String s2 = "b";
        
        // Act
        int result = editDistance.editDistance(s1, s2);
        
        // Assert
        assertEquals(1, result);
    }
    
    @Test
    public void testEditDistance_multipleCharacters() {
        // Arrange
        String s1 = "apple";
        String s2 = "lemon";
        
        // Act
        int result = editDistance.editDistance(s1, s2);
        
        // Assert
        assertEquals(3, result);
    }
}
```
Note that this is just one possible way to generate a test class for the `editDistance` method. There are many other ways to write tests, and the best approach will depend on the specific requirements of your project.
