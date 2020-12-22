package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(5,2);
        ComplexNumber n2 = new ComplexNumber(2,5);
        ComplexNumber sum = n1.sum(n2);
        ComplexNumber multi = n1.multiply(n2);
        System.out.println(sum.toString());
        System.out.println(multi.toString());
    }
}
