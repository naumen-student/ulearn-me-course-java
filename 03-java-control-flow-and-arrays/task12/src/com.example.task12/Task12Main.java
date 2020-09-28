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
        for(int i = 0; i < arr.length - 1; i++)
        {
            int index = findMinIndex(arr, i + 1, arr.length);
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }

    static int findMinIndex(int[] arr, int leftBound, int rightBound) {
        int index = leftBound - 1;
        for (int i = leftBound; i < rightBound; i++) {
            if (arr[i] < arr[index])
                index = i;
        }
        return index;
    }
}