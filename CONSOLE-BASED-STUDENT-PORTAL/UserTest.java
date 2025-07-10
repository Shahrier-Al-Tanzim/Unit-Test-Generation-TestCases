query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": null, "imports": ["java.util.Scanner", "java.io.File", "java.io.FileInputStream", "java.io.FileOutputStream", "java.io.ObjectInputStream", "java.io.ObjectOutputStream", "java.util.ArrayList"], "classes": [{"class_name": "User", "modifiers": [], "fields": [{"name": "sc", "type": "Scanner"}, {"name": "f", "type": "File"}, {"name": "student", "type": "ArrayList"}, {"name": "fis", "type": "FileInputStream"}, {"name": "fos", "type": "FileOutputStream"}, {"name": "oos", "type": "ObjectOutputStream"}, {"name": "ois", "type": "ObjectInputStream"}, {"name": "st", "type": "StudentProfile"}], "constructors": [], "methods": [{"name": "show", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "ois", "member": "readObject", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[], member=size, postfix_operators=[], prefix_operators=[], qualifier=al, selectors=[], type_arguments=None)"]}, {"qualifier": "al", "member": "size", "arguments": []}, {"qualifier": "al", "member": "get", "arguments": ["index"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Profile*****************\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tName = \"), operandr=MethodInvocation(arguments=[], member=getName, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getName", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tRegistration Number = \"), operandr=MethodInvocation(arguments=[], member=getRegnumber, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getRegnumber", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tBranch = \"), operandr=MethodInvocation(arguments=[], member=getBranch, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getBranch", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tYear = \"), operandr=MethodInvocation(arguments=[], member=getYear, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getYear", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tGender = \"), operandr=MethodInvocation(arguments=[], member=getGender, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getGender", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tDate of birth = \"), operandr=MethodInvocation(arguments=[], member=getDob, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getDob", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tMother's name = \"), operandr=MethodInvocation(arguments=[], member=getMname, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getMname", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tFather's name = \"), operandr=MethodInvocation(arguments=[], member=getFname, postfix_operators=[], prefix_operators=[], qualifier=s, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "s", "member": "getFname", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Profile*****************\n\")"]}, {"qualifier": "fis", "member": "close", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tSorry !!! please try again\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}], "conditionals": []}, {"name": "changePass", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter new User name : \")"]}, {"qualifier": "sc", "member": "next", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter new 4 digit numeric password : \")"]}, {"qualifier": "sc", "member": "nextInt", "arguments": []}, {"qualifier": "ois", "member": "readObject", "arguments": []}, {"qualifier": "result", "member": "concat", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=user, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\" \"), operator=+), operandr=MemberReference(member=pass, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator=+)"]}, {"qualifier": "al", "member": "set", "arguments": ["index", "result"]}, {"qualifier": "oos", "member": "writeObject", "arguments": ["al"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tPassword has been Changed\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "fos", "member": "flush", "arguments": []}, {"qualifier": "fos", "member": "close", "arguments": []}, {"qualifier": "fis", "member": "close", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tSorry !!! please try again\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}], "conditionals": []}, {"name": "updateP", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter Name : \")"]}, {"qualifier": "sc", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter Numeric Registration number : \")"]}, {"qualifier": "sc", "member": "nextLong", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter  Branch name : \")"]}, {"qualifier": "sc", "member": "next", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter Your gender(Male/Female) : \")"]}, {"qualifier": "sc", "member": "next", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter your current Academic year : \")"]}, {"qualifier": "sc", "member": "nextInt", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter your date of birth(day/month/year) : \")"]}, {"qualifier": "sc", "member": "nextLine", "arguments": []}, {"qualifier": "sc", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter your Mother's name : \")"]}, {"qualifier": "sc", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter Your Father's Name : \")"]}, {"qualifier": "sc", "member": "nextLine", "arguments": []}, {"qualifier": "st", "member": "setName", "arguments": ["name"]}, {"qualifier": "st", "member": "setRegnumber", "arguments": ["regnumber"]}, {"qualifier": "st", "member": "setBranch", "arguments": ["branch"]}, {"qualifier": "st", "member": "setGender", "arguments": ["gender"]}, {"qualifier": "st", "member": "setYear", "arguments": ["year"]}, {"qualifier": "st", "member": "setDob", "arguments": ["dob"]}, {"qualifier": "st", "member": "setMname", "arguments": ["mname"]}, {"qualifier": "st", "member": "setFname", "arguments": ["fname"]}, {"qualifier": "ois", "member": "readObject", "arguments": []}, {"qualifier": "al", "member": "set", "arguments": ["index", "st"]}, {"qualifier": "oos", "member": "writeObject", "arguments": ["al"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\t profile is updated successfully\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "fos", "member": "flush", "arguments": []}, {"qualifier": "fos", "member": "close", "arguments": []}, {"qualifier": "fis", "member": "close", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tSorry !!! please try again\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}], "conditionals": []}, {"name": "delete", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "ois", "member": "readObject", "arguments": []}, {"qualifier": "al", "member": "remove", "arguments": ["index"]}, {"qualifier": "oos", "member": "writeObject", "arguments": ["al"]}, {"qualifier": "ois", "member": "readObject", "arguments": []}, {"qualifier": "all", "member": "remove", "arguments": ["index"]}, {"qualifier": "oos", "member": "writeObject", "arguments": ["all"]}, {"qualifier": "fos", "member": "flush", "arguments": []}, {"qualifier": "fos", "member": "close", "arguments": []}, {"qualifier": "fis", "member": "close", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\tSorry !!! please try again\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n*******************Result*****************\n\")"]}], "conditionals": []}, {"name": "menu", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "index", "type": "int"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"1. Show Profile\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"2. Change Password and Username \")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"3. Update Profile\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"4. Delete Account\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"5. Logout\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter choice : \")"]}, {"qualifier": "sc", "member": "nextInt", "arguments": []}, {"qualifier": null, "member": "show", "arguments": ["index"]}, {"qualifier": null, "member": "changePass", "arguments": ["index"]}, {"qualifier": null, "member": "updateP", "arguments": ["index"]}, {"qualifier": null, "member": "delete", "arguments": ["index"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n**********Successfully Deleted**********\n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n**********Successfully logout**********\n\")"]}], "conditionals": []}]}]}


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
8. Import only what's necessary: JUnit 5, Mockito, and the class under test.
9. Return only a complete Java test class, no explanation.


result: import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

class StudentTest {
    private List<Student> students = new ArrayList<>();
    private Student student;

    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Doe"));
        student = new Student("Alice", "Smith");
    }

    @Test
    void show() {
        // Arrange
        Mockito.when(student.getName()).thenReturn("Alice Smith");

        // Act
        String result = student.show();

        // Assert
        assertEquals("Alice Smith", result);
    }

    @Test
    void changePass() {
        // Arrange
        Mockito.when(student.getName()).thenReturn("Alice Smith");
        Mockito.doNothing().when(student).changePass();

        // Act
        student.changePass();

        // Assert
        verify(student, times(1)).changePass();
    }

    @Test
    void updateP() {
        // Arrange
        Mockito.when(student.getName()).thenReturn("Alice Smith");
        Mockito.doNothing().when(student).updateP();

        // Act
        student.updateP();

        // Assert
        verify(student, times(1)).updateP();
    }

    @Test
    void delete() {
        // Arrange
        Mockito.when(student.getName()).thenReturn("Alice Smith");
        Mockito.doNothing().when(students).remove(0);

        // Act
        students.delete(0);

        // Assert
        verify(students, times(1)).remove(0);
    }
}
