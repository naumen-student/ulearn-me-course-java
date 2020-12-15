package com.example.task10;

import java.awt.geom.Arc2D;
import java.util.Map;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        return Float.isInfinite(a) && Float.isInfinite(b) && a * b > 0 ? true :
                Float.isNaN(a) && Float.isNaN(b) ? true :
                Math.abs(a - b) < Math.pow(0.1, precision) ? true : false;
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
