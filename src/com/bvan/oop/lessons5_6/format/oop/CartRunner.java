package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        cart.print(new CsvFormatter());
        System.out.println();

        cart.print(new CsvFormatter(";"));
        System.out.println();

        cart.print(new CsvFormatter("|"));
        System.out.println();

        cart.print(new JsonFormatter());
        System.out.println();
    }
}
