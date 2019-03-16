package com.bvan.oop.lessons1_2.hw;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MaxArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Boris",
                "Ivan",
                "Paraska",
                "Oleksandr",
                "Gleb",
                "Gregoriy",
                "Maria",
                "Masha"));
        String name = findNameWithMostFrequentLetter(names, 'g');
        System.out.println(name); // Paraska

//        ArrayList<String> names2 = new ArrayList<>();
//        findNameWithMostFrequentLetter(names2, 'a');
    }

    public static String findNameWithMostFrequentLetter(
            ArrayList<String> names, char letter) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("empty names");
        }

        String res = names.get(0);
        for (String name : names) {
            if (countLetter(name, letter) > countLetter(res, letter)) {
                res = name;
            }
        }
        return res;
    }

    public static int countLetter(String name, char letter) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.toLowerCase(name.charAt(i)) ==
                    Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }
}
