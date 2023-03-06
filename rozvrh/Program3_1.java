package rozvrh;

public class Program3_1 {
    public static void main(String[] args) {
        Vyucujuci vyucujuci = new Vyucujuci("pan", "man");
        Student student1 = new Student("jan", "plavko");
        Student student2 = new Student("jan", "plavko");
        Student student3 = new Student("jan", "plavko");
        Student student4 = new Student("jan", "plavko");
        Miestnost miestnost = new Miestnost("izba");
        Predmet predmet = new Predmet("jan");
        RozvrhovaJednotka rozvrhovaJednotka = new RozvrhovaJednotka(3, 13, predmet);
        Rozvrh rozvrh = new Rozvrh();
        rozvrh.pridajJednotku(rozvrhovaJednotka);
    }
}
