package cvik3.projekt.clenovia;

import cvik3.projekt.ClenTimu;
import cvik3.projekt.ProjektovyTim;

public class Tester extends ClenTimu {

    public Tester(String meno) {
        super(meno);
    }

    public Tester(String meno, ProjektovyTim tim) {
        super(meno, tim);
    }

    @Override
    public void spracujUlohu(String uloha) {
        System.out.println("tester " + meno + ": " + uloha);
    }
}
