query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.greedyalgorithms", "imports": ["java.util.HashMap", "java.util.LinkedList", "java.util.Map"], "classes": [{"class_name": "GaleShapley", "modifiers": ["public", "final"], "fields": [], "constructors": [{"parameters": [], "modifiers": ["private"]}], "methods": [{"name": "stableMatch", "modifiers": ["public", "static"], "return_type": "Map", "parameters": [{"name": "womenPrefs", "type": "Map"}, {"name": "menPrefs", "type": "Map"}], "invocations": [{"qualifier": "menPrefs", "member": "keySet", "arguments": []}, {"qualifier": "freeMen", "member": "isEmpty", "arguments": []}, {"qualifier": "freeMen", "member": "poll", "arguments": []}, {"qualifier": "menPrefs", "member": "get", "arguments": ["man"]}, {"qualifier": "manPref", "member": "isEmpty", "arguments": []}, {"qualifier": "manPref", "member": "poll", "arguments": []}, {"qualifier": "engagements", "member": "get", "arguments": ["woman"]}, {"qualifier": "engagements", "member": "put", "arguments": ["woman", "man"]}, {"qualifier": "womenPrefs", "member": "get", "arguments": ["woman"]}, {"qualifier": "womanPrefList", "member": "indexOf", "arguments": ["man"]}, {"qualifier": "womanPrefList", "member": "indexOf", "arguments": ["fiance"]}, {"qualifier": "engagements", "member": "put", "arguments": ["woman", "man"]}, {"qualifier": "freeMen", "member": "add", "arguments": ["fiance"]}, {"qualifier": "freeMen", "member": "add", "arguments": ["man"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=manPref, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=manPref, selectors=[], type_arguments=None), operator=||)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=fiance, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=womanPrefList, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=man, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=indexOf, postfix_operators=[], prefix_operators=[], qualifier=womanPrefList, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=fiance, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=indexOf, postfix_operators=[], prefix_operators=[], qualifier=womanPrefList, selectors=[], type_arguments=None), operator=<)", "has_else": true}]}]}]}
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
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class GaleShapleyTest {
    @Mock private Map<String, LinkedList<String>> womenPrefs;
    @Mock private Map<String, LinkedList<String>> menPrefs;
    @Mock private Map<String, String> engagements;

    @BeforeEach
    void setUp() {
        // Set up inputs and mocks
        when(menPrefs.keySet()).thenReturn(new LinkedList<>());
        when(freeMen.isEmpty()).thenReturn(true);
        when(freeMen.poll()).thenReturn("man");
        when(menPrefs.get("man")).thenReturn(new LinkedList<>());
        when(manPref.isEmpty()).thenReturn(true);
        when(manPref.poll()).thenReturn("fiance");
        when(engagements.get("woman")).thenReturn("man");
        when(engagements.put("woman", "man")).thenReturn("man");
        when(womenPrefs.get("woman")).thenReturn(new LinkedList<>());
        when(womanPrefList.indexOf("man")).thenReturn(-1);
        when(womanPrefList.indexOf("fiance")).thenReturn(-1);
        when(engagements.put("woman", "man")).thenReturn("man");
        when(freeMen.add("fiance")).thenReturn(true);
        when(freeMen.add("man")).thenReturn(true);
    }

    @Test
    void stableMatch() {
        // Arrange
        Map<String, String> result = GaleShapley.stableMatch(womenPrefs, menPrefs);

        // Act
        String man = result.get("woman");

        // Assert
        assertEquals("man", man);
    }
}
```
