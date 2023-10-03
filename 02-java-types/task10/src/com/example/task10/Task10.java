package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (Double.isNaN(a) && Double.isNaN(b)) return true;
        if (Double.isInfinite(a) && Double.isInfinite(b))
            return Math.signum(a * b) == 1;
        precision = precision == 0 ? 1 : precision;
        return Math.abs(a - b) <= Math.pow(10, -precision);
    }

    public static void main(String[] args) {
        System.out.println(compare((0.4f + 0.3f), 0.7f, 2));
    }
}
