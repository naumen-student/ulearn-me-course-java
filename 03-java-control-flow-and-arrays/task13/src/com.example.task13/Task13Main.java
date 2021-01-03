package com.example.task13;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i : arr) {
            if (i < 1000) {
                newArr.add(i);
            }
        }
        int[] result = new int[newArr.size()];
        for (int i = 0; i < newArr.size(); i++) {
            result[i] = newArr.get(i);
        }
        return result;
    }

}