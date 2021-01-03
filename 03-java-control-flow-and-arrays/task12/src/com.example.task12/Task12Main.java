package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) min = arr[j];
                if (arr[j] == min) x = j;
            }
            int cur = arr[i];
            arr[i] = min;
            arr[x] = cur;
        }
    }

}