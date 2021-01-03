package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null)
            return;
        boolean flag = false;
        while(!flag){
            flag = true;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    int min = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = min;
                    flag = false;
                }
            }
        }
    }

}