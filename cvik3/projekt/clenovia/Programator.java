package projekt.clenovia;

import projekt.ClenTimu;
import projekt.ProjektovyTim;

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
