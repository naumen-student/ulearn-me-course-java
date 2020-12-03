package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 3);
        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
    }
}
