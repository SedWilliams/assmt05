
// Student.java

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private List<Textbook> textbooks;
    private Pen pen;
    private Notebook notebook;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        this.textbooks = new ArrayList<>();
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Student ID: " + studentId);
    }

    public void printSupplies() {
        System.out.println("Supplies for " + getName() + ":");
        System.out.println("- " + pen);
        System.out.println("- " + notebook);
        for (Textbook textbook : textbooks) {
            System.out.println("- " + textbook);
        }
    }
}
