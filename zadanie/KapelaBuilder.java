package zadanie;

import java.util.ArrayList;
import java.util.List;

// Builder pattern pre Kapelu
public class KapelaBuilder {
    private String nazov = "";
    private List<ClenKapely> cleny = new ArrayList<>();
    private String zaner = "";
    private List<String> albumy = new ArrayList<>();
    private List<String> skladby = new ArrayList<>();

    public KapelaBuilder setNazov(String nazov) {
        this.nazov = nazov;
        return this;
    }

    public KapelaBuilder setClenovia(List<ClenKapely> cleny) {
        this.cleny = cleny;
        return this;
    }

    public KapelaBuilder setAlbumy(List<String> albumy) {
        this.albumy = albumy;
        return this;
    }

    public KapelaBuilder setSkladby(List<String> skladby) {
        this.skladby = skladby;
        return this;
    }

    public KapelaBuilder setZaner(String zaner) {
        this.zaner = zaner;
        return this;
    }

    public Kapela build() {
        Kapela kapela = new Kapela(nazov, cleny, zaner, albumy, skladby);

        nazov = "";
        cleny = new ArrayList<>();
        zaner = "";
        albumy = new ArrayList<>();
        skladby = new ArrayList<>();

        return kapela;
    }
}
