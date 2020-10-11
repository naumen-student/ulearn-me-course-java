package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0)
            return;

        int minEl = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minEl) {
                minEl = arr[i];
                arr[i] = arr[0];
                arr[0] = minEl;
            }
        }
    }

}