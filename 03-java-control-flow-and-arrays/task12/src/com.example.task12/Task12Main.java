package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr!=null) {
            int save;
            for (int i = 0; i < arr.length; i++)
                for (int j = i; j < arr.length; j++)
                    if (arr[j] < arr[i]) {
                        save = arr[i];
                        arr[i] = arr[j];
                        arr[j] = save;
                    }
        }
    }

}