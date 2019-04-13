package com.bvan.oop.lessons7_8.enum_example;

public class Practice {

    public static void main(String[] args) {
        System.out.println(Genre.DRAMA == Genre.DRAMA);
        System.out.println(Genre.DRAMA == Genre.valueOf("DRAMA"));
        System.out.println(Genre.values()[10]);
    }
}
