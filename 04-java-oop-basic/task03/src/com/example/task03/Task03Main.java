package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c = new Complex(1, 1);
        System.out.println(c.plus(new Complex(12, 13)).toString());
    }
}
