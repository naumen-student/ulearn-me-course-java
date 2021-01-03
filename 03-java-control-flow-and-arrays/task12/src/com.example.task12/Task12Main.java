package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++)
           getSort(arr, i);
    }

    private static int[] getSort(int[] arr, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length - 1; i++)
            minIndex = arr[i + 1] < arr[i] ? i + 1 : minIndex;
        int min = arr[minIndex];
        arr[minIndex] = arr[startIndex];
        arr[startIndex] = min;
        return arr;
    }

}