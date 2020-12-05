package com.example.task13;

import java.util.ArrayList;
import java.util.List;

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
        if (!(arr == null || arr.length == 0)) {
            List<Integer> list = new ArrayList<Integer>();

            for (int i : arr) {
                if (i <= 1000) {
                    list.add(i);
                }
            }
            int[] arrr = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                arrr[i] = list.get(i);
            }
            return arrr;
        } else {
            return arr;
        }
    }

}