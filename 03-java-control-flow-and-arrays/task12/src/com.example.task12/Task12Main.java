package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if(arr==null || arr.length==0)
            return;
        for(int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = currentIndex; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            if (minIndex != currentIndex) {
                arr[minIndex] = arr[currentIndex];
                arr[currentIndex] = min;
            }
        }
    }

}