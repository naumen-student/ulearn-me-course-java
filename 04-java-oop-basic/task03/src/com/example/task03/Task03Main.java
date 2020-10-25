package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(2, 5);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num1 + num2 = " + num1.add(num2));
        System.out.println("num1 * num2 = " + num1.mult(num2));
    }
}
