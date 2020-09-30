package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null)
            return null;

        int size = arr.length;

        for (int k : arr) {
            if (k > 1000)
                size--;
        }

        int[] arr2 = new int[size];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                arr2[j] = arr[i];
                j++;
            }
        }

        return arr2;

        // можно еще через лист решить, но раз тема массивы. Могу переделать
    }

}