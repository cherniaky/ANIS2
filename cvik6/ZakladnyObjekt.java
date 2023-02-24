package cvik6;

public class ZakladnyObjekt<T extends Bod> implements GrafickyObjekt<T> {
    private T position;

    public ZakladnyObjekt(T position) {
        this.position = position;
    }

    @Override
    public T getPoloha() {
        return position;
    }

}
