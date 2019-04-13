package com.bvan.oop.lessons7_8.generic;

import com.bvan.oop.lessons7_8.enum_example.Genre;
import com.bvan.oop.lessons7_8.enum_example.Movie;
import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vanya");
        names.add("Sasha");
        System.out.println(names);

        List names2 = new ArrayList();
        names2.add("Vanya");
        names2.add("Sasha");
        names2.add(1);
        names2.add(new Movie("A", 2000, Genre.COMEDY));

        String s = (String) names2.get(3);
        System.out.println(s);
    }
}
