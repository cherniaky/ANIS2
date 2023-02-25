package cvik8;

public class BodImpl implements Bod {
    private int x;
    private int y;

    public BodImpl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
