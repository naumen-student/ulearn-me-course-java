package com.example.task11;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    private  static  int getIndexOfMin(int[] arr)
    {
        List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = Arrays.stream(arr).min().getAsInt();
        return list.lastIndexOf(min);
    }

    static void swap(int[] arr) {
        if (arr==null||arr.length==0 )
            return;
        int minIndex = getIndexOfMin((arr));

        int temp = arr[0];
        arr[0]=arr[minIndex];
        arr[minIndex]=temp;
    }

}