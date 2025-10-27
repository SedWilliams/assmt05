
// OOP_ClassRelationship_Inheritance_IS_A_ShedrickAnsong.java

public class OOP_ClassRelationship_Inheritance_IS_A_ShedrickWilliams {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Person person = new Person("Shedrick Williams", 20);
        Student student = new Student("Shedrick Williams", 20, "12345");
        ComputerScienceStudent csStudent = new ComputerScienceStudent("Shedrick Williams", 20, "12345");

        System.out.println("--- Person ---");
        person.introduce();
        System.out.println();

        System.out.println("--- Student ---");
        student.introduce();
        System.out.println();

        System.out.println("--- Computer Science Student ---");
        csStudent.introduce();
    }
}
