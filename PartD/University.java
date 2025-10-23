
// University.java

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        // Composition: Departments are created and managed by the University
        this.departments.add(new Department("Computer Science"));
        this.departments.add(new Department("Mathematics"));
    }

    public String getName() {
        return name;
    }

    public void printDepartments() {
        System.out.println("Departments at " + name + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
            department.printOffices();
        }
    }
}
