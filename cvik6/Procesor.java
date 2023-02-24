package cvik6;

import java.util.ArrayList;
import java.util.List;

public class Procesor<V, S> {
    private List<S> vystupy = new ArrayList<>();

    public List<S> getVystupy() {
        return vystupy;
    }

    public void vypocitaj(List<Instrukcia<V,S>> program, List<V> vstypy) {
        for (int i = 0; i < vstypy.size(); i++) {
            V input = vstypy.get(i);
            Instrukcia<V, S> instruction = program.get(i);
            S output = instruction.spracuj(input);
            vystupy.add(output);
        }
    }
}
