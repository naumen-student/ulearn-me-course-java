package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            int newNum = arr[i];
            if ((newNum <= arr[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}