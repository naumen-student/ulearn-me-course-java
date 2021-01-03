package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }

}