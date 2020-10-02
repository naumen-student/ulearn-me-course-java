package com.example.task12;

import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (Arrays.equals(arr, null) || Arrays.equals(arr, new int[]{})) return;
        else
        {
            for (int i = 0; i < arr.length; i++)
            {
                int min = 0, index = 0;
                for (int j = i; j < arr.length; j++)
                {
                    if (min == 0 || arr[j] < min)
                    {
                        min = arr[j];
                        index = j;
                    }
                }
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
    }

}