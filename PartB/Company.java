import hu.webarticum.treeprinter.*;
import hu.webarticum.treeprinter.printer.traditional.TraditionalTreePrinter;
// Student.java

//draw diagrams on paper

public class Company {

  //Companies generally HAS-A name, CEO, CTO, CFO, COO
    private String name;
    private CEO ceo;
    private CTO cto;
    private CFO cfo;


    public Company(String name, String ceoName, String ctoName, String cfoName) {
        this.name = name;
        this.ceo = new CEO(ceoName);
        this.cto = new CTO(ctoName);
        this.cfo = new CFO(cfoName);
    }

    public void printCompanyTree() {

      SimpleTreeNode root = new SimpleTreeNode("Company: " + name);
      root.addChild(new SimpleTreeNode("CEO: " + ceo.getName()));
      root.addChild(new SimpleTreeNode("CTO: " + cto.getName()));
      root.addChild(new SimpleTreeNode("CFO: " + cfo.getName()));
      new TraditionalTreePrinter().print(root);

    }
}
