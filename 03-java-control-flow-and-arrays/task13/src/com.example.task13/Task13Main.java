package com.example.task13;
import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;

        ArrayList<Integer> resultIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                resultIndexes.add(i);
            }
        }
        int[] resultArr = new int[resultIndexes.size()];
        for (int i = 0; i < resultIndexes.size(); i++) {
            resultArr[i] = arr[resultIndexes.get(i)];
        }
        return resultArr;
    }

}