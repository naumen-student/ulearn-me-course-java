package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        if (arr == null || arr.length == 0)
            return;

        for (int j = 0; j < arr.length; j++) {
            int min = Integer.MAX_VALUE;
            int index = j;

            for (int i = j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }

            int first = arr[j];
            arr[j] = arr[index];
            arr[index] = first;
        }
    }

}