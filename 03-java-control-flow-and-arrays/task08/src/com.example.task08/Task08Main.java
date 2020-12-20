package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {

        if (arr.length == 0)
            return 0;

        long mult = 1;

        for (int a : arr) {
            mult *= a;
        }
        return mult;
    }
}