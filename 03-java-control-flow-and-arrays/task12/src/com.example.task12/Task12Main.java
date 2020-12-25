package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if(arr == null)
            return;
        int mN = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(Math.min(arr[j], mN) == arr[j]){
                    mN = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = mN;
            index = i;
            mN = Integer.MAX_VALUE;
        }
    }

}