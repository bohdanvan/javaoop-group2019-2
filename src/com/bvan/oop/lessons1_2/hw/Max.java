package com.bvan.oop.lessons1_2.hw;

/**
 * @author bvanchuhov
 */
public class Max {

    public static void main(String[] args) {
        int[] array = {10, 30, 5, 20};
        int res = max(array);
        System.out.println("res = " + res);
    }

    public static int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        int max = array[0];
        for (int elem : array) { // iter
            if (elem > max) {
                max = elem;
            }
        }

        return max;
    }
}
