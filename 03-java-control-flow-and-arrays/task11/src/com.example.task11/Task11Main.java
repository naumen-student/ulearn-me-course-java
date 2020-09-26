package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
    }

    static void swap(int[] arr) {
     int minNumber = Integer.MAX_VALUE;
     int index = 0;
     if(arr == null || arr.length == 0)
         return;
     for(int i = 0; i < arr.length; i++){
         if(Math.min(minNumber, arr[i]) == arr[i]){
             index = i;
             minNumber = arr[i];
         };
     }
     arr[index] = arr[0];
     arr[0] = minNumber;
    }

}