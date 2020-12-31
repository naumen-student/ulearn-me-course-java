package com.example.task06;

import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int[] array = new int[]{a, b, c, d};
        int max = Integer.MIN_VALUE;
        for (int i: array) {
            if(i > max) max = i;
        }
        return max;
    }

}