query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["java.util.ArrayList", "java.util.Collections", "java.util.List"], "classes": [{"class_name": "BucketSort", "modifiers": ["public"], "fields": [{"name": "BUCKET_DIVISOR", "type": "int"}], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "", "member": "findMin", "arguments": ["array"]}, {"qualifier": "", "member": "findMax", "arguments": ["array"]}, {"qualifier": "", "member": "calculateNumberOfBuckets", "arguments": ["length"]}, {"qualifier": "", "member": "initializeBuckets", "arguments": ["numberOfBuckets"]}, {"qualifier": "", "member": "distributeElementsIntoBuckets", "arguments": ["array", "buckets", "min", "max", "numberOfBuckets"]}, {"qualifier": "", "member": "concatenateBuckets", "arguments": ["buckets", "array"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=length, postfix_operators=[], prefix_operators=[], qualifier=array, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "calculateNumberOfBuckets", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "arrayLength", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "max", "arguments": ["BinaryOperation(operandl=MemberReference(member=arrayLength, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=BUCKET_DIVISOR, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=/)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}], "conditionals": []}, {"name": "initializeBuckets", "modifiers": ["private"], "return_type": "List", "parameters": [{"name": "numberOfBuckets", "type": "int"}], "invocations": [{"qualifier": "buckets", "member": "add", "arguments": ["ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[], dimensions=None, name=ArrayList, sub_type=None))"]}], "conditionals": []}, {"name": "distributeElementsIntoBuckets", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "array", "type": "T"}, {"name": "buckets", "type": "List"}, {"name": "min", "type": "T"}, {"name": "max", "type": "T"}, {"name": "numberOfBuckets", "type": "int"}], "invocations": [{"qualifier": "", "member": "hash", "arguments": ["element", "min", "max", "numberOfBuckets"]}, {"qualifier": "buckets", "member": "get", "arguments": ["bucketIndex"]}, {"qualifier": null, "member": "add", "arguments": ["element"]}], "conditionals": []}, {"name": "concatenateBuckets", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "buckets", "type": "Iterable"}, {"name": "array", "type": "T"}], "invocations": [{"qualifier": "Collections", "member": "sort", "arguments": ["bucket"]}], "conditionals": []}, {"name": "hash", "modifiers": ["private"], "return_type": "int", "parameters": [{"name": "element", "type": "T"}, {"name": "min", "type": "T"}, {"name": "max", "type": "T"}, {"name": "numberOfBuckets", "type": "int"}], "invocations": [{"qualifier": "max", "member": "compareTo", "arguments": ["min"]}, {"qualifier": "element", "member": "compareTo", "arguments": ["min"]}], "conditionals": []}, {"name": "findMin", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "element", "member": "compareTo", "arguments": ["min"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=min, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=element, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=<)", "has_else": false}]}, {"name": "findMax", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "array", "type": "T"}], "invocations": [{"qualifier": "element", "member": "compareTo", "arguments": ["max"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=max, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=compareTo, postfix_operators=[], prefix_operators=[], qualifier=element, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}]}]}
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
package com.thealgorithms.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class BucketSortTest {
    private BucketSort bucketSort;
    private List<Integer> array;
    private int length;
    private int numberOfBuckets;
    private List<List<Integer>> buckets;
    private Integer min, max;

    @BeforeEach
    void setUp() {
        // Set up inputs
        length = 10;
        array = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            array.add(i);
        }
        numberOfBuckets = 5;
        buckets = new ArrayList<>();
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
        min = Collections.min(array);
        max = Collections.max(array);
    }

    @Test
    void sort() {
        // Arrange
        Mockito.when(bucketSort.findMin(array)).thenReturn(min);
        Mockito.when(bucketSort.findMax(array)).thenReturn(max);
        Mockito.when(bucketSort.calculateNumberOfBuckets(length)).thenReturn(numberOfBuckets);
        Mockito.when(bucketSort.initializeBuckets(numberOfBuckets)).thenReturn(buckets);
        Mockito.when(bucketSort.distributeElementsIntoBuckets(array, buckets, min, max, numberOfBuckets)).thenReturn();
        Mockito.when(bucketSort.concatenateBuckets(buckets, array)).thenReturn(array);

        // Act
        bucketSort.sort(array);

        // Assert
        assertEquals(array, Collections.sort(array));
    }
}
```
