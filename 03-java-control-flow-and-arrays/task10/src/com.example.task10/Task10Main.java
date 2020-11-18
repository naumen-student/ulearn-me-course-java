package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

    }

    static int numMin(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[min])
                min = i;
        return min;
    }

}