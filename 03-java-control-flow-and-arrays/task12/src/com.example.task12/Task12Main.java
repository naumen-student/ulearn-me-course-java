package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                int temp = arr[i];
                if(arr[k] < arr[i]){
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

    }
}
