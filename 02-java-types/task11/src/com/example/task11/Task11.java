package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        // Считаем проценты за год
        return  (float) (sum * Math.pow(percent + 1.0, 12));
    }
}
