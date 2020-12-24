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

        for (int start = 0; start < arr.length; start++) {
            int minValue = arr[start];
            int minIndex = start;

            for (int current = start + 1; current < arr.length; current++) {
                if (arr[current] < minValue){
                    minValue = arr[current];
                    minIndex = current;
                }
            }

            int swap = arr[start];
            arr[start] = minValue;
            arr[minIndex] = swap;
        }
    }

}