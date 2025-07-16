query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.devutils.searches", "imports": [], "classes": []}
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
Here are the generated JUnit 5 unit tests for each of the methods in the JSON array:
```json
[
  {
    "package": "com.thealgorithms.devutils.searches",
    "imports": ["org.junit.jupiter.api.Test"],
    "classes": [
      {
        "name": "binarySearch",
        "methods": [
          {
            "name": "testBinarySearch",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint target = 3;\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nint result = binarySearch(arr, target, low, high);\n\n// Assert\nassertEquals(2, result);"
          }
        ]
      },
      {
        "name": "linearSearch",
        "methods": [
          {
            "name": "testLinearSearch",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint target = 3;\n\n// Act\nint result = linearSearch(arr, target);\n\n// Assert\nassertEquals(2, result);"
          }
        ]
      },
      {
        "name": "binaryInsertionSort",
        "methods": [
          {
            "name": "testBinaryInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbinaryInsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "linearInsertionSort",
        "methods": [
          {
            "name": "testLinearInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nlinearInsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "mergeSort",
        "methods": [
          {
            "name": "testMergeSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nmergeSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "bubbleSort",
        "methods": [
          {
            "name": "testBubbleSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nbubbleSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "insertionSort",
        "methods": [
          {
            "name": "testInsertionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\ninsertionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "merge",
        "methods": [
          {
            "name": "testMerge",
            "signature": "(int[], int, int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint low = 0;\nint high = arr.length - 1;\n\n// Act\nmerge(arr, low, high);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "quickSort",
        "methods": [
          {
            "name": "testQuickSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nquickSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);"
          }
        ]
      },
      {
        "name": "selectionSort",
        "methods": [
          {
            "name": "testSelectionSort",
            "signature": "(int[], int)",
            "body": "// Arrange\nint[] arr = new int[]{1, 2, 3, 4, 5};\nint n = arr.length;\n\n// Act\nselectionSort(arr, n);\n\n// Assert\nassertArrayEquals(new int[]{1, 
