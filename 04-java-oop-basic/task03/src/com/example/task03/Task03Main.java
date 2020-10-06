package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(2,5);
        ComplexNumber n2 = new ComplexNumber(4,3);
        ComplexNumber r1 = n1.sum(n2);
        ComplexNumber r2 = n1.multiply(n2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
