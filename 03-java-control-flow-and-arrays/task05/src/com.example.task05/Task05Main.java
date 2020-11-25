package com.example.task05;

import java.util.Arrays;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMin(5,4,3));
        System.out.println(getMin(2,7,1));
        System.out.println(getMin(9,9,8));
         */
    }

    static int getMin(int a, int b, int c) {
        return Arrays.stream(new int[] {a, b, c}).min().getAsInt();
    }
}