package rozvrh;

public class RozvrhovaJednotka {
    Integer den;
    Integer hodina;
    Miestnost miestnost;
    Predmet predmet;
    Vyucujuci vyucujuci;
    Student[] studenti;

    public RozvrhovaJednotka(Integer den, Integer hodina, Predmet predmet) {
        this.den = den;
        this.hodina = hodina;
        this.predmet = predmet;
    }
}
