package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstComplexNumber = new ComplexNumber(2, 3);
        ComplexNumber secondComplexNumber = new ComplexNumber(4, 5);
        firstComplexNumber.sum(secondComplexNumber).print();
        firstComplexNumber.multiply(secondComplexNumber).print();
    }
}
