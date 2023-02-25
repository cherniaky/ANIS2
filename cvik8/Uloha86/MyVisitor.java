package cvik8.Uloha86;

public class MyVisitor implements Visitor {
   

    public void visit(Oddelenie oddelenie) {
        System.out.println("Oddelenie: " + oddelenie.getName());
    }
    public void visit(Zamestnanec zamestnanec) {
        System.out.println("Oddelenie: " + zamestnanec.getName());
        System.out.println("Plat: " + zamestnanec.getSalary());
    }

}
