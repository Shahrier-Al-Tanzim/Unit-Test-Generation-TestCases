query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "main.game", "imports": ["main.game_objects.Key", "main.game_objects.Player", "java.io.IOException", "java.util.ArrayList", "java.util.Scanner", "main.maze_generator.MazeGenerator"], "classes": [{"class_name": "Display", "modifiers": [], "fields": [{"name": "FOG", "type": "char"}, {"name": "map", "type": "char"}, {"name": "player", "type": "Player"}, {"name": "height", "type": "int"}, {"name": "width", "type": "int"}], "constructors": [{"parameters": [{"name": "map", "type": "char"}, {"name": "player", "type": "Player"}], "modifiers": []}], "methods": [{"name": "update", "modifiers": [], "return_type": "void", "parameters": [{"name": "keys", "type": "ArrayList"}], "invocations": [{"qualifier": "", "member": "clearScreen", "arguments": []}, {"qualifier": "", "member": "createCoveredMap", "arguments": []}, {"qualifier": "System.out", "member": "print", "arguments": ["ClassCreator(arguments=[MemberReference(member=displayMap, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=row, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=String, sub_type=None))"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tKey(s) collected: %d/%d\n\")", "BinaryOperation(operandl=MemberReference(member=NUMBER_OF_KEYS, postfix_operators=[], prefix_operators=[], qualifier=LevelOne, selectors=[]), operandr=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=keys, selectors=[], type_arguments=None), operator=-)", "NUMBER_OF_KEYS"]}, {"qualifier": "keys", "member": "size", "arguments": []}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tHint to the nearest key: %s\n\")", "MethodInvocation(arguments=[MemberReference(member=keys, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=getNearestKeyHints, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None)"]}, {"qualifier": "", "member": "getNearestKeyHints", "arguments": ["keys"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tVisibility: %d blocks\n\")", "MethodInvocation(arguments=[], member=getVisibility, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None)"]}, {"qualifier": "player", "member": "getVisibility", "arguments": []}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tHealth: %d/%d\n\")", "TernaryExpression(condition=MethodInvocation(arguments=[], member=isDead, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None), if_false=MethodInvocation(arguments=[], member=getHealthLevel, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None), if_true=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0))", "INITIAL_HEALTH_LEVEL"]}, {"qualifier": "player", "member": "isDead", "arguments": []}, {"qualifier": "player", "member": "getHealthLevel", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": []}, {"name": "getNearestKeyHints", "modifiers": ["private"], "return_type": "String", "parameters": [{"name": "keys", "type": "ArrayList"}], "invocations": [{"qualifier": "keys", "member": "size", "arguments": []}, {"qualifier": "keys", "member": "size", "arguments": []}, {"qualifier": "keys", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": null, "member": "getDirectionHints", "arguments": ["MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None)"]}, {"qualifier": "player", "member": "getPosition", "arguments": []}, {"qualifier": "keys", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": "keys", "member": "size", "arguments": []}, {"qualifier": "keys", "member": "get", "arguments": ["i"]}, {"qualifier": null, "member": "distanceTo", "arguments": ["player"]}, {"qualifier": "nearestKey", "member": "distanceTo", "arguments": ["player"]}, {"qualifier": "keys", "member": "get", "arguments": ["i"]}, {"qualifier": "nearestKey", "member": "getDirectionHints", "arguments": ["MethodInvocation(arguments=[], member=getPosition, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None)"]}, {"qualifier": "player", "member": "getPosition", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=keys, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=keys, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": true}, {"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=get, postfix_operators=[], prefix_operators=[], qualifier=keys, selectors=[MethodInvocation(arguments=[MemberReference(member=player, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=distanceTo, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=MethodInvocation(arguments=[MemberReference(member=player, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=distanceTo, postfix_operators=[], prefix_operators=[], qualifier=nearestKey, selectors=[], type_arguments=None), operator=<)", "has_else": false}]}, {"name": "update", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "clearScreen", "arguments": []}, {"qualifier": "", "member": "createCoveredMap", "arguments": []}, {"qualifier": "System.out", "member": "print", "arguments": ["ClassCreator(arguments=[MemberReference(member=displayMap, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=row, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))])], body=None, constructor_type_arguments=None, postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], type=ReferenceType(arguments=None, dimensions=None, name=String, sub_type=None))"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tKey(s) collected: %d/%d\n\")", "NUMBER_OF_KEYS", "NUMBER_OF_KEYS"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tHint to the nearest key: -\")"]}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tVisibility: %d blocks\n\")", "MethodInvocation(arguments=[], member=getVisibility, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None)"]}, {"qualifier": "player", "member": "getVisibility", "arguments": []}, {"qualifier": "System.out", "member": "printf", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tHealth: %d/%d\n\")", "TernaryExpression(condition=MethodInvocation(arguments=[], member=isDead, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None), if_false=MethodInvocation(arguments=[], member=getHealthLevel, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None), if_true=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0))", "INITIAL_HEALTH_LEVEL"]}, {"qualifier": "player", "member": "isDead", "arguments": []}, {"qualifier": "player", "member": "getHealthLevel", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": []}, {"name": "createCoveredMap", "modifiers": ["private"], "return_type": "char", "parameters": [], "invocations": [{"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getIcon", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getVisibility", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getVisibility", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getVisibility", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getX", "arguments": []}, {"qualifier": "player", "member": "getVisibility", "arguments": []}, {"qualifier": "player", "member": "getY", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=map, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MethodInvocation(arguments=[], member=getX, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None))]), operandr=MemberReference(member=HORIZONTAL_WALL, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=map, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])), ArraySelector(index=MethodInvocation(arguments=[], member=getX, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None))]), operandr=MemberReference(member=HORIZONTAL_WALL, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=map, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MethodInvocation(arguments=[], member=getY, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None)), ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=VERTICAL_WALL, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=map, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MethodInvocation(arguments=[], member=getY, postfix_operators=[], prefix_operators=[], qualifier=player, selectors=[], type_arguments=None)), ArraySelector(index=MemberReference(member=j, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=MemberReference(member=VERTICAL_WALL, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}]}, {"name": "gameIntroMessage", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "clearScreen", "arguments": []}, {"qualifier": "", "member": "printWithDelay", "arguments": ["intro", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=40)"]}, {"qualifier": "", "member": "delay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=500)"]}, {"qualifier": "input", "member": "equals", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\")"]}, {"qualifier": "s", "member": "nextLine", "arguments": []}], "conditionals": []}, {"name": "winMessage", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "clear", "arguments": ["mid_H", "mid_W"]}, {"qualifier": "", "member": "update", "arguments": []}], "conditionals": []}, {"name": "loseMessage", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "clear", "arguments": ["mid_H", "mid_W"]}, {"qualifier": "", "member": "update", "arguments": []}], "conditionals": []}, {"name": "nextLevelMessage", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "update", "arguments": []}, {"qualifier": "", "member": "delay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=500)"]}, {"qualifier": "", "member": "printWithDelay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\nALL KEYS FOUND! \")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=80)"]}, {"qualifier": "", "member": "delay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=500)"]}, {"qualifier": "", "member": "printWithDelay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"BUT...\nWE'RE NOT DONE YET...\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=80)"]}, {"qualifier": "", "member": "delay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=800)"]}, {"qualifier": "", "member": "printWithDelay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\nFIND THE EXIT BEFORE YOUR HP BECOMES ZERO!\")", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=70)"]}, {"qualifier": "", "member": "delay", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1000)"]}], "conditionals": []}, {"name": "invalidMovementMessage", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"You can't walk through walls, my friend..\")"]}], "conditionals": []}, {"name": "printWithDelay", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "message", "type": "String"}, {"name": "millis", "type": "int"}], "invocations": [{"qualifier": "message", "member": "length", "arguments": []}, {"qualifier": "message", "member": "length", "arguments": []}, {"qualifier": "System.out", "member": "print", "arguments": ["MethodInvocation(arguments=[MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=charAt, postfix_operators=[], prefix_operators=[], qualifier=message, selectors=[], type_arguments=None)"]}, {"qualifier": "message", "member": "charAt", "arguments": ["i"]}, {"qualifier": "", "member": "delay", "arguments": ["millis"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MethodInvocation(arguments=[], member=length, postfix_operators=[], prefix_operators=[], qualifier=message, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=>)", "has_else": false}]}, {"name": "delay", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "millis", "type": "int"}], "invocations": [{"qualifier": "Thread", "member": "sleep", "arguments": ["millis"]}, {"qualifier": "e", "member": "printStackTrace", "arguments": []}], "conditionals": []}, {"name": "clearScreen", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": null, "member": "inheritIO", "arguments": []}, {"qualifier": null, "member": "start", "arguments": []}, {"qualifier": null, "member": "waitFor", "arguments": []}, {"qualifier": "e", "member": "printStackTrace", "arguments": []}], "conditionals": []}, {"name": "clear", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "mid_H", "type": "int"}, {"name": "mid_W", "type": "int"}], "invocations": [], "conditionals": []}]}]}


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


