
// Department.java

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Office> offices;

    public Department(String name) {
        this.name = name;
        this.offices = new ArrayList<>();
        // Composition: Offices are created and managed by the Department
        this.offices.add(new Office("D101"));
        this.offices.add(new Office("D102"));
    }

    public String getName() {
        return name;
    }

    public void printOffices() {
        System.out.println("Offices in the " + name + " department:");
        for (Office office : offices) {
            System.out.println("- " + office);
        }
    }
}
