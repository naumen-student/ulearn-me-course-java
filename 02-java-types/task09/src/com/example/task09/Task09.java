package com.example.task09;

public class Task09 {

    public static double solution() {
        float a = 1.0f;
        float b = 3.0f;
        double x = ((double) a / b - 1.0 / 3.0) * 1.0e9;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(solution());

    }

}
