query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.datastructures.hashmap.hashing", "imports": ["java.util.Objects"], "classes": [{"class_name": "HashMapCuckooHashing", "modifiers": ["public"], "fields": [{"name": "tableSize", "type": "int"}, {"name": "buckets", "type": "Integer"}, {"name": "emptySlot", "type": "Integer"}, {"name": "size", "type": "int"}, {"name": "thresh", "type": "int"}], "constructors": [{"parameters": [{"name": "tableSize", "type": "int"}], "modifiers": ["public"]}], "methods": [{"name": "hashFunction1", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "key", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}, {"name": "hashFunction2", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "key", "type": "int"}], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}, {"name": "insertKey2HashTable", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "key", "type": "int"}], "invocations": [{"qualifier": "", "member": "isFull", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Hash table is full, lengthening & rehashing table\")"]}, {"qualifier": "", "member": "reHashTableIncreasesTableSize", "arguments": []}, {"qualifier": "", "member": "checkTableContainsKey", "arguments": ["key"]}, {"qualifier": "", "member": "hashFunction1", "arguments": ["key"]}, {"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "emptySlot"]}, {"qualifier": "", "member": "checkLoadFactor", "arguments": []}, {"qualifier": "", "member": "hashFunction2", "arguments": ["temp"]}, {"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "emptySlot"]}, {"qualifier": "", "member": "checkLoadFactor", "arguments": []}, {"qualifier": "", "member": "checkLoadFactor", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Infinite loop occurred, lengthening & rehashing table\")"]}, {"qualifier": "", "member": "reHashTableIncreasesTableSize", "arguments": []}, {"qualifier": "", "member": "insertKey2HashTable", "arguments": ["key"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isFull, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=key, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=checkTableContainsKey, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=emptySlot, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=Objects, selectors=[], type_arguments=None), operator=||)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=emptySlot, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=Objects, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "reHashTableIncreasesTableSize", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "emptySlot"]}, {"qualifier": "newT", "member": "insertKey2HashTable", "arguments": ["This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[MemberReference(member=buckets, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None), ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])"]}, {"qualifier": "Math", "member": "log", "arguments": ["tableSize"]}, {"qualifier": "Math", "member": "log", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), operandr=MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=emptySlot, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=['!'], qualifier=Objects, selectors=[], type_arguments=None), operator=&&)", "has_else": false}]}, {"name": "deleteKeyFromHashTable", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "key", "type": "int"}], "invocations": [{"qualifier": "", "member": "hashFunction1", "arguments": ["key"]}, {"qualifier": "", "member": "isEmpty", "arguments": []}, {"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "wrappedInt"]}, {"qualifier": "", "member": "hashFunction2", "arguments": ["key"]}, {"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "wrappedInt"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=wrappedInt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=Objects, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=wrappedInt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=Objects, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "displayHashtable", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "emptySlot"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Bucket \"), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\": Empty\"), operator=+)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Bucket \"), operandr=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\": \"), operator=+), operandr=MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), MethodInvocation(arguments=[], member=toString, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)]), operator=+)"]}, {"qualifier": null, "member": "toString", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=emptySlot, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=Objects, selectors=[], type_arguments=None), operator=||)", "has_else": true}]}, {"name": "findKeyInTable", "modifiers": ["public"], "return_type": "int", "parameters": [{"name": "key", "type": "int"}], "invocations": [{"qualifier": "", "member": "hashFunction1", "arguments": ["key"]}, {"qualifier": "", "member": "isEmpty", "arguments": []}, {"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "wrappedInt"]}, {"qualifier": "", "member": "hashFunction2", "arguments": ["key"]}, {"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "wrappedInt"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=wrappedInt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=Objects, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=hash, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=wrappedInt, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=['!'], qualifier=Objects, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "checkTableContainsKey", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "key", "type": "int"}], "invocations": [{"qualifier": "", "member": "hashFunction1", "arguments": ["key"]}, {"qualifier": "", "member": "hashFunction1", "arguments": ["key"]}, {"qualifier": null, "member": "equals", "arguments": ["key"]}, {"qualifier": "", "member": "hashFunction2", "arguments": ["key"]}, {"qualifier": "", "member": "hashFunction2", "arguments": ["key"]}, {"qualifier": null, "member": "equals", "arguments": ["key"]}], "conditionals": []}, {"name": "checkLoadFactor", "modifiers": ["public"], "return_type": "double", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Load factor is %.2f, rehashing table.%n\")", "factor"]}, {"qualifier": "", "member": "reHashTableIncreasesTableSize", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=factor, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=.7), operator=>)", "has_else": false}]}, {"name": "isFull", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [{"qualifier": "Objects", "member": "equals", "arguments": ["buckets", "emptySlot"]}], "conditionals": [{"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=MethodInvocation(arguments=[MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), MemberReference(member=emptySlot, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=Objects, selectors=[], type_arguments=None), operator=||)", "has_else": false}]}, {"name": "isEmpty", "modifiers": ["public"], "return_type": "boolean", "parameters": [], "invocations": [], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=buckets, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}]}, {"name": "getNumberOfKeysInTable", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}]}]}
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

result: ```
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {
    private HashTable hashTable;
    private HashTable.Bucket bucket;

    @BeforeEach
    void setUp() {
        hashTable = new HashTable(10);
        bucket = Mockito.mock(HashTable.Bucket.class);
    }

    @Test
    void testInsert_whenKeyIsNotPresent_shouldAddNewEntry() {
        // Arrange
        int key = 1;
        String value = "value";
        Mockito.when(bucket.getKey()).thenReturn(key);
        Mockito.when(bucket.getValue()).thenReturn(value);

        // Act
        hashTable.insert(bucket);

        // Assert
        assertEquals(1, hashTable.size());
    }

    @Test
    void testInsert_whenKeyIsPresent_shouldUpdateExistingEntry() {
        // Arrange
        int key = 1;
        String value = "value";
        Mockito.when(bucket.getKey()).thenReturn(key);
        Mockito.when(bucket.getValue()).thenReturn(value);
        hashTable.insert(bucket);

        // Act
        hashTable.insert(bucket);

        // Assert
        assertEquals(1, hashTable.size());
    }

    @Test
    void testFind_whenKeyIsPresent_shouldReturnValue() {
        // Arrange
        int key = 1;
        String value = "value";
        Mockito.when(bucket.getKey()).thenReturn(key);
        Mockito.when(bucket.getValue()).thenReturn(value);
        hashTable.insert(bucket);

        // Act
        String result = hashTable.find(key);

        // Assert
        assertEquals(value, result);
    }

    @Test
    void testFind_whenKeyIsNotPresent_shouldReturnNull() {
        // Arrange
        int key = 1;
        String value = "value";
        Mockito.when(bucket.getKey()).thenReturn(key);
        Mockito.when(bucket.getValue()).thenReturn(value);
        hashTable.insert(bucket);

        // Act
        String result = hashTable.find(2);

        // Assert
        assertNull(result);
    }
}
```
