package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        return (Float.isNaN(a) && Float.isNaN(b)) ||
                (Float.isInfinite(a) && Float.isInfinite(b) && ((a < 0 && b < 0) || (a > 0 && b > 0))) ||
                Math.abs(a - b) < Math.pow(10.0, -1.0 * precision);
    }
}