package com.example.task13;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null) return null;
        List list = new ArrayList();
        for (int num : arr) {
            if (num <= 1000)
                list.add(num);
        }
        int[] new_arr = new int[list.size()];
        for (int i = 0; i < new_arr.length; i++)
            new_arr[i] = (int)list.get(i);
        return new_arr;
    }

}