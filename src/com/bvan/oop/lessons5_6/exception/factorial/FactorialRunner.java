package com.bvan.oop.lessons5_6.exception.factorial;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        try {
            BigInteger factorial = Factorial.factorial(10);
            System.out.println(factorial);
            System.out.println("In try");
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Sorry, illegal argument : " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Sorry, illegal state: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException | ArrayStoreException e) {
            System.out.println("Sorry, array error");
        } catch (RuntimeException e) {
            System.out.println("Sorry error");
        }

        System.out.println("After try-catch");
        System.out.println("Goodbye");
    }
}
