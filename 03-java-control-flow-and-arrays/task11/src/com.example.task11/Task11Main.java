package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] a = null;
        swap(a);
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int min = 2147483647;
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                ind = i;
            }
        }
        int temp = arr[ind];
        arr[ind] = arr[0];
        arr[0] = temp;

    }

}