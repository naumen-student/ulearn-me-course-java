package com.example.task12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task12Main {
    public static void main(String[] args) {
    }

    private  static int getIndexOfMin(int[]  arr,int startIndex) {
        List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = Arrays.stream(arr).skip(startIndex).min().getAsInt();
        return list.lastIndexOf(min);
    }

    static void swap(int[] arr,int startIndex) {
        int minIndex = getIndexOfMin(arr,startIndex);
        int temp = arr[startIndex];
        arr[startIndex]=arr[minIndex];
        arr[minIndex]=temp;
    }

    static void selectionSort(int[] arr) {
        if ((arr!=null&&arr.length!=0) )
            for (int i = 0; i <arr.length ; i++)
                swap(arr, i);
    }
}