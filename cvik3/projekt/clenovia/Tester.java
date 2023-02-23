package projekt.clenovia;

import projekt.ClenTimu;
import projekt.ProjektovyTim;

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
