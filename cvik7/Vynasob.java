package cvik7;

public class Vynasob extends Operacia {
    private int cislo;

    public Vynasob(int cislo, Operacia prev) {
        super(prev);
        this.cislo = cislo;
    }

    public double vypocitaj(double x) {
        double y = super.vypocitaj(x);
        return y * cislo;
    }
}
