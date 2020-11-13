package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int number = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                number = i;
            }
        }
        int a = arr[0];
        arr[0] = arr[number];
        arr[number] = a;
    }

}