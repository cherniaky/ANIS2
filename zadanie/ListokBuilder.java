package zadanie;

import java.time.LocalDateTime;

public class ListokBuilder {
    private String nazovKapely = "";
    private LocalDateTime cas = null;
    private int cena = 0;

    public ListokBuilder addNazov(String nazov) {
        this.nazovKapely = nazov;
        return this;
    }

    public ListokBuilder addCas(LocalDateTime cas) {
        this.cas = cas;
        return this;
    }

    public ListokBuilder addCena(int cena) {
        this.cena = cena;
        return this;
    }

    public Listok build() {
        Listok listok = new Listok(nazovKapely, cas, cena);
        nazovKapely = "";
        cas = null;
        cena = 0;
        return listok;
    }
}
