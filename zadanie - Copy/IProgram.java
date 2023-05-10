package zadanie;

import java.time.LocalDateTime;
import java.util.Collection;

public interface IProgram {

    public void pridajRozvrhovuJednotku(IKapela kapela, int cena, LocalDateTime cas, int kapacita);

    public RozvrhovaJednotka ziskatRozvrhovuJednotku(LocalDateTime cas);

    public void zmazatRozvrhovuJednotku(LocalDateTime cas);

    public Collection<RozvrhovaJednotka> ziskatRozvrhovyJednotky();

    public String ziskatHarmonogram(); 
}
