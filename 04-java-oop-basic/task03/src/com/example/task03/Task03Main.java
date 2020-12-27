package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(4, -3);
        System.out.println((a.sum(b)).toString());
        System.out.println((a.multiply(b)).toString());
    }
}
