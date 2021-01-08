package com.example.task13;


import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null)
            return null;
        return Arrays.stream(arr).filter(element -> element <= 1000).toArray();
    }

}