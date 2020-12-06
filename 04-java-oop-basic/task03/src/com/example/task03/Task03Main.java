package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers number1 = new ComplexNumbers(2.0, 4.0);
        ComplexNumbers number2 = new ComplexNumbers(8.4, 1.3);
        ComplexNumbers sum = number1.sum(number2);
        ComplexNumbers multiply = number1.multiply(number2);
    }
}
