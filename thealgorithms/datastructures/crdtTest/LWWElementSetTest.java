query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.crdt", "imports": ["java.time.Instant", "java.util.HashMap", "java.util.Map"], "classes": [{"class_name": "LWWElementSet", "modifiers": [], "fields": [{"name": "addSet", "type": "Map"}, {"name": "removeSet", "type": "Map"}], "constructors": [{"parameters": [], "modifiers": []}], "methods": [{"name": "add", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "key", "type": "T"}], "invocations": [{"qualifier": "addSet", "member": "put", "arguments": ["key", "ClassCreator(arguments=[MemberReference(member=key, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MethodInvocation(arguments=[], member=now, postfix_operators=[], prefix_operators=[], qualifier=Instant, selectors=[], type_arguments=None)], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[], dimensions=None, name=Element, sub_type=None))"]}, {"qualifier": "Instant", "member": "now", "arguments": []}], "conditionals": []}, {"name": "remove", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "key", "type": "T"}], "invocations": [{"qualifier": "removeSet", "member": "put", "arguments": ["key", "ClassCreator(arguments=[MemberReference(member=key, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MethodInvocation(arguments=[], member=now, postfix_operators=[], prefix_operators=[], qualifier=Instant, selectors=[], type_arguments=None)], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[], dimensions=None, name=Element, sub_type=None))"]}, {"qualifier": "Instant", "member": "now", "arguments": []}], "conditionals": []}, {"name": "lookup", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "key", "type": "T"}], "invocations": [{"qualifier": "addSet", "member": "get", "arguments": ["key"]}, {"qualifier": "removeSet", "member": "get", "arguments": ["key"]}, {"qualifier": "inAddSet.timestamp", "member": "isAfter", "arguments": ["timestamp"]}], "conditionals": []}, {"name": "merge", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "other", "type": "LWWElementSet"}], "invocations": [{"qualifier": "other.addSet", "member": "entrySet", "arguments": []}, {"qualifier": "addSet", "member": "merge", "arguments": ["MethodInvocation(arguments=[], member=getKey, postfix_operators=[], prefix_operators=[], qualifier=entry, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=entry, selectors=[], type_arguments=None)", "MethodReference(expression=This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[]), method=MemberReference(member=resolveConflict, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": "entry", "member": "getKey", "arguments": []}, {"qualifier": "entry", "member": "getValue", "arguments": []}, {"qualifier": "other.removeSet", "member": "entrySet", "arguments": []}, {"qualifier": "removeSet", "member": "merge", "arguments": ["MethodInvocation(arguments=[], member=getKey, postfix_operators=[], prefix_operators=[], qualifier=entry, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=entry, selectors=[], type_arguments=None)", "MethodReference(expression=This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[]), method=MemberReference(member=resolveConflict, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), type_arguments=[])"]}, {"qualifier": "entry", "member": "getKey", "arguments": []}, {"qualifier": "entry", "member": "getValue", "arguments": []}], "conditionals": []}, {"name": "resolveConflict", "modifiers": ["private"], "return_type": "Element", "parameters": [{"name": "e1", "type": "Element"}, {"name": "e2", "type": "Element"}], "invocations": [{"qualifier": "e1.timestamp", "member": "isAfter", "arguments": ["timestamp"]}], "conditionals": []}]}, {"class_name": "Element", "modifiers": [], "fields": [{"name": "key", "type": "T"}, {"name": "timestamp", "type": "Instant"}], "constructors": [{"parameters": [{"name": "key", "type": "T"}, {"name": "timestamp", "type": "Instant"}], "modifiers": []}], "methods": []}]}
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

result: Here's an example of how you could generate a complete, idiomatic JUnit 5 unit test class for the `LWWElementSet` class using the provided JSON metadata:
```java
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class LWWElementSetTest {
    private Map<String, Element> addSet = new HashMap<>();
    private Map<String, Element> removeSet = new HashMap<>();
    private LWWElementSet lwwElementSet;

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @AfterEach
    void tearDown() {
        // Cleanup after each test method
    }

    @Test
    public void add_addsElementToAddSet() {
        // Arrange
        String key = "key";
        Instant timestamp = Instant.now();
        Element element = new Element(key, timestamp);
        when(lwwElementSet.getAddSet()).thenReturn(addSet);

        // Act
        lwwElementSet.add(element);

        // Assert
        verify(lwwElementSet).getAddSet();
        assertEquals(1, addSet.size());
    }

    @Test
    public void remove_removesElementFromRemoveSet() {
        // Arrange
        String key = "key";
        Instant timestamp = Instant.now();
        Element element = new Element(key, timestamp);
        when(lwwElementSet.getRemoveSet()).thenReturn(removeSet);

        // Act
        lwwElementSet.remove(element);

        // Assert
        verify(lwwElementSet).getRemoveSet();
        assertEquals(1, removeSet.size());
    }

    @Test
    public void lookup_returnsTrueIfElementIsInAddSet() {
        // Arrange
        String key = "key";
        Instant timestamp = Instant.now();
        Element element = new Element(key, timestamp);
        when(lwwElementSet.getAddSet()).thenReturn(addSet);
        addSet.put(key, element);

        // Act
        boolean result = lwwElementSet.lookup(element);

        // Assert
        verify(lwwElementSet).getAddSet();
        assertTrue(result);
    }

    @Test
    public void lookup_returnsFalseIfElementIsNotInAddSet() {
        // Arrange
        String key = "key";
        Instant timestamp = Instant.now();
        Element element = new Element(key, timestamp);
        when(lwwElementSet.getAddSet()).thenReturn(addSet);

        // Act
        boolean result = lwwElementSet.lookup(element);

        // Assert
        verify(lwwElementSet).getAddSet();
        assertFalse(result);
    }

    @Test
    public void merge_mergesOtherLWWElementSetIntoThisOne() {
        // Arrange
        LWWElementSet other = new LWWElementSet();
        String key1 = "key1";
        Instant timestamp1 = Instant.now();
        Element element1 = new Element(key1, timestamp1);
        when(other.getAddSet()).thenReturn(addSet);
        addSet.put(key1, element1);
        String key2 = "key2";
        Instant timestamp2 = Instant.now();
        Element element2 = new Element(key2, timestamp2);
        when(other.getRemoveSet()).thenReturn(removeSet);
        removeSet.put(key2, element2);

        // Act
        lwwElementSet.merge(other);

        // Assert
        verify(lwwElementSet).getAddSet();
        verify(lwwElementSet).getRemoveSet();
        assertEquals(2, addSet.size());
        assertEquals(1, removeSet.size());
    }
}
```
Note that this is just one possible way to generate a JUnit 5 unit test class for the `LWWElementSet` class using the provided JSON metadata. There are many other ways to write tests, and the specific approach you choose will depend on your testing goals and preferences.
