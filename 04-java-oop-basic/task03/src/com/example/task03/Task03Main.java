package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex number1 = new Complex(1, -4);
        Complex number2 = new Complex(1, 2);
        Complex sum = Complex.sum(number1, number2);
        Complex mult = Complex.multiply(number1, number2);
        System.out.println(sum.toString());
        System.out.println(mult.toString());
    }
}
