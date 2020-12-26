package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        if (Float.isInfinite(a) && Float.isInfinite(b))
            return a * b > 0;
        if (Float.isNaN(a) && Float.isNaN(b))
            return true;

        double eps = precision == 0 ? Double.MIN_VALUE : Math.pow(10, -precision);

        return Math.abs(a - b) < eps;
    }

}
