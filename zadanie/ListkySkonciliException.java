package zadanie;

import java.time.LocalDateTime;

public class ListkySkonciliException extends Exception {
    private LocalDateTime cas;
    private String nazovKapely;

    public ListkySkonciliException() {
        this(null);
    }

    public ListkySkonciliException(String sprava) {
        this(sprava, null, "");
    }

    public ListkySkonciliException(String sprava, LocalDateTime cas, String nazov) {
        super(sprava);
        this.cas = cas;
        this.nazovKapely = nazov;
    }

    public LocalDateTime getCas() {
        return cas;
    }

    public String getNazovKapely() {
        return nazovKapely;
    }
}
