package cvik5;

import java.util.ArrayList;
import java.util.List;

public class Priklad5_8 {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("cherry");
        wordList.add("apple");
        wordList.add("date");
        wordList.add("apple");

        String slovo = "apple";
        System.out.println("Original list: " + wordList);

        for (int i = wordList.size() - 1; i >= 0; i--) {
            if (wordList.get(i).equals(slovo)) {
                wordList.remove(i);
            }
        }

        System.out.println("Word " + slovo + " removed: " + wordList);
    }
}
