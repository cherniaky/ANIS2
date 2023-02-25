package cvik8.Uloha86;

class Zamestnanec {
    private String name;
    private double salary;

    public Zamestnanec(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}