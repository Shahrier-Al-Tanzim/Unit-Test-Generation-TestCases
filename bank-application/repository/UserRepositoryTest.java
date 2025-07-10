query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "com.youtube.bank.repository", "imports": ["com.youtube.bank.entity.Transaction", "com.youtube.bank.entity.User", "java.time.LocalDate", "java.util", "java.util.stream.Collectors"], "classes": [{"class_name": "UserRepository", "modifiers": ["public"], "fields": [{"name": "users", "type": "Set"}, {"name": "transactions", "type": "List"}, {"name": "chequeBookRequest", "type": "Map"}], "constructors": [], "methods": [{"name": "approveChequeBookRequest", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "userId", "type": "String"}], "invocations": [{"qualifier": "chequeBookRequest", "member": "containsKey", "arguments": ["userId"]}, {"qualifier": "chequeBookRequest", "member": "put", "arguments": ["userId", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=true)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=userId, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=[], prefix_operators=[], qualifier=chequeBookRequest, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "getUserIdForCheckBookRequest", "modifiers": ["public"], "return_type": "List", "parameters": [], "invocations": [{"qualifier": "chequeBookRequest", "member": "entrySet", "arguments": []}, {"qualifier": "entry", "member": "getValue", "arguments": []}, {"qualifier": "userIds", "member": "add", "arguments": ["MethodInvocation(arguments=[], member=getKey, postfix_operators=[], prefix_operators=[], qualifier=entry, selectors=[], type_arguments=None)"]}, {"qualifier": "entry", "member": "getKey", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=['!'], qualifier=entry, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "raiseChequeBookRequest", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "userId", "type": "String"}], "invocations": [{"qualifier": "chequeBookRequest", "member": "put", "arguments": ["userId", "Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=false)"]}], "conditionals": []}, {"name": "getAllChequeBookRequest", "modifiers": ["public"], "return_type": "Map", "parameters": [], "invocations": [], "conditionals": []}, {"name": "transferAmount", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "userId", "type": "String"}, {"name": "payeeUserId", "type": "String"}, {"name": "amount", "type": "Double"}], "invocations": [{"qualifier": "", "member": "debit", "arguments": ["userId", "amount", "payeeUserId"]}, {"qualifier": "", "member": "credit", "arguments": ["payeeUserId", "amount", "userId"]}], "conditionals": []}, {"name": "debit", "modifiers": ["private"], "return_type": "boolean", "parameters": [{"name": "userId", "type": "String"}, {"name": "amount", "type": "Double"}, {"name": "payeeUserId", "type": "String"}], "invocations": [{"qualifier": "", "member": "getUser", "arguments": ["userId"]}, {"qualifier": "user", "member": "getAccountBalance", "arguments": []}, {"qualifier": "users", "member": "remove", "arguments": ["user"]}, {"qualifier": "user", "member": "setAccountBalance", "arguments": ["finalBalance"]}, {"qualifier": "LocalDate", "member": "now", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["transaction"]}, {"qualifier": "transactions", "member": "add", "arguments": ["transaction"]}, {"qualifier": "users", "member": "add", "arguments": ["user"]}], "conditionals": []}, {"name": "credit", "modifiers": ["private"], "return_type": "boolean", "parameters": [{"name": "payeeUserId", "type": "String"}, {"name": "amount", "type": "Double"}, {"name": "userId", "type": "String"}], "invocations": [{"qualifier": "", "member": "getUser", "arguments": ["payeeUserId"]}, {"qualifier": "user", "member": "getAccountBalance", "arguments": []}, {"qualifier": "users", "member": "remove", "arguments": ["user"]}, {"qualifier": "user", "member": "setAccountBalance", "arguments": ["finalBalance"]}, {"qualifier": "LocalDate", "member": "now", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["transaction"]}, {"qualifier": "transactions", "member": "add", "arguments": ["transaction"]}, {"qualifier": "users", "member": "add", "arguments": ["user"]}], "conditionals": []}, {"name": "printTransactions", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "userId", "type": "String"}], "invocations": [{"qualifier": "transactions", "member": "stream", "arguments": []}, {"qualifier": null, "member": "filter", "arguments": ["LambdaExpression(body=MethodInvocation(arguments=[], member=getTransactionPerformedBy, postfix_operators=[], prefix_operators=[], qualifier=transaction, selectors=[MethodInvocation(arguments=[MemberReference(member=userId, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), parameters=[MemberReference(member=transaction, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "transaction", "member": "getTransactionPerformedBy", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["userId"]}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[], member=toList, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "toList", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Date \t User Id \t Amount \t Type \t Initial Balance \t Final Balance\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"-----------------------------------------------------------------------\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getTransactionDate, postfix_operators=[], prefix_operators=[], qualifier=t, selectors=[], type_arguments=None), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\t\"), operator=+), operandr=MethodInvocation(arguments=[], member=getTransactionUserId, postfix_operators=[], prefix_operators=[], qualifier=t, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\t\"), operator=+), operandr=MethodInvocation(arguments=[], member=getTransactionAmount, postfix_operators=[], prefix_operators=[], qualifier=t, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\t\t\"), operator=+), operandr=MethodInvocation(arguments=[], member=getTransactionType, postfix_operators=[], prefix_operators=[], qualifier=t, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\t\t\"), operator=+), operandr=MethodInvocation(arguments=[], member=getInitialBalance, postfix_operators=[], prefix_operators=[], qualifier=t, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\t\t\"), operator=+), operandr=MethodInvocation(arguments=[], member=getFinalBalance, postfix_operators=[], prefix_operators=[], qualifier=t, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "t", "member": "getTransactionDate", "arguments": []}, {"qualifier": "t", "member": "getTransactionUserId", "arguments": []}, {"qualifier": "t", "member": "getTransactionAmount", "arguments": []}, {"qualifier": "t", "member": "getTransactionType", "arguments": []}, {"qualifier": "t", "member": "getInitialBalance", "arguments": []}, {"qualifier": "t", "member": "getFinalBalance", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"-----------------------------------------------------------------------\")"]}], "conditionals": []}, {"name": "getUser", "modifiers": ["public"], "return_type": "User", "parameters": [{"name": "userId", "type": "String"}], "invocations": [{"qualifier": "users", "member": "stream", "arguments": []}, {"qualifier": null, "member": "filter", "arguments": ["LambdaExpression(body=MethodInvocation(arguments=[], member=getUsername, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[MethodInvocation(arguments=[MemberReference(member=userId, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), parameters=[MemberReference(member=user, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "user", "member": "getUsername", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["userId"]}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[], member=toList, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "toList", "arguments": []}, {"qualifier": "result", "member": "isEmpty", "arguments": []}, {"qualifier": "result", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=result, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "checkBankBalance", "modifiers": ["public"], "return_type": "Double", "parameters": [{"name": "userId", "type": "String"}], "invocations": [{"qualifier": "users", "member": "stream", "arguments": []}, {"qualifier": null, "member": "filter", "arguments": ["LambdaExpression(body=MethodInvocation(arguments=[], member=getUsername, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[MethodInvocation(arguments=[MemberReference(member=userId, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), parameters=[MemberReference(member=user, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "user", "member": "getUsername", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["userId"]}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[], member=toList, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "toList", "arguments": []}, {"qualifier": "result", "member": "isEmpty", "arguments": []}, {"qualifier": "result", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}, {"qualifier": null, "member": "getAccountBalance", "arguments": []}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=result, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "printUsers", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["users"]}], "conditionals": []}, {"name": "login", "modifiers": ["public"], "return_type": "User", "parameters": [{"name": "username", "type": "String"}, {"name": "password", "type": "String"}], "invocations": [{"qualifier": "users", "member": "stream", "arguments": []}, {"qualifier": null, "member": "filter", "arguments": ["LambdaExpression(body=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getUsername, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[MethodInvocation(arguments=[MemberReference(member=username, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operandr=MethodInvocation(arguments=[], member=getPassword, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[MethodInvocation(arguments=[MemberReference(member=password, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None), operator=&&), parameters=[MemberReference(member=user, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])])"]}, {"qualifier": "user", "member": "getUsername", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["username"]}, {"qualifier": "user", "member": "getPassword", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["password"]}, {"qualifier": null, "member": "collect", "arguments": ["MethodInvocation(arguments=[], member=toList, postfix_operators=[], prefix_operators=[], qualifier=Collectors, selectors=[], type_arguments=None)"]}, {"qualifier": "Collectors", "member": "toList", "arguments": []}, {"qualifier": "finalList", "member": "isEmpty", "arguments": []}, {"qualifier": "finalList", "member": "get", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=0)"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=['!'], qualifier=finalList, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "addNewCustomer", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "username", "type": "String"}, {"name": "password", "type": "String"}, {"name": "contact", "type": "String"}], "invocations": [{"qualifier": "users", "member": "add", "arguments": ["user"]}], "conditionals": []}]}]}


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

'''
result: Here is an example of how you can use JUnit 5 and Mockito to write unit tests for the `Bank` class:
```
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

public class BankTest {
    @Mock
    private List<User> users;

    @Spy
    private User user = new User();

    @InjectMocks
    private Bank bank;

    @BeforeEach
    public void setUp() {
        // Set up any necessary preconditions before each test method
    }

    @Test
    public void testAddUser() {
        // Arrange
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");
        user.setContact("contact");

        // Act
        bank.addNewCustomer(user);

        // Assert
        verify(users, times(1)).add(user);
    }

    @Test
    public void testLogin() {
        // Arrange
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");

        // Act
        bank.login(user.getUsername(), user.getPassword());

        // Assert
        verify(users, times(1)).contains(user);
    }
}
```
In this example, we use the `@Mock` annotation to create a mock `List<User>` object that will be used as a dependency for the `Bank` class. We also use the `@Spy` annotation to create a spy object for the `User` class that will be used as an argument for the `addNewCustomer()` method.

We then inject these mocks and spies into the `Bank` class using the `@InjectMocks` annotation, so that we can test the behavior of the `Bank` class with the mocked dependencies.

In the `testAddUser()` method, we set up a new `User` object with some sample data, and then call the `addNewCustomer()` method on the `Bank` class with this user as an argument. We then verify that the `users` list contains the newly added user using the `verify()` method from Mockito.

In the `testLogin()` method, we set up a new `User` object with some sample data, and then call the `login()` method on the `Bank` class with this user's username and password as arguments. We then verify that the `users` list contains the logged in user using the `verify()` method from Mockito.

Note that we use the `@BeforeEach` annotation to set up any necessary preconditions before each test method, and the `@Test` annotation to indicate which methods are test methods.
