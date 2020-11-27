package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        if (arr != null && arr.length != 0) {

            int lowestNum = Integer.MAX_VALUE;
            int lowestNumIndex = 0;
            int temp = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= lowestNum) {
                    lowestNum = arr[i];
                    lowestNumIndex = i;
                }
            }

            arr[0] = arr[lowestNumIndex];
            arr[lowestNumIndex] = temp;
        }
    }

}