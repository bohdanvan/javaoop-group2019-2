package com.bvan.oop.lessons7_8.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Bohdan",
                "Bohdan",
                "Anton",
                "Inna",
                "Ivan",
                "Inna",
                "Inna",
                "Bohdan",
                "Anton",
                "Anton"
        );

//        Set<String> uniqueNames = new HashSet<>();
//        for (String name : names) {
//            uniqueNames.add(name);
//        }

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

        System.out.println(names.contains("Inna"));
        System.out.println(names.contains("Taras"));
    }
}
