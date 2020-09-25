package com.example.task13;

import java.lang.reflect.Array;
import java.util.*;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {1001, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        ArrayList <Integer> newArr = new ArrayList<>();
        for (int j : arr) {
            if (j <= 1000) {
                newArr.add(j);
            }
        }
        int[] res = new int[newArr.size()];
        for (int i=0; i < res.length; i++) {
            res[i] = newArr.get(i);
        }
        arr = res;
        return arr;
    }
}