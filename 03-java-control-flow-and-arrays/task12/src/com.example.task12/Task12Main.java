package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 1) return;
        for (int j = 0; j < arr.length - 1; j++) {
            int minValue = arr[j];
            int minIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] <= minValue) {
                    minValue = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex] = arr[j];
            arr[j] = minValue;
        }
    }

}