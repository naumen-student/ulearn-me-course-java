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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0)
            return;
        int cash;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                cash = arr[0];
                arr[0] = arr[i];
                arr[i] = cash;
            }
        }
    }

}