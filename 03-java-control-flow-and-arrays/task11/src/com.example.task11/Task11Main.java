package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
    }

    static void swap(int[] arr) {
        if(arr == null || arr.length == 0) return;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++)
            minIndex = arr[i] < arr[minIndex] ? i : minIndex;
        int min = arr[minIndex];
        arr[minIndex] = arr[0];
        arr[0] = min;
    }
}