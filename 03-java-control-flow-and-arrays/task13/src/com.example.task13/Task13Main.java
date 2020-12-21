package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr == null || arr.length == 0)
            return arr;
        int[] newArray = new int[arr.length];
        int newArrayLength = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 1000){
                newArray[newArrayLength] = arr[i];
                newArrayLength++;
            }
        }
        return Arrays.copyOfRange(newArray, 0, newArrayLength);
    }

}