result: import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

class GameTest {
    private Game game;
    private Input input;
    private Output output;
    private Map map;
    private Player player;

    @BeforeEach
    void setUp() {
        input = mock(Input.class);
        output = mock(Output.class);
        map = mock(Map.class);
        player = mock(Player.class);
        game = new Game(input, output, map, player);
    }

    @Test
    void testGameIntroMessage() {
        // Arrange
        when(output.getWidth()).thenReturn(100);
        when(output.getHeight()).thenReturn(50);

        // Act
        game.gameIntroMessage();

        // Assert
        verify(output, times(2)).printWithDelay("intro", 40);
        verify(output).delay(500);
    }

    @Test
    void testWinMessage() {
        // Arrange
        when(map.getAllKeys()).thenReturn(new ArrayList<>());

        // Act
        game.winMessage();

        // Assert
        verify(output).clear(10, 5);
        verify(output).update();
    }

    @Test
    void testLoseMessage() {
        // Arrange
        when(map.getAllKeys()).thenReturn(new ArrayList<>());

        // Act
        game.loseMessage();

        // Assert
        verify(output).clear(10, 5);
        verify(output).update();
    }

    @Test
    void testNextLevelMessage() {
        // Arrange
        when(map.getAllKeys()).thenReturn(new ArrayList<>());

        // Act
        game.nextLevelMessage();

        // Assert
        verify(output).update();
        verify(output).delay(500);
        verify(output).printWithDelay("Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\nALL KEYS FOUND! \")", 80);
        verify(output).delay(500);
        verify(output).printWithDelay("Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"BUT...\nWE'RE NOT DONE YET...\")", 80);
        verify(output).delay(800);
        verify(output).printWithDelay("Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\nFIND THE EXIT BEFORE YOUR HP BECOMES ZERO!\")", 70);
        verify(output).delay(1000);
    }

    @Test
    void testInvalidMovementMessage() {
        // Arrange
        when(input.getDirection()).thenReturn("");

        // Act
        game.invalidMovementMessage();

        // Assert
        verify(output).println("You can't walk through walls, my friend..");
    }
}
