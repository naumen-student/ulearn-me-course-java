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
        int min;
        int numMin;
        for (int i = 0; i <= arr.length - 1; i++) {
            min = Integer.MAX_VALUE;
            numMin = 0;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    numMin = j;
                }
            }
            arr[numMin] = arr[i];
            arr[i] = min;
        }
    }

}