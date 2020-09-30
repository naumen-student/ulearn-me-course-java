package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        int c = Integer.MAX_VALUE;
        int pozition = 0;
        if (arr == null || arr.length == 0)
            return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < c) {
                c = arr[i];
                pozition = i;
            }
            if (i + 1 == arr.length) {
                int b = arr[0];
                arr[0] = arr[pozition];
                arr[pozition] = b;
            }
        }
    }

}