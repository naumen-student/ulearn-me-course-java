package com.example.task11;

import java.lang.reflect.Array;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 100, 100000, 1001010010, -1000};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int min = Integer.MAX_VALUE;
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
                ind = i;
            }
        }
        arr[ind] = arr[0];
        arr[0] = min;
    }

}