package cvik5;

public class Vykurovanie extends ZakladneZariadenie implements Termostat {
    static int MAX_TEPLOTA = 40;
    int teplota;

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
    public void nastavTeplotu(int teplota) throws ChybaVykurovania {
        if (teplota < 0 || teplota > MAX_TEPLOTA) {
            throw new ChybaVykurovania("Teplota je mimo rozsahu", this);
        }
        this.teplota = teplota;
        System.out.println("aktuálna teplota: " + teplota);
    }

}
