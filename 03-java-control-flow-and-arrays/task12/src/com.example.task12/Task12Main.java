package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] a = {4, 1, 7, 0, 1};
        selectionSort(a);
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    index = j;
                }
            arr[index] = arr[i];
            arr[i] = minValue;
        }
    }

}
