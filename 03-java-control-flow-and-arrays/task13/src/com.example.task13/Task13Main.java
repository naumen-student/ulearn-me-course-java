package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

    }

    static int[] removeMoreThen1000(int[] arr) {
        int counter = 0;
        for(int j = 0 ;j< arr.length;j++) if(arr[j] > 1000) counter++;
        int[] copy = new int[arr.length - counter];
        int i = 0, j = 0;
        while(i!= arr.length){
            if(arr[i] <= 1000) {
                copy[j] = arr[i];
                i++; j++;
            }
            else i++;
        }
        return copy;
    }

}