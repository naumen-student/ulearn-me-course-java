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
        if (arr == null || arr.length < 1) return;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int minNum = arr[i];
            for (int t = i + 1; t < arr.length; t++) {
                if (arr[t] <= minNum) {
                    minNum = arr[t];
                    minIndex = t;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = minNum;
        }
    }
}