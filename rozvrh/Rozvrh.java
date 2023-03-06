package rozvrh;

public class Rozvrh {
    RozvrhovaJednotka[] jednotky = new RozvrhovaJednotka[0];

    public void pridajJednotku(RozvrhovaJednotka jednotka) {
        RozvrhovaJednotka[] newMembers = new RozvrhovaJednotka[jednotky.length + 1];
        for (int i = 0; i < jednotky.length; i++) {
            newMembers[i] = jednotky[i];
        }
        newMembers[jednotky.length] = jednotka;
        jednotky = newMembers;
    }

    public void nastavVyucujuceho(RozvrhovaJednotka jednotka, Vyucujuci vyucujuci) {
        try {
            for (RozvrhovaJednotka rozvrhovaJednotka : jednotky) {
                if (rozvrhovaJednotka.vyucujuci == vyucujuci && jednotka.den == rozvrhovaJednotka.den
                        && rozvrhovaJednotka.hodina == jednotka.hodina) {
                    throw new Exception("Kolizia");
                }
            }
            jednotka.vyucujuci = vyucujuci;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void nastavMiestnost(RozvrhovaJednotka jednotka, Miestnost miestnost) {

    }

    public void pridajStudenta(RozvrhovaJednotka jednotka, Student student) {

    }
}