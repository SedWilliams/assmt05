
// RefactoredCustomer.java
// This is the refactored, cohesive Customer class.

public class RefactoredCustomer {
    private String name;
    private String email;

    public RefactoredCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
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
}
