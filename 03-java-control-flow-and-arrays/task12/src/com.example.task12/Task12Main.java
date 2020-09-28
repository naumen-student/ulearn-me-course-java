package com.example.task12;

public class Task12Main {
    static void selectionSort(int[] arr) {
        swap(arr, 0);
    }

    static void swap(int[] arr, int number) {
        if (arr == null || arr.length == 0) return;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[number] < min){
                min = arr[i];
                index = i;
            }
        }
        arr[index] = arr[0];
        arr[0] = min;
        number++;
    }
}