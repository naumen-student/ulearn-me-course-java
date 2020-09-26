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
        if(arr == null || arr.length < 1 ) return;
        int minIndex = 0;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((minNum >= arr[i])) {
                minNum = arr[i];
                minIndex = i;
            }
        }
        arr[minIndex] = arr[0];
        arr[0] = minNum;
    }

}