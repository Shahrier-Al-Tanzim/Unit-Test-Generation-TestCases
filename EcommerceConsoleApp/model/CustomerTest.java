query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "org.chris.ecommerce.model", "imports": [], "classes": [{"class_name": "Customer", "modifiers": ["public"], "fields": [{"name": "id", "type": "String"}, {"name": "password", "type": "String"}, {"name": "email", "type": "String"}, {"name": "name", "type": "String"}, {"name": "address", "type": "String"}, {"name": "contactNumber", "type": "String"}], "constructors": [{"parameters": [{"name": "id", "type": "String"}, {"name": "password", "type": "String"}, {"name": "email", "type": "String"}, {"name": "name", "type": "String"}, {"name": "address", "type": "String"}, {"name": "contactNumber", "type": "String"}], "modifiers": ["public"]}, {"parameters": [{"name": "name", "type": "String"}, {"name": "address", "type": "String"}, {"name": "contactNumber", "type": "String"}, {"name": "password", "type": "String"}, {"name": "email", "type": "String"}], "modifiers": ["public"]}, {"parameters": [{"name": "name", "type": "String"}, {"name": "password", "type": "String"}, {"name": "email", "type": "String"}], "modifiers": ["public"]}], "methods": [{"name": "getId", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setId", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "id", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getPassword", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setPassword", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "password", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getName", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setName", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "name", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getCustomerAddress", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setCustomerAddress", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "address", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getContactNumber", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setContactNumber", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "contactNumber", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "getEmail", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setEmail", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "email", "type": "String"}], "invocations": [], "conditionals": []}, {"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [], "conditionals": []}]}]}


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
package org.chris.ecommerce.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CustomerTest {
    private String id = "1234567890";
    private String password = "password";
    private String email = "email@example.com";
    private String name = "John Doe";
    private String address = "123 Main St.";
    private String contactNumber = "555-555-5555";

    @BeforeEach
    void setUp() {
        // Set up required preconditions before each test method
    }

    @Test
    public void getId_shouldReturnId() {
        Customer customer = new Customer(id, password, email, name, address, contactNumber);
        Mockito.when(customer.getId()).thenReturn(id);
        assertEquals(id, customer.getId());
    }

    @Test
    public void setId_shouldSetId() {
        Customer customer = new Customer(name, email, address, contactNumber);
        String newId = "9876543210";
        customer.setId(newId);
        assertEquals(newId, customer.getId());
    }

    @Test
    public void getPassword_shouldReturnPassword() {
        Customer customer = new Customer(id, password, email, name, address, contactNumber);
        Mockito.when(customer.getPassword()).thenReturn(password);
        assertEquals(password, customer.getPassword());
    }

    @Test
    public void setPassword_shouldSetPassword() {
        Customer customer = new Customer(id, name, email, address, contactNumber);
        String newPassword = "newPassword";
        customer.setPassword(newPassword);
        assertEquals(newPassword, customer.getPassword());
    }

    @Test
    public void getName_shouldReturnName() {
        Customer customer = new Customer(id, password, email, name, address, contactNumber);
        Mockito.when(customer.getName()).thenReturn(name);
        assertEquals(name, customer.getName());
    }

    @Test
    public void setName_shouldSetName() {
        Customer customer = new Customer(id, password, email, address, contactNumber);
        String newName = "Jane Doe";
        customer.setName(newName);
        assertEquals(newName, customer.getName());
    }

    @Test
    public void getCustomerAddress_shouldReturnAddress() {
        Customer customer = new Customer(id, password, email, name, address, contactNumber);
        Mockito.when(customer.getCustomerAddress()).thenReturn(address);
        assertEquals(address, customer.getCustomerAddress());
    }

    @Test
    public void setCustomerAddress_shouldSetAddress() {
        Customer customer = new Customer(id, password, email, name, contactNumber);
        String newAddress = "456 Elm St.";
        customer.setCustomerAddress(newAddress);
        assertEquals(newAddress, customer.getCustomerAddress());
    }

    @Test
    public void getContactNumber_shouldReturnContactNumber() {
        Customer customer = new Customer(id, password, email, name, address, contactNumber);
        Mockito.when(customer.getContactNumber()).thenReturn(contactNumber);
        assertEquals(contactNumber, customer.getContactNumber());
    }

    @Test
    public void setContactNumber_shouldSetContactNumber() {
        Customer customer = new Customer(id, password, email, name, address);
        String newContactNumber = "987-654-3210";
        customer.setContactNumber(newContactNumber);
        assertEquals(newContactNumber, customer.getContactNumber());
    }

    @Test
    public void getEmail_shouldReturnEmail() {
        Customer customer = new Customer(id, password, email, name, address, contactNumber);
        Mockito.when(customer.getEmail()).thenReturn(email);
        assertEquals(email, customer.getEmail());
    }

    @Test
    public void setEmail_shouldSetEmail() {
        Customer customer = new Customer(id, password, name, address, contactNumber);
        String newEmail = "newEmail@example.com";
        customer.setEmail(newEmail);
        assertEquals(newEmail, customer.getEmail());
    }
}
```
