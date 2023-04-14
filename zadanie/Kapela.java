package zadanie;

import java.util.ArrayList;
import java.util.List;

public class Kapela implements IKapela {
    private String nazov;
    private List<ClenKapely> cleny = new ArrayList<>();
    private String zaner;
    private List<String> albumy = new ArrayList<>();
    private List<String> skladby = new ArrayList<>();

    public Kapela(String nazov, List<ClenKapely> cleny, String zaner, List<String> albumy, List<String> skladby) {
        this.nazov = nazov;
        this.cleny.addAll(cleny);
        this.zaner = zaner;
        this.albumy.addAll(albumy);
        this.skladby.addAll(skladby);
    }

    @Override
    public boolean equals(Kapela kapela) {
        return this.nazov.equals(kapela.ziskatNazov());
    }

    @Override
    public int hashCode() {
        return this.nazov.hashCode();
    }

    @Override
    public String ziskatNazov() {
        return this.nazov;
    }

    @Override
    public List<String> ziskatZoznamAlbumov() {
        return this.albumy;
    }

    @Override
    public List<ClenKapely> ziskatZoznamClenov() {
        return cleny;
    }

    @Override
    public List<String> ziskatZoznamSkladieb() {
        return skladby;
    }

    @Override
    public String ziskatZaner() {
        return zaner;
    }
}
