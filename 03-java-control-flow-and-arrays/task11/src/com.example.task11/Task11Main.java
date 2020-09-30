package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int first = arr[0];
        int min = arr[0];
        int swapMinInd = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < min) {
                min = arr[j];
                swapMinInd = j;
            }
        }
        arr[0] = arr[swapMinInd];
        arr[swapMinInd] = first;
    }

}