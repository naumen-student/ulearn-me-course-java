package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int i = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] <= min) {
                min = arr[j];
                i = j;
            }
        }
        int val = arr[0];
        arr[0] = arr[i];
        arr[i] = val;
    }

}