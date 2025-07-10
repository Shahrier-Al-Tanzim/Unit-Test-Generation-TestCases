query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "org.chris.ecommerce.controller", "imports": ["java.time.LocalDate", "java.time.temporal.ChronoUnit", "java.util.HashMap", "java.util.Iterator", "java.util.Map", "java.util.Scanner", "java.util.Set", "org.chris.ecommerce.model.Customer", "org.chris.ecommerce.model.Invoice", "org.chris.ecommerce.model.Item", "org.chris.ecommerce.utility.DataGeneratorUtil"], "classes": [{"class_name": "EcommerceController", "modifiers": ["public"], "fields": [{"name": "dataGeneratorUtil", "type": "DataGeneratorUtil"}, {"name": "customers", "type": "Map"}, {"name": "items", "type": "Map"}, {"name": "invoices", "type": "Map"}, {"name": "itemCodes", "type": "Map"}, {"name": "consoleScan", "type": "Scanner"}, {"name": "invoice", "type": "Invoice"}], "constructors": [{"parameters": [], "modifiers": ["public"]}], "methods": [{"name": "displayMainMenu", "modifiers": ["private"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"+================================+\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"| Welcome to CyberJab CommandLine Ecommerce! |\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|1. Register |\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|2. Login |\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|3. Exit app. |\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"+================================+\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\nEnter Choice (1, 2, 3) : \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "Integer", "member": "parseInt", "arguments": ["choiceEntered"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter a valid choice (1, 2, 3). Try Again!\")"]}, {"qualifier": "System.out", "member": "println", "arguments": []}], "conditionals": []}, {"name": "displayCustMenu", "modifiers": ["private"], "return_type": "int", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"+==========Customer Menu=========+\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|1. Buy an Item                  |\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|2. Return an Item               |\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|3. Log out                      |\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"+================================+\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter a number (1,2,3) from Customer menu : \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "Integer", "member": "parseInt", "arguments": ["inputToParse"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Something happened with the try!\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Please enter a valid choice. Try again!\")"]}], "conditionals": []}, {"name": "register", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter your details for a new customer account\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Name: \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Email: \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "customers", "member": "containsKey", "arguments": ["email"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Email already exists, Try again..\")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Password: \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Confirm password: \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "password", "member": "equals", "arguments": ["confirmPassword"]}, {"qualifier": "customers", "member": "put", "arguments": ["email", "customer"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Registration Successful\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Password does not match. try again\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"something happened, try again\")"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=confirmPassword, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=[], prefix_operators=[], qualifier=password, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "showItems", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "items", "member": "entrySet", "arguments": []}, {"qualifier": "set", "member": "iterator", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n+=============Items in Stock===================+\")"]}, {"qualifier": "System.out", "member": "print", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|ProductId \t Name \t\t Item Code \t Price |\t \n\")"]}, {"qualifier": "items", "member": "isEmpty", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"No purchases have been made on this account \")"]}, {"qualifier": "iterator", "member": "hasNext", "arguments": []}, {"qualifier": "iterator", "member": "next", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|\"), operandr=MethodInvocation(arguments=[], member=getKey, postfix_operators=[], prefix_operators=[], qualifier=mentry, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\". \"), operator=+), operandr=MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=mentry, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|\"), operator=+)"]}, {"qualifier": "mentry", "member": "getKey", "arguments": []}, {"qualifier": "mentry", "member": "getValue", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"+================================+\")"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[], member=isEmpty, postfix_operators=[], prefix_operators=[], qualifier=items, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "showInvoices", "modifiers": ["private"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "invoices", "member": "entrySet", "arguments": []}, {"qualifier": "set", "member": "iterator", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n+================================+\")"]}, {"qualifier": "iterator", "member": "hasNext", "arguments": []}, {"qualifier": "iterator", "member": "next", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|\"), operandr=MethodInvocation(arguments=[], member=getValue, postfix_operators=[], prefix_operators=[], qualifier=mentry, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"|\"), operator=+)"]}, {"qualifier": "mentry", "member": "getValue", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"+================================+\")"]}], "conditionals": []}, {"name": "buyItem", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "c", "type": "Customer"}], "invocations": [{"qualifier": "", "member": "showItems", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter the product Id of the item you want to purchase\")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "Long", "member": "parseLong", "arguments": ["choice"]}, {"qualifier": "items", "member": "containsKey", "arguments": ["selected"]}, {"qualifier": "items", "member": "get", "arguments": ["selected"]}, {"qualifier": "Math", "member": "random", "arguments": []}, {"qualifier": "item", "member": "getItemTotal", "arguments": []}, {"qualifier": "invoices", "member": "put", "arguments": ["invoiceNo", "invoice"]}, {"qualifier": "itemCodes", "member": "put", "arguments": ["MethodInvocation(arguments=[], member=getItemCode, postfix_operators=[], prefix_operators=[], qualifier=item, selectors=[], type_arguments=None)", "item"]}, {"qualifier": "item", "member": "getItemCode", "arguments": []}, {"qualifier": "invoice", "member": "showInvoiceDetails", "arguments": []}, {"qualifier": "invoice", "member": "toString", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[], member=showInvoiceDetails, postfix_operators=[], prefix_operators=[], qualifier=invoice, selectors=[], type_arguments=None)"]}, {"qualifier": "invoice", "member": "showInvoiceDetails", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["MethodInvocation(arguments=[], member=toString, postfix_operators=[], prefix_operators=[], qualifier=invoice, selectors=[], type_arguments=None)"]}, {"qualifier": "invoice", "member": "toString", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Press Enter to continue\")"]}, {"qualifier": "System.in", "member": "read", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Please enter the product number from the catalog.\")"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=selected, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=[], prefix_operators=[], qualifier=items, selectors=[], type_arguments=None)", "has_else": false}]}, {"name": "ReplaceItem", "modifiers": ["private"], "return_type": "void", "parameters": [{"name": "c", "type": "Customer"}], "invocations": [{"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Welcome \"), operandr=MethodInvocation(arguments=[], member=getEmail, postfix_operators=[], prefix_operators=[], qualifier=c, selectors=[], type_arguments=None), operator=+), operandr=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"!! Your invoice details are:\"), operator=+)"]}, {"qualifier": "c", "member": "getEmail", "arguments": []}, {"qualifier": "", "member": "showInvoices", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter the invoice number.\")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "Long", "member": "parseLong", "arguments": ["input"]}, {"qualifier": "invoices", "member": "containsKey", "arguments": ["invoiceNo"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Invoice found\")"]}, {"qualifier": "invoices", "member": "get", "arguments": ["invoiceNo"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter the itemcode of the item to replace.\")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "itemCodes", "member": "containsKey", "arguments": ["input"]}, {"qualifier": "itemCodes", "member": "get", "arguments": ["input"]}, {"qualifier": "ChronoUnit.DAYS", "member": "between", "arguments": ["MethodInvocation(arguments=[], member=getPurchaseDate, postfix_operators=[], prefix_operators=[], qualifier=enteredInvoice, selectors=[], type_arguments=None)", "MethodInvocation(arguments=[], member=now, postfix_operators=[], prefix_operators=[], qualifier=LocalDate, selectors=[], type_arguments=None)"]}, {"qualifier": "enteredInvoice", "member": "getPurchaseDate", "arguments": []}, {"qualifier": "LocalDate", "member": "now", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Yes, you can return your purchase. Would you like to proceed (enter y for yes or n for no.)\")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "choice", "member": "equals", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"y\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Return successful,Your replaced item is\"), operandr=MethodInvocation(arguments=[], member=toString, postfix_operators=[], prefix_operators=[], qualifier=itemToReplace, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "itemToReplace", "member": "toString", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Press Enter to continue\")"]}, {"qualifier": "System.in", "member": "read", "arguments": []}, {"qualifier": "choice", "member": "equals", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"n\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Returning back to customer menu\")"]}, {"qualifier": "", "member": "displayCustMenu", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Not valid input\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Your purchase is past the 15 day period. You are not able to return or replace your item(s)\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Press Enter to continue\")"]}, {"qualifier": "System.in", "member": "read", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"You dont have this item in your invoice\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Not a valid choice\")"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=invoiceNo, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=[], prefix_operators=[], qualifier=invoices, selectors=[], type_arguments=None)", "has_else": false}, {"condition": "MethodInvocation(arguments=[MemberReference(member=input, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=[], prefix_operators=[], qualifier=itemCodes, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "BinaryOperation(operandl=MemberReference(member=validDate, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[]), operandr=Literal(postfix_operators=[], prefix_operators=['-'], qualifier=None, selectors=[], value=15), operator=>=)", "has_else": true}, {"condition": "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"y\")], member=equals, postfix_operators=[], prefix_operators=[], qualifier=choice, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "MethodInvocation(arguments=[Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"n\")], member=equals, postfix_operators=[], prefix_operators=[], qualifier=choice, selectors=[], type_arguments=None)", "has_else": true}]}, {"name": "startBrowsing", "modifiers": ["public"], "return_type": "void", "parameters": [], "invocations": [{"qualifier": "", "member": "displayMainMenu", "arguments": []}, {"qualifier": "", "member": "register", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter Email and Password:\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Email : \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Password : \")"]}, {"qualifier": "consoleScan", "member": "nextLine", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": []}, {"qualifier": "customers", "member": "containsKey", "arguments": ["cEmail"]}, {"qualifier": "customers", "member": "get", "arguments": ["cEmail"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"\n+======Login Successful!=========+\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["BinaryOperation(operandl=Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Welcome \"), operandr=MethodInvocation(arguments=[], member=getName, postfix_operators=[], prefix_operators=[], qualifier=customer, selectors=[], type_arguments=None), operator=+)"]}, {"qualifier": "customer", "member": "getName", "arguments": []}, {"qualifier": "customer", "member": "getPassword", "arguments": []}, {"qualifier": null, "member": "equals", "arguments": ["cPassword"]}, {"qualifier": "", "member": "showItems", "arguments": []}, {"qualifier": "", "member": "displayCustMenu", "arguments": []}, {"qualifier": "", "member": "buyItem", "arguments": ["customer"]}, {"qualifier": "System.in", "member": "read", "arguments": []}, {"qualifier": "", "member": "ReplaceItem", "arguments": ["customer"]}, {"qualifier": "System.in", "member": "read", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Signed out successfully\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter a valid choice\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Invalid Credentials..Try again\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Invalid Credentials..Try again\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Thank you for using the CyberJab Ecommerce CLI\")"]}, {"qualifier": "System", "member": "exit", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=1)"]}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter a Valid Option!\")"]}, {"qualifier": "System.out", "member": "println", "arguments": []}, {"qualifier": "System.out", "member": "println", "arguments": ["Literal(postfix_operators=[], prefix_operators=[], qualifier=None, selectors=[], value=\"Enter a valid choice. Try Again!\")"]}, {"qualifier": "System.out", "member": "println", "arguments": ["exception"]}], "conditionals": [{"condition": "MethodInvocation(arguments=[MemberReference(member=cEmail, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=containsKey, postfix_operators=[], prefix_operators=[], qualifier=customers, selectors=[], type_arguments=None)", "has_else": true}, {"condition": "MethodInvocation(arguments=[], member=getPassword, postfix_operators=[], prefix_operators=[], qualifier=customer, selectors=[MethodInvocation(arguments=[MemberReference(member=cPassword, postfix_operators=[], prefix_operators=[], qualifier=, selectors=[])], member=equals, postfix_operators=None, prefix_operators=None, qualifier=None, selectors=None, type_arguments=None)], type_arguments=None)", "has_else": true}]}]}]}


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


