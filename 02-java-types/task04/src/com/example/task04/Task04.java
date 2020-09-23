package com.example.task04;

public class Task04 {

    public static float calculate(int aa, int bb, String operation) {
        float a = aa, b = bb;

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
