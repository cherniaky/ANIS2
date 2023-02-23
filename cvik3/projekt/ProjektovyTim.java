package cvik3.projekt;

import cvik3.projekt.clenovia.Programator;

public class ProjektovyTim {
    protected String nazov;
    protected ClenTimu[] clenovia;

    public ProjektovyTim(String name) {
        this.nazov = name;
        this.clenovia = new ClenTimu[0];
    }

    public ClenTimu[] getClenovia() {
        return clenovia;
    }

    public void pridajClena(ClenTimu member) {
        ClenTimu[] newMembers = new ClenTimu[clenovia.length + 1];
        for (int i = 0; i < clenovia.length; i++) {
            newMembers[i] = clenovia[i];
        }
        member.tim = this;
        newMembers[clenovia.length] = member;
        clenovia = newMembers;
    }

    public void programuj(String uloha) {
        for (int i = 0; i < clenovia.length; i++) {
            if (clenovia[i] instanceof Programator) {
                clenovia[i].spracujUlohu(uloha);
            }
        }
    }
}
