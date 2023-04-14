package zadanie;

import java.util.Scanner;

public class HudobnyFestivalMain {
    public static void main(String[] args) {
        Festival festival = new Festival("Letný festival 2023");

        // Vytvorenie kapiel
        Kapela kapela1 = new Kapela("The Beatles", null, null, null, null);
        Kapela kapela2 = new Kapela("Queen", null, null, null, null);
        Kapela kapela3 = new Kapela("AC/DC", null, null, null, null);

        // Vytvorenie členov kapiel
        ClenKapely johnLennon = new ClenKapely("John Lennon", "gitara", null);
        ClenKapely paulMcCartney = new ClenKapely("Paul McCartney", "basgitara", null);
        ClenKapely freddieMercury = new ClenKapely("Freddie Mercury", "spev", null);
        ClenKapely angusYoung = new ClenKapely("Angus Young", "gitara", null);

        // Pridanie členov do kapiel
        kapela1.pridajClena(johnLennon);
        kapela1.pridajClena(paulMcCartney);
        kapela2.pridajClena(freddieMercury);
        kapela3.pridajClena(angusYoung);

        // Pridanie kapiel na festival
        festival.pridajKapelu(kapela1);
        festival.pridajKapelu(kapela2);
        festival.pridajKapelu(kapela3);

        // Vytvorenie programu festivalu
        Program program = new Program(festival);
        program.pridajVystupenie(kapela1, "10:00");
        program.pridajVystupenie(kapela2, "14:00");
        program.pridajVystupenie(kapela3, "18:00");

        // Predaj lístkov
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vitajte na festivale " + festival.getNazov());
        while (true) {
            System.out.println("1 - Zobraziť program");
            System.out.println("2 - Kúpiť lístok");
            System.out.println("3 - Koniec");

            int volba = scanner.nextInt();
            switch (volba) {
                case 1:
                    program.ziskatHarmonogram();
                    break;
                case 2:
                    System.out.println("Zadajte názov kapely:");
                    String nazovKapely = scanner.next();
                    Kapela kapela = festival.getKapela(nazovKapely);
                    if (kapela == null) {
                        System.out.println("Kapela s názvom " + nazovKapely + " neexistuje.");
                        break;
                    }
                    System.out.println("Zadajte počet lístkov:");
                    int pocetListkov = scanner.nextInt();
                    festival.predajListky(kapela, pocetListkov);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Neplatná voľba.");
                    break;
            }
        }
    }
}
