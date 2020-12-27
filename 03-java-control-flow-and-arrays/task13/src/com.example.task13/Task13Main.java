package com.example.task13;

import java.util.ArrayList;
import java.util.List;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        List<Integer> listFromArr = new ArrayList<>();
        for (int arg : arr){
            if (arg <= 1000){
                listFromArr.add(arg);
            }
        }

        int[] newArr = new int[listFromArr.size()];
        for (int i = 0; i < newArr.length; i++)
            newArr[i] = listFromArr.get(i);
        return newArr;
    }

}