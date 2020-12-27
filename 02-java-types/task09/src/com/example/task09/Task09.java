package com.example.task09;

public class Task09 {

    public static double solution() {
        float a = 1.0f;
        float b = 3.0f;
        return (a / b - 1.0f / 3.0f) * 1.0e9;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
