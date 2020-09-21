package com.example.task10;

public class Task10 {

    private static double round(float number, int precision){
        long divider = (long) Math.pow(10, precision);
        return Math.floor(number * divider) / divider;
    }

    public static boolean compare(float a, float b, int precision) {
        if(Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }

        if (Float.isInfinite(a) && Float.isInfinite(b)) {
             return a == b;
        }

        if (Float.isFinite(a) && Float.isFinite(b)) {
            return Math.abs(round(a, precision) - round(b, precision)) < 1e-100;
        }

        return false;
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
