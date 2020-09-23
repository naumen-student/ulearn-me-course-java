package com.example.task12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task12Main {
    public static void main(String[] args) {
    }

    private  static int getIndexOfMin(int[]  arr,int startIndex)
    {
        IntStream stream = Arrays.stream(arr).skip(startIndex);
        int min = stream.min().getAsInt();

        for (int i = arr.length-1; i >=startIndex ; i--)
            if (arr[i]==min)
                return  i;

        return  -1;
    }

    static void swap(int[] arr,int startIndex) {
        int minIndex = getIndexOfMin(arr,startIndex);
        int temp = arr[startIndex];
        arr[startIndex]=arr[minIndex];
        arr[minIndex]=temp;
    }

    static void selectionSort(int[] arr) {
        if (!(arr==null||arr.length==0) )
            for (int i = 0; i <arr.length ; i++)
                swap(arr, i);
    }

}