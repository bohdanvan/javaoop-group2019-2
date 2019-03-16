package com.bvan.oop.lessons1_2.arraylist;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        int[] array = new int[10];

        // dynamic array
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list.add(10, 1000);

        System.out.println(list);
    }

//    public static void add(int[] array, int index, int elem) { ... }
}
