package com.bvan.oop.lessons7_8.generic.box;

public class Box<T> {

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

//    public T create() {
//        return new T();
//    }

//    public T[] createArray() {
//        return (T[]) new Object[10];
//    }

    @Override
    public String toString() {
        return "Box{" +
                "value='" + value + '\'' +
                '}';
    }
}
