package cvik6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Priklad6_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "apple", "banana", "apple"));
        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {
            map.merge(str, 1, Integer::sum);
        }

        System.out.println("List: " + list);
        System.out.println("Map: " + map);
    }
}
