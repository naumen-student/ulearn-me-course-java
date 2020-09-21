package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        return (float) (Math.pow(1.0 + percent, 12) * sum);
    }

    public static void main(String[] args) {
    }

}
