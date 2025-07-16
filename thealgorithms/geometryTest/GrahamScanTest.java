query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.geometry", "imports": ["java.util.ArrayList", "java.util.Arrays", "java.util.Stack"], "classes": [{"class_name": "GrahamScan", "modifiers": ["public"], "fields": [{"name": "hull", "type": "Stack"}], "constructors": [{"parameters": [{"name": "points", "type": "Point"}], "modifiers": ["public"]}], "methods": [{"name": "hull", "modifiers": ["public"], "return_type": "Iterable", "parameters": [], "invocations": [], "conditionals": []}]}]}
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
import com.thealgorithms.geometry.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import static org.mockito.Mockito.*;

public class GrahamScanTest {
    private Stack<Point> hull;
    private GrahamScan gs;

    @BeforeEach
    public void setUp() {
        this.hull = new Stack<>();
        this.gs = new GrahamScan(new ArrayList<>());
    }

    @AfterEach
    public void tearDown() {
        this.hull = null;
        this.gs = null;
    }

    @Test
    public void testHull() {
        // Arrange
        Point[] points = new Point[]{new Point(0, 0), new Point(1, 1), new Point(2, 2)};
        when(this.gs.hull()).thenReturn(Arrays.asList(points));

        // Act
        Iterable<Point> result = this.gs.hull();

        // Assert
        assertEquals(Arrays.asList(points), result);
    }
}
```
