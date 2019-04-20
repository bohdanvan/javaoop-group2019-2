package com.bvan.oop.lessons9_10;

public class Complexity {

    public static void main(String[] args) {
        int n = 100;

        // O(N)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // O(N)
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

        // O(N/2) = O(N)
        for (int i = 0; i < n / 2; i++) {
            System.out.println(i);
        }

        // O(1)
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        // O(log N)
        for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }

        // O(log N)
        for (int i = n; i > 0; i /= 2) {
            System.out.println(i);
        }

        // O(N^2)
        for (int i = 0; i < n; i++) { // O(N)
            for (int j = 0; j < n; j++) { // O(N)
                System.out.println(i + " " + j);
            }
        }

        // O(N * log N)
        for (int i = 0; i < n; i++) { // O(N)
            for (int j = n; j > 0; j /= 2) { // O(log N)
                System.out.println(j);
            }
        }

        // O(N^2) + O(N * logN) = O(N^2)
        // 100 * O(log N) + 2 * O(1) + O(N) / 10 = O(N)
    }
}
