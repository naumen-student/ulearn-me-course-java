package com.example.task13;

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
        if(arr == null ) return null;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i : arr) {
            if (i < 1000){
                numbers.add(i);
            }
        }
        int[] res = new int[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) {
            res[i] = numbers.get(i);
        }
        return res;
    }

}