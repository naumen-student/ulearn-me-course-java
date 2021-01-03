package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0)
            return arr;
        int c = 0;
        for (int i : arr) {
            if (i <= 1000)
                c += 1;
        }
        int[] newArr = new int[c];
        int n = 0;
        for (int i : arr) {
            if (i <= 1000) {
                newArr[n] = i;
                n += 1;
            }
        }
        return newArr;

    }

}