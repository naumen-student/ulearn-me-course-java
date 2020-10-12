package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {11, 11, 1, 8};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        int min = arr[0];
        int x = arr[0];
        int a = 0;
        if (arr.length == 0 || arr == null) return;
        else
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    a = i;
                }
            }
        arr[0] = min;
        arr[a] = x;
    }

}