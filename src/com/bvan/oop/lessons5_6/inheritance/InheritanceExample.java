package com.bvan.oop.lessons5_6.inheritance;

import java.time.LocalDate;

public class InheritanceExample {

    public static void main(String[] args) {
        Person p1 = new Person("Taras", LocalDate.of(1985, 4, 15));
        p1.sayHello();

        Developer d = new Developer(
                "Ivan", LocalDate.of(1990, 6, 7), "Amazon");
        d.sayHello();
        d.writeCode();

        Person p2 = new Developer(
                "Masha", LocalDate.of(1997, 7, 8), "Google");
        p2.sayHello();
    }
}

class Person {

    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {
        this("noname", null);
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}

class Developer extends Person {

    private final String company;

    public Developer(String name, LocalDate birthDate, String company) {
        super(name, birthDate);
        this.company = company;
    }

    public Developer() {
        super();
        this.company = null;
    }

    public void writeCode() {
        System.out.println("I'm writing code in " + company);
    }

    @Override
    public void sayHello() {
        System.out.println("I'm dev from " + company);
        super.sayHello();
    }
}
