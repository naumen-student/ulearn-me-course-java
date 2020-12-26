package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result = 0;
        if (operation.equals("+"))
            result = a + b;
        if (operation.equals("-"))
            result = a - b;
        if (operation.equals("*"))
            result = a * b;
        if (operation.equals("/"))
            result = (float)a / b;
        return result;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
