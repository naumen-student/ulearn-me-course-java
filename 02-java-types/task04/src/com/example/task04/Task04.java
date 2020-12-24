package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        if (operation.equals("+")) {
            return ((float) a + b);
        }

        if (operation.equals("-")) {
            return ((float) a - b);
        }

        if (operation.equals("*")) {
            return ((float) a * b);
        }

        return ((float) a / b);
    }
}
