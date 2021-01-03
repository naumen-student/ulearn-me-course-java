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

        int minimal_index = 0;
        for (int i = 0; i < arr.length; i++) {
            int minimal_value = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < minimal_value) {
                    minimal_value = arr[j];
                    minimal_index = j;
                }
            arr[minimal_index] = arr[i];
            arr[i] = minimal_value;
        }
    }

}