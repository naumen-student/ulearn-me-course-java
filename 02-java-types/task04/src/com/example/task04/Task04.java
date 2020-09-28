package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result = 0.0f;
        if (operation.equals("+"))
            result = a + b;
        if (operation.equals("-"))
            result = a - b;
        if (operation.equals("/"))
            result = (float)a / b;
        if (operation.equals("*"))
            result = a * b;
        return result;
    }

    public static void main(String[] args) {
        System.out.print(calculate(-25,5,"+"));
    }

}
