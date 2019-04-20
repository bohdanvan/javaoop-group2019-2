package com.bvan.oop.lessons9_10.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordsCount {

    public static void main(String[] args) {
        List<String> langs = createLangs();
        Map<String, Integer> wordToCount =
                new TreeMap<>(countWords(langs));

        System.out.println(wordToCount);
    }

    // O(N)
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordToCount = new LinkedHashMap<>();
        for (String word : words) { // O(N)
            if (wordToCount.containsKey(word)) { // O(1)
                Integer count = wordToCount.get(word); // O(1)
                wordToCount.put(word, count + 1); // O(1)
            } else {
                wordToCount.put(word, 1); // O(1)
            }
        }
        return wordToCount;
    }

    private static List<String> createLangs() {
        return Arrays.asList(
                "JavaScript",
                "Java",
                "Kotlin",
                "Java",
                "Java",
                "C#",
                "Java",
                "Kotlin",
                "Python",
                "Kotlin",
                "Kotlin",
                "Java",
                "Python",
                "C#",
                "Python",
                "C#",
                "Python",
                "C#",
                "JavaScript",
                "Python",
                "Python"
        );
    }
}


