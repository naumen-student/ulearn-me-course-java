package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        if (arr == null)
            return;
        for (int i = 0; i < arr.length - 1; i++)
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int val = arr[i];
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }
    }

}