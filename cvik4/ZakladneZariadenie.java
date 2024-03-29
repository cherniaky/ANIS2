package cvik4;

public abstract class ZakladneZariadenie implements Zariadenie {
    protected boolean stav;
    protected String nazov;

    ZakladneZariadenie(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public void zapni() {
        if (!stav) {
            stav = true;
            System.out.println("zariadenie zapnute");
        }
    }

    @Override
    public void vypni() {
        if (stav) {
            stav = false;
            System.out.println("zariadenie vypnuté");
        }
    }
}
