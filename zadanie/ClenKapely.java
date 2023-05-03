package zadanie;

// Class pre clena kapley
public class ClenKapely extends Osoba {
    public String nastroj;

    public ClenKapely(String meno, String email, String nastroj) {
        super(meno, email);
        this.nastroj = nastroj;
    }

    public String getNastroj() {
        return nastroj;
    }

    public void setNastroj(String nastroj) {
        this.nastroj = nastroj;
    }

    @Override
    public String getInfo() {
        return "Clen kapely: " + this.getMeno();
    }
}
