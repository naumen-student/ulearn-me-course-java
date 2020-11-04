package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(13.4, 4);
        ComplexNumber b = new ComplexNumber(16.6, -5);
        ComplexNumber TestSum = a.sum(b);
        ComplexNumber TestMultiply = a.multiply(b);
    }
}
