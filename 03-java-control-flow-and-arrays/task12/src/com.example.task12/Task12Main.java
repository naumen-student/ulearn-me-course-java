package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        int min;
        int pos = -1;
        if(arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            if (arr[i] >= min){
                arr[pos] = arr[i];
                arr[i] = min;
            }
        }
    }

}