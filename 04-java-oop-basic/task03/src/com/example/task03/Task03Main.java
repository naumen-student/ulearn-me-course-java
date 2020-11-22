package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2.0, 8.6);
        ComplexNumber number2 = new ComplexNumber(7.1, 4.3);
        ComplexNumber sum = number1.findSum(number2);
        ComplexNumber multiply = number1.findMultiply(number2);
    }
}
