package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

public class NameFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
