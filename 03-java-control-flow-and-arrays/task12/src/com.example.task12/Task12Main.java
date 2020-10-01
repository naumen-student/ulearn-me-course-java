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

        for (int i = 0; i < arr.length; i++) {
            swap(arr, i);
        }
    }

    static void swap(int[] arr, int swapIndex) {
        int savedElement = arr[swapIndex];
        int minIndex = numMin(arr, swapIndex);
        arr[swapIndex] = arr[minIndex];
        arr[minIndex] = savedElement;
    }

    static int numMin(int[] arr, int startIndex) {
        int minIndex = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

}