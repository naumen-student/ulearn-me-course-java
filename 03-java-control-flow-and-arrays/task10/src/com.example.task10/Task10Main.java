package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int valueMin = Integer.MAX_VALUE;
        int indexMin = 0;
        for(int index = 0; index < arr.length; index++){
            if(arr[index] <= valueMin) {
                valueMin = arr[index];
                indexMin = index;
            }
        }
        return indexMin;
    }

}