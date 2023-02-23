public class Program {
    public static void main(String[] args) {
        Vykurovanie vykurovanie = new Vykurovanie("vykurovanie");
        Osvetlenie osvetlenie = new Osvetlenie("osvetlenie");
        Dom dom = new Dom(vykurovanie, osvetlenie);

        dom.zapniSvetlo();
        dom.zapniKurenie();
        try {
            dom.nastavTeplotu(40);
        } catch (IllegalArgumentException e) {
            System.out.println("Teplota je mimo rozsahu, nastavim 25");
            vykurovanie.nastavTeplotu(25);
        } finally {
            dom.vypniKurenie();
        }
    }
}
