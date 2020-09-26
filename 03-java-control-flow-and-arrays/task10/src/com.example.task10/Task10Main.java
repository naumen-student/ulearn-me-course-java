package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

    }

    static int numMin(int[] arr) {
        int minIndex = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

}