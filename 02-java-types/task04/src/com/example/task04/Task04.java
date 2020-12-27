package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        return 0;
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return (float) a / b;
        }
        return 0f;
    }

    public static void main(String[] args) {

    }

}
