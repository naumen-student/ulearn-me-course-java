package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.5, 4.0);
        ComplexNumber num2 = new ComplexNumber(12.3, 2.8);
        ComplexNumber add = num1.sum(num2);
        ComplexNumber multiply = num1.multiply(num2);
    }
}
