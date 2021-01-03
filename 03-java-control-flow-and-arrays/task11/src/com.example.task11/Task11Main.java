package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        int min = Integer.MAX_VALUE;
        int numberMin = -1;
        if (arr == null)
            return;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= min){
                min = arr[i];
                numberMin = i;
            }
        }
        if (numberMin > 0) {
            int zeroElem = arr[0];
            arr[0] = arr[numberMin];
            arr[numberMin] = zeroElem;
        }
    }

}