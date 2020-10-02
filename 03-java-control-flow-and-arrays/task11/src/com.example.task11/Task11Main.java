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
        if (Arrays.equals(arr, null) || Arrays.equals(arr,new int[]{}))
            return;
        else {
            int min = 0, ind = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min || min == 0) {
                    min = arr[i];
                    ind = i;
                }
            }
            arr[ind] = arr[0];
            arr[0] = min;
        }
    }

}