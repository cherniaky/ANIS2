package cvik7;

import java.io.IOException;
import java.util.Map;

public class Zapisovac {
    // zapisované dáta sú mapa v podobe kľúč:hodnota, tzn. napr. {"priorita": 1,
    // "sprava": "chyba aplikacie"}
    public void zapis(Map<String, Object> data) throws IOException {
        System.out.println(data);
    }
}
