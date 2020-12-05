package com.example.task06;


import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int[] arr = {a, b ,c, d };
        int max = arr[0];
        for (int i = 0; i < 4; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

}