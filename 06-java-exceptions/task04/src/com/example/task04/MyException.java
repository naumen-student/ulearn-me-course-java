package com.example.task04;

public class MyExpection extends IllegalArgumentException {
    public MyExpection(String message) {
        super(message);
    }
}