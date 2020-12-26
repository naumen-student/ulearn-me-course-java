package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr)
            min = Integer.min (i, min);
        return min;
    }
}