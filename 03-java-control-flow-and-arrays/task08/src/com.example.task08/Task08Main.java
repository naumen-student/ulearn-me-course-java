package com.example.task08;

public class Task08Main {
    static long mult(int[] arr) {
        if (arr.length == 0 || arr == null) return 0;
        long result = 1;
        for (int number: arr){
            result *= number;
        }
        return result;
    }
}