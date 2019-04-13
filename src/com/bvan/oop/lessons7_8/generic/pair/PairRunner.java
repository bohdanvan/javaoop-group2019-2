package com.bvan.oop.lessons7_8.generic.pair;

public class PairRunner {

    public static void main(String[] args) {
        Pair<String, String> firstAndLastName = new Pair<>("John", "Smith");
        Pair<String, Integer> nameAndAge = new Pair<>("John", 30);

        String name = nameAndAge.getLeft();
        Integer age = nameAndAge.getRight();
        System.out.println("Hello, I'm " + name + ", " + age + " years old");
    }
}
