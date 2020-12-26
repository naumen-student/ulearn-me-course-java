package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers complex1 = new ComplexNumbers(2, 6);
        ComplexNumbers complex2 = new ComplexNumbers(5, 4);
        System.out.println(complex1.toString());
        System.out.println(complex2.toString());
        System.out.println(complex1.sum(complex2).toString());
        System.out.println(complex1.multiply(complex2).toString());
    }
}
