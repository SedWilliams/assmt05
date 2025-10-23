
// CohesiveExample.java
// This class is cohesive because it represents a single entity: a customer.

// Weekend before or week before thanksgiving
// if he keeps pushing it back it might just be online

public class CohesiveExample {
    private String name;
    private String email;
    private String phoneNumber;

    public CohesiveExample(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void sendEmail(String message) {
        System.out.println("Emailing to " + email + ": " + message);
    }

    public void printCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
