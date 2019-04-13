package com.bvan.oop.lessons7_8.enum_example;

public class MovieRunner {

    public static void main(String[] args) {
        Movie pulpFiction = new Movie("Pulp Fiction", 1994, Genre.COMEDY);
        Movie greenMile = new Movie(
                "Green Mile", 1999, Genre.valueOf("DRAMA"));

        System.out.println(pulpFiction);
        System.out.println(greenMile);
    }
}
