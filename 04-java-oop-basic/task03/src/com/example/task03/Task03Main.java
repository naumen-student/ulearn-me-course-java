package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum number1 = new ComplexNum(5,2);
        ComplexNum number2 = new ComplexNum(7,3);
        ComplexNum result1 = number1.Sum(number2);
        ComplexNum result2 = number1.Multiply(number2);
        System.out.println(result1.toString());
        System.out.println(result2.toString());

    }
}
