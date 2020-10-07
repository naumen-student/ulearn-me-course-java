package com.example.task03;

public class Task03Main
{
    public static void main(String[] args)
    {
        ComplexNumber number1 = new ComplexNumber(1,8);
        ComplexNumber number2 = new ComplexNumber(4,8);
        ComplexNumber result1 = number1.Summary(number2);
        ComplexNumber result2 = number1.Multiply(number2);
        System.out.println(result1.toString());
        System.out.println(result2.toString());
    }
}
