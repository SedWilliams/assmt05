
// Professor.java

import java.util.ArrayList;
import java.util.List;

public class Professor extends Employee {
    private String title;
    private List<Course> courses;

    public Professor(String name, int age, String employeeId, String title) {
        super(name, age, employeeId);
        this.title = title;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Title: " + title);
    }

    public void printCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
