package zadanie;

import java.time.LocalDateTime;

public class ListkySkonciliException extends Exception {
    protected LocalDateTime cas;
    protected String nazovKapely;

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

    public LocalDateTime getCasDateTime() {
        return cas;
    }

    public String getNazovKapely() {
        return nazovKapely;
    }
}
