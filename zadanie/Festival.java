package zadanie;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Class pre Festival, implementuje Singelton pattern a Composite
public class Festival {
    private static Festival festival = null;
    private String nazov;
    private LocalDate datum;
    private String miesto;
    private Program program = new Program();

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
        return nazov + " in " + miesto;
    }

    public Program ziskatProgram() {
        return program;
    }
}
