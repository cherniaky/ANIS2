package zadanie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HudobnyFestivalMain {
    public static void main(String[] args) {
        Festival festival = Festival.getFestival("Letny festival 2023", LocalDate.of(2023, 7, 10), "Kosice");

        // Vytvorenie kapiel
        Kapela kapela1 = new Kapela("The Beatles", "Pop");
        Kapela kapela2 = new Kapela("Queen", "Pop-rock");
        Kapela kapela3 = new Kapela("AC/DC", "Rock");

        // Vytvorenie členov kapiel
        ClenKapely johnLennon = new ClenKapely("John Lennon", "johnlennon@gmail.com", "gitara");
        ClenKapely paulMcCartney = new ClenKapely("Paul McCartney", "paulmccartney@gmail.com", "basgitara");
        ClenKapely freddieMercury = new ClenKapely("Freddie Mercury", "freddiemercury@gmail.com", "spev");
        ClenKapely angusYoung = new ClenKapely("Angus Young", "angusyoung@gmail.com", "gitara");

        // Pridanie členov do kapiel
        kapela1.pridajClena(johnLennon);
        kapela1.pridajClena(paulMcCartney);
        kapela2.pridajClena(freddieMercury);
        kapela3.pridajClena(angusYoung);

        // Vytvorenie programu festivalu
        Program program = festival.ziskatProgram();
        program.pridajRozvrhovuJednotku(kapela1, 30, LocalDateTime.of(2023, 7, 10, 7, 30), 100);
        program.pridajRozvrhovuJednotku(kapela2, 40, LocalDateTime.of(2023, 7, 10, 10, 30), 100);
        program.pridajRozvrhovuJednotku(kapela3, 50, LocalDateTime.of(2023, 7, 10, 12, 30), 100);

        // Predaj lístkov
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vitajte na festivale " + festival.getInfo());
        while (true) {
            System.out.println("--------------------");
            System.out.println("1 - Zobrazit program");
            System.out.println("2 - Kupit listok");
            System.out.println("3 - Koniec");
            System.out.println("--------------------");

            int volba = scanner.nextInt();
            switch (volba) {
                case 1:
                    System.out.println(program.ziskatHarmonogram());
                    break;
                case 2:
                    System.out.println("Zadajte cas(HH:mm): ");
                    String cas = scanner.next();

                    String dateTimeString = "2023-07-10 " + cas;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                    LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

                    RozvrhovaJednotka rozvrhovaJednotka = program.ziskatRozvrhovuJednotku(dateTime);
                    if (rozvrhovaJednotka == null) {
                        System.out.println("Na cas " + cas + " nic neexistuje.");
                        break;
                    }
                    System.out.println("Zadajte pocet listkov:");
                    int pocetListkov = scanner.nextInt();
                    System.out.println("Zadajte svoj e-mail: ");
                    String email = scanner.next();
                    System.out.println("Zadajte svoje meno: ");
                    String meno = scanner.next();

                    PredajListkov predajListkov = rozvrhovaJednotka.ziskatPredajListkov();
                    List<Listok> listky = new ArrayList<>();

                    for (int i = 0; i < pocetListkov; i++) {
                        try {
                            listky.add(predajListkov.kupitListok(email, meno));
                        } catch (ListkySkonciliException e) {

                            System.out
                                    .print("Listky na " + e.getNazovKapely() + " cas: " + e.getCas().format(formatter)
                                            + " uz skoncili");
                        }
                    }

                    System.out.println("Tuna mate id vasich listkov:");
                    for (Listok listok : listky) {
                        System.out.println(listok.getId());
                    }
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Neplatná voľba.");
                    break;
            }
        }
    }
}
