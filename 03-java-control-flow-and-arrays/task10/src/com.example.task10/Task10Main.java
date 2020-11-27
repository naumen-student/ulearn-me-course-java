package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int mini = 2147483647;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mini) {
                result = i;
                mini = arr[i];
            }
        }
        return result;
    }

}