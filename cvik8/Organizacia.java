package cvik8;

import java.util.ArrayList;
import java.util.List;

public class Organizacia {
    private String name;
    private List<Oddelenie> departments;

    public Organizacia(String meno) {
        this.name = meno;
        this.departments = new ArrayList<>();
    }

    public void addOddelenie(Oddelenie oddelenie) {
        this.departments.add(oddelenie);
    }

    public void removeOddelenie(Oddelenie oddelenie) {
        this.departments.remove(oddelenie);
    }

    public List<Oddelenie> getDepartments() {
        return this.departments;
    }

    public String getName() {
        return this.name;
    }
}
