package com.example.task13;

import com.sun.tools.javac.util.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null) return null;

        int wrongNumbersCount = 0;
        int currentIndex = 0;

        for (int number : arr) {
            if (number > 1000) wrongNumbersCount++;
        }

        int[] resArr = new int[arr.length - wrongNumbersCount];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1000) {
                resArr[currentIndex] = arr[i];
                currentIndex++;
            }
        }
        return resArr;
    }

}