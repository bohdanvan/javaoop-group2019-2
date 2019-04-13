package com.bvan.oop.lessons7_8.generic.box;

public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
//        Box<Cat> catBox1 = new Box<>(new Dog());
//        Box<Cat> catBox2 = new Box<Dog>(new Dog());

        Box<String> nameBox = new Box<>("Ivan");
        Box<Box<Dog>> dogContainer = new Box<>(new Box<>(new Dog()));

        Cat cat = catBox.get();

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
