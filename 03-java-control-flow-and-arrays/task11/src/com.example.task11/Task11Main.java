package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        int min = Integer.MAX_VALUE;
        int numOfMin = -1;
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                numOfMin = i;
            }
        }
        arr[numOfMin] = arr[0];
        arr[0] = min;
    }

}