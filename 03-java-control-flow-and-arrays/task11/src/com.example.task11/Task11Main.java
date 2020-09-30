package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        int minNum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= arr[minNum]) {
                minNum = i;
            }
        int n = arr[minNum];
        arr[minNum] = arr[0];
        arr[0] = n;
    }

}