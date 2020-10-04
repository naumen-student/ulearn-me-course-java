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
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < num) {
                    num = arr[j];
                    count = j;
                }
            }
            arr[count] = arr[i];
            arr[i] = num;
        }
    }

}