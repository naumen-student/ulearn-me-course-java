package com.example.task12;

public class Task12Main {

    private static int GetMinIndex(int[] arr, int startIndex) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null)
            return;
        for (int i = 0; i < arr.length; i++) {
            int index = GetMinIndex(arr, i);
            Swap(arr, i, index);
        }
    }

    private static void Swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
