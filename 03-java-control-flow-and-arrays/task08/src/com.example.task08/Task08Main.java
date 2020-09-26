package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

    }

    static long mult(int[] arr) {
        long result = 1;
        if(arr.length == 0)
            return 0;
        for (int j : arr) {
            result *= j;
        }
        return result;
    }

}