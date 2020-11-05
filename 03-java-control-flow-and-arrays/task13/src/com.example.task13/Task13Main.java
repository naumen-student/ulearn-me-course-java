package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        return  Arrays.stream(arr).filter(x -> x < 1000).toArray();
    }

}