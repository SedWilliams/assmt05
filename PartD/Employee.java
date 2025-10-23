
// Employee.java

public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Employee ID: " + employeeId);
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
