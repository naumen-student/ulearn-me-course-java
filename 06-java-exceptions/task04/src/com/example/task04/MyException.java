package com.example.task04;

public class MyException extends IllegalArgumentException {

    public String message;

    public MyException() {
    }

    public MyException(String message) {
        this.message = message;
    }
}
