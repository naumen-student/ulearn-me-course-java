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
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int number = 0;
            int minim = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minim) {
                    minim = arr[j];
                    number = j;
                }
            }
            arr[number] = arr[i];
            arr[i] = minim;
        }
    }

}