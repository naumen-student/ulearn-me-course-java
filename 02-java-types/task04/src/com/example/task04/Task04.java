package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        if (operation.equals("+"))
            return a + b;
        if (operation.equals("-"))
            return a - b;
        if (operation.equals("*"))
            return a * b;
        return (float) a / b;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 4, "/");
        System.out.println(result);
    }

}
