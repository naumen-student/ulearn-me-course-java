package com.example.task10;

import java.util.stream.IntStream;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        return IntStream.range(0,arr.length)
                .reduce((i,j) -> arr[i] >= arr[j] ? j : i)
                .getAsInt();
    }
}
