package cvik5;

public class ChybaZariadenia extends Exception {
    private Zariadenie chybneZariadenie;

    public ChybaZariadenia() {
        super();
    }

    public ChybaZariadenia(String sprava) {
        super(sprava);
    }

    public ChybaZariadenia(String sprava, Zariadenie zariadenie) {
        super(sprava);
        this.chybneZariadenie = zariadenie;
    }
}
