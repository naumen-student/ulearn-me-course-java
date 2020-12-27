package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

    }

    static int numMin(int[] arr) {
        return 0;
        int imin = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[imin])
                imin = i;
        return imin;
    }
}