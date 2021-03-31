package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

    }

    static long mult(int[] arr) {
        if(arr.length == 0) return 0;
        long result = 1L;
        for(int i = 0; i < arr.length; i++){
            result *= arr[i];
        }
        return result;
    }

}