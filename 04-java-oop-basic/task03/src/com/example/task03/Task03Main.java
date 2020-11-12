package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(3,6);
        Complex b = new Complex(4,7);
        System.out.println((a.sum(b)).toString());
        System.out.println((a.multiply(b)).toString());
    }
}
