package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int index = numMin(arr);
        int tmp = arr[0];
        arr[0] = arr[index];
        arr[index] = tmp;
    }

    static int numMin(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[index])
                index = i;
        }
        return index;
    }
}