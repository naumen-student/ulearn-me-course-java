package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        int temp;
        int count = 0;
        int num = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                num = arr[i];
                count = i;
            }
        }
        temp = arr[count];
        arr[count] = arr[0];
        arr[0] = temp;
    }

}