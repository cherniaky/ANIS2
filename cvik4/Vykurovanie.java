package cvik4;

public class Vykurovanie extends ZakladneZariadenie implements Termostat {
    static protected int MAX_TEPLOTA = 40;
    protected int teplota;

    Vykurovanie(String nazov) {
        super(nazov);
    }

    @Override
    public void zapni() {
        teplota = 25;
    }

    @Override
    public void vypni() {
        teplota = 0;
    }

    @Override
    public void nastavTeplotu(int teplota) {
        if (teplota < 0 || teplota > MAX_TEPLOTA) {
           throw new IllegalArgumentException("Teplota je mimo rozsahu");
        }
        this.teplota = teplota;
        System.out.println("aktualna teplota: " + teplota);
    }

}
