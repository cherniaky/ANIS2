package cvik5;

import java.util.ArrayList;
import java.util.List;

public class Dom {
    // Vykurovanie vykurovanie;
    // Osvetlenie osvetlenie;
    List<ZakladneZariadenie> zariadenia = new ArrayList<>();

    public Dom(Vykurovanie vykurovanie, Osvetlenie osvetlenie) {
        // this.osvetlenie = osvetlenie;
        // this.vykurovanie = vykurovanie;
        zariadenia.add(vykurovanie);
        zariadenia.add(osvetlenie);
    }

    public void zapniSvetlo() throws ChybaZariadenia {
        for (ZakladneZariadenie zakladneZariadenie : zariadenia) {
            if (zakladneZariadenie instanceof Osvetlenie) {
                zakladneZariadenie.zapni();
            }
        }
    }

    public void vypniSvetlo() throws ChybaZariadenia {
        for (ZakladneZariadenie zakladneZariadenie : zariadenia) {
            if (zakladneZariadenie instanceof Osvetlenie) {
                zakladneZariadenie.vypni();
            }
        }
        // osvetlenie.vypni();
    }

    public void zapniKurenie() {
        for (ZakladneZariadenie zakladneZariadenie : zariadenia) {
            if (zakladneZariadenie instanceof Vykurovanie) {
                // zakladneZariadenie.vypni();
                try {
                    zakladneZariadenie.zapni();
                } catch (ChybaZariadenia e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public void vypniKurenie() {
        for (ZakladneZariadenie zakladneZariadenie : zariadenia) {
            if (zakladneZariadenie instanceof Vykurovanie) {
                // zakladneZariadenie.vypni();
                try {
                    zakladneZariadenie.vypni();
                } catch (ChybaZariadenia e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        // vykurovanie.vypni();
    }

    public void nastavTeplotu(int teplota) throws ChybaVykurovania {
        for (ZakladneZariadenie zakladneZariadenie : zariadenia) {
            if (zakladneZariadenie instanceof Vykurovanie) {
                // vykurovanie.vypni();
                ((Vykurovanie)zakladneZariadenie).nastavTeplotu(teplota);
            }
        }

    }
}
