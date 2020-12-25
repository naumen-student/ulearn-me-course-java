package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex complex = new Complex(2, -5);
        Complex newComplex = new Complex(4, -7);
        System.out.println(complex.add(newComplex).toString());
        System.out.println(complex.multiply(newComplex).toString());

    }
}
