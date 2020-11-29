package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

    }

    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                result = i;
            }
        }
        return result;
    }

}