package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        for (int i = 1; i <= 12; i++) {
            sum += sum * percent;
        }
        return sum;
    }
}