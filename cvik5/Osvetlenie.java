package cvik5;

public class Osvetlenie extends ZakladneZariadenie {

    Osvetlenie(String nazov) {
        super(nazov);
    }
    
    @Override
    public void zapni() throws ChybaZariadenia {
        if (!stav) {
            super.zapni();
            System.out.println("osvetlenie zapnuté");
        }
    }
    @Override
    public void vypni() throws ChybaZariadenia {
        if (stav) {
            super.vypni();
            System.out.println("osvetlenie vypnuté");
        }
        
    }
}
