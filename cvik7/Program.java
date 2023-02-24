package cvik7;

public class Program {
    public static void main(String[] args) {

        ExpressionBuilder builder = new ExpressionBuilder();

        Operacia vysledok = builder.vynasob(10).pripocitaj(10)
                .pripocitaj(-3)
                .build();

        double x = 5;

        System.out.println(vysledok.vypocitaj(x));
    }
}
