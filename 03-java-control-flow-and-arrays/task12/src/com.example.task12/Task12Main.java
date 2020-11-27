package com.example.task12;

import java.util.Arrays;

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

        if (arr != null && arr.length != 0) {

            for (int j = 0; j < arr.length; j++) {

                int currentIterationIndex = j;
                int lowestNum = Integer.MAX_VALUE;
                int lowestNumIndex = 0;
                int temp = arr[currentIterationIndex];

                for (int i = currentIterationIndex; i < arr.length; i++) {
                    if (arr[i] <= lowestNum) {
                        lowestNum = arr[i];
                        lowestNumIndex = i;
                    }
                }

                arr[currentIterationIndex] = arr[lowestNumIndex];
                arr[lowestNumIndex] = temp;
            }
        }
    }

}