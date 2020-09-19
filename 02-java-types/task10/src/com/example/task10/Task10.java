package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        boolean resultComparison = false;
        if ((Float.isNaN(a) && Float.isNaN(b)) || (Float.isInfinite(a) && Float.isInfinite(b)
                && ((a > 0 && b > 0) || (a < 0 && b < 0))) || (Math.abs(a - b) < Math.pow(10.0, -1.0*precision)))
            resultComparison = true;
        return resultComparison;
    }

    public static void main(String[] args) {
        float a = Float.POSITIVE_INFINITY;
        float b = 0.4f;
        float sum = a + b;
        float c = Float.POSITIVE_INFINITY;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
