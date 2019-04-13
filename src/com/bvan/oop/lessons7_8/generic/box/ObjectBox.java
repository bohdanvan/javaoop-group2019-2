package com.bvan.oop.lessons7_8.generic.box;

public class ObjectBox {

    private final Object value;

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "value='" + value + '\'' +
                '}';
    }
}
