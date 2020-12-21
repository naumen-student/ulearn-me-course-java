package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int pos = 0;
            int res = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < res) res = arr[j];
                if (arr[j] == res) pos = j;
            }
            int temp = arr[i];
            arr[i] = res;
            arr[pos] = temp;
        }
    }

}