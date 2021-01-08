package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {1000, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        int x = 0;
        for (int k : arr) {
            if (k <= 1000)
                x++;

        }
        int b = 0;
        int[] newarr = new int[x];
        for (int i : arr) {
            if (i <= 1000) {
                newarr[b] = i;
                b++;
            }
        }
        return newarr;
    }

}