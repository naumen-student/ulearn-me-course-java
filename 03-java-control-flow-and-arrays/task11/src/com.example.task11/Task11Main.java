package com.example.task11;

import java.lang.reflect.Array;
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
        if (arr != null && arr.length > 1) {
            int minIndex = getIndecesToReplace(arr);
            int t = arr[0];
            arr[0] = arr[minIndex];
            arr[minIndex] = t;
        }
    }

    public static int getIndecesToReplace (int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}