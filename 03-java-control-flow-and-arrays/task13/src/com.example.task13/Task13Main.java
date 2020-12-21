package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1000) {
                continue;
            }
            count++;
        }
        int[] result = new int[count];
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1000) {
                amount += 1;
                continue;
            }
            result[i - amount] = arr[i];
        }
        return result;
    }
}






