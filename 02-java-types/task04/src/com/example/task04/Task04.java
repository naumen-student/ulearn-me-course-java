package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        float afloat = (float)a;
        float bfloat = (float)b;

        if (operation.equals("+"))
            return afloat + bfloat;
        if (operation.equals("-"))
            return afloat - bfloat;
        if (operation.equals("/"))
            return afloat / bfloat;
        return afloat * bfloat;

    }

    public static void main(String[] args) {

        float result = calculate(-534, 6, "*");
        System.out.println(result);

    }

}
