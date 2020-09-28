package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int minIndex = 0;
        int i = 0;
        while (i != arr.length) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            i++;
            minIndex = i;
        }
    }

}