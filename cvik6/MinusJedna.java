package cvik6;

public class MinusJedna implements Instrukcia<Integer, Integer> {

    @Override
    public Integer spracuj(Integer vstup) {
        return vstup - 1;
    }

}
