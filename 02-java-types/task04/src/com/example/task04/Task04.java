package com.example.task04;

public class Task04 {

    public static float calculate(int firstNumber, int secondNumber, String operation) {
        if (operation.equals("+"))
            return firstNumber + secondNumber;

        if (operation.equals("-"))
            return firstNumber - secondNumber;

        if (operation.equals("/"))
            return (float) firstNumber / secondNumber;

        return firstNumber * secondNumber;
    }

    public static void main(String[] args) {

    }

}
