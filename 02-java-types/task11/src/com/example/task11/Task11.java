package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        return (float) (Math.pow((1.0 + percent), 12) * sum);
    }

    public static void main(String[] args) {

        float sum = 500123131;
        float percent = 0.00000001f;

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
