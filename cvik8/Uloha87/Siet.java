package cvik8.Uloha87;

import java.util.List;
import java.util.LinkedList;

public class Siet {

    private List<Zariadenie> zariadenia = new LinkedList<>();

    public void pripojZariadenie(Zariadenie zariadenie) {
        zariadenia.add(zariadenie);
        this.notifikujVsetky("pripojenie");
    }

    public void odpojZariadenie(Zariadenie zariadenie) {
        zariadenia.remove(zariadenie);
        this.notifikujVsetky("odpojenie");
    }

    public void notifikujVsetky(String sprava) {

        for (Zariadenie zariadenie : zariadenia) {
            zariadenie.spracuj(sprava);
        }

    }
}
