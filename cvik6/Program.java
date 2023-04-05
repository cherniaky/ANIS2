package cvik6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Procesor<Integer, Integer> procesor = new Procesor<>();
        List<Integer> inputs = Arrays.asList(1, 2, 3, 4);

        List<Instrukcia<Integer, Integer>> instructions = Arrays.asList(new PlusJedna(), new MinusJedna(),
                new PlusJedna(), new MinusJedna());

        procesor.vypocitaj(instructions, inputs);
        System.out.println(procesor.getVystupy());

        ZakladnyObjekt<Bod2D> zak1 = new ZakladnyObjekt<Bod2D>(new Bod2D(2, 33));
        ZakladnyObjekt<Bod2D> zak2 = new ZakladnyObjekt<Bod2D>(new Bod2D(25, 333));
        ZakladnyObjekt<Bod2D> zak3 = new ZakladnyObjekt<Bod2D>(new Bod2D(22, 323));

        List<ZakladnyObjekt<Bod2D>> linst = new LinkedList<>();
        linst.add(zak1);
        linst.add(zak2);
        linst.add(zak3);

        ZlozenyObjekt2D<ZakladnyObjekt<Bod2D>> zloz = new ZlozenyObjekt2D<ZakladnyObjekt<Bod2D>>(linst);
    }
}
