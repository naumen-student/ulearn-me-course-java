package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 7, 7, 10};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index_min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                index_min = i;
            }
        }
        return index_min;
    }
}