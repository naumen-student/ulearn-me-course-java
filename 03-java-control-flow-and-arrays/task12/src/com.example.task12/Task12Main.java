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
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int currentMinIndex = findMinIndexFromIndex(arr, i);
            swap(arr, i, currentMinIndex);
        }
    }

    static int findMinIndexFromIndex(int[] arr, int index) {
        int minValue = arr[index];
        int minIndex = index;
        for (int i = index; i < arr.length; i++)
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        return minIndex;
    }

    static void swap(int[] arr, int indexSwap1, int indexSwap2) {
        int swapValue = arr[indexSwap1];
        arr[indexSwap1] = arr[indexSwap2];
        arr[indexSwap2] = swapValue;
    }
}