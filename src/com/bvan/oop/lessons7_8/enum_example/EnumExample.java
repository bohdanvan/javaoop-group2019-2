package com.bvan.oop.lessons7_8.enum_example;

public class EnumExample {

    public static void main(String[] args) {
        Genre g1 = Genre.ACTION;
        System.out.println(g1);

        // String -> enum
        Genre g2 = Genre.valueOf("drama".toUpperCase());
        System.out.println(g2);

        // int -> enum
        Genre[] genres = Genre.values();
        Genre g3 = genres[2];
        System.out.println(g3);

        // enum -> String
        String name = g1.name();
        System.out.println(name);

        // enum -> int
        int ordinal = g1.ordinal();
        System.out.println(ordinal);

        System.out.println(Genre.HORROR.getShortName());
        System.out.println(Genre.THRILLER.getLikeLevel());
    }
}
