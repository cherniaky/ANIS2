package cvik4;

public class Osvetlenie extends ZakladneZariadenie {

    Osvetlenie(String nazov) {
        super(nazov);
    }
    
    @Override
    public void zapni() {
        if (!stav) {
            super.zapni();
            System.out.println("osvetlenie zapnute");
        }
    }
    @Override
    public void vypni() {
        if (stav) {
            super.vypni();
            System.out.println("osvetlenie vypnute");
        }
        
    }
}
