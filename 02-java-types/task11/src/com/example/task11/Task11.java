package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        sum *= Math.pow(1.0 + percent, 12);
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.0100077f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("yyyyyyyyyyyyyyyyyy: " + sum);

    }

}
