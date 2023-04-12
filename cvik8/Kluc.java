package cvik8;

import java.util.HashMap;
import java.util.Map;

public class Kluc {
    private static byte[] data;

    private Kluc(byte[] data) {
        this.data = data;
    }

    private static Map<String, Kluc> kluce = new HashMap<>();

    public static Kluc vygenerujKluc(String heslo) {
        if (kluce.containsKey(heslo)) {
            return kluce.get(heslo);
        } else {
            // zložitý výpočet dát z hesla
            Kluc kluc = new Kluc(data);
            kluce.put(heslo, kluc);
            return kluc;
        }
    }
}
