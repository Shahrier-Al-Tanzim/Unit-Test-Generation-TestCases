query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.searches", "imports": ["java.util.ArrayList", "java.util.HashMap", "java.util.List", "java.util.Map", "java.util.Objects"], "classes": [{"class_name": "Movie", "modifiers": [], "fields": [{"name": "docId", "type": "int"}, {"name": "name", "type": "String"}, {"name": "imdbRating", "type": "double"}, {"name": "releaseYear", "type": "int"}, {"name": "content", "type": "String"}], "constructors": [{"parameters": [{"name": "docId", "type": "int"}, {"name": "name", "type": "String"}, {"name": "imdbRating", "type": "double"}, {"name": "releaseYear", "type": "int"}, {"name": "content", "type": "String"}], "modifiers": []}], "methods": [{"name": "getWords", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}]}, {"class_name": "SearchResult", "modifiers": [], "fields": [{"name": "docId", "type": "int"}, {"name": "relevanceScore", "type": "double"}], "constructors": [{"parameters": [{"name": "docId", "type": "int"}, {"name": "relevanceScore", "type": "double"}], "modifiers": []}], "methods": [{"name": "getDocId", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "equals", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "o", "type": "Object"}], "invocations": [{"qualifier": "", "member": "getClass", "arguments": []}, {"qualifier": "o", "member": "getClass", "arguments": []}, {"qualifier": "Double", "member": "compare", "arguments": ["relevanceScore", "relevanceScore"]}], "conditionals": [{"condition": "BinaryOperation(operandl=This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[]), operandr=MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getClass, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[], member=getClass, postfix_operators=[], prefix_operators=[], qualifier=o, selectors=[], type_arguments=None), operator=!=), operator=||)", "has_else": false}]}, {"name": "hashCode", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "Objects", "member": "hash", "arguments": ["docId", "relevanceScore"]}], "conditionals": []}, {"name": "getRelevanceScore", "modifiers": ["public"], "return_type": "double", "parameters": [], "invocations": [], "conditionals": []}]}, {"class_name": "BM25InvertedIndex", "modifiers": ["public", "final"], "fields": [{"name": "index", "type": "Map"}, {"name": "movies", "type": "Map"}, {"name": "totalDocuments", "type": "int"}, {"name": "avgDocumentLength", "type": "double"}, {"name": "K", "type": "double"}, {"name": "B", "type": "double"}], "constructors": [{"parameters": [], "modifiers": []}], "methods": [{"name": "addMovie", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "docId", "type": "int"}, {"name": "name", "type": "String"}, {"name": "imdbRating", "type": "double"}, {"name": "releaseYear", "type": "int"}, {"name": "content", "type": "String"}], "invocations": [{"qualifier": "movies", "member": "put", "arguments": ["docId", "movie"]}, {"qualifier": "movie", "member": "getWords", "arguments": []}, {"qualifier": "index", "member": "putIfAbsent", "arguments": ["term", "ClassCreator(arguments=[], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=[], dimensions=None, name=HashMap, sub_type=None))"]}, {"qualifier": "index", "member": "get", "arguments": ["term"]}, {"qualifier": "index", "member": "put", "arguments": ["term", "docList"]}, {"qualifier": "docList", "member": "put", "arguments": ["docId", "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=docId, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)], member=getOrDefault, postfix_operators=[], prefix_operators=[], qualifier=docList, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}, {"qualifier": "docList", "member": "getOrDefault", "arguments": ["docId", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=docList, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "getMoviesLength", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "movies", "member": "size", "arguments": []}], "conditionals": []}, {"name": "search", "modifiers": ["public"], "return_type": "List", "parameters": [{"name": "term", "type": "String"}], "invocations": [{"qualifier": "term", "member": "toLowerCase", "arguments": []}, {"qualifier": "index", "member": "containsKey", "arguments": ["term"]}, {"qualifier": "index", "member": "get", "arguments": ["term"]}, {"qualifier": "", "member": "computeIDF", "arguments": ["MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=termDocs, selectors=[], type_arguments=None)"]}, {"qualifier": "termDocs", "member": "size", "arguments": []}, {"qualifier": "termDocs", "member": "entrySet", "arguments": []}, {"qualifier": "entry", "member": "getKey", "arguments": []}, {"qualifier": "entry", "member": "getValue", "arguments": []}, {"qualifier": "movies", "member": "get", "arguments": ["docId"]}, {"qualifier": "movie", "member": "getWords", "arguments": []}, {"qualifier": "", "member": "computeBM25Score", "arguments": ["termFrequency", "docLength", "idf"]}, {"qualifier": "results", "member": "add", "arguments": ["ClassCreator(arguments=[MemberReference(member=docId, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=score, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=SearchResult, sub_type=None))"]}, {"qualifier": "results", "member": "sort", "arguments": ["LambdaExpression(body=MethodInvocation(arguments=[MemberReference(member=relevanceScore, postfix_operators=[], prefix_operators=[], qualifier=r2, selectors=[]), MemberReference(member=relevanceScore, postfix_operators=[], prefix_operators=[], qualifier=r1, selectors=[])], member=compare, postfix_operators=[], prefix_operators=[], qualifier=Double, selectors=[], type_arguments=None), parameters=[InferredFormalParameter(name=r1), InferredFormalParameter(name=r2)])"]}, {"qualifier": "Double", "member": "compare", "arguments": ["relevanceScore", "relevanceScore"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=term, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=[], prefix_operators=['!'], qualifier=index, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=movie, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===)", "has_else": false}]}, {"name": "computeBM25Score", "modifiers": ["private"], "return_type": "double", "parameters": [{"name": "termFrequency", "type": "int"}, {"name": "docLength", "type": "double"}, {"name": "idf", "type": "double"}], "invocations": [], "conditionals": []}, {"name": "computeIDF", "modifiers": ["private"], "return_type": "double", "parameters": [{"name": "docFrequency", "type": "int"}], "invocations": [{"qualifier": "Math", "member": "log", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=totalDocuments, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=MemberReference(member=docFrequency, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=-), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0.5), operator=+), operandr=BinaryOperation(operandl=MemberReference(member=docFrequency, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0.5), operator=+), operator=/), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator=+)"]}], "conditionals": []}]}]}
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
Here's an example of how you could write tests for the given code using JUnit 5 and Mockito:
```
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BM25SearchTest {
    @Mock
    private Index index;

    @InjectMocks
    private BM25Search bm25Search;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSearch() {
        // Arrange
        String term = "term";
        int docFrequency = 10;
        double idf = Math.log((double) totalDocuments / (docFrequency + 0.5));
        when(index.containsKey(term)).thenReturn(true);
        when(index.get(term)).thenReturn(docList);
        when(docList.size()).thenReturn(10);
        when(docList.getOrDefault(docId, 0)).thenReturn(1);
        double score = bm25Search.computeBM25Score(termFrequency, docLength, idf);

        // Act
        List<SearchResult> results = bm25Search.search(term);

        // Assert
        assertEquals(10, results.size());
        for (int i = 0; i < results.size(); i++) {
            SearchResult result = results.get(i);
            assertEquals(docId, result.getDocId());
            assertEquals(score, result.getScore(), 0.01);
        }
    }
}
```
In this example, we use the `@Mock` annotation to create a mock instance of the `Index` class and inject it into the `BM25Search` class using the `@InjectMocks` annotation. We then set up some expectations for the behavior of the `index` mock object using the `when()` method from Mockito, and verify that the `search()` method returns the expected results by asserting on the size of the returned list and the values of the `docId` and `score` fields of each element in the list.

Note that this is just one possible way to write tests for the given code using JUnit 5 and Mockito, and there are many other ways to do it as well. The key is to use the appropriate annotations and methods from these frameworks to set up expectations and verify behavior, and to test the desired aspects of the code's functionality.
