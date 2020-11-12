package com.example.task11;

import java.util.stream.IntStream;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int first = arr[0];
        int index = IntStream.range(0,arr.length)
                .reduce((i,j) -> arr[i] >= arr[j] ? j : i)
                .getAsInt();
        arr[0] = arr[index];
        arr[index] = first;
    }
}
