package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(2, 3);
        ComplexNumber cn2 = new ComplexNumber(-1, 1);
        ComplexNumber cnAdd = cn1.add(cn2);
        ComplexNumber cnMultiplication = cn1.multiplication(cn2);
    }
}