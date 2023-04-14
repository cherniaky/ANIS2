package zadanie;

import java.util.List;

public class SponsoredKapela implements IKapela {
    private Kapela kapela;
    private String sponsor;

    public SponsoredKapela(String nazov, List<ClenKapely> cleny, String zaner, List<String> albumy,
            List<String> skladby,
            String sponsor) {
        this.kapela = new Kapela(nazov, cleny, zaner, albumy, skladby);
        this.sponsor = sponsor;
    }

    @Override
    public boolean equals(Kapela kapela) {
        return this.kapela.equals(kapela);
    }

    @Override
    public int hashCode() {
        return this.kapela.hashCode();
    }

    @Override
    public String ziskatNazov() {
        return this.kapela.ziskatNazov() + " sponsored by: " + sponsor;
    }

    @Override
    public List<String> ziskatZoznamAlbumov() {
        return this.kapela.ziskatZoznamAlbumov();
    }

    @Override
    public List<ClenKapely> ziskatZoznamClenov() {
        return kapela.ziskatZoznamClenov();
    }

    @Override
    public List<String> ziskatZoznamSkladieb() {
        return kapela.ziskatZoznamSkladieb();
    }

    @Override
    public String ziskatZaner() {
        return kapela.ziskatZaner();
    }
}
