package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(5, -1);
        ComplexNumber second = new ComplexNumber(7, -5);
        System.out.println(first.toString());
        System.out.println(second.toString());
        ComplexNumber sum = first.sum(second);
        System.out.println(sum.toString());
        ComplexNumber multiplication = first.multiply(second);
        System.out.println(multiplication.toString());
    }
}
