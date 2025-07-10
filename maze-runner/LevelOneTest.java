query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "main.game", "imports": ["main.game_objects.Key", "main.game_objects.Player", "main.game_objects.Torch", "java.awt.event.KeyEvent", "java.awt.event.KeyListener", "java.util.ArrayList"], "classes": [{"class_name": "LevelOne", "modifiers": [], "fields": [{"name": "NUMBER_OF_KEYS", "type": "int"}, {"name": "gameMap", "type": "GameMap"}, {"name": "player", "type": "Player"}, {"name": "display", "type": "Display"}, {"name": "progressListener", "type": "ProgressListener"}, {"name": "torch", "type": "Torch"}, {"name": "keys", "type": "ArrayList"}], "constructors": [{"parameters": [{"name": "gameMap", "type": "GameMap"}, {"name": "player", "type": "Player"}, {"name": "display", "type": "Display"}], "modifiers": []}], "methods": [{"name": "addProgressListener", "modifiers": [], "return_type": "void", "parameters": [{"name": "progressListener", "type": "ProgressListener"}], "invocations": [], "conditionals": []}, {"name": "init", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "gameMap", "member": "addToMap", "arguments": ["player"]}, {"qualifier": "gameMap", "member": "getRandomPosition", "arguments": []}, {"qualifier": "keys", "member": "add", "arguments": ["key"]}, {"qualifier": "gameMap", "member": "addToMap", "arguments": ["key"]}, {"qualifier": "gameMap", "member": "getRandomPosition", "arguments": []}, {"qualifier": "gameMap", "member": "addToMap", "arguments": ["torch"]}, {"qualifier": "display", "member": "update", "arguments": ["keys"]}], "conditionals": []}, {"name": "start", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "player", "member": "isDead", "arguments": []}, {"qualifier": "progressListener", "member": "levelFailed", "arguments": []}, {"qualifier": "keys", "member": "size", "arguments": []}, {"qualifier": "gameMap", "member": "removeFromMap", "arguments": ["torch"]}, {"qualifier": "progressListener", "member": "levelOneCompleted", "arguments": []}, {"qualifier": "Thread", "member": "sleep", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1000)"]}, {"qualifier": "e", "member": "printStackTrace", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isDead, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=keys, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": false}]}, {"name": "checkIfPlayerHasReachedItem", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "player", "member": "getPosition", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=key, selectors=[], type_arguments=None)"]}, {"qualifier": "key", "member": "getPosition", "arguments": []}, {"qualifier": "keys", "member": "remove", "arguments": ["key"]}, {"qualifier": "keys", "member": "trimToSize", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=keys, selectors=[], type_arguments=None)"]}, {"qualifier": "keys", "member": "size", "arguments": []}, {"qualifier": "player", "member": "hasTorch", "arguments": []}, {"qualifier": "player", "member": "getPosition", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=torch, selectors=[], type_arguments=None)"]}, {"qualifier": "torch", "member": "getPosition", "arguments": []}, {"qualifier": "player", "member": "foundTorch", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[MethodInvocation(arguments=[MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=key, selectors=[], type_arguments=None)], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": false}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=hasTorch, postfix_operators=[], prefix_operators=['!'], qualifier=player, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[MethodInvocation(arguments=[MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=torch, selectors=[], type_arguments=None)], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operator=&&)", "has_else": false}]}, {"name": "keyPressed", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "e", "type": "KeyEvent"}], "invocations": [{"qualifier": "e", "member": "getKeyCode", "arguments": []}, {"qualifier": "e", "member": "getKeyCode", "arguments": []}, {"qualifier": "gameMap", "member": "validateMovement", "arguments": ["player", "DIRECTION"]}, {"qualifier": "gameMap", "member": "removeFromMap", "arguments": ["player"]}, {"qualifier": "player", "member": "move", "arguments": ["DIRECTION"]}, {"qualifier": "gameMap", "member": "addToMap", "arguments": ["player"]}, {"qualifier": "", "member": "checkIfPlayerHasReachedItem", "arguments": []}, {"qualifier": "player", "member": "reduceHealthLevelBy", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "display", "member": "update", "arguments": ["keys"]}, {"qualifier": "display", "member": "invalidMovementMessage", "arguments": []}, {"qualifier": "display", "member": "update", "arguments": ["keys"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=player, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), MemberReference(member=DIRECTION, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=validateMovement, postfix_operators=[], prefix_operators=[], qualifier=gameMap, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "keyTyped", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "e", "type": "KeyEvent"}], "invocations": [], "conditionals": []}, {"name": "keyReleased", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "e", "type": "KeyEvent"}], "invocations": [], "conditionals": []}]}]}


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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LevelOneTest {
    private GameMap gameMap;
    private Player player;
    private Display display;
    private ProgressListener progressListener;
    private Torch torch;
    private ArrayList<Key> keys;

    @BeforeEach
    void setUp() {
        this.gameMap = mock(GameMap.class);
        this.player = mock(Player.class);
        this.display = mock(Display.class);
        this.progressListener = mock(ProgressListener.class);
        this.torch = mock(Torch.class);
        this.keys = new ArrayList<>();
    }

    @Test
    void addProgressListener() {
        LevelOne levelOne = new LevelOne(gameMap, player, display);
        levelOne.addProgressListener(progressListener);
        verify(levelOne).addProgressListener(progressListener);
    }

    @Test
    void init() {
        LevelOne levelOne = new LevelOne(gameMap, player, display);
        levelOne.init();
        verify(gameMap).addToMap(player);
        verify(gameMap).getRandomPosition();
        verify(keys).add(key);
        verify(gameMap).addToMap(key);
        verify(gameMap).getRandomPosition();
        verify(gameMap).addToMap(torch);
        verify(display).update(keys);
    }

    @Test
    void start() {
        LevelOne levelOne = new LevelOne(gameMap, player, display);
        when(player.isDead()).thenReturn(false);
        levelOne.start();
        verify(progressListener).levelFailed();
        verify(keys).size();
        verify(gameMap).removeFromMap(torch);
        verify(progressListener).levelOneCompleted();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void checkIfPlayerHasReachedItem() {
        LevelOne levelOne = new LevelOne(gameMap, player, display);
        when(player.getPosition()).thenReturn(key.getPosition());
        levelOne.checkIfPlayerHasReachedItem();
        verify(player).getPosition();
        verify(null).equals(key.getPosition());
        verify(keys).remove(key);
        verify(keys).trimToSize();
        verify(System.out).println(keys.size());
        verify(player).hasTorch();
        verify(player).getPosition();
        verify(null).equals(torch.getPosition());
        verify(player).foundTorch();
    }

    @Test
    void keyPressed() {
        LevelOne levelOne = new LevelOne(gameMap, player, display);
        when(e.getKeyCode()).thenReturn(KeyEvent.VK_UP);
        levelOne.keyPressed(e);
        verify(e).getKeyCode();
        verify(e).getKeyCode();
        verify(gameMap).validateMovement(player, DIRECTION);
        verify(gameMap).removeFromMap(player);
        verify(player).move(DIRECTION);
        verify(gameMap).addToMap(player);
        verify(levelOne).checkIfPlayerHasReachedItem();
        verify(player).reduceHealthLevelBy(1);
        verify(display).update(keys);
        verify(display).invalidMovementMessage();
        verify(display).update(keys);
    }

    @Test
    void keyTyped() {
        LevelOne levelOne = new LevelOne(gameMap, player, display);
        when(e.getKeyCode()).thenReturn(KeyEvent.VK_UP);
        levelOne.keyTyped(e);
        verify(e).getKeyCode();
    }

    @Test
    void keyReleased() {
        LevelOne levelOne = new LevelOne(gameMap, player, display);
        when(e.getKeyCode()).thenReturn(KeyEvent.VK_UP);
        levelOne.keyReleased(e);
        verify(e).getKeyCode();
    }
}
```
