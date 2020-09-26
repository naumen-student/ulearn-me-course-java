package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
    }

    static void swap(int[] arr) {
        int valueMin = Integer.MAX_VALUE;
        int indexMin = 0;
        if(arr != null && arr.length > 0) {
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] < valueMin) {
                    valueMin = arr[index];
                    indexMin = index;
                }
            }
            arr[indexMin] = arr[0];
            arr[0] = valueMin;
        }
    }
}