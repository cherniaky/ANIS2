package cvik7;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ZapisovacAdapter implements Logovanie {
    private final Zapisovac zapisovac;

    public ZapisovacAdapter(Zapisovac zapisovac) {
        this.zapisovac = zapisovac;
    }

    @Override
    public void log(int priorita, String sprava) {
        Map<String, Object> data = new HashMap<>();
        data.put("priorita", priorita);
        data.put("sprava", sprava);
        try {
            zapisovac.zapis(data);
        } catch (IOException e) {
            System.err.println("Chyba pri zápise logu: " + e.getMessage());
        }
    }
}
