package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isNaN(a) && Float.isNaN(b)
                || a == Float.POSITIVE_INFINITY && b == Float.POSITIVE_INFINITY
                || a == Float.NEGATIVE_INFINITY && b == Float.NEGATIVE_INFINITY) {
            return true;
        }
        
        return Math.abs(a - b) <= (precision == 0 ? 0 : Math.pow(0.1f, precision));
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
