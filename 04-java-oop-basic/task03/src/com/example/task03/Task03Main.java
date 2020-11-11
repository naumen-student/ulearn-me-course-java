package com.example.task03;

public class Task03Main{
    public static void main(String[] args){
        Complex number1 = new Complex(3,1);
        Complex number2 = new Complex(5,4);
        Complex result2 = number1.Multiply(number2);
        Complex result1 = number1.Sum(number2);
        System.out.println(result1.toString());
        System.out.println(result2.toString());
    }
}
