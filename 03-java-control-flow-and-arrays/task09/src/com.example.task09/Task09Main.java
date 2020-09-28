package com.example.task09;

import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = -2;
        arr[1] = 9;
        arr[2] = 73;
        arr[3] = -73;
        arr[4] = 3;
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int value : arr)
            if (value < min)
                min = value;
        return min;
    }

}