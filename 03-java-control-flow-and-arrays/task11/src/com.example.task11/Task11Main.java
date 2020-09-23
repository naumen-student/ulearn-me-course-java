package com.example.task11;

import java.util.Arrays;
import java.util.stream.IntStream;

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
        IntStream stream = Arrays.stream(arr);
        int min = stream.min().getAsInt();
        for (int i = arr.length-1; i >=0 ; i--)
            if (arr[i]==min)
                return  i;
        return  -1;
    }

    static void swap(int[] arr) {
        if (arr==null||arr.length==0 )
            return;
        int minIndex = getIndexOfMin(arr);
        int temp = arr[0];
        arr[0]=arr[minIndex];
        arr[minIndex]=temp;
    }

}