package cvik5;

public abstract class ZakladneZariadenie implements Zariadenie {
    boolean stav;
    String nazov;

    ZakladneZariadenie(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public void zapni() throws ChybaZariadenia {
        if (stav) {
            throw new ChybaZariadenia("Device is already on", this);
        }
        stav = true;
        System.out.println("zariadenie zapnuté");
    }

    @Override
    public void vypni() throws ChybaZariadenia {
        if (!stav) {
            throw new ChybaZariadenia("Device is already off", this);
        }
        stav = false;
        System.out.println("zariadenie vypnuté");
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof ZakladneZariadenie)) {
            return false;
        }

        return this.nazov.equals(((ZakladneZariadenie)obj).nazov);
    }

    @Override
    public int hashCode() {
        return this.nazov.hashCode();
    }
}
