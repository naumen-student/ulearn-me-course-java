package com.example.task13;

import java.lang.reflect.Array;
import java.util.*;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {1001, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        ArrayList <Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1000) {
                newArr.add(arr[i]);
            }
        }
        int[] res = new int[newArr.size()];
        for (int i=0; i < res.length; i++)
            res[i] = newArr.get(i);
        return res;
    }

    public static int[] convertIntegers(ArrayList<Integer> integers)
    {
        int[] res = new int[integers.size()];
        for (int i=0; i < res.length; i++)
            res[i] = integers.get(i);
        return res;
    }

}