
// ComputerScienceStudent.java

public class ComputerScienceStudent extends Student {
    private String major;

    public ComputerScienceStudent(String name, int age, String studentId) {
        super(name, age, studentId);
        this.major = "Computer Science";
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Major: " + major);
    }

    public String getMajor() {
        return major;
    }
}
