package com.example.task13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i < 1000) {
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        for (int j = 0; j < list.size(); j++)
            res[j] = list.get(j);
        return res;
    }
}