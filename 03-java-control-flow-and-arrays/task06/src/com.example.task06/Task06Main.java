package com.example.task06;

import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMax(33, 22, 33, 33));

    }

    static int getMax(int a, int b, int c, int d) {
        int[] arr = new int[] {a, b, c, d};
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}