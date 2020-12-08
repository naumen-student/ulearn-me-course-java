package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(3, 5);
        ComplexNumber second = new ComplexNumber(4, 6);

        // before
        System.out.println(first.toString());
        System.out.println(second.toString());

        ComplexNumber sum = first.add(second);
        ComplexNumber multiplied = second.multiply(first);

        // after
        System.out.println(sum.toString());
        System.out.println(multiplied.toString());
    }
}
