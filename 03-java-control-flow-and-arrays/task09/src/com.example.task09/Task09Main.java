package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int mini = 2147483647;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < mini)
                mini = arr[i];
        return mini;
    }

}