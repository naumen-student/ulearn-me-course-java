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
        if (arr == null)
            return null;
        List list = new ArrayList ();
        for (int number : arr){
            if (number <= 1000)
                list.add(number);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = (int)list.get(i);
        return result;
    }

}