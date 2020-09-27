package com.example.task09;

public class Task09Main {
    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int number: arr
             ) {
            if (number < min) min = number;
        }
        return min;
    }
}