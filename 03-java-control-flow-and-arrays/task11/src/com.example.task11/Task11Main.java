package com.example.task11;

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
        if (arr == null || arr.length == 0)
            return;

        int firstElement = arr[0];
        int minElementIndex = numMin(arr);
        arr[0] = arr[minElementIndex];
        arr[minElementIndex] = firstElement;
    }

    static int numMin(int[] arr) {
        int minIndex = 0;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minNumber) {
                minNumber = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


}