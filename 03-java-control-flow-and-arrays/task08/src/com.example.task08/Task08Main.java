package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        long p = 1;
        for (int i = 0; i < arr.length; i++) {
            p = p * arr[i];
        }
        return p;
    }

}