package com.example.task11;

public class Task11Main {

        static int GetIndexOfMinElement(int[] arr){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            return index;
        }

        static void swap(int[] arr){
            if (arr == null || arr.length == 0)
                return;
            int index = GetIndexOfMinElement(arr);
            int temp = arr[0];
            arr[0] = arr[index];
            arr[index] = temp;
    }
}
