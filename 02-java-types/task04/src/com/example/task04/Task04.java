package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float num1 = (float)a;
        float num2 = (float)b;
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            case "*":
                return num1 * num2;
        }
        return 0;
    }

    public static void main(String[] args) {
    }
}