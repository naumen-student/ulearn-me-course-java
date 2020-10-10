package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(21, 10);
        ComplexNumber number2 = new ComplexNumber(0.3, -7.7);
        ComplexNumber sum = number1.complexSum(number2);
        ComplexNumber mult = number1.complexMult(number2);

        System.out.println(number1.toString());
        System.out.println(number2.toString());
        System.out.println(sum.toString());
        System.out.println(mult.toString());
    }
}
