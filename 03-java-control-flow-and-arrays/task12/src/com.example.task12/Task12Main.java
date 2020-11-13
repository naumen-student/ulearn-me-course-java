package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int mini = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < mini) {
                    mini = arr[j];
                    index = j;
                }

            arr[index] = arr[i];
                arr[i] = mini;
            }
        }

    }

