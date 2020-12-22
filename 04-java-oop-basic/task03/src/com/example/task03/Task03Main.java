package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber( -3, 2);
        ComplexNumber second = new ComplexNumber(4, -3);

        System.out.println(first.sum(second).toString());
        System.out.println(first.multiply(second).toString());
    }
}
