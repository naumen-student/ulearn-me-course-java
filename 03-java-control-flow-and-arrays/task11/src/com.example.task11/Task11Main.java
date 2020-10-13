package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {

        if (arr == null || arr.length == 0) return;
        int min = numMin(arr);
        int x = arr[0];
        arr[0] = arr[min];
        arr[min] = x;
    }

    static int numMin(int[] arr) {

        int min = Integer.MAX_VALUE;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];

            if (arr[i] == min)
                x = i;
        }
        return x;
    }
}