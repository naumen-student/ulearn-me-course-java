package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int min = arr[0];
        int temp = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (min >= arr[i]) {
                min = arr[i];
                index = i;
            }

        arr[0] = arr[index];
            arr[index] = temp;


    }
}