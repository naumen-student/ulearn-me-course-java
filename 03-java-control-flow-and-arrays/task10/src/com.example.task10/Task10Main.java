package com.example.task10;

public class Task10Main {

    static int numMin(int[] arr) {
        int lastIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= min)
            {
                lastIndex = i;
                min = arr[i];
            }
        }
        return lastIndex;
    }

}