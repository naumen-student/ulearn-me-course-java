package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= arr[index])
                index = i;
            return index;
    }

}