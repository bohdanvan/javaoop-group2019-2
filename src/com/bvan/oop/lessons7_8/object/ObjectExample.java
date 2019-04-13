package com.bvan.oop.lessons7_8.object;

import java.util.ArrayList;
import java.util.Objects;

public class ObjectExample {

    public static void main(String[] args) {
        User user1 = new User("darklord123");

        String s = user1.toString();
        System.out.println(s);

        User user2 = new User("darklord123");
        System.out.println("ref: " + (user1 == user2)); // false
        System.out.println(user1.equals(user2));
        System.out.println(user1.getUsername().equals(user2.getUsername()));

        // -----

        A a = new A(10);
        A b = new A(10);
        System.out.println(a.equals(b));

        // -----

        int x = 10;
        int y = 10;
        System.out.println(x == y);

        // -----

        Object obj1 = new User("john");
        Object obj2 = "Hello";
        Object obj3 = new ArrayList<String>();
    }
}

class User extends Object {

    private final String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}

class A {
    private final int x;

    public A(int x) {
        this.x = x;
    }
}
