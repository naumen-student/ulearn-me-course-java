package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int minNumber = Integer.MAX_VALUE;
        int indexMinNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minNumber) {
                minNumber = arr[i];
                indexMinNumber = i;
            }
        }

        arr[indexMinNumber] = arr[0];
        arr[0] = minNumber;
    }
}