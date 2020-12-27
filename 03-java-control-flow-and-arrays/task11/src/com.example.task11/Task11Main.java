package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
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
