package com.example.task07;

import java.util.Arrays;

public class Task07Main {
    public static void main(String[] args) {
    }

    static int sum(int[] arr) {
        return Arrays.stream(arr).sum();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++)
//            sum += arr[i];
//        return sum;
    }

}