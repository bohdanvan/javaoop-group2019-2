package com.bvan.oop.lessons9_10.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(500_000);
        System.out.println(list1.size()); // 0

        // O(N)
        for (int i = 1; i <= 500_000; i++) { // O(N)
            list1.add(i); // O(1)
        }
        System.out.println(list1);

        // O(N^2)
        List<Integer> list2 = new ArrayList<>();
        for (int i = 500_000; i >= 1; i--) { // O(N)
            list2.add(0, i); // O(N)
        }
        System.out.println(list2);
    }
}
