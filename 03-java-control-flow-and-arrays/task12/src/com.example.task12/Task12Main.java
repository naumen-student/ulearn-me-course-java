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
        for (int i = 0; i < arr.length; i++){
            int index = 0;
            int mini = 2147483647;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < mini) {
                    mini = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = mini;
        }
    }

}