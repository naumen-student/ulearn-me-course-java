package com.example.task10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) minIndex = i;
        }
        return minIndex;
    }
}