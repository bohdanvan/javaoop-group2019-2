package com.bvan.oop.lessons9_10.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KeysOrder {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new LinkedHashMap<>();
        // HashMap - random order
        // TreeMap - sorted order
        // LinkedHashMap - adding order

        phoneBook.put("Boris", new PhoneNumber("+30951111115"));
        phoneBook.put("Ivan", new PhoneNumber("+30951111111"));
        phoneBook.put("Masha", new PhoneNumber("+30951111112"));
        phoneBook.put("Anton", new PhoneNumber("+30951111113"));
        phoneBook.put("Anna", new PhoneNumber("+30951111114"));
        phoneBook.put("Igor", new PhoneNumber("+30951111115"));

        for (Entry<String, PhoneNumber> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
