package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        return IsEqualsInfinity(a, b)
                || IsBothNaN(a, b)
                || Math.abs(a - b) < Math.pow(0.1, precision);
    }

    private static boolean IsEqualsInfinity(float a, float b) {
        return Float.isInfinite(a) && Float.isInfinite(b) && a == b;
    }

    private static boolean IsBothNaN(float a, float b) {
        return Float.isNaN(a) && Float.isNaN(b);
    }
}
