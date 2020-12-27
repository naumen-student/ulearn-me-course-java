package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

    }

    static void selectionSort(int[] arr) {
        if (arr == null)
            return;
        for (int i = 0; i < arr.length; i++) {
            int imin = i;
            for (int j = i + 1; j < arr.length; j++)
                imin = arr[imin] < arr[j] ? imin : j;
            int tmp = arr[imin];
            arr[imin] = arr[i];
            arr[i] = tmp;
        }
    }

}
