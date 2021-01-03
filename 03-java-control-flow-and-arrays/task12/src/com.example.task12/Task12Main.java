package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = Integer.MAX_VALUE;
            for (int k = i; k < arr.length; k++) {
                if (arr[k] < num) {
                    num = arr[k];
                    count = k;
                }
            }
        arr[count] = arr[i];
        arr[i] = num;
        }
    }

}