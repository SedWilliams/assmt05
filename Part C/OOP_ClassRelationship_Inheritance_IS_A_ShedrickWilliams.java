/********************************************************************
 * File: OOP_ClassRelationship_Inheritance_IS_A_ShedrickWilliams.java
 * @author: Shedrick Williams
 * @since: 10/26/25
 * 
 * Description: Program showcases the class design principle of inheritance.
 * The Person class is the base class, the Student class is a subclass of Person,
 * and the ComputerScienceStudent class is a subclass of Student.
 ********************************************************************/


import java.util.ArrayList;

import hu.webarticum.treeprinter.*;
import hu.webarticum.treeprinter.printer.traditional.*;
import hu.webarticum.treeprinter.decorator.BorderTreeNodeDecorator;
import hu.webarticum.treeprinter.text.AnsiFormat;
import hu.webarticum.treeprinter.text.ConsoleText;

public class OOP_ClassRelationship_Inheritance_IS_A_ShedrickWilliams {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
      Car car = new Car("Toyota", "Camry", "2024", "Red", "12345");

      //Logic for generating and displaying the tree
      SimpleTreeNode root = new SimpleTreeNode(ConsoleText.of("Interface: IsDriveable").format(
        AnsiFormat.BOLD.compose(AnsiFormat.YELLOW).compose(AnsiFormat.UNDERLINE)
      ));
      
      SimpleTreeNode vertexNode1 = new SimpleTreeNode("(IS-A) IMPLEMENTED BY");
      root.addChild(vertexNode1);

      SimpleTreeNode vertexNode2 = new SimpleTreeNode("parent class Vehicle");
      vertexNode1.addChild(vertexNode2);

      SimpleTreeNode vertexNode3 = new SimpleTreeNode("(IS-A) EXTENDED BY");
      vertexNode2.addChild(vertexNode3);

      SimpleTreeNode vertexNode4 = new SimpleTreeNode("child class Car");
      vertexNode3.addChild(vertexNode4);



      new TraditionalTreePrinter().print(root);
    }
}
