package com.example.task10;

public class Task10Main {
    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int item = 0;
        for (int i = 0; i < arr.length; i++){
            if (min >= arr[i]){
                min = arr[i];
                item = i;
            }
        }
        return item;
    }
}