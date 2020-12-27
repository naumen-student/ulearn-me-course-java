package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(10, 2);
        ComplexNumber c2 = new ComplexNumber(4, 1);
        ComplexNumber sum = c1.add(c2);
        ComplexNumber multiply = c1.multiply(c2);
    }
}
