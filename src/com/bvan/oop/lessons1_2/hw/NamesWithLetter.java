package com.bvan.oop.lessons1_2.hw;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class NamesWithLetter {

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

        ArrayList<String> res = findNamesWithLetter(names, 'G');
        System.out.println(res); // [Gleb, Gregoriy]
    }

    public static ArrayList<String> findNamesWithLetter(
            ArrayList<String> names, char letter) {

        ArrayList<String> res = new ArrayList<>();

        String lowerCase = "" +  Character.toLowerCase(letter);
        String upperCase = "" + Character.toUpperCase(letter);

        for (String name : names) {
            if (name.contains(lowerCase)
                    || name.contains(upperCase)) {
                res.add(name);
            }
        }

        return res;
    }
}
