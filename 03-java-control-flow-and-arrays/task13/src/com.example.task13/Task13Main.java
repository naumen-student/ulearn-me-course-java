package com.example.task13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr == null) return null;
        int newArrSize = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] <= 1000)
                newArrSize++;
        int[] newArr = new int[newArrSize];
        int index = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] <= 1000){
                newArr[index] = arr[i];
                index++;
            }
        return newArr;
    }

}