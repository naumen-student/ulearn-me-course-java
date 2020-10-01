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

        int savedElement = arr[0];
        int minIndex = numMin(arr);
        arr[0] = arr[minIndex];
        arr[minIndex] = savedElement;
    }

    static int numMin(int[] arr) {
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}