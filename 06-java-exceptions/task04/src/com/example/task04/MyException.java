package com.example.task04;

public class MyException extends IllegalArgumentException {
    public MyException(String format) {
        super(format);
    }
}
