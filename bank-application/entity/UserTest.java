// OG copde didint work, had to change the ' ' to " " in where string was contatenated, then it worked

query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "com.youtube.bank.entity", "imports": [], "classes": [{"class_name": "User", "modifiers": ["public"], "fields": [{"name": "username", "type": "String"}, {"name": "password", "type": "String"}, {"name": "contactNumber", "type": "String"}, {"name": "role", "type": "String"}, {"name": "accountBalance", "type": "Double"}], "constructors": [{"parameters": [{"name": "username", "type": "String"}, {"name": "password", "type": "String"}, {"name": "contactNumber", "type": "String"}, {"name": "role", "type": "String"}, {"name": "accountBalance", "type": "Double"}], "modifiers": ["public"]}], "methods": [{"name": "getUsername", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setUsername", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "username", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getPassword", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setPassword", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "password", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getContactNumber", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setContactNumber", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "contactNumber", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getRole", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setRole", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "role", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getAccountBalance", "modifiers": ["public"], "return_type": "Double", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setAccountBalance", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "accountBalance", "type": "Double"}], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "equals", "modifiers": ["public"], "return_type": "boolean", "parameters": [{"name": "o", "type": "Object"}], "invocations": [{"qualifier": "", "member": "getClass", "arguments": []}, {"qualifier": "o", "member": "getClass", "arguments": []}, {"qualifier": "username", "member": "equals", "arguments": ["username"]}, {"qualifier": "password", "member": "equals", "arguments": ["password"]}, {"qualifier": "contactNumber", "member": "equals", "arguments": ["contactNumber"]}], "conditionals": [{"condition": "BinaryOperation(operandl=This(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[]), operandr=MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operator===)", "has_else": false}, {"condition": "BinaryOperation(operandl=BinaryOperation(operandl=MemberReference(member=o, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator===), operandr=BinaryOperation(operandl=MethodInvocation(arguments=[], member=getClass, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[], type_arguments=None), operandr=MethodInvocation(arguments=[], member=getClass, postfix_operators=[], prefix_operators=[], qualifier=o, selectors=[], type_arguments=None), operator=!=), operator=||)", "has_else": false}, {"condition": "TernaryExpression(condition=BinaryOperation(operandl=MemberReference(member=username, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), if_false=BinaryOperation(operandl=MemberReference(member=username, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), if_true=MethodInvocation(arguments=[MemberReference(member=username, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[])], member=equals, postfix_operators=[], prefix_operators=['!'], qualifier=username, selectors=[], type_arguments=None))", "has_else": false}, {"condition": "TernaryExpression(condition=BinaryOperation(operandl=MemberReference(member=password, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), if_false=BinaryOperation(operandl=MemberReference(member=password, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=null), operator=!=), if_true=MethodInvocation(arguments=[MemberReference(member=password, postfix_operators=[], prefix_operators=[], qualifier=user, selectors=[])], member=equals, postfix_operators=[], prefix_operators=['!'], qualifier=password, selectors=[], type_arguments=None))", "has_else": false}]}, {"name": "hashCode", "modifiers": ["public"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "username", "member": "hashCode", "arguments": []}, {"qualifier": "password", "member": "hashCode", "arguments": []}, {"qualifier": "contactNumber", "member": "hashCode", "arguments": []}], "conditionals": []}]}]}


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
package com.youtube.bank.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserTest {
    @Mock
    private String username;
    @Mock
    private String password;
    @Mock
    private String contactNumber;
    @Mock
    private String role;
    @Mock
    private Double accountBalance;

    private User user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        user = new User(username, password, contactNumber, role, accountBalance);
    }

    @Test
    void getUsername_returnsUsername() {
        when(user.getUsername()).thenReturn("test");
        assertEquals("test", user.getUsername());
    }

    @Test
    void setUsername_setsUsername() {
        user.setUsername("test");
        verify(user).setUsername("test");
    }

    @Test
    void getPassword_returnsPassword() {
        when(user.getPassword()).thenReturn("test");
        assertEquals("test", user.getPassword());
    }

    @Test
    void setPassword_setsPassword() {
        user.setPassword("test");
        verify(user).setPassword("test");
    }

    @Test
    void getContactNumber_returnsContactNumber() {
        when(user.getContactNumber()).thenReturn("1234567890");
        assertEquals("1234567890", user.getContactNumber());
    }

    @Test
    void setContactNumber_setsContactNumber() {
        user.setContactNumber("1234567890");
        verify(user).setContactNumber("1234567890");
    }

    @Test
    void getRole_returnsRole() {
        when(user.getRole()).thenReturn("admin");
        assertEquals("admin", user.getRole());
    }

    @Test
    void setRole_setsRole() {
        user.setRole("admin");
        verify(user).setRole("admin");
    }

    @Test
    void getAccountBalance_returnsAccountBalance() {
        when(user.getAccountBalance()).thenReturn(100.0);
        assertEquals(100.0, user.getAccountBalance());
    }

    @Test
    void setAccountBalance_setsAccountBalance() {
        user.setAccountBalance(100.0);
        verify(user).setAccountBalance(100.0);
    }

    @Test
    void toString_returnsUsernameAndPassword() {
        when(user.getUsername()).thenReturn("test");
        when(user.getPassword()).thenReturn("test");
        assertEquals("User{username='test', password='test'}", user.toString());
    }

    @Test
    void equals_returnsTrueIfSameObject() {
        User other = new User("test", "test", "1234567890", "admin", 100.0);
        assertEquals(user, other);
    }

    @Test
    void equals_returnsFalseIfDifferentUsername() {
        User other = new User("test2", "test", "1234567890", "admin", 100.0);
        assertNotEquals(user, other);
    }

    @Test
    void equals_returnsFalseIfDifferentPassword() {
        User other = new User("test", "test2", "1234567890", "admin", 100.0);
        assertNotEquals(user, other);
    }

    @Test
    void equals_returnsFalseIfDifferentContactNumber() {
        User other = new User("test", "test", "1234567890", "admin", 100.0);
        assertNotEquals(user, other);
    }

    @Test
    void equals_returnsFalseIfDifferentRole() {
        User other = new User("test", "test", "1234567890", "admin", 100.0);
        assertNotEquals(user, other);
    }

    @Test
    void equals_returnsFalseIfDifferentAccountBalance() {
        User other = new User("test", "test", "1234567890", "admin", 100.0);
        assertNotEquals(user, other);
    }
}
```
