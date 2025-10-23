
// RefactoredOrder.java
// This is the refactored, cohesive Order class.

import java.util.List;
import java.util.ArrayList;

public class RefactoredOrder {
    private int orderId;
    private List<String> products;
    private double totalAmount;
    private RefactoredCustomer customer; // HAS-A relationship

    public RefactoredOrder(int orderId, RefactoredCustomer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void calculateTotal(double price) {
        totalAmount += price;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        customer.printCustomerDetails();
        System.out.println("Products: " + products);
        System.out.println("Total Amount: " + totalAmount);
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public RefactoredCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(RefactoredCustomer customer) {
        this.customer = customer;
    }
}
