package com.example.task10;

public class Task10 {
    public static boolean compare(float a, float b, int precision) {
        double threshold = Math.pow(0.1, precision);
        if (Float.isInfinite(a) && Float.isInfinite(b))
            return a==b;
        if (Float.isNaN(a) && Float.isNaN(b))
            return true;
        return Math.abs(a- b) < threshold;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }
}
