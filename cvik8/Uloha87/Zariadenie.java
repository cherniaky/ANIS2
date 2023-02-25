package cvik8.Uloha87;

public class Zariadenie {
    public void oznamPripojenie(Siet siet) {
        System.out.println("Zariadenie sa pripojilo k sieti.");
        siet.notifikujVsetky();
    }

    public void oznamOdpojenie(Siet siet) {
        System.out.println("Zariadenie sa odpojilo od siete.");
        siet.notifikujVsetky();
    }

    public void aktualizuj(Siet siet) {
        System.out.println("Aktualizácia stavu siete.");
    }
}