result: Here's an example of how you could write unit tests for the `EcommerceCLI` class using JUnit 5 and Mockito:
```
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EcommerceCLITest {
  @Mock private ItemRepository itemRepository;
  @Mock private CustomerRepository customerRepository;
  @Mock private OrderRepository orderRepository;

  private EcommerceCLI ecommerceCLI;

  @BeforeEach
  public void setUp() {
    this.ecommerceCLI = new EcommerceCLI(itemRepository, customerRepository, orderRepository);
  }

  @Test
  public void testListItems() {
    // Arrange
    List<Item> items = List.of(new Item("123", "Product 1", 10.99), new Item("456", "Product 2", 19.99));
    when(itemRepository.findAll()).thenReturn(items);

    // Act
    List<Item> result = ecommerceCLI.listItems();

    // Assert
    assertEquals(items, result);
    verify(itemRepository).findAll();
  }

  @Test
  public void testAddItem() {
    // Arrange
    Item item = new Item("123", "Product 1", 10.99);
    when(itemRepository.save(any())).thenReturn(item);

    // Act
    Item result = ecommerceCLI.addItem(item);

    // Assert
    assertEquals(item, result);
    verify(itemRepository).save(any());
  }

  @Test
  public void testRemoveItem() {
    // Arrange
    String itemId = "123";
    when(itemRepository.deleteById(itemId)).thenReturn(true);

    // Act
    boolean result = ecommerceCLI.removeItem(itemId);

    // Assert
    assertTrue(result);
    verify(itemRepository).deleteById(itemId);
  }

  @Test
  public void testListCustomers() {
    // Arrange
    List<Customer> customers = List.of(new Customer("123", "John Doe"), new Customer("456", "Jane Smith"));
    when(customerRepository.findAll()).thenReturn(customers);

    // Act
    List<Customer> result = ecommerceCLI.listCustomers();

    // Assert
    assertEquals(customers, result);
    verify(customerRepository).findAll();
  }

  @Test
  public void testAddCustomer() {
    // Arrange
    Customer customer = new Customer("123", "John Doe");
    when(customerRepository.save(any())).thenReturn(customer);

    // Act
    Customer result = ecommerceCLI.addCustomer(customer);

    // Assert
    assertEquals(customer, result);
    verify(customerRepository).save(any());
  }

  @Test
  public void testRemoveCustomer() {
    // Arrange
    String customerId = "123";
    when(customerRepository.deleteById(customerId)).thenReturn(true);

    // Act
    boolean result = ecommerceCLI.removeCustomer(customerId);

    // Assert
    assertTrue(result);
    verify(customerRepository).deleteById(customerId);
  }

  @Test
  public void testListOrders() {
    // Arrange
    List<Order> orders = List.of(new Order("123", "Product 1", 10.99), new Order("456", "Product 2", 19.99));
    when(orderRepository.findAll()).thenReturn(orders);

    // Act
    List<Order> result = ecommerceCLI.listOrders();

    // Assert
    assertEquals(orders, result);
    verify(orderRepository).findAll();
  }

  @Test
  public void testAddOrder() {
    // Arrange
    Order order = new Order("123", "Product 1", 10.99);
    when(orderRepository.save(any())).thenReturn(order);

    // Act
    Order result = ecommerceCLI.addOrder(order);

    // Assert
    assertEquals(order, result);
    verify(orderRepository).save(any());
  }

  @Test
  public void testRemoveOrder() {
    // Arrange
    String orderId = "123";
    when(orderRepository.deleteById(orderId)).thenReturn(true);

    // Act
    boolean result = ecommerceCLI.removeOrder(orderId);

    // Assert
    assertTrue(result);
    verify(orderRepository).deleteById(orderId);
  }
}
```
In this example, we're using the `@Mock` annotation from Mockito to create mocks of the `ItemRepository`, `CustomerRepository`, and `OrderRepository` classes. We're then creating an instance of the `EcommerceCLI` class in the `@BeforeEach` method and using it in our test methods.

We're also using the `when()` and `verify()` methods from Mockito to stub the behavior of the mocks and verify that they were called as expected.

In each test method, we're setting up the inputs for the method under test (e.g., a list of items or customers) and then calling the method. We're then verifying that the results are what we expect them to be using the `assertEquals()` method from JUnit 5.

Finally, we're using the `@Test` annotation from JUnit 5 to indicate which methods should be run as tests.
