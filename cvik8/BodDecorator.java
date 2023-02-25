package cvik8;

public class BodDecorator implements Bod {
    protected Bod bod;
    protected Bod center;

    public BodDecorator(Bod bod, Bod center) {
        this.bod = bod;
        this.center = center;
    }

    public int getX() {
        return bod.getX() + center.getX();
    }

    public int getY() {
        return bod.getY() + center.getY();
    }
}
