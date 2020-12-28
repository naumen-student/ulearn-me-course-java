package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(5, 10);
        ComplexNumber number2 = new ComplexNumber(-4, 3);
        ComplexNumber sum = number1.sum(number2);
        ComplexNumber mul = number1.multiply(number2);
        System.out.println(sum);
        System.out.println(mul);
    }
}
