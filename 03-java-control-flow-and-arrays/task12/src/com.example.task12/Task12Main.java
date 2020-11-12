package com.example.task12;

import java.util.stream.IntStream;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int index = IntStream.range(i, arr.length)
                    .reduce((m, n) -> arr[m] >= arr[n] ? n : m)
                    .getAsInt();
            arr[i] = arr[index];
            arr[index] = current;
        }
    }

}