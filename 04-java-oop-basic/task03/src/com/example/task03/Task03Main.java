package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(7, -10);
        ComplexNumber secondNumber = new ComplexNumber(-4, 9);
        ComplexNumber sum = firstNumber.sum(secondNumber);
        ComplexNumber mulriply = firstNumber.multiply(secondNumber);
    }
}
