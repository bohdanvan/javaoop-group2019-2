package com.bvan.oop.lessons9_10.java8;

public class PersonInfoRunner {

    public static void main(String[] args) {
        PersonInfo info = (n, a) -> "Hello, I'm " + n + ", " + a + " years old";
//        PersonInfo infoAnonymous = new PersonInfo() {
//            @Override
//            public String buildMessage(String n, int a) {
//                return "Hello, I'm " + n + ", " + a + " years old";
//            }
//        };

        System.out.println(info.buildMessage("Taras", 25));
        System.out.println(info.buildMessage("Ivan", 30));
    }
}

@FunctionalInterface
interface PersonInfo {

    String buildMessage(String name, int age);

    default void printMessage(String name, int age) {
        System.out.println(buildMessage(name, age));
    }
}
