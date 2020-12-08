package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return Arrays.stream(arr).mapToLong(e -> e).reduce(1, (a, b) -> a * b);
    }
}
