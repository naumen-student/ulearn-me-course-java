package com.example.task11;

import java.util.Arrays;
import java.util.NoSuchElementException;

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

    static void swap(int[] arr) {
        int min;
        try {
            min = Arrays.stream(arr).min().getAsInt();
        } catch (Exception e) {
            return;
        }
        int indexOfMin = lastIndexMin(arr, min);
        int swap = arr[0];
        arr[indexOfMin] = swap;
        arr[0] = min;
    }

    static int lastIndexMin(int[] arr, int min) throws NoSuchElementException {
        for (int i = arr.length - 1; i >= 0; i--) if (arr[i] == min) return i;
        throw new NoSuchElementException("The is no element: " + min);
    }
}