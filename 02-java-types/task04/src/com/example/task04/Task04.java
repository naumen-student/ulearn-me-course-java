package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result = 0.0f;
        float a1 = a * 1.0f;
        float b1 = b * 1.0f;
        if (operation.equals("+"))
            result = a1 + b1;
        if (operation.equals("-"))
            result = a1 - b1;
        if (operation.equals("/"))
            result = a1 / b1;
        if (operation.equals("*"))
            result = a1 * b1;
        return result;
    }

    public static void main(String[] args) {
        System.out.print(calculate(25,6,"/"));
    }

}
