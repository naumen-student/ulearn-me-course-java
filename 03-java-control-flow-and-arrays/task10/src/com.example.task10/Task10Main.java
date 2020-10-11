package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int minEl = arr[0];
        int numEl = 0;
        for(int i = 0; i < arr.length; i++)
            if (arr[i] <= minEl) {
                minEl = arr[i];
                numEl = i;
            }
        return numEl;
    }

}