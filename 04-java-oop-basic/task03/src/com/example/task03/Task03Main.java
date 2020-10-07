package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers a = new ComplexNumbers(1, 3);
        ComplexNumbers b = new ComplexNumbers(25, 10);
        System.out.println((a.sum(b)).toString());
        System.out.println((a.mult(b)).toString());
    }
}