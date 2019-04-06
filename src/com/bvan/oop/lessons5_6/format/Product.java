package com.bvan.oop.lessons5_6.format;

public class Product {

    private final String name;
    private long price;

    public Product(String name, long price) {
        checkPrice(price);
        this.name = name;
        this.price = price;
    }

    private void checkPrice(long price) {
        if (price < 0) {
            throw new IllegalArgumentException("illegal price: " + price);
        }
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        checkPrice(price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
