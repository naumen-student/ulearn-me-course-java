package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        CNumber number1 = new CNumber(2.0, 8.6);
        CNumber number2 = new CNumber(7.1, 4.3);
        CNumber sum = number1.Sum(number2);
        CNumber multiply = number1.Multiply(number2);
    }
}
