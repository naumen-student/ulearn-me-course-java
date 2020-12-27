package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = null;
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null)
            return null;

        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                length++;
            }
        }

        int[] newArr = new int[length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }
}