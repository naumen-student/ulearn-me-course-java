package com.example.task11;

import java.lang.reflect.Array;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0){
            return;
        }

        int minElement = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minElement){
                minElement = arr[i];
                minIndex = i;
            }
        }
        int temp;
        temp = arr[minIndex];
        arr[minIndex] = arr[0];
        arr[0] = temp;
    }

}