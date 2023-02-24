package cvik6;

import java.util.List;

public class ZlozenyObjekt2D<T extends ZakladnyObjekt<Bod2D>> {
    private List<T> objekty;

    public ZlozenyObjekt2D(List<T> objects) {
        this.objekty = objects;
    }

    public List<T> getObjekty() {
        return objekty;
    }
}
