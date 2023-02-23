package cvik5;

public class Program {
    public static void main(String[] args) {
        Vykurovanie vykurovanie = new Vykurovanie("vykurovanie");
        Osvetlenie osvetlenie = new Osvetlenie("osvetlenie");
        Dom dom = new Dom(vykurovanie, osvetlenie);

        try {
            dom.zapniSvetlo();
        } catch (ChybaZariadenia e) {
            System.out.println("Chyba zariadenia");
        }
        dom.zapniKurenie();
        try {
            dom.nastavTeplotu(40);
        } catch (ChybaVykurovania e) {
            System.out.println("Teplota je mimo rozsahu, nastavim 25");
            try {
                vykurovanie.nastavTeplotu(25);
            } catch (ChybaVykurovania e1) {
                
            }
        } finally {
            dom.vypniKurenie();
        }
    }
}
