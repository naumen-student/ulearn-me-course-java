package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        int mN = Integer.MAX_VALUE;
        int index = 0;
        if(arr == null || arr.length == 0)
            return;
        for(int i = 0; i < arr.length; i++){
            if(Math.min(mN, arr[i]) == arr[i]){
                index = i;
                mN = arr[i];
            };
        }
        arr[index] = arr[0];
        arr[0] = mN;
    }

}