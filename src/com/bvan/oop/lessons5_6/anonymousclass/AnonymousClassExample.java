package com.bvan.oop.lessons5_6.anonymousclass;

import com.bvan.oop.lessons5_6.format.Product;
import com.bvan.oop.lessons5_6.format.oop.Cart;
import com.bvan.oop.lessons5_6.format.oop.CsvFormatter;
import com.bvan.oop.lessons5_6.format.oop.Formatter;

public class AnonymousClassExample {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));

        cart.print(csvFormatter());
        System.out.println();

        cart.print(priceFormatter());
    }

    // static factory method
    public static Formatter priceFormatter() {
        return new Formatter() {
            @Override
            public String format(Product product) {
                return String.valueOf(product.getPrice());
            }
        };
    }

    // static factory method
    public static Formatter csvFormatter() {
        return new CsvFormatter();
    }

    // static factory method
    public static Formatter priceFormatterLambda() {
        return product -> String.valueOf(product.getPrice());
    }
}

class PriceFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return String.valueOf(product.getPrice());
    }
}
