package zadanie;

import java.time.LocalDateTime;

public class RozvrhovaJednotka {
    private IKapela kapela;
    private int cena;
    private LocalDateTime cas;
    private int kapacita;
    private PredajListkov predajListkov;

    public RozvrhovaJednotka(IKapela kapela, int cena, LocalDateTime cas, int kapacita) {
        this.cas = cas;
        this.kapela = kapela;
        this.kapacita = kapacita;
        this.cena = cena;
        this.predajListkov = new PredajListkov(kapela.ziskatNazov(), cas, cena, kapacita);
    }

    public PredajListkov ziskatPredajListkov() {
        return predajListkov;
    }

    public Kapela ziskatKapelu() {
        return kapela;
    }

    public String ziskatInfo() {
        return "Kapela: " + kapela.ziskatNazov() + ", Cena: " + cena + ", Volne listky: "
                + predajListkov.getPocetListkov();
    }
}
