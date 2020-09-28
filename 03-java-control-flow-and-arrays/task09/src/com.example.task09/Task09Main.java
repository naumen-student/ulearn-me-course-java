package com.example.task09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
//        int min = Integer.MAX_VALUE;
//        for (int element : arr)
//        {
//            if (element < min)
//                min = element; }
//        return min;
    }
}