package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float aF = (float)a;
        float bF = (float)b;

        if (operation.equals("+"))
            return aF + bF;
        if (operation.equals("-"))
            return aF - bF;
        if (operation.equals("/"))
            return aF / bF;
        return aF * bF;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }
}
