package com.example.task13;

import java.util.ArrayList;
import java.util.List;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        List<String> list = new ArrayList<>();
        for (int num : arr)
            if (num <= 1000) list.add(String.valueOf(num));
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = Integer.parseInt(list.get(i));
        return res;
    }
}