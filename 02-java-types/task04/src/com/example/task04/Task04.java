package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation) {
            case "/":
                return (float) a / b;
            case "*":
                return (float) a * b;
            case "-":
                return (float) a - b;
            default:
                return (float) a + b;
        }
    }

    public static void main(String[] args) {
    }

}
