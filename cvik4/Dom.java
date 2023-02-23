public class Dom {
    Vykurovanie vykurovanie;
    Osvetlenie osvetlenie;

    public Dom(Vykurovanie vykurovanie, Osvetlenie osvetlenie) {
        this.osvetlenie = osvetlenie;
        this.vykurovanie = vykurovanie;
    }

    public void zapniSvetlo() {
        osvetlenie.zapni();
    }

    public void vypniSvetlo() {
        osvetlenie.vypni();
    }

    public void zapniKurenie() {
        vykurovanie.zapni();
    }

    public void vypniKurenie() {
        vykurovanie.vypni();
    }

    public void nastavTeplotu(int teplota) {
       
            vykurovanie.nastavTeplotu(teplota);
       
    }
}
