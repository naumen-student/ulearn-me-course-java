package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float num = 0;

        if (operation.trim().equals("/"))
            num = 1f * a / b;
        if (operation.trim().equals("*"))
            num = a * b;
        if (operation.trim().equals("+"))
            num = a + b;
        if (operation.trim().equals("-"))
            num = a - b;

        return num;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
