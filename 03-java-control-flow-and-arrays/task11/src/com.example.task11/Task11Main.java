package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = null;
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        int min = Integer.MAX_VALUE;
        int position = 0;

        if (arr == null)
            return;

        if (arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
                position = i;
            }
        }

        int first = arr[0];
        arr[0] = arr[position];
        arr[position] = first;
    }
}