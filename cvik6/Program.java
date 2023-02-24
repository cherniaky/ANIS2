package cvik6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Procesor<Integer, Integer> procesor = new Procesor<>();
        List<Integer> inputs = Arrays.asList(1, 2, 3, 4);

        List<Instrukcia<Integer, Integer>> instructions = Arrays.asList(new PlusJedna(), new MinusJedna(),
                new PlusJedna(), new MinusJedna());

        procesor.vypocitaj(instructions, inputs);
        System.out.println(procesor.getVystupy());
    }
}
