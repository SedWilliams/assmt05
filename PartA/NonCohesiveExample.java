
// NonCohesiveExample.java
// This class is not cohesive because it tries to manage two separate entities: customers and orders.

import java.util.List;
import java.util.ArrayList;

public class NonCohesiveExample {
    // Customer fields
    private String customerName;
    private String customerEmail;

    // Order fields
    private int orderId;
    private List<String> products;
    private double totalAmount;

    public NonCohesiveExample(String customerName, String customerEmail, int orderId) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Customer method
    public void printCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + customerEmail);
    }

    // Order methods
    public void addProduct(String product) {
        products.add(product);
    }

    public void calculateTotal(double price) {
        totalAmount += price;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products: " + products);
        System.out.println("Total Amount: " + totalAmount);
    }
}
