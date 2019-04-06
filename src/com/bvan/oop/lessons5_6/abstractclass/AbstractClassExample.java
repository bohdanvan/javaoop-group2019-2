package com.bvan.oop.lessons5_6.abstractclass;

import java.util.ArrayList;
import java.util.List;

public class AbstractClassExample {

    public static void main(String[] args) {
//      new User("ivanp");

        PremiumUser taras = new PremiumUser("taras");
        SimpleUser inna = new SimpleUser("inna");

        List<User> users = new ArrayList<>();
        users.add(taras); // User u1 = new PremiumUser("taras");
        users.add(inna); // User u2 = new SimpleUser("inna");

        users.get(0).watch();
        users.get(1).watch();

        users.get(0).watchFreeContent();
    }

}

abstract class User {

    private final String username;

    public User(String username) {
        this.username = username;
    }

    public void watchFreeContent() {
        System.out.println("I'm " + username + ", "
                + "I'm watching free content");
    }

    public abstract void watch();
}

class PremiumUser extends User {

    public PremiumUser(String username) {
        super(username);
    }

    @Override
    public void watch() {
        System.out.println("I'm watching private content for free");
    }
}

class SimpleUser extends User {

    public SimpleUser(String username) {
        super(username);
    }

    @Override
    public void watch() {
        System.out.println("I have to pay to watch private content");
    }
}