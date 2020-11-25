package com.example.task06;

import java.util.Arrays;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
        System.out.println(getMax(7, 5, 2, 9));
        System.out.println(getMax(9, 9, 8, 10));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        return Arrays.stream(new int[] {a, b, c, d}).max().getAsInt();
    }

}