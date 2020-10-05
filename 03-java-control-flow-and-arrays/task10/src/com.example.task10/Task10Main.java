package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int minI = 0;
        int min = 2147483647;
        for(int i = 0;i<arr.length;i++)
            if (arr[i]<=min) {
                min = arr[i];
                minI = i;
            }
        return minI;
    }

}