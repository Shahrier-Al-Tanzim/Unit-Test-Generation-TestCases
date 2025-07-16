query: 
You are a Java testing assistant.
Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:
```json
{"package": "com.thealgorithms.ciphers.a5", "imports": ["java.util.BitSet"], "classes": [{"class_name": "A5Cipher", "modifiers": ["public"], "fields": [{"name": "keyStreamGenerator", "type": "A5KeyStreamGenerator"}, {"name": "KEY_STREAM_LENGTH", "type": "int"}], "constructors": [{"parameters": [{"name": "sessionKey", "type": "BitSet"}, {"name": "frameCounter", "type": "BitSet"}], "modifiers": ["public"]}], "methods": [{"name": "encrypt", "modifiers": ["public"], "return_type": "BitSet", "parameters": [{"name": "plainTextBits", "type": "BitSet"}], "invocations": [{"qualifier": "result", "member": "xor", "arguments": ["plainTextBits"]}, {"qualifier": "keyStreamGenerator", "member": "getNextKeyStream", "arguments": []}, {"qualifier": "result", "member": "xor", "arguments": ["key"]}], "conditionals": []}, {"name": "resetCounter", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "keyStreamGenerator", "member": "reInitialize", "arguments": []}], "conditionals": []}]}]}
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
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

class A5CipherTest {
    private BitSet sessionKey;
    private BitSet frameCounter;
    private A5Cipher cipher;

    @BeforeEach
    void setUp() {
        sessionKey = new BitSet();
        frameCounter = new BitSet();
        cipher = new A5Cipher(sessionKey, frameCounter);
    }

    @AfterEach
    void tearDown() {
        sessionKey = null;
        frameCounter = null;
        cipher = null;
    }

    @Test
    public void encrypt_shouldXorPlainTextBitsWithKeyStreamAndFrameCounter() {
        // Arrange
        BitSet plainTextBits = new BitSet();
        BitSet keyStream = new BitSet();
        BitSet frameCounterBits = new BitSet();
        when(keyStreamGenerator.getNextKeyStream()).thenReturn(keyStream);
        when(frameCounter.xor(plainTextBits)).thenReturn(frameCounterBits);

        // Act
        BitSet result = cipher.encrypt(plainTextBits);

        // Assert
        verify(result).xor(plainTextBits);
        verify(keyStreamGenerator).getNextKeyStream();
        verify(result).xor(key);
    }
}
```
