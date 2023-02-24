package cvik6;

public class Bod2D implements Bod {
    private double x;
    private double y;

    public Bod2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return 0;
    }
}
