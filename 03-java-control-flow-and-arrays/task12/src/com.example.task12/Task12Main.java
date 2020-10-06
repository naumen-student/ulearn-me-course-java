package com.example.task12;

import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        for (int i = 0; i < arr.length; i++) {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= minValue) {
                    minIndex = j;
                    minValue = arr[j];
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }
    }

}