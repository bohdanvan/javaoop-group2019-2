package com.bvan.oop.lessons5_6.exception;

public class NoMoneyException extends RuntimeException {

    public NoMoneyException() {
    }

    public NoMoneyException(String message) {
        super(message);
    }
}
