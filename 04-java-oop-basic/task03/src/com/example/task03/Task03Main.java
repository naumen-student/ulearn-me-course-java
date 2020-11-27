package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumver = new ComplexNumber(2, 1);
        ComplexNumber secondNumver = new ComplexNumber(3, 2);
        System.out.println(firstNumver);
        System.out.println(secondNumver);
        System.out.println(ComplexNumber.add(firstNumver, secondNumver));
        System.out.println(ComplexNumber.multiplication(firstNumver, secondNumver));

    }
}
