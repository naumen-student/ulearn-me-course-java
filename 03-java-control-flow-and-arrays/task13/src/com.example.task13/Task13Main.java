package com.example.task13;


import java.util.ArrayList;
import java.util.List;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        int[] resArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(resArr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        List<Integer> list = new ArrayList<>();
         for (int a: arr) {
             if (a <= 1000) {
                 list.add(a);
             }
         }
        int[] resArr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            resArr[i] = list.get(i);
        }
        return resArr;
    }

}