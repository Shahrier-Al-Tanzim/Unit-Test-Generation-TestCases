// System.out.println("\n\n\t*Courses List*\n \n \"Maths\" \t\"English\" \n\"Computer Science\" \t \"IT\" ");
// Above line game the error
// (ragvenv) PS C:\Thesis\RagPipe\ragvenv> python .\RagPipeline.py
// Java syntax error: Expected ')'

// it was fixed to 
// System.out.println("\n\n\t*Courses List*\n \n \\\"Maths\\\" \t\\\"English\\\" \n\\\"Computer Science\\\" \t \\\"IT\\\" ");

query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "pack1", "imports": ["java.util.Scanner"], "classes": [{"class_name": "Student", "modifiers": ["public"], "fields": [{"name": "firstname", "type": "String"}, {"name": "lastname", "type": "String"}, {"name": "gradlevel", "type": "int"}, {"name": "Courses", "type": "String"}, {"name": "enrollchoice", "type": "String"}, {"name": "cost", "type": "int"}, {"name": "id", "type": "int"}, {"name": "sc", "type": "Scanner"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "Id", "modifiers": ["private"], "return_type": "int", "parameters": [], "invocations": [], "conditionals": []}, {"name": "Enroll", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n\n\t*Courses List*\n \n \\\"Maths\\\" \t\\\"English\\\" \n\\\"Computer Science\\\" \t \\\"IT\\\" \")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n\nEnter '1' to enroll and '0' to not enroll !!\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\nDo you want to enroll for \"), operandr=MemberReference(member=Courses, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=+)"]}, {"qualifier": "sc", "member": "nextInt", "arguments": []}, {"qualifier": "", "member": "balence", "arguments": []}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=choice, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1), operator===)", "has_else": false}]}, {"name": "balence", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Remaining balence is Rs: \"), operandr=MemberReference(member=cost, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}], "conditionals": []}, {"name": "paytut", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"How much do you want to pay : Rs \")"]}, {"qualifier": "sc", "member": "nextInt", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Thank you for your payment Rs \"), operandr=MemberReference(member=pay, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "", "member": "balence", "arguments": []}], "conditionals": []}, {"name": "stat", "modifiers": [], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"------------------------------------\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n\t Student Name : \"), operandr=MemberReference(member=firstname, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \"), operator=+), operandr=MemberReference(member=lastname, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n\t Graduation Level : \"), operandr=MemberReference(member=gradlevel, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" year\"), operator=+)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n\t Enrollment ID : \"), operandr=MethodInvocation(arguments=[], member=Id, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "", "member": "Id", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n\tEnrolled courses are: \")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\t\t\t\t\"), operandr=MemberReference(member=enrollchoice, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operator=+)"]}, {"qualifier": "", "member": "balence", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"--------Total paid--------- \")"]}], "conditionals": [{"condition": "BinaryOperation(operandl=MemberReference(member=enrollchoice, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[ArraySelector(index=MemberReference(member=i, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]))]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=)", "has_else": false}, {"condition": "BinaryOperation(operandl=MemberReference(member=cost, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0), operator=!=)", "has_else": true}]}]}]}


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
package pack1;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentTest {
    private Scanner sc;
    private Student student;

    @BeforeEach
    void setup() {
        sc = mock(Scanner.class);
        student = new Student();
    }

    @Test
    public void testId() {
        int id = 1234567890;
        when(sc.nextInt()).thenReturn(id);
        assertEquals(id, student.Id());
    }

    @Test
    public void testEnroll() {
        String choice = "1";
        when(sc.nextLine()).thenReturn(choice);
        student.Enroll();
        verify(System.out).println("Courses List:");
        verify(System.out).println("\n\t*Maths*\n\t*English*\n\t*Computer Science*\n\t*IT*\n");
        verify(System.out).println("Enter '1' to enroll and '0' to not enroll !!");
        verify(System.out).println("\nDo you want to enroll for \n" + student.Courses[i] + " ?");
        verify(sc).nextInt();
        verify(student).balence();
    }

    @Test
    public void testBalence() {
        int cost = 100;
        when(sc.nextInt()).thenReturn(cost);
        student.paytut();
        verify(System.out).println("How much do you want to pay : Rs " + cost + " ?");
        verify(sc).nextInt();
        verify(System.out).println("Thank you for your payment Rs " + cost + " !");
        verify(student).balence();
    }

    @Test
    public void testStat() {
        student.stat();
        verify(System.out).println("------------------------------------");
        verify(System.out).println("\n\t Student Name : " + student.firstname + " " + student.lastname);
        verify(System.out).println("\n\t Graduation Level : " + student.gradlevel + " year");
        verify(System.out).println("\n\t Enrollment ID : " + student.Id());
        verify(System.out).println("\n\tEnrolled courses are: ");
        for (int i = 0; i < student.Courses.length; i++) {
            verify(System.out).println("\t\t\t\t" + student.enrollchoice[i]);
        }
        verify(System.out).println("--------Total paid--------- ");
    }
}
```
