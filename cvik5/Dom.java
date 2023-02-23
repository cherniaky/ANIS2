package cvik5;

public class Dom {
    Vykurovanie vykurovanie;
    Osvetlenie osvetlenie;

    public Dom(Vykurovanie vykurovanie, Osvetlenie osvetlenie) {
        this.osvetlenie = osvetlenie;
        this.vykurovanie = vykurovanie;
    }

    public void zapniSvetlo() throws ChybaZariadenia {
        osvetlenie.zapni();
    }

    public void vypniSvetlo() throws ChybaZariadenia {
        osvetlenie.vypni();
    }

    public void zapniKurenie() {
        vykurovanie.zapni();
    }

    public void vypniKurenie() {
        vykurovanie.vypni();
    }

    public void nastavTeplotu(int teplota) throws ChybaVykurovania {

        vykurovanie.nastavTeplotu(teplota);

    }
}
