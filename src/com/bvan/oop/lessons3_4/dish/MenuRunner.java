package com.bvan.oop.lessons3_4.dish;

/**
 * @author bvanchuhov
 */
public class MenuRunner {

    public static void main(String[] args) {
        Dish pizza = new Dish("Pizza", "Popular food", 150);
        Dish ceazar = new Dish("Ceazar", "Salad", 120);

        Menu summerMenu = new Menu("Summer Menu");
        summerMenu.addDish(pizza);
        summerMenu.addDish(ceazar);

        Dish cheapestDish = summerMenu.getCheapestDish();
        System.out.println(cheapestDish);

        System.out.println(summerMenu);
    }
}
