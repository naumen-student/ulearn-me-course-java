package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {

    }

    static long mult(int[] arr) {
        return 1;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return Arrays.stream(arr).mapToLong(e -> e).reduce(1, (a, b) -> a * b);
    }

}
