package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        return (float) (sum * Math.pow(1.0 + percent, 12));
    }

    public static void main(String[] args) {

        float sum = 500;
        float percent = 0.0100077f;

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
