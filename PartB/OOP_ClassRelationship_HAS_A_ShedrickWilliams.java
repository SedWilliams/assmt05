/********************************************************************
 * File: OOP_ClassRelationship_HAS_A_ShedrickWilliams.java
 * @author: Shedrick Williams
 * @since: 10/26/25
 * 
 * Description: Program showcases the class design principle of aggregation and composition.
 * The Company class has a list of employees inhereted through composition,
 * and the CEO, CTO, and CFO roles are inhereted through aggregation.
 ********************************************************************/

public class OOP_ClassRelationship_HAS_A_ShedrickWilliams {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
      //initialize program

      Company company = new Company("Workday", "Aneel Bhusri", "Chano Fernandez", "Robynne Sisco");
      company.printCompanyTree();
    }
}
