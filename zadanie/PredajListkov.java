package zadanie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PredajListkov {
    private List<Listok> listky = new ArrayList<>();
    private LocalDateTime cas;
    private String nazov;

    public PredajListkov(String nazov, LocalDateTime cas, int cena, int pocet) {
        this.cas = cas;
        this.nazov = nazov;
        ListokBuilder builder = new ListokBuilder();
        for (int i = 0; i < pocet; i++)
            listky.add(builder.addNazov(nazov).addCas(cas).addCena(cena).build());
    }

    public Listok kupitListok(String email, String meno) throws ListkySkonciliException {
        if (listky.isEmpty()) {
            throw new ListkySkonciliException("Uz neexistuju listky", cas, nazov);
        } else {
            Listok listok = listky.get(0);
            listky.remove(0);
            listok.pridatEmail(email);
            listok.pridatMeno(meno);
            return listok;
        }

    }

    public void vratitListok(Listok listok) {
        listok.zmazatEmail();
        listok.zmazatMeno();
        listky.add(listok);
    }

    public int getPocetListkov() {
        return listky.size();
    }
}
