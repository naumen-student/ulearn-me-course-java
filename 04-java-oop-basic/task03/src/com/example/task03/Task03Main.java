package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 4);
        ComplexNumber b = new ComplexNumber(3, -5);
        System.out.println((a.sum(b)).toString());
        System.out.println((a.multiply(b)).toString());
    }
}
