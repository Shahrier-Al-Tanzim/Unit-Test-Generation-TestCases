query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.sorts", "imports": ["com.thealgorithms.sorts.SortUtils.print", "com.thealgorithms.datastructures.trees.BSTRecursiveGeneric", "java.util.List"], "classes": [{"class_name": "TreeSort", "modifiers": ["public"], "fields": [], "constructors": [], "methods": [{"name": "sort", "modifiers": ["public"], "return_type": "T", "parameters": [{"name": "unsortedArray", "type": "T"}], "invocations": [{"qualifier": "", "member": "doTreeSortArray", "arguments": ["unsortedArray"]}], "conditionals": []}, {"name": "sort", "modifiers": ["public"], "return_type": "List", "parameters": [{"name": "unsortedList", "type": "List"}], "invocations": [{"qualifier": "", "member": "doTreeSortList", "arguments": ["unsortedList"]}], "conditionals": []}, {"name": "doTreeSortArray", "modifiers": ["private"], "return_type": "T", "parameters": [{"name": "unsortedArray", "type": "T"}], "invocations": [{"qualifier": "tree", "member": "add", "arguments": ["element"]}, {"qualifier": "tree", "member": "inorderSort", "arguments": []}], "conditionals": []}, {"name": "doTreeSortList", "modifiers": ["private"], "return_type": "List", "parameters": [{"name": "unsortedList", "type": "Iterable"}], "invocations": [{"qualifier": "tree", "member": "add", "arguments": ["element"]}, {"qualifier": "tree", "member": "inorderSort", "arguments": []}], "conditionals": []}, {"name": "main", "modifiers": ["static", "public"], "return_type": "void", "parameters": [{"name": "args", "type": "String"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Testing for Integer Array....\")"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"unsorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["a"]}, {"qualifier": "treeSort", "member": "sort", "arguments": ["a"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"sorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["a"]}, {"qualifier": "System.out", "member": "println", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Testing for Integer List....\")"]}, {"qualifier": "List", "member": "of", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=3)", "Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=7)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=45)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=343)", "Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=5)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=2)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=9)"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"unsorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["intList"]}, {"qualifier": "treeSort", "member": "sort", "arguments": ["intList"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"sorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["intList"]}, {"qualifier": "System.out", "member": "println", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Testing for String Array....\")"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"unsorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["b"]}, {"qualifier": "treeSort", "member": "sort", "arguments": ["b"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"sorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["b"]}, {"qualifier": "System.out", "member": "println", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Testing for String List....\")"]}, {"qualifier": "List", "member": "of", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"banana\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"berry\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"orange\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"grape\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"peach\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"cherry\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"apple\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"pineapple\")"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"unsorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["stringList"]}, {"qualifier": "treeSort", "member": "sort", "arguments": ["stringList"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"%-10s\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"sorted: \")"]}, {"qualifier": "", "member": "print", "arguments": ["stringList"]}], "conditionals": []}]}]}
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TreeSortTest {
    @Mock
    private BSTRecursiveGeneric tree;

    @BeforeEach
    public void setUp() {
        // Set up the mock object for the BSTRecursiveGeneric class
        when(tree.add(any())).thenReturn(true);
        when(tree.inorderSort()).thenReturn(List.of());
    }

    @Test
    public void testSortArray() {
        // Arrange
        int[] unsortedArray = new int[]{3, 7, 45, 1, 343, -5, 2, 9};

        // Act
        TreeSort.sort(unsortedArray);

        // Assert
        assertEquals(List.of(-5, 1, 2, 3, 7, 9, 45, 343), List.of(unsortedArray));
    }

    @Test
    public void testSortList() {
        // Arrange
        List<Integer> unsortedList = List.of(3, 7, 45, 1, 343, -5, 2, 9);

        // Act
        TreeSort.sort(unsortedList);

        // Assert
        assertEquals(List.of(-5, 1, 2, 3, 7, 9, 45, 343), unsortedList);
    }

    @Test
    public void testSortStringArray() {
        // Arrange
        String[] unsortedArray = new String[]{"banana", "berry", "orange", "grape", "peach", "cherry", "apple", "pineapple"};

        // Act
        TreeSort.sort(unsortedArray);

        // Assert
        assertEquals(List.of("apple", "banana", "berry", "cherry", "grape", "orange", "peach", "pineapple"), List.of(unsortedArray));
    }

    @Test
    public void testSortStringList() {
        // Arrange
        List<String> unsortedList = List.of("banana", "berry", "orange", "grape", "peach", "cherry", "apple", "pineapple");

        // Act
        TreeSort.sort(unsortedList);

        // Assert
        assertEquals(List.of("apple", "banana", "berry", "cherry", "grape", "orange", "peach", "pineapple"), unsortedList);
    }
}
```
