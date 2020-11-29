package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
    }

    static void swap(int[] arr) {
        if(arr==null || arr.length==0)
            return;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min) {
                min = arr[i];
                minIndex = i;
            }
        }
        if(minIndex!=0){
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
    }

}