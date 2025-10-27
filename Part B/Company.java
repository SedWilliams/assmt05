/********************************************************************
 * File: Company.java
 * @author: Shedrick Williams
 * @since: 10/26/25
 * 
 * Description: Represents a company.
 ********************************************************************/

import java.util.ArrayList;

import hu.webarticum.treeprinter.*;
import hu.webarticum.treeprinter.printer.traditional.*;
import hu.webarticum.treeprinter.decorator.BorderTreeNodeDecorator;
import hu.webarticum.treeprinter.text.AnsiFormat;
import hu.webarticum.treeprinter.text.ConsoleText;

public class Company {

    //Companies generally strongly HAS-A name, CEO, CTO, CFO, COO
    private String name;
    private CEO ceo;
    private CTO cto;
    private CFO cfo;

    // Companies generally weakly HAS-A list of employees
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name, String ceoName, String ctoName, String cfoName) {
        //instantiated here because it is a strong relationship.
        //CEO, CTO, CFO roles are dependent on the company.
        //If anyone in these roles leaves the company, they may not work in the same role after.
        this.name = name;
        this.ceo = new CEO(ceoName);
        this.cto = new CTO(ctoName);
        this.cfo = new CFO(cfoName);

        //not instantiated here because it is a weak relationship.
        //Employee objects are independent of company.
        //If an employee leaves the company, they will at the very least be an 
        //employee at another company.

        //I don't have fake data for employees but this is where and how I would add them.
        //this.employees.addAll(employees);
    }

    public void printCompanyTree() {

      SimpleTreeNode root = new SimpleTreeNode(ConsoleText.of("Company: " + name).format(
        AnsiFormat.BOLD.compose(AnsiFormat.YELLOW).compose(AnsiFormat.UNDERLINE)
      ));

      SimpleTreeNode vertexNode1 = new SimpleTreeNode("HAS-A: STRONG");
      SimpleTreeNode vertexNode2 = new SimpleTreeNode("HAS-A: STRONG");
      SimpleTreeNode vertexNode3 = new SimpleTreeNode("HAS-A: STRONG");
      SimpleTreeNode vertexNode4 = new SimpleTreeNode("HAS-A: WEAK");

      root.addChild(vertexNode1);
      root.addChild(vertexNode2);
      root.addChild(vertexNode3);
      root.addChild(vertexNode4);

      SimpleTreeNode ceoNode = new SimpleTreeNode("CEO: " + ceo.getName());
      SimpleTreeNode ctoNode = new SimpleTreeNode("CTO: " + cto.getName());
      SimpleTreeNode cfoNode = new SimpleTreeNode("CFO: " + cfo.getName());
      SimpleTreeNode employeesNode = new SimpleTreeNode("Employees[]");
      vertexNode1.addChild(new BorderTreeNodeDecorator(ceoNode).builder().buildFor(ceoNode));
      vertexNode2.addChild(new BorderTreeNodeDecorator(ctoNode).builder().buildFor(ctoNode));
      vertexNode3.addChild(new BorderTreeNodeDecorator(cfoNode).builder().buildFor(cfoNode));
      vertexNode4.addChild(new BorderTreeNodeDecorator(employeesNode).builder().buildFor(employeesNode));


      new TraditionalTreePrinter().print(root);

    }
}
