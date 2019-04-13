package com.bvan.oop.lessons7_8.generic.box;

public class ObjectBoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        ObjectBox catBox = new ObjectBox(dog);
        sendBox(catBox);
    }

    private static void sendBox(ObjectBox catBox) {
        Object value = catBox.get();
        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meow();
        } else {
            throw new IllegalArgumentException("where is my cat?");
        }
    }
}

class Cat {

    public void meow() {
        System.out.println("Meow-meow");
    }
}

class Dog {

    public void bark() {
        System.out.println("Gav-gav");
    }
}
