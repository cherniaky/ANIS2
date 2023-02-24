package cvik7;

public class ExpressionBuilder implements Builder {
    private Operacia operacia;

    public ExpressionBuilder() {
        operacia = new Operacia(null) {
            public double vypocitaj(double x) {
                return x;
            }
        };
    }

    @Override
    public Builder pripocitaj(int cislo) {
        operacia = new Pripocitaj(cislo, operacia);
        return this;
    }

    @Override
    public Builder vynasob(int cislo) {
        operacia = new Vynasob(cislo, operacia);
        return this;
    }

    @Override
    public Operacia build() {
        return operacia;
    }

}
