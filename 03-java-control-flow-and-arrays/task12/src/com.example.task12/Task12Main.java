package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8, 7, 9};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length - 1; i++) {
            int index_min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index_min])
                    index_min = j;
            int temp = arr[index_min];
            arr[index_min] = arr[i];
            arr[i] = temp;
        }
    }
}