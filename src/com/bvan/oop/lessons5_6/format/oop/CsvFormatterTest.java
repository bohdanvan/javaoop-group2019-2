package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

public class CsvFormatterTest {

    public static void main(String[] args) {
        CsvFormatter csvFormatter = new CsvFormatter(";");
        String s = csvFormatter.format(new Product("MacBook", 2000));
        System.out.println(s); // MacBook;2000
    }
}
