package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (Double.isNaN(a) ^ Double.isNaN(b))
            return false;
        return (int)((a - b) * Math.pow(10, precision)) == 0;
    }

    public static void main(String[] args) {
    }

}
