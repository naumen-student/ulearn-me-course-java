package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation)
        {
            case "+":
                return a + b;
                break;
            case "-":
                return a-b;
                break;
            case "/":
                return a/b;
                break;
            case "*":
                return a*b;
                break;
        }
        return a;
    }

    public static void main() {

    }

}
