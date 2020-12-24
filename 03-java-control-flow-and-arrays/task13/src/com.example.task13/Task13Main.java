package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;
        int size = 0;
        for (int j : arr)
            if (j <= 1000)
                size++;
        int[] newArr = new int[size];
        int number = 0;
        for (int j : arr)
            if (j <= 1000) {
                newArr[number] = j;
                number++;
            }
        return newArr;
    }

}