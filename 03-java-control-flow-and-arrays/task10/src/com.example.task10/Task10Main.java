package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        if (arr == null)
            return -1;
        int indexMin = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
}