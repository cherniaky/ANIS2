package cvik8.Uloha84;

public class GrafickeOkno {
    private int x;
    private int y;
    private boolean jeZavrete;

    public GrafickeOkno() {
        x = 10;
        y = 10;
    }

    public void presunt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void minimalizuj() {
        x = 0;
        y = 0;
    }

    public void zavri() {
        jeZavrete = true;
    }
}
