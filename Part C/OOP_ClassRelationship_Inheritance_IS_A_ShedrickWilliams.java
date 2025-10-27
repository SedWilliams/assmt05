/********************************************************************
 * File: OOP_ClassRelationship_Inheritance_IS_A_ShedrickWilliams.java
 * @author: Shedrick Williams
 * @since: 10/26/25
 * 
 * Description: Program showcases the class design principle of inheritance.
 * The Person class is the base class, the Student class is a subclass of Person,
 * and the ComputerScienceStudent class is a subclass of Student.
 ********************************************************************/

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
