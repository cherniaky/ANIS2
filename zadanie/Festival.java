package zadanie;

import java.time.LocalDate;

public class Festival {
    private static Festival festival = null;
    private String nazov;
    private LocalDate datum;
    private String miesto;
    private Program program;

    private Festival(String nazov, LocalDate datum, String miesto) {
        this.nazov = nazov;
        this.datum = datum;
        this.miesto = miesto;
    }

    public static Festival getFestival(String nazov, LocalDate datum, String miesto) {
        if (festival == null) {
            return new Festival(nazov, datum, miesto);
        }

        return festival;
    }

    public String getInfo() {
        return nazov + " at " + datum.toString() + " in " + miesto;
    }

    public Program ziskatProgram() {
        return program;
    }
}
