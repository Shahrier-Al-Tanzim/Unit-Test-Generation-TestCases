query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "main.game", "imports": ["main.game_objects.Player", "javax.swing", "java.util.Scanner"], "classes": [{"class_name": "Game", "modifiers": ["public"], "fields": [{"name": "isVisibilityMode", "type": "boolean"}, {"name": "jFrame", "type": "JFrame"}, {"name": "gameMap", "type": "GameMap"}, {"name": "player", "type": "Player"}, {"name": "display", "type": "Display"}, {"name": "levelOne", "type": "LevelOne"}, {"name": "levelTwo", "type": "LevelTwo"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "init", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter maze height (min 5): \")"]}, {"qualifier": "s", "member": "hasNextInt", "arguments": []}, {"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"That's not a number! Enter again: \")"]}, {"qualifier": "s", "member": "next", "arguments": []}, {"qualifier": "s", "member": "nextInt", "arguments": []}, {"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter maze width (min 5): \")"]}, {"qualifier": "s", "member": "hasNextInt", "arguments": []}, {"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"That's not a number! Enter again: \")"]}, {"qualifier": "s", "member": "next", "arguments": []}, {"qualifier": "s", "member": "nextInt", "arguments": []}, {"qualifier": "gameMap", "member": "getRandomPosition", "arguments": []}, {"qualifier": "gameMap", "member": "getMap", "arguments": []}, {"qualifier": "display", "member": "gameIntroMessage", "arguments": []}], "conditionals": []}, {"name": "setupWindowForKeyListener", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "jFrame", "member": "setVisible", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=true)"]}, {"qualifier": "jFrame", "member": "setSize", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=100)", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=100)"]}, {"qualifier": "jFrame", "member": "setDefaultCloseOperation", "arguments": ["EXIT_ON_CLOSE"]}], "conditionals": []}, {"name": "startLevelOne", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "levelOne", "member": "addProgressListener", "arguments": ["This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[])"]}, {"qualifier": "jFrame", "member": "addKeyListener", "arguments": ["levelOne"]}, {"qualifier": "levelOne", "member": "start", "arguments": []}], "conditionals": []}, {"name": "startLevelTwo", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "levelTwo", "member": "setProgressListener", "arguments": ["This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[])"]}, {"qualifier": "jFrame", "member": "addKeyListener", "arguments": ["levelTwo"]}, {"qualifier": "levelTwo", "member": "start", "arguments": []}], "conditionals": []}, {"name": "levelOneCompleted", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "jFrame", "member": "removeKeyListener", "arguments": ["levelOne"]}, {"qualifier": "display", "member": "nextLevelMessage", "arguments": []}, {"qualifier": "", "member": "startLevelTwo", "arguments": []}], "conditionals": []}, {"name": "levelTwoCompleted", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "jFrame", "member": "removeKeyListener", "arguments": ["levelTwo"]}, {"qualifier": "display", "member": "winMessage", "arguments": []}, {"qualifier": "System", "member": "exit", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": []}, {"name": "levelFailed", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "display", "member": "loseMessage", "arguments": []}, {"qualifier": "System", "member": "exit", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": []}]}]}


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


result: Here's an example of how you could write unit tests for the `Game` class using JUnit 5 and Mockito:
```java
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Scanner;

import javax.swing.JFrame;

import main.game_objects.Player;
import main.game.Game;

class GameTest {
    private Game game;
    private JFrame jFrame;
    private Player player;
    private Scanner s;

    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs
        game = new Game();
        jFrame = mock(JFrame.class);
        player = mock(Player.class);
        s = mock(Scanner.class);
    }

    @AfterEach
    void tearDown() {
        // Clean up after each test method
        verifyNoMoreInteractions(jFrame, player, s);
    }

    @Test
    void init_validInput_setsUpGame() {
        // Arrange
        when(s.hasNextInt()).thenReturn(true);
        when(s.nextInt()).thenReturn(5);
        when(s.hasNextInt()).thenReturn(true);
        when(s.nextInt()).thenReturn(5);

        // Act
        game.init();

        // Assert
        assertEquals(5, game.getMap().getHeight());
        assertEquals(5, game.getMap().getWidth());
    }

    @Test
    void init_invalidInput_throwsException() {
        // Arrange
        when(s.hasNextInt()).thenReturn(false);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> game.init());
    }

    @Test
    void setupWindowForKeyListener_setsUpFrame() {
        // Arrange
        when(jFrame.setVisible(true)).thenReturn(null);
        when(jFrame.setSize(100, 100)).thenReturn(null);
        when(jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)).thenReturn(null);

        // Act
        game.setupWindowForKeyListener();

        // Assert
        verify(jFrame).setVisible(true);
        verify(jFrame).setSize(100, 100);
        verify(jFrame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Test
    void startLevelOne_startsLevel() {
        // Arrange
        when(levelOne.addProgressListener(game)).thenReturn(null);
        when(jFrame.addKeyListener(levelOne)).thenReturn(null);
        when(levelOne.start()).thenReturn(null);

        // Act
        game.startLevelOne();

        // Assert
        verify(levelOne).addProgressListener(game);
        verify(jFrame).addKeyListener(levelOne);
        verify(levelOne).start();
    }

    @Test
    void startLevelTwo_startsLevel() {
        // Arrange
        when(levelTwo.setProgressListener(game)).thenReturn(null);
        when(jFrame.addKeyListener(levelTwo)).thenReturn(null);
        when(levelTwo.start()).thenReturn(null);

        // Act
        game.startLevelTwo();

        // Assert
        verify(levelTwo).setProgressListener(game);
        verify(jFrame).addKeyListener(levelTwo);
        verify(levelTwo).start();
    }

    @Test
    void levelOneCompleted_endsGame() {
        // Arrange
        when(jFrame.removeKeyListener(levelOne)).thenReturn(null);
        when(display.nextLevelMessage()).thenReturn(null);
        when(game.startLevelTwo()).thenReturn(null);

        // Act
        game.levelOneCompleted();

        // Assert
        verify(jFrame).removeKeyListener(levelOne);
        verify(display).nextLevelMessage();
        verify(game).startLevelTwo();
    }

    @Test
    void levelTwoCompleted_endsGame() {
        // Arrange
        when(jFrame.removeKeyListener(levelTwo)).thenReturn(null);
        when(display.winMessage()).thenReturn(null);
        when(System.exit(0)).thenReturn(null);

        // Act
        game.levelTwoCompleted();

        // Assert
        verify(jFrame).removeKeyListener(levelTwo);
        verify(display).winMessage();
        verify(System).exit(0);
    }

    @Test
    void levelFailed_endsGame() {
        // Arrange
        when(display.loseMessage()).thenReturn(null);
        when(System.exit(0)).thenReturn(null);

        // Act
        game.levelFailed();

        // Assert
        verify(display).loseMessage();
        verify(System).exit(0);
    }
}
```
Note that this is just an example and you may need to modify it to fit your specific use case. Also, make sure to import only what is necessary for the test class and not the entire `Game` class.
