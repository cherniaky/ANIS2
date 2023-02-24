package cvik6;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        ZlozenyObjekt2D<ZakladnyObjekt<Bod2D>> zlozeny = new ZlozenyObjekt2D<>(
                Arrays.asList(new ZakladnyObjekt<Bod2D>(new Bod2D(1, 3)), new ZakladnyObjekt<Bod2D>(new Bod2D(1, 3)),
                        new ZakladnyObjekt<Bod2D>(new Bod2D(1, 3))));

        System.out.println(zlozeny.getObjekty());
    }
}
