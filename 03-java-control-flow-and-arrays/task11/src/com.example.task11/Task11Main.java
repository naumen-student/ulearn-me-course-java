package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        int i = arr[0];
        arr[0] = arr[indexMin];
        arr[indexMin] = i;

    }

}