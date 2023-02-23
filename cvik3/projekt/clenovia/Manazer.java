package cvik3.projekt.clenovia;

import cvik3.projekt.ClenTimu;
import cvik3.projekt.ProjektovyTim;

public class Manazer extends ClenTimu {

    public Manazer(String meno) {
        super(meno);
    }

    public Manazer(String meno, ProjektovyTim tim) {
        super(meno, tim);
    }

    @Override
    public void spracujUlohu(String uloha) {
        System.out.println("manažér " + meno + ": " + uloha);
    }

}
