package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3.3,2.3);
        ComplexNumber num2 = new ComplexNumber(1.1, 2.2);
        ComplexNumber sum = num1.sum(num2);
        ComplexNumber multiply = num1.multiply(num2);
    }
}
