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
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1001)
                indexes.add(i);
        }

        int[] newArr = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            newArr[i] = arr[indexes.get(i)];
        }

        return newArr;
    }

}