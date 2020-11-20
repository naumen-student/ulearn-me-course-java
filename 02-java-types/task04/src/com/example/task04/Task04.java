package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        char op = operation.charAt(0);
        float num1 = (float)a;
        float num2 = (float)b;
        if (op == '+') return num1 + num2;
        if (op == '-') return num1 - num2;
        if (op == '/') return num1 / num2;
        if (op == '*') return num1 * num2;
        return 0;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
