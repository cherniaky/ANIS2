package cvik7;

public class Pripocitaj extends Operacia {

    private int cislo;

    public Pripocitaj(int cislo, Operacia prev) {
        super(prev);
        this.cislo = cislo;
    }

    public double vypocitaj(double x) {
        double y = super.vypocitaj(x);
        return y + cislo;
    }
}
