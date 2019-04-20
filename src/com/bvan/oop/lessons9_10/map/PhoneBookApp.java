package com.bvan.oop.lessons9_10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PhoneBookApp {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new HashMap<>();

        phoneBook.put("Ivan", new PhoneNumber("+30951111111"));
        phoneBook.put("Masha", new PhoneNumber("+30951111112"));
        phoneBook.put("Anton", new PhoneNumber("+30951111113"));
        phoneBook.put("Anna", null); // not a good practice

        PhoneNumber mashaNumber = phoneBook.get("Anna");
        System.out.println(mashaNumber);

        PhoneNumber ivanNumber = phoneBook.get("ivan");
        System.out.println(ivanNumber);

        System.out.println(phoneBook.containsKey("Anna"));
        System.out.println(phoneBook.containsKey("ivan"));
        System.out.println("-------------");

        phoneBook.remove("Anton");
        System.out.println(phoneBook.get("Anton"));
        System.out.println("-------------");

        System.out.println("For-each: ");
        Set<String> keys = phoneBook.keySet();
        Collection<PhoneNumber> values = phoneBook.values();

        Set<Map.Entry<String, PhoneNumber>> entries = phoneBook.entrySet();
        for (Entry<String, PhoneNumber> entry : entries) {
            String name = entry.getKey();
            PhoneNumber phoneNumber = entry.getValue();
            System.out.println(name + " -> " + phoneNumber);
        }
    }
}

class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
