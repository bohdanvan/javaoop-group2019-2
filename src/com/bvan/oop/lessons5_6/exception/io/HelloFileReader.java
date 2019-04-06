package com.bvan.oop.lessons5_6.exception.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HelloFileReader {

    public static void main(String[] args) {
        try {
            String message = readMessageFromFile("files/hello.txt");
            System.out.println(message);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        }
    }

    public static String readMessageFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        String message = scanner.nextLine();
        scanner.close();

        return message;
    }
}
