package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int numOfMin = -1;
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                numOfMin = i;
                min = arr[i];
            }
        }
        return numOfMin;
    }

}