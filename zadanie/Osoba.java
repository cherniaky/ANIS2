package zadanie;

public abstract class Osoba {
    private String meno;
    private String email;

    public Osoba(String meno, String email) {
        this.meno = meno;
        this.email = email;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getInfo();
}
