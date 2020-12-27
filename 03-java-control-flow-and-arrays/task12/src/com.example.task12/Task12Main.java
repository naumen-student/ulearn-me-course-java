package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length > 1) {
            for (int startIndex = 0; startIndex < arr.length - 1; startIndex++)
                arr = getMinIndexAndReplace(arr, startIndex);
        }
    }

    public static int[] getMinIndexAndReplace (int[] arr, int startIndex) {
        int minIndex = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        int t = arr[startIndex];
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        arr[startIndex] = minValue;
        arr[minIndex] = t;
        return arr;
    }

}