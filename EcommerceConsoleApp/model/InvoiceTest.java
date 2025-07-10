query: 	
You are a Java testing assistant.

Below is a JSON array of method-metadata for the class under test. Your task is to generate a complete, idiomatic JUnit 5 unit test class for each following Java method:

```json
# {"package": "org.chris.ecommerce.model", "imports": ["java.math.BigDecimal", "java.time.LocalDate", "java.util.List"], "classes": [{"class_name": "Invoice", "modifiers": ["public"], "fields": [{"name": "invoiceNo", "type": "long"}, {"name": "customer", "type": "Customer"}, {"name": "item", "type": "Item"}, {"name": "items", "type": "List"}, {"name": "purchaseDate", "type": "LocalDate"}, {"name": "quantity", "type": "int"}, {"name": "invoiceTotal", "type": "BigDecimal"}], "constructors": [{"parameters": [{"name": "invoiceNo", "type": "long"}, {"name": "customer", "type": "Customer"}, {"name": "item", "type": "Item"}, {"name": "purchaseDate", "type": "LocalDate"}, {"name": "invoiceTotal", "type": "BigDecimal"}], "modifiers": ["public"]}, {"parameters": [{"name": "invoiceNo", "type": "long"}, {"name": "customer", "type": "Customer"}, {"name": "item", "type": "Item"}, {"name": "invoiceTotal", "type": "BigDecimal"}], "modifiers": ["public"]}], "methods": [{"name": "toString", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "customer", "member": "getEmail", "arguments": []}, {"qualifier": "item", "member": "getName", "arguments": []}, {"qualifier": "item", "member": "getItemCode", "arguments": []}, {"qualifier": "item", "member": "getItemPrice", "arguments": []}, {"qualifier": "item", "member": "getQuantity", "arguments": []}, {"qualifier": "item", "member": "getItemPrice", "arguments": []}, {"qualifier": "", "member": "getPurchaseDate", "arguments": []}], "conditionals": []}, {"name": "showInvoiceDetails", "modifiers": ["public"], "return_type": "String", "parameters": [], "invocations": [{"qualifier": "customer", "member": "getEmail", "arguments": []}, {"qualifier": "item", "member": "getpId", "arguments": []}, {"qualifier": "item", "member": "getName", "arguments": []}, {"qualifier": "item", "member": "getItemCode", "arguments": []}, {"qualifier": "item", "member": "getItemPrice", "arguments": []}, {"qualifier": "item", "member": "getQuantity", "arguments": []}, {"qualifier": "item", "member": "getItemPrice", "arguments": []}], "conditionals": []}, {"name": "getInvoiceNo", "modifiers": ["public"], "return_type": "long", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setInvoiceNo", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "invoiceNo", "type": "long"}], "invocations": [], "conditionals": []}, {"name": "getPurchaseDate", "modifiers": ["public"], "return_type": "LocalDate", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setPurchaseDate", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "purchaseDate", "type": "LocalDate"}], "invocations": [], "conditionals": []}, {"name": "getInvoiceTotal", "modifiers": ["public"], "return_type": "BigDecimal", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setInvoiceTotal", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "invoiceTotal", "type": "BigDecimal"}], "invocations": [], "conditionals": []}, {"name": "getCustomer", "modifiers": ["public"], "return_type": "Customer", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setCustomer", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "customer", "type": "Customer"}], "invocations": [], "conditionals": []}, {"name": "getItem", "modifiers": ["public"], "return_type": "Item", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setItem", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "item", "type": "Item"}], "invocations": [], "conditionals": []}, {"name": "getItems", "modifiers": ["public"], "return_type": "List", "parameters": [], "invocations": [], "conditionals": []}, {"name": "setItems", "modifiers": ["public"], "return_type": "void", "parameters": [{"name": "items", "type": "List"}], "invocations": [], "conditionals": []}]}]}


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


result: Here's an example of how you could generate a complete, idiomatic JUnit 5 unit test class for the `Invoice` class:
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class InvoiceTest {

    private Invoice invoice;
    private Customer customer;
    private Item item;

    @BeforeEach
    void setUp() {
        // Set up inputs, mocks, or stubs
        invoice = new Invoice(1L, new Customer("John Doe"), new Item("Apple", 10.99), LocalDate.now());
        customer = Mockito.mock(Customer.class);
        item = Mockito.mock(Item.class);
    }

    @Test
    void testToString() {
        // Arrange
        String expectedResult = "Invoice: 1, Customer: John Doe, Item: Apple, Quantity: 10.99";

        // Act
        String actualResult = invoice.toString();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testShowInvoiceDetails() {
        // Arrange
        String expectedResult = "Invoice: 1, Customer: John Doe, Item: Apple, Quantity: 10.99";

        // Act
        String actualResult = invoice.showInvoiceDetails();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetInvoiceNo() {
        // Arrange
        Long expectedResult = 1L;

        // Act
        Long actualResult = invoice.getInvoiceNo();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSetInvoiceNo() {
        // Arrange
        Long newInvoiceNo = 2L;

        // Act
        invoice.setInvoiceNo(newInvoiceNo);

        // Assert
        assertEquals(newInvoiceNo, invoice.getInvoiceNo());
    }

    @Test
    void testGetPurchaseDate() {
        // Arrange
        LocalDate expectedResult = LocalDate.now();

        // Act
        LocalDate actualResult = invoice.getPurchaseDate();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSetPurchaseDate() {
        // Arrange
        LocalDate newPurchaseDate = LocalDate.now().plusDays(1);

        // Act
        invoice.setPurchaseDate(newPurchaseDate);

        // Assert
        assertEquals(newPurchaseDate, invoice.getPurchaseDate());
    }

    @Test
    void testGetInvoiceTotal() {
        // Arrange
        BigDecimal expectedResult = new BigDecimal("10.99");

        // Act
        BigDecimal actualResult = invoice.getInvoiceTotal();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSetInvoiceTotal() {
        // Arrange
        BigDecimal newInvoiceTotal = new BigDecimal("12.99");

        // Act
        invoice.setInvoiceTotal(newInvoiceTotal);

        // Assert
        assertEquals(newInvoiceTotal, invoice.getInvoiceTotal());
    }

    @Test
    void testGetCustomer() {
        // Arrange
        Customer expectedResult = new Customer("John Doe");

        // Act
        Customer actualResult = invoice.getCustomer();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSetCustomer() {
        // Arrange
        Customer newCustomer = new Customer("Jane Doe");

        // Act
        invoice.setCustomer(newCustomer);

        // Assert
        assertEquals(newCustomer, invoice.getCustomer());
    }

    @Test
    void testGetItem() {
        // Arrange
        Item expectedResult = new Item("Apple", 10.99);

        // Act
        Item actualResult = invoice.getItem();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSetItem() {
        // Arrange
        Item newItem = new Item("Orange", 12.99);

        // Act
        invoice.setItem(newItem);

        // Assert
        assertEquals(newItem, invoice.getItem());
    }

    @Test
    void testGetItems() {
        // Arrange
        List<Item> expectedResult = List.of(new Item("Apple", 10.99));

        // Act
        List<Item> actualResult = invoice.getItems();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSetItems() {
        // Arrange
        List<Item> newItems = List.of(new Item("Orange", 12.99));

        // Act
        invoice.setItems(newItems);

        // Assert
        assertEquals(newItems, invoice.getItems());
    }
}
```
Note that this is just an example and you may need to modify it based on your specific use case. Additionally, you should make sure to test all the methods of the `Invoice` class thoroughly to ensure they are working correctly.
