package com.bvan.oop.lessons7_8.generic.pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Splitter {

    public static void main(String[] args) {
        Pair<String, String> split = split("Hello, Java", 5);
        System.out.println(split);

        Pair<String, String> split2 = split("abracadabra", 4);
        System.out.println(split2);

        List<String> names = new ArrayList<>(Arrays.asList("Masha", "Ivan", "Taras", "Yevhinii", "Bohdan"));
        Pair<List<String>, List<String>> split3 = split(names, 3);
        System.out.println(split3);
        System.out.println(split(names, 0));
        System.out.println(split(names, names.size()));
//        System.out.println(split(names, -1));
//        System.out.println(split(names, 10));
    }

    public static Pair<String, String> split(String s, int i) {
        return new Pair<>(
                s.substring(0, i),
                s.substring(i, s.length())
        );
    }

    public static <T> Pair<List<T>, List<T>> split(
            List<T> list, int i) {
        if (i < 0 || i > list.size()) {
            throw new IllegalArgumentException("illegal index: " + i);
        }

        List<T> left = list.subList(0, i);
        List<T> right = list.subList(i, list.size());
        return new Pair<>(left, right);
    }
}
