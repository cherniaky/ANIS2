package cvik8;

public class BodDecorator implements Bod {
    int X;
    int Y;
    Bod stred;

    public BodDecorator(int x, int y, Bod stred) {
        this.X = x;
        this.Y = y;
        this.stred = stred;
    }

    @Override
    public int getX() {
        return this.X + stred.getX();
    }

    @Override
    public int getY() {
        return this.Y + stred.getY();
    }
}
