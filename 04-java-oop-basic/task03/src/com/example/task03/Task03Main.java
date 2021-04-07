package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNum num1 = new ComplexNum(44, 23);
        ComplexNum num2 = new ComplexNum(3, 6);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}