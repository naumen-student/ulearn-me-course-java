package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        if (Float.isInfinite(a) && Float.isInfinite(b))
            return a * b > 0;

        return (Float.isNaN(a) && Float.isNaN(b)
                || Math.abs(a - b) < Math.pow(10, -precision));

    }

    public static void main(String[] args) {
    }

}
