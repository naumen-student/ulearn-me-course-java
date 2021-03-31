package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        int min = arr[0];
        int numMin = 0;
        for(int i = 1; i < arr.length; i++){
            if(min >= arr[i]) {
                min = arr[i];
                numMin = i;
            }
        }
        int holder = arr[0];
        arr[0] = arr[numMin];
        arr[numMin] = holder;
    }

}