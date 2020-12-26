package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        if (operation.equals("+"))
            return a+b;
        if (operation.equals("-"))
            return a-b;
        if (operation.equals("/"))
            return (float)a/b;
        return a*b;
    }

    public static void main(String[] args) {
    }

}
