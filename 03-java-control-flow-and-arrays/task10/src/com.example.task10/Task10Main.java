package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {

        int i = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] <= min) {
                min = arr[j];
                i = j;
            }
        }
        return i;
    }

}