package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

    }

    static void selectionSort(int[] arr) {
        if(arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                int numMin = i;
                for (int j = i; j < arr.length; j++) {
                    if (min >= arr[j]) {
                        min = arr[j];
                        numMin = j;
                    }
                }
                int holder = arr[i];
                arr[i] = arr[numMin];
                arr[numMin] = holder;
            }
        }
    }

}