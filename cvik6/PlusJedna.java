package cvik6;

public class PlusJedna implements Instrukcia<Integer, Integer> {

    @Override
    public Integer spracuj(Integer vstup) {
        return vstup + 1;
    }

}
