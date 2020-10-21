package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex firstNumber = new Complex(5, -6);
        Complex secondNumber = new Complex(-3, 2);
        Complex additionResult = firstNumber.add(secondNumber);
        Complex multiplicationResult = firstNumber.multiply(secondNumber);
        System.out.println(additionResult.toString());
        System.out.println(multiplicationResult.toString());
    }
}
