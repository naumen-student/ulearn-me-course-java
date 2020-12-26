package com.example.task04;

public class MyException extends IllegalArgumentException {

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}