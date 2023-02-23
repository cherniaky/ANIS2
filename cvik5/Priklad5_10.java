package cvik5;

import java.util.HashSet;
import java.util.Set;

public class Priklad5_10 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("January");
        set1.add("February");
        set1.add("March");

        Set<String> set2 = new HashSet<>();
        set2.add("January");
        set2.add("February");
        set2.add("April");
        set2.add("May");

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<String> complement = new HashSet<>(union);
        complement.removeAll(set1);
        System.out.println("Complement of set1 against the union set: " + complement);
    }
}
