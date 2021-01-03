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

        if (arr == null) return null;

        List arrayList = new ArrayList();
        for (int i : arr) {
            if (i <= 1000)
                arrayList.add(i);
        }

        int[] array = new int[arrayList.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) arrayList.get(i);

        return array;
    }
}