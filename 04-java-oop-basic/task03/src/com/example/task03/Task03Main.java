package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1,1);
        ComplexNumber c2 = new ComplexNumber(2,2);
        System.out.println(c1.multiple(c2));
        System.out.println(c1.add(c2));
    }
}
