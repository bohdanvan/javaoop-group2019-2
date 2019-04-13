package com.bvan.oop.lessons7_8.generic;

import com.bvan.oop.lessons7_8.generic.box.Box;
import java.util.ArrayList;
import java.util.List;

public class GenericRawType {

    public static void main(String[] args) {
        Box<String> nameBox = new Box<>("John");
        Box box = new Box("Anna"); // Raw type (with generic) - BAD PRACTICE

        List<String> list = new ArrayList<>();
        addInt(list);
        String s = list.get(0);
        System.out.println(s);
    }

    private static void addInt(List list) {
        list.add(1);
    }
}
