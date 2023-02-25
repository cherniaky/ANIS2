package cvik8;

import java.util.ArrayList;
import java.util.List;

class Oddelenie {
    private String name;
    private List<Oddelenie> oddelenies;
    private List<Zamestnanec> employees;

    public Oddelenie(String name) {
        this.name = name;
        this.oddelenies = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addOddelenie(Oddelenie Oddelenie) {
        this.oddelenies.add(Oddelenie);
    }

    public void removeOddelenie(Oddelenie Oddelenie) {
        this.oddelenies.remove(Oddelenie);
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

    public List<Oddelenie> getOddelenies() {
        return this.oddelenies;
    }

    public List<Zamestnanec> getEmployees() {
        return this.employees;
    }
}
