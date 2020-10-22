package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float c = (float) a;
        float d = (float) b;
        return operation.equalsIgnoreCase("*") ? c * d :
                operation.equalsIgnoreCase("+") ? c + d :
                operation.equalsIgnoreCase("/") ? c / d :  c - d;
    }

    public static void main(String[] args) {
    }

}
