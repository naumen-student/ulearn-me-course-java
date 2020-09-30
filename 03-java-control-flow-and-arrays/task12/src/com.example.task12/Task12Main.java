package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int pozition = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pozition = i;
            }
            if (i + 1 == arr.length) {
                arr[pozition] = arr[count];
                arr[count] = min;
                count++;
                min = Integer.MAX_VALUE;
                i = count;
            }
            if (arr[arr.length - 2] > arr[arr.length - 1]) {
                int k = arr[arr.length - 2];
                int dz = arr[arr.length - 1];
                arr[arr.length - 1] = k;
                arr[arr.length - 2] = dz;
            }
        }
    }

}