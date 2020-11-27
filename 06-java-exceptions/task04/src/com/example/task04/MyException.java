package com.example.task04;

public class MyException extends IllegalArgumentException {
    private String message;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}