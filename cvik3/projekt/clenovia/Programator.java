package cvik3.projekt.clenovia;

import cvik3.projekt.ClenTimu;
import cvik3.projekt.ProjektovyTim;

public class Programator extends ClenTimu {

    public Programator(String meno) {
        super(meno);
    }

    public Programator(String meno, ProjektovyTim tim) {
        super(meno, tim);
    }

    @Override
    public void spracujUlohu(String uloha) {
        System.out.println("programátor " + meno + ": " + uloha);
    }

}
