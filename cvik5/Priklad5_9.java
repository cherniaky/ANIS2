package cvik5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Priklad5_9 {
    public static void main(String[] args) {
        List wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("cherry");
        wordList.add("apple");
        wordList.add("date");
        wordList.add("banana");
        wordList.add("apple");

        System.out.println("Original list: " + wordList);

        Set uniqueWords = new HashSet<>(wordList);
        List uniqueWordList = new ArrayList<>(uniqueWords);

        System.out.println("List with duplicates removed: " + uniqueWordList);
    }
}
