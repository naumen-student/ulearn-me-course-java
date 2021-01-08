package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[1];
        arr[0] = 1;

        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        long p = 1;
        if (arr.length == 0)
            return 0;
        else
            for (int j : arr)
                p *= j;
        return p;
    }
}