package zadanie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Program implements IProgram {
    private Map<LocalDateTime, RozvrhovaJednotka> harmonogram;

    public Program() {
        harmonogram = new HashMap<>();
    }

    @Override
    public void pridajRozvrhovuJednotku(Kapela kapela, int cena, LocalDateTime cas, int kapacita) {
        harmonogram.put(cas, new RozvrhovaJednotka(kapela, cena, cas, kapacita));
    }

    @Override
    public String ziskatHarmonogram() {
        StringBuilder sb = new StringBuilder();
        sb.append("Harmonogram: \n");
        for (Map.Entry<LocalDateTime, RozvrhovaJednotka> entry : harmonogram.entrySet()) {
            LocalDateTime dateTime = entry.getKey();
            RozvrhovaJednotka rozvrhovaJednotka = entry.getValue();
            sb.append(dateTime.format(DateTimeFormatter
                    .ofPattern("HH:mm"))).append(" - ").append(rozvrhovaJednotka.ziskatInfo()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public RozvrhovaJednotka ziskatRozvrhovuJednotku(LocalDateTime cas) {
        return harmonogram.get(cas);
    }

    @Override
    public Collection<RozvrhovaJednotka> ziskatRozvrhovyJednotky() {
        return harmonogram.values();
    }

    @Override
    public void zmazatRozvrhovuJednotku(LocalDateTime cas) {
        harmonogram.remove(cas);
    }
}
