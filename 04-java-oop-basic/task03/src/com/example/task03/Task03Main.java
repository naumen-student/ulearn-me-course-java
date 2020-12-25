package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers firstNumber = new ComplexNumbers(21, 12);
        ComplexNumbers secondNumber = new ComplexNumbers(7, 56);
        System.out.println((firstNumber.sum(secondNumber)).toString());
        System.out.println((firstNumber.multiplication(secondNumber)).toString());
    }
}