package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5, 9);
        ComplexNumber b = new ComplexNumber(2, -14);
        System.out.println((a.sum(b)).toString());
        System.out.println((a.multiply(b)).toString());
    }
}
