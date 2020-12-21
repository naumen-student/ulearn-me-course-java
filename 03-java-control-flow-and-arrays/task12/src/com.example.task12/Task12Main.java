package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if(arr == null)
            return;
        int minNumber = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(Math.min(arr[j], minNumber) == arr[j]){
                    minNumber = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = minNumber;
            index = i;
            minNumber = Integer.MAX_VALUE;
        }
    }

}