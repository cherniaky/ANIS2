package cvik7;

public abstract class Operacia {
    private Operacia prev;

    public Operacia(Operacia prev) {
        this.prev = prev;
    }

    public double vypocitaj(double x) {
        if (prev != null) {
            return prev.vypocitaj(x);
        } else {
            return x;
        }
    }
}
