package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(2,4);
        ComplexNumber second = new ComplexNumber(4,3);
        ComplexNumber sum = first.sum(second);
        ComplexNumber multiply = second.multiply(first);
    }
}
