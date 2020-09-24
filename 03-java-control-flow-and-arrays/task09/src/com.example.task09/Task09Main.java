package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        int res = Integer.MAX_VALUE;
        for (int num : arr)
            res = Math.min(res, num);
        return res;
    }
}