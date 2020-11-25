package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        if (operation.equals("+")) {
            return (float) a + b;
        } else if (operation.equals("-")) {
            return (float) a - b;
        } else if (operation.equals("*")) {
            return (float) a * b;
        } else {
            return (float) a/b;
        }
    }

    public static void main(String[] args) {

    }

}
