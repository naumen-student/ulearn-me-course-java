package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 5);
        Complex c = a.add(b);
        System.out.println(c);
    }
}
