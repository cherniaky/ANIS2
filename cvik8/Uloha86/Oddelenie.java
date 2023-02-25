package cvik8.Uloha86;

import java.util.ArrayList;
import java.util.List;

class Oddelenie {
    private String name;
    private List<Oddelenie> oddelenia;
    private List<Zamestnanec> employees;

    public Oddelenie(String name) {
        this.name = name;
        this.oddelenia = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addOddelenie(Oddelenie Oddelenie) {
        this.oddelenia.add(Oddelenie);
    }

    public void removeOddelenie(Oddelenie Oddelenie) {
        this.oddelenia.remove(Oddelenie);
    }

    public void addEmployee(Zamestnanec employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Zamestnanec employee) {
        this.employees.remove(employee);
    }

    public String getName() {
        return this.name;
    }

    public List<Oddelenie> getOddelenia() {
        return this.oddelenia;
    }

    public List<Zamestnanec> getEmployees() {
        return this.employees;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Zamestnanec zamestnanec : employees) {
            zamestnanec.accept(visitor);
        }
        for (Oddelenie podOddelenie : oddelenia) {
            podOddelenie.accept(visitor);
        }
    }
}
