package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers num1 = new ComplexNumbers(2.0, 6.0);
        ComplexNumbers num2 = new ComplexNumbers(4.0, 1.0);
        ComplexNumbers sum = num1.Sum(num2);
        ComplexNumbers multiply = num1.Multiply(num2);
    }
}