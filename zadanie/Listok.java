package zadanie;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Listok {
    private int id;
    private String nazovKapely;
    private LocalDateTime cas;
    private int cena;
    private String emailKupujuceho = "";
    private String menoKupujuceho = "";

    public Listok(String nazovKapely, LocalDateTime cas, int cena) {
        this.id = ThreadLocalRandom.current().nextInt(0, 10000);
        this.nazovKapely = nazovKapely;
        this.cas = cas;
        this.cena = cena;
    }

    public void pridatMeno(String menoString) {
        menoKupujuceho = menoString;
    }

    public void zmazatMeno() {
        menoKupujuceho = "";
    }

    public void pridatEmail(String emailString) {
        emailKupujuceho = emailString;
    }

    public void zmazatEmail() {
        emailKupujuceho = "";
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Listok) {
            return this.id == ((Listok) obj).getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
