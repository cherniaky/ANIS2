package cvik5.projekt;

import java.util.HashSet;
import java.util.Set;

public class ProjektovyTim {
    protected String nazov;
    protected Set<ClenTimu> clenovia;

    public ProjektovyTim(String name) {
        this.nazov = name;
        this.clenovia = new HashSet<>();
    }

    public ClenTimu[] getClenovia() {
        return (ClenTimu[]) clenovia.toArray();
    }

    public void pridajClena(ClenTimu member) {
        clenovia.add(member);
        member.tim = this;
    }

    // public void programuj(String uloha) {
    //     for (int i = 0; i < clenovia.length; i++) {
    //         if (clenovia[i] instanceof Programator) {
    //             clenovia[i].spracujUlohu(uloha);
    //         }
    //     }
    // }
}
