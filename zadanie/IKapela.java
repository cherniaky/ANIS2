package zadanie;

import java.util.List;

public interface IKapela {

    public String ziskatNazov(); 
    public void pridajClena(ClenKapely clen);
    public List<ClenKapely> ziskatZoznamClenov(); 
    public List<String> ziskatZoznamAlbumov(); 
    public List<String> ziskatZoznamSkladieb(); 
    public String ziskatZaner(); 
    public boolean equals(Kapela kapela); 
    public int hashCode(); 
}
