package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {

        int lowestNum = Integer.MAX_VALUE;
        int lowestNumIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= lowestNum) {
                lowestNum = arr[i];
                lowestNumIndex = i;
            }
        }
        return lowestNumIndex;
    }

}