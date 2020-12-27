package com.example.task13;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

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
        if (arr != null) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int i : arr)
                if (i <= 1000)
                    res.add(i);
            Integer[] temp = new Integer[res.size()];
            return res.stream().mapToInt(Integer::intValue).toArray();
        }
        return null;
    }